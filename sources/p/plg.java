package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class plg {
    public final String a;
    public final String b;
    public final String c;
    public final olg d;
    public final g07 e;
    public final g07 f;

    public plg(String str, String str2, String str3, olg olgVar, g07 g07Var, g07 g07Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = olgVar;
        this.e = g07Var;
        this.f = g07Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plg)) {
            return false;
        }
        plg plgVar = (plg) obj;
        return this.a.equals(plgVar.a) && this.b.equals(plgVar.b) && this.c.equals(plgVar.c) && this.d == plgVar.d && this.e.equals(plgVar.e) && this.f.equals(plgVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }
}
