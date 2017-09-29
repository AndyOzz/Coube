
public class Encryption {
    private String text = "";
    private String encText = "";
    protected static  char[][] key = {{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И'},
            {'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т'},
            {'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь'},
            {'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё'},
            {'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п'},
            {'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'},
            {'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' ', '.', ',', ')'},
            {'(', '?', '!', '_', '@', '1', '2', '3', '4', '5'},
            {'6', '7', '8', '9', '0', '*', '/', '+', '-', '\\'}};

    public Encryption(String text){


        this.text = text;
        findInArr(this.text);

    }

    public String getEncText(){

        return this.encText;
    }

    public void findInArr(String text){


        for(int i=0; i<text.length(); ++i){
            this.encText += charIn(text.charAt(i));

        }
    }



    public String charIn(char c){

        String rez = "";
        for(int i=0; i<key.length; ++i){
            for(int j=0; j<key[i].length; ++j){
                if(key[i][j] == c){
                    rez = rez + (i+""+j+" ");
                }
            }
        }

        return rez;
    }
}