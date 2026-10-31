package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class em91 {
    public final String a;
    public final String b;
    public final sqe c;
    public final boolean d;
    public final sp91 e;
    public final jm91 f;

    public /* synthetic */ em91(String str, String str2, sqe sqeVar, boolean z, sp91 sp91Var, int i) {
        this(str, str2, sqeVar, (i & 8) != 0 ? false : z, sp91Var, (jm91) im91.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em91)) {
            return false;
        }
        em91 em91Var = (em91) obj;
        return u890.j(this.a, em91Var.a) && u890.j(this.b, em91Var.b) && u890.j(this.c, em91Var.c) && this.d == em91Var.d && u890.j(this.e, em91Var.e) && u890.j(this.f, em91Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31);
    }

    public em91(String str, String str2, sqe sqeVar, boolean z, sp91 sp91Var, jm91 jm91Var) {
        this.a = str;
        this.b = str2;
        this.c = sqeVar;
        this.d = z;
        this.e = sp91Var;
        this.f = jm91Var;
    }
}
