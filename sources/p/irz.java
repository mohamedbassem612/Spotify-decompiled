package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum irz implements v190 {
    BAD_CREDENTIALS(0),
    REGION_MISMATCH(1),
    PASSWORD_CHANGED(2),
    UNRECOGNIZED(-1);

    public final int a;

    irz(int i) {
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
