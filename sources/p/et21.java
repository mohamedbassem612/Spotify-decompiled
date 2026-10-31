package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum et21 implements v190 {
    RESOLUTION_METHOD_UNSPECIFIED(0),
    RESOLUTION_METHOD_STORE(1),
    RESOLUTION_METHOD_IP_ADDRESS(2),
    RESOLUTION_METHOD_DEFAULT(3),
    RESOLUTION_METHOD_UNRESOLVED(4),
    UNRECOGNIZED(-1);

    public final int a;

    et21(int i) {
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
