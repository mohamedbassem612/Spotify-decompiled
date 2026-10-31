package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum bec implements v190 {
    DARK(0),
    LIGHT(1),
    UNRECOGNIZED(-1);

    public final int a;

    bec(int i) {
        this.a = i;
    }

    public static bec a(int i) {
        if (i == 0) {
            return DARK;
        }
        if (i != 1) {
            return null;
        }
        return LIGHT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
