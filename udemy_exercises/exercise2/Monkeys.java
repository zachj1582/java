package exercise2;

class Monkeys {

    public boolean monkeyBusiness(Monkey[] monkeys) {
        int smiling = 0;
        int notSmile = 0;
        for(int i = 0; i<monkeys.length; i++){
            // monkeys[i].smile ? smiling++ : notSmile++;
            if(monkeys[i].smile == true){
                smiling++;
            } else {
                notSmile++;
            }
            if(smiling > notSmile){
                return true;
            }
        }
        return false;
    //BONUS EXERCISE
    //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.  
        // smiling > notSmile ? return true : return false;
    }

    static class Monkey {
        String name;
        boolean smile;
        public Monkey(String name, boolean smile) {
            this.name = name;
            this.smile = smile;
        }

    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and determine whether the majority of them are smiling or not.  
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.

        Monkey[] monkeyList = {new Monkey("Rafiqi", true), new Monkey("Curious George", true), new Monkey("King Kong", false)};
        System.out.println(monkeyList);
        
    }
    
}