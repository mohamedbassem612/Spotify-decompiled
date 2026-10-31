package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum lig1 implements v190 {
    TRANSITION_TYPE_UNSPECIFIED(0),
    TRANSITION_TYPE_AUTO(1),
    TRANSITION_TYPE_CUSTOM(2),
    UNRECOGNIZED(-1);

    public final int a;

    lig1(int i) {
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
