package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ux71 implements vx71 {
    public final mw71 a;

    public ux71(mw71 mw71Var) {
        this.a = mw71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux71) && this.a == ((ux71) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
