package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rla {
    public final jla a;
    public final int b;
    public final jla c;
    public final wj31 d;
    public final List e;
    public final String f;

    public rla(jla jlaVar, int i, jla jlaVar2, wj31 wj31Var, List list, String str) {
        this.a = jlaVar;
        this.b = i;
        this.c = jlaVar2;
        this.d = wj31Var;
        this.e = list;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rla) {
            rla rlaVar = (rla) obj;
            if (this.a == rlaVar.a && this.b == rlaVar.b && this.c == rlaVar.c && u890.j(this.d, rlaVar.d) && u890.j(this.e, rlaVar.e) && u890.j(this.f, rlaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = f4i1.b((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
