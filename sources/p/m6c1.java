package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m6c1 {
    public final String a;
    public final vnr0 b;
    public final boolean c;
    public final vnr0 d;
    public final int e;
    public final String f;
    public final float g;
    public final l6c1 h;
    public final k6c1 i;

    public m6c1(String str, vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, String str2, float f, l6c1 l6c1Var, k6c1 k6c1Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = z;
        this.d = vnr0Var2;
        this.e = i;
        this.f = str2;
        this.g = f;
        this.h = l6c1Var;
        this.i = k6c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6c1)) {
            return false;
        }
        m6c1 m6c1Var = (m6c1) obj;
        return u890.j(this.a, m6c1Var.a) && this.b.equals(m6c1Var.b) && this.c == m6c1Var.c && this.d.equals(m6c1Var.d) && this.e == m6c1Var.e && u890.j(this.f, m6c1Var.f) && p3v.c(this.g, m6c1Var.g) && this.h.equals(m6c1Var.h) && this.i.equals(m6c1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + x0d.f(cy30.d(kaa0.f(this.e, (this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31), 31, this.f), 31, this.g)) * 31);
    }
}
