package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum i1z0 implements v190 {
    UNKNOWN_QUERY_TYPE(0),
    IMPLICIT(1),
    EXPLICIT(2),
    UNRECOGNIZED(-1);

    public final int a;

    i1z0(int i) {
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
