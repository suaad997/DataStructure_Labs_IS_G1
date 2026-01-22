package Graph;

public class Main {
    public static void main(String[] args) {
        AdjaneceyList adjList= new AdjaneceyList(3);
        adjList.addedges(0,1);
        adjList.addedges(1,2);
        adjList.addedges(2,0);
        adjList.display();



    }
}
