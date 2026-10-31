package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l991 {
    public final qa91 a;
    public final String b;
    public final iu30 c;

    public l991(qa91 qa91Var, String str, iu30 iu30Var) {
        this.a = qa91Var;
        this.b = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l991)) {
            return false;
        }
        l991 l991Var = (l991) obj;
        return this.a.equals(l991Var.a) && u890.j(this.b, l991Var.b) && u890.j(this.c, l991Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
