package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r68 extends t68 {
    public final wve1 a;

    public r68(wve1 wve1Var) {
        this.a = wve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r68) && this.a.equals(((r68) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.a);
    }
}
