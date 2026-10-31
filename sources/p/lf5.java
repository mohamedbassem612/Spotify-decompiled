package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum lf5 {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean a;
    public final boolean b;

    /* synthetic */ lf5(int i) {
        this((i & 1) == 0, false);
    }

    lf5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
