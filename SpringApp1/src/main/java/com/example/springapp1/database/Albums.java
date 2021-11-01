package com.example.springapp1.database;


import java.util.Arrays;
import java.util.List;

public class Albums {
    private int albumsId;
    private int artistId;
    private String albName;
    private String albStatus;

    public Albums() {
    }

    public static Albums.AlbumsBuilder albumsBuilder() {
        return new Albums().new AlbumsBuilder();
    }

    public class  AlbumsBuilder {
        private AlbumsBuilder() {
        }
        public Albums.AlbumsBuilder albumsId(int albumsId) {
            Albums.this.albumsId = albumsId;
            return this;
        }

        public Albums.AlbumsBuilder artistId(int artistId) {
            Albums.this.artistId = artistId;
            return this;
        }

        public Albums.AlbumsBuilder albName(String albName) {
            Albums.this.albName = albName;
            return this;
        }

        public Albums.AlbumsBuilder albStatus(String albStatus) {
            Albums.this.albStatus = albStatus;
            return this;
        }

        public Albums build() {
            return Albums.this;
        }
    }

    public static List<Albums> getAlbums(){
        Albums albums1 = Albums.albumsBuilder()
                .albumsId(101)
                .artistId(1)
                .albName("Electric Ladyland")
                .albStatus("Classic Rock")
                .build();

        Albums albums2 = Albums.albumsBuilder()
                .albumsId(201)
                .artistId(2)
                .albName("Music to Be Murdered By")
                .albStatus("Rolling Stone - 3/5")
                .build();

        Albums albums3 = Albums.albumsBuilder()
                .albumsId(301)
                .artistId(3)
                .albName("Hot Fuss")
                .albStatus("Rolling Stone - 3.5/5")
                .build();

        Albums albums4 = Albums.albumsBuilder()
                .albumsId(302)
                .artistId(3)
                .albName("Battle Born")
                .albStatus("Rolling Stone - 3/5")
                .build();

        Albums albums5 = Albums.albumsBuilder()
                .albumsId(401)
                .artistId(4)
                .albName("Blur")
                .albStatus("Rolling Stone - 4/5")
                .build();

        Albums albums6 = Albums.albumsBuilder()
                .albumsId(402)
                .artistId(4)
                .albName("The Magic Whip")
                .albStatus("Rolling Stone - 4/5")
                .build();

        Albums albums7 = Albums.albumsBuilder()
                .albumsId(501)
                .artistId(5)
                .albName("New album")
                .albStatus("Rolling Stone - 3/5")
                .build();

        Albums albums8 = Albums.albumsBuilder()
                .albumsId(502)
                .artistId(5)
                .albName("King of the hill")
                .albStatus("not rated")
                .build();



        return Arrays.asList(albums1, albums2, albums3, albums4, albums5, albums6, albums7, albums8);
    }

    @Override
    public String toString() {
        return "Albums" +
                "albumsId=" + albumsId +
                ", artistId=" + artistId +
                ", albName='" + albName + '\'' +
                ", albStatus='" + albStatus;
    }

    public int getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(int albumsId) {
        this.albumsId = albumsId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getAlbName() {
        return albName;
    }

    public void setAlbName(String albName) {
        this.albName = albName;
    }

    public String getAlbStatus() {
        return albStatus;
    }

    public void setAlbStatus(String albStatus) {
        this.albStatus = albStatus;
    }
}
