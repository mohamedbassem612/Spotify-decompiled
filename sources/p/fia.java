package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum fia implements v190 {
    BEARER_UNKNOWN(0),
    BEARER_CELLULAR(1),
    BEARER_WIFI(2),
    UNRECOGNIZED(-1);

    public final int a;

    fia(int i) {
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
