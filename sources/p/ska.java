package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ska {
    public final nla a;
    public final int b;
    public final ola c;
    public final dhz0 d;
    public final dhz0 e;
    public final dhz0 f;
    public final wj31 g;
    public final List h;

    public ska(nla nlaVar, int i, ola olaVar, dhz0 dhz0Var, dhz0 dhz0Var2, dhz0 dhz0Var3, wj31 wj31Var, List list) {
        this.a = nlaVar;
        this.b = i;
        this.c = olaVar;
        this.d = dhz0Var;
        this.e = dhz0Var2;
        this.f = dhz0Var3;
        this.g = wj31Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ska) {
            ska skaVar = (ska) obj;
            if (this.a == skaVar.a && this.b == skaVar.b && this.c == skaVar.c && this.d.equals(skaVar.d) && this.e.equals(skaVar.e) && this.f.equals(skaVar.f) && u890.j(this.g, skaVar.g) && u890.j(this.h, skaVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
