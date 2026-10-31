package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cxq0 implements m6m {
    public final m6m a;
    public final uyl b;
    public final uyl c;

    public cxq0(m6m m6mVar, uyl uylVar) {
        this.a = m6mVar;
        this.b = uylVar;
        this.c = uylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxq0)) {
            return false;
        }
        cxq0 cxq0Var = (cxq0) obj;
        return u890.j(this.a, cxq0Var.a) && u890.j(this.b, cxq0Var.b);
    }

    public final Object getId() {
        return this.a.getId();
    }

    public final uyl getItem() {
        return this.c;
    }

    public final k1r getResult() {
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
