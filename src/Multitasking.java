class Video{
        void video() {
            System.out.println("play video");
        }
    }
    class Music{
        void music() {
            System.out.println("play music");
        }
    }

class Read{
    void read() {
        System.out.println("reading books");
    }
}

    public class Multitasking {
        public static void main(String[] args) {
            Video v = new Video();
            Music m = new Music();
            Read r = new Read();
            v.video();
            m.music();
            r.read();
        }
    }
