package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum jc30 implements v190 {
    SUCCESS(0),
    NOT_FOUND(2),
    UNRECOGNIZED(-1);

    public final int a;

    jc30(int i) {
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
