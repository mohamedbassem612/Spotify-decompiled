package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum qf51 implements v190 {
    SECTION_UNSPECIFIED(0),
    SECTION_ACTIVE(1),
    SECTION_SUGGESTED(2),
    UNRECOGNIZED(-1);

    public final int a;

    qf51(int i) {
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
