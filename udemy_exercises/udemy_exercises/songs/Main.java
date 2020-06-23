package udemy_exercises.songs;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args){

        Album album = new Album("Dookie", "Green Day");
        album.addSong("IDK1", 3.1);
        album.addSong("IDK2", 2.1);
        album.addSong("IDK3", 3.41);
        album.addSong("IDK4", 3.14);
        album.addSong("IDK5", 3.26);
        album.addSong("IDK6", 4.28);
        album.addSong("IDK7", 3.27);
        album.addSong("IDK8", 3.29);
        albums.add(album);

        album = new Album("Some Album", "Some Artist");
        album.addSong("Some song 1", 3.55);
        album.addSong("Some song 2", 3.5);
        album.addSong("Some song 3", 3.05);
        album.addSong("Some song 4", 3.53);
        album.addSong("Some song 5", 3.23);
        album.addSong("Some song 6", 3.45);
        album.addSong("Some song 7", 3.10);
        album.addSong("Some song 8", 3.01);
        album.addSong("Some song 9", 3.26);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("IDK4", playList);
        albums.get(0).addToPlayList("IDK1", playList);
        albums.get(0).addToPlayList("IDK2", playList);
        albums.get(0).addToPlayList("IDK3", playList);
        albums.get(0).addToPlayList("IDK45", playList); //doesn't exist
        albums.get(0).addToPlayList(8, playList);

        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(12, playList); //doesn't exist

        play(playList);



    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing: " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing: " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay the current song\n" +
                    "4 - list songs in the playlist\n" +
                    "5 - print available actions\n" +
                    "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }


}
