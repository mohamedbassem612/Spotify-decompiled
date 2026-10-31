package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kb31 implements pb31 {
    public final String a;
    public final boolean b;
    public final vbe c;

    public kb31(String str, boolean z, vbe vbeVar) {
        this.a = str;
        this.b = z;
        this.c = vbeVar;
    }

    public static kb31 f(kb31 kb31Var, String str, vbe vbeVar, int i) {
        if ((i & 1) != 0) {
            str = kb31Var.a;
        }
        boolean z = (i & 2) != 0 ? kb31Var.b : true;
        if ((i & 4) != 0) {
            vbeVar = kb31Var.c;
        }
        return new kb31(str, z, vbeVar);
    }

    public final vbe b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb31)) {
            return false;
        }
        kb31 kb31Var = (kb31) obj;
        return this.a.equals(kb31Var.a) && this.b == kb31Var.b && u890.j(this.c, kb31Var.c);
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
