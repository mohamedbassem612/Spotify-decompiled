package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sgm {
    public final String a;
    public final i24 b;
    public final tie c;
    public final tie d;
    public final boolean e;
    public final uie f;
    public final ela g;
    public final iu30 h;
    public final iu30 i;

    public sgm(String str, i24 i24Var, tie tieVar, tie tieVar2, boolean z, uie uieVar, ela elaVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = str;
        this.b = i24Var;
        this.c = tieVar;
        this.d = tieVar2;
        this.e = z;
        this.f = uieVar;
        this.g = elaVar;
        this.h = iu30Var;
        this.i = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sgm) {
            sgm sgmVar = (sgm) obj;
            if (u890.j(this.a, sgmVar.a) && this.b == sgmVar.b && this.c == sgmVar.c && this.d == sgmVar.d && this.e == sgmVar.e && this.f == sgmVar.f && this.g == sgmVar.g && this.h.equals(sgmVar.h) && this.i.equals(sgmVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ktd.g(this.h, (this.g.hashCode() + ((this.f.hashCode() + xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31, 31);
    }
}
