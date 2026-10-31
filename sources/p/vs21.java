package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum vs21 implements v190 {
    RESIDENT_KEY_UNSPECIFIED(0),
    RESIDENT_KEY_REQUIRED(1),
    RESIDENT_KEY_PREFERRED(2),
    RESIDENT_KEY_DISCOURAGED(3),
    UNRECOGNIZED(-1);

    public final int a;

    vs21(int i) {
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
