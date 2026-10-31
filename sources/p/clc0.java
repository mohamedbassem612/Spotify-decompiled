package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum clc0 implements v190 {
    EMPTY(0),
    ARTIST(1),
    ALBUM(2),
    TRACK(4),
    LOCAL_TRACK(9),
    SHOW(62),
    EPISODE(63),
    CLIP(92),
    PODCAST_CHAPTER(96),
    KALLAX(100),
    USER_HIGHLIGHT(101),
    LISTENING_STATS(107),
    UNRECOGNIZED(-1);

    public final int a;

    clc0(int i) {
        this.a = i;
    }

    public static clc0 a(int i) {
        if (i == 0) {
            return EMPTY;
        }
        if (i == 1) {
            return ARTIST;
        }
        if (i == 2) {
            return ALBUM;
        }
        if (i == 4) {
            return TRACK;
        }
        if (i == 9) {
            return LOCAL_TRACK;
        }
        if (i == 92) {
            return CLIP;
        }
        if (i == 96) {
            return PODCAST_CHAPTER;
        }
        if (i == 107) {
            return LISTENING_STATS;
        }
        if (i == 62) {
            return SHOW;
        }
        if (i == 63) {
            return EPISODE;
        }
        if (i == 100) {
            return KALLAX;
        }
        if (i != 101) {
            return null;
        }
        return USER_HIGHLIGHT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
