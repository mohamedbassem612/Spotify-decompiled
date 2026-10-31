package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum wd00 implements v190 {
    EVENT_TYPE_UNKNOWN(0),
    DISMISS(1),
    VIEW(2),
    CLICK(3),
    UNRECOGNIZED(-1);

    public final int a;

    wd00(int i) {
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
