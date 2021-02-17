public class BouncingBall {

        public static int bouncingBall(double h, double bounce, double window) {
            int passCounter = 0;
            if(h < window){
                passCounter = -1;
            }
            while (h >= window){
                passCounter++;
                h = h * bounce;
                if (h >= window){
                    passCounter++;
                }
            }
            return passCounter;
        }
    }
