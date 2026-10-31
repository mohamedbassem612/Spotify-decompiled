package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum uat implements v190 {
    UNDEFINED(0),
    NORMAL(1),
    COMPACT(2),
    UNRECOGNIZED(-1);

    public final int a;

    uat(int i) {
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
