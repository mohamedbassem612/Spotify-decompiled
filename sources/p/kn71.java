package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum kn71 implements v190 {
    UNSPECIFIED_TYPE(0),
    SUMMARY(1),
    TOP_SONGS(2),
    TOP_ARTISTS(3),
    UNRECOGNIZED(-1);

    public final int a;

    kn71(int i) {
        this.a = i;
    }

    public static kn71 a(int i) {
        if (i == 0) {
            return UNSPECIFIED_TYPE;
        }
        if (i == 1) {
            return SUMMARY;
        }
        if (i == 2) {
            return TOP_SONGS;
        }
        if (i != 3) {
            return null;
        }
        return TOP_ARTISTS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
