package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum jrj0 implements v190 {
    PERMISSION_NEVER_SEEN(0),
    PERMISSION_TEMPORARILY_DENIED(1),
    PERMISSION_PERMANENTLY_DENIED(2),
    UNRECOGNIZED(-1);

    public final int a;

    jrj0(int i) {
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
