package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum z5m1 implements v190 {
    UNDEFINED(0),
    VALIDATION_ERROR(1),
    GENERATION_ERROR(2),
    UNRECOGNIZED(-1);

    public final int a;

    z5m1(int i) {
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
