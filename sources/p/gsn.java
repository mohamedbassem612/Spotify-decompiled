package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum gsn implements v190 {
    ORIGIN_TYPE_UNSPECIFIED(0),
    ORIGIN_TYPE_FRESH(1),
    ORIGIN_TYPE_CLONED(2),
    ORIGIN_TYPE_AGENTIC(3),
    UNRECOGNIZED(-1);

    public final int a;

    gsn(int i) {
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
