package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class um01 {
    public final String a;
    public final String b;
    public final d8r0 c;
    public final q8b d;
    public final int e;
    public final boolean f;

    public um01(String str, String str2, d8r0 d8r0Var, q8b q8bVar, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d8r0Var;
        this.d = q8bVar;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um01)) {
            return false;
        }
        um01 um01Var = (um01) obj;
        return u890.j(this.a, um01Var.a) && u890.j(this.b, um01Var.b) && u890.j(this.c, um01Var.c) && this.d.equals(um01Var.d) && this.e == um01Var.e && this.f == um01Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, (this.d.hashCode() + hrt.i(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31);
    }
}
