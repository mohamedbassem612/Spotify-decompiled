package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum d6m1 implements v190 {
    WORLD_STATE_UNDEFINED(0),
    WORLD_STATE_EMPTY(1),
    WORLD_STATE_IN_PROGRESS(2),
    WORLD_STATE_POPULATED(3),
    UNRECOGNIZED(-1);

    public final int a;

    d6m1(int i) {
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
