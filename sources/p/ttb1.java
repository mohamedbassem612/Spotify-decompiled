package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ttb1 implements v190 {
    SUCCESS(0),
    BAD_REQUEST(1),
    INTERNAL_ERROR(2),
    NOT_FOUND(3),
    UNRECOGNIZED(-1);

    public final int a;

    ttb1(int i) {
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
