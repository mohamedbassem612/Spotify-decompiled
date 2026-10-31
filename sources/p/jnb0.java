package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum jnb0 implements x190 {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);

    public final int a;

    jnb0(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
