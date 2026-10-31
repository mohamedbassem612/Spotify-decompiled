package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tqw {
    public final tka0 a;
    public final Object b;

    public tqw(tka0 tka0Var, Object obj) {
        this.a = tka0Var;
        this.b = obj;
    }

    public final Object a(tka0 tka0Var) {
        if (u890.j(this.a, tka0Var)) {
            return this.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqw)) {
            return false;
        }
        tqw tqwVar = (tqw) obj;
        return u890.j(this.a, tqwVar.a) && this.b.equals(tqwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ElementInteractionResult(key=" + this.a.r() + ", value=" + this.b + ")";
    }
}
