package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum aj51 implements v190 {
    SECTION_TYPE_UNDEFINED(0),
    SECTION_TYPE_CAROUSEL(1),
    SECTION_TYPE_MDC(2),
    UNRECOGNIZED(-1);

    public final int a;

    aj51(int i) {
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
