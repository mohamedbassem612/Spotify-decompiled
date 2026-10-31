package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xmd {
    public final wmd a;
    public final af5 b;

    public xmd(wmd wmdVar, af5 af5Var) {
        this.a = wmdVar;
        this.b = af5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmd)) {
            return false;
        }
        xmd xmdVar = (xmd) obj;
        return this.a.equals(xmdVar.a) && u890.j(this.b, xmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
