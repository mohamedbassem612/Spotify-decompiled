package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class amg {
    public final String a;
    public final cmg b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public amg(String str, cmg cmgVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = cmgVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amg)) {
            return false;
        }
        amg amgVar = (amg) obj;
        return u890.j(this.a, amgVar.a) && this.b.equals(amgVar.b) && this.c == amgVar.c && this.d == amgVar.d && this.e == amgVar.e && this.f == amgVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
