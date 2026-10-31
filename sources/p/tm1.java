package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tm1 {
    public final String a;
    public final int b;
    public final boolean c;
    public final piz d;

    public tm1(String str, int i, boolean z, piz pizVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = pizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm1)) {
            return false;
        }
        tm1 tm1Var = (tm1) obj;
        return u890.j(this.a, tm1Var.a) && this.b == tm1Var.b && this.c == tm1Var.c && u890.j(this.d, tm1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        piz pizVar = this.d;
        return iG + (pizVar == null ? 0 : pizVar.hashCode());
    }
}
