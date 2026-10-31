package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pxz implements b700 {
    public final String a;
    public final tv80 b;

    public pxz(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxz)) {
            return false;
        }
        pxz pxzVar = (pxz) obj;
        return this.a.equals(pxzVar.a) && u890.j(this.b, pxzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
