package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v991 {
    public final String a;
    public final d991 b;
    public final iu30 c;

    public v991(String str, d991 d991Var, iu30 iu30Var) {
        this.a = str;
        this.b = d991Var;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v991)) {
            return false;
        }
        v991 v991Var = (v991) obj;
        return u890.j(this.a, v991Var.a) && this.b == v991Var.b && u890.j(this.c, v991Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
