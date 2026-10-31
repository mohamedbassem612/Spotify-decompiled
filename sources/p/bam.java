package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum bam implements v190 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_TRACK(1),
    CONTENT_TYPE_ALBUM(2),
    CONTENT_TYPE_MUSIC_VIDEO(3),
    CONTENT_TYPE_PODCAST_EPISODE(4),
    CONTENT_TYPE_PODCAST_SHOW(5),
    CONTENT_TYPE_AUDIOBOOK_CHAPTER(6),
    CONTENT_TYPE_AUDIOBOOK(7),
    CONTENT_TYPE_COURSE(9),
    UNRECOGNIZED(-1);

    public final int a;

    bam(int i) {
        this.a = i;
    }

    public static bam a(int i) {
        switch (i) {
            case 0:
                return CONTENT_TYPE_UNSPECIFIED;
            case 1:
                return CONTENT_TYPE_TRACK;
            case 2:
                return CONTENT_TYPE_ALBUM;
            case 3:
                return CONTENT_TYPE_MUSIC_VIDEO;
            case 4:
                return CONTENT_TYPE_PODCAST_EPISODE;
            case 5:
                return CONTENT_TYPE_PODCAST_SHOW;
            case 6:
                return CONTENT_TYPE_AUDIOBOOK_CHAPTER;
            case 7:
                return CONTENT_TYPE_AUDIOBOOK;
            case 8:
            default:
                return null;
            case 9:
                return CONTENT_TYPE_COURSE;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
