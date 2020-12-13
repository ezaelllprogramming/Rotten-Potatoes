public class RottenPotato {

    public static void main(String[] args) {

        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };

        System.out.println("Movie zero's average rating: " + movieAvgRating(ratings, 0));                    
        System.out.println("Movie one's average rating: " + movieAvgRating(ratings, 1));    
        System.out.println("Reviewer zero's average rating: " + reviewerAvgRating(ratings, 0));    
        System.out.println("Reviewer one's average rating: " + reviewerAvgRating(ratings, 1));
        System.out.println("Average rating for all movies in 2018: " + avgRating2018(ratings));    
        System.out.println("Hardest reviewer is #" + hardestReviewer2018(ratings));
        System.out.println("Worst movie is #" + worstMovie2018(ratings));
    }

    //Question 1
    public static double movieAvgRating(int[][] ratings, int movie) {
        int sum = 0;
        double avg;
        for(int r = 0 ; r < 3; r++){
            sum += ratings[r][movie];
        }
        avg = sum/3.0;
        return avg;
    }

    //Question 2
    public static double reviewerAvgRating(int[][] ratings,int reviewer) {
        int sum = 0;
        double avg;
        for(int c = 0 ; c < 4; c++){
            sum += ratings[reviewer][c];
        }
        avg = sum/4.0;
        return avg;
    }

    //Question 3
    public static double avgRating2018(int[][] ratings) {
        int sum= 0;
        double avg;

        for(int r = 0 ; r < 3; r++) {

            for(int c = 0; c < 4;c++){

                sum += ratings[r][c];
                
            }

        }
        avg = sum/12.0;
        return avg;
    }

    //Question 4
    public static int hardestReviewer2018(int[][] ratings) {
        double avg = 0;
        double minavg = 100; 
        int hardestReviewer = 5;
        for(int r = 0; r < 3; r++){
            avg = reviewerAvgRating(ratings, r);
            if(avg < minavg){
                minavg = avg;
                hardestReviewer = r;
            }
        }
        return hardestReviewer;
    }

    //question 5
    public static int worstMovie2018(int[][] ratings) {
        double avg = 0;
        double minavg = 100; 
        int worstMovie = 5;
        for(int c = 0; c < 4; c++){
            avg = movieAvgRating(ratings, c);
            if(avg < minavg){
                minavg = avg;
                worstMovie = c;
            }
        }
        return worstMovie;
    }   
}