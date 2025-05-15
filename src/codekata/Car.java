package codekata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    public Body body;
    public Chassis chassis;

    public Car(int length, int doors) {
        if (length < 7) throw new IllegalArgumentException("Length too small");
        if (doors < 1) throw new IllegalArgumentException("At least one door required");
        if (doors * 2 + 2 > length - 2) throw new IllegalArgumentException("Too many doors for this car length");

        this.body = new Body(length, doors);
        this.chassis = new Chassis(length);
    }

    public class Body {
        public String component;
        public Body(int length, int doors) {
            String top = " " + "_".repeat(length - 2) + "\n";

            char[] middle = new char[length - 1];
            Arrays.fill(middle, ' ');
            middle[0] = '|';
            middle[length - 2] = '\\';
            int left = 1;
            int right = length - 3;
            boolean front = true;
            for (int i = 0; i < doors; i++) {
                if (front) {
                    middle[left] = '[';
                    middle[left + 1] = ']';
                    left += 3;
                } else {
                    middle[right - 1] = '[';
                    middle[right] = ']';
                    right -= 3;
                }
                front = !front;
            }

            String mid = new String(middle) + "\n";
            this.component = top + mid;
        }
    }

    public class Chassis {
        public String component;
        public Chassis(int length) {
            StringBuilder bottom = new StringBuilder("-".repeat(length));
            List<Integer> axlePositions = new ArrayList<>();
            int axles = 2;
            if (length >= 12) {
                axles++;
                int extra = length - 12;
                axles += extra / 2;
            }
            int rear = 2;
            int front = length - 3;
            boolean toRear = true;
            while (axlePositions.size() < axles) {
                axlePositions.add(toRear ? rear : front);
                if (toRear) rear += 2;
                else front -= 2;
                toRear = !toRear;
            }
            for (int pos : axlePositions) {
                if (pos >= 0 && pos < length - 1)
                    bottom.setCharAt(pos, 'o');
            }
            bottom.setCharAt(length - 1, '\'');
            this.component = bottom.toString();
        }
    }

        public static void main(String[] args) {
            Car car = new Car(12, 3);
            System.out.print(car.body.component);
            System.out.println(car.chassis.component);
        }
    }
