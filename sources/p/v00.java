package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum v00 implements v190 {
    URI(0),
    SUBMIT(1),
    DISMISS(2),
    NO_ACTION(3),
    UNRECOGNIZED(-1);

    public final int a;

    v00(int i) {
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
