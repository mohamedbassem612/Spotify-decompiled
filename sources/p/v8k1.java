package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v8k1 extends d7p1 {
    public final String c;
    public final tv80 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public v8k1(String str, tv80 tv80Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.c = str;
        this.d = tv80Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8k1)) {
            return false;
        }
        v8k1 v8k1Var = (v8k1) obj;
        return u890.j(this.c, v8k1Var.c) && this.d.equals(v8k1Var.d) && this.e == v8k1Var.e && this.f == v8k1Var.f && this.g == v8k1Var.g && this.h == v8k1Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
