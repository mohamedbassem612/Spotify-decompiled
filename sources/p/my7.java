package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class my7 {
    public final f58 a;
    public final String b;
    public final z1u0 c;

    public my7(f58 f58Var, String str, z1u0 z1u0Var) {
        this.a = f58Var;
        this.b = str;
        this.c = z1u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my7)) {
            return false;
        }
        my7 my7Var = (my7) obj;
        return this.a.equals(my7Var.a) && this.b.equals(my7Var.b) && u890.j(this.c, my7Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        z1u0 z1u0Var = this.c;
        return iD + (z1u0Var == null ? 0 : z1u0Var.hashCode());
    }
}
