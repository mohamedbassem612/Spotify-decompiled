package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum fub1 implements v190 {
    OK(0),
    IN_PROGRESS(1),
    INVALID_URL(2),
    INTERNAL(3),
    UNRECOGNIZED(-1);

    public final int a;

    fub1(int i) {
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
