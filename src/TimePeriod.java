public class TimePeriod {
        private int hours;
        private int minutes;
        public TimePeriod(int h, int m){
            this.hours = h;
            this.minutes = m;
            while(this.minutes >= 60){
                this.hours+=1;
                this.minutes-=60;
            }
        }
        public String toString()
        {
            return "" + hours + "h " + minutes + "m";
        }

        public void scale(){

        }

// add further methods here
    }


