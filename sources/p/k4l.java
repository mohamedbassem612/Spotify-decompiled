package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum k4l implements v190 {
    CONNECT(0),
    CAST(1),
    UNRECOGNIZED(-1);

    public final int a;

    k4l(int i) {
        this.a = i;
    }

    public static k4l a(int i) {
        if (i == 0) {
            return CONNECT;
        }
        if (i != 1) {
            return null;
        }
        return CAST;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
