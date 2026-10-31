package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yvu0 implements v190 {
    NO_RESTRICTION(0),
    RESTRICT_SOURCE_TO_50(1),
    RESTRICT_SOURCE_TO_500(2),
    UNRECOGNIZED(-1);

    public final int a;

    yvu0(int i) {
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
