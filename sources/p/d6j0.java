package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum d6j0 implements v190 {
    MARKETING(0),
    TRANSACTIONAL(1),
    UNRECOGNIZED(-1);

    public final int a;

    d6j0(int i) {
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
