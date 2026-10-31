package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum w0z0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABILITY_NONE(0),
    AVAILABILITY_AVAILABLE(1),
    UNRECOGNIZED(-1);

    public final int a;

    w0z0(int i) {
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
