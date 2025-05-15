package codekata.Blocks;

public class Main {
        public static void main(String[] args){
            int[] dimensions = {2, 4, 6};
            Block block = new Block(dimensions);

            System.out.println("Width: " + block.getWidth());
            System.out.println("Length: " + block.getLength());
            System.out.println("Height: " + block.getHeight());
            System.out.println("Volume: " + block.getVolume());
            System.out.println("Surface Area: " + block.getSurfaceArea());
        }
    }
