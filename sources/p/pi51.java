package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum pi51 implements v190 {
    SECTION_STATE_UNDEFINED(0),
    SECTION_STATE_EMPTY(1),
    SECTION_STATE_IN_PROGRESS(2),
    SECTION_STATE_POPULATED(3),
    SECTION_STATE_DELETED(4),
    UNRECOGNIZED(-1);

    public final int a;

    pi51(int i) {
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
