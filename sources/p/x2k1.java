package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum x2k1 implements v190 {
    VIDEO_SURFACE_UNKNOWN(0),
    VIDEO_SURFACE_FULLSCREEN(1),
    VIDEO_SURFACE_NOW_PLAYING_BAR(2),
    VIDEO_SURFACE_NOW_PLAYING_SIDEBAR(3),
    VIDEO_SURFACE_NOW_PLAYING_VIEW(4),
    VIDEO_SURFACE_NOW_PLAYING_VIEW_VERTICAL(5),
    VIDEO_SURFACE_PICTURE_IN_PICTURE(6),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_SURFACE_CINEMA(7),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_SURFACE_EXTERNAL(8),
    VIDEO_SURFACE_OTHER(9),
    UNRECOGNIZED(-1);

    public final int a;

    x2k1(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
