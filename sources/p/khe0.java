package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum khe0 implements v190 {
    RESOLUTION_METHOD_UNSPECIFIED(0),
    RESOLUTION_METHOD_STORE(1),
    RESOLUTION_METHOD_INFERRED(2),
    RESOLUTION_METHOD_PROVIDED(3),
    UNRECOGNIZED(-1);

    public final int a;

    khe0(int i) {
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
