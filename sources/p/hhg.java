package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hhg {
    public final String a;
    public final String b;
    public final zma1 c;
    public final iu30 d;

    public hhg(String str, String str2, zma1 zma1Var, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = zma1Var;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhg)) {
            return false;
        }
        hhg hhgVar = (hhg) obj;
        return u890.j(this.a, hhgVar.a) && u890.j(this.b, hhgVar.b) && this.c.equals(hhgVar.c) && u890.j(this.d, hhgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
