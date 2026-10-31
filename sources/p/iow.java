package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iow extends kow {
    public final b510 a;
    public final r310 b;
    public final vgq0 c;
    public final ijg d;
    public final cf70 e;

    public iow(b510 b510Var, r310 r310Var, vgq0 vgq0Var, ijg ijgVar, cf70 cf70Var) {
        this.a = b510Var;
        this.b = r310Var;
        this.c = vgq0Var;
        this.d = ijgVar;
        this.e = cf70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iow) {
            iow iowVar = (iow) obj;
            if (this.a.equals(iowVar.a) && this.b.equals(iowVar.b) && this.c == iowVar.c && this.d.equals(iowVar.d) && this.e.equals(iowVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
