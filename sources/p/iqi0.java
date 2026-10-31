package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iqi0 {
    public final String a;
    public final String b;
    public final int c;
    public final x7i1 d;
    public final wls0 e;
    public final List f;

    public iqi0(String str, String str2, int i, x7i1 x7i1Var, wls0 wls0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = x7i1Var;
        this.e = wls0Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqi0)) {
            return false;
        }
        iqi0 iqi0Var = (iqi0) obj;
        return u890.j(this.a, iqi0Var.a) && u890.j(this.b, iqi0Var.b) && this.c == iqi0Var.c && this.d.equals(iqi0Var.d) && this.e == iqi0Var.e && u890.j(this.f, iqi0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31);
    }
}
