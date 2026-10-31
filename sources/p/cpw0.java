package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpw0 {
    public final l2r0 a;
    public final String b;
    public final boolean c;

    public cpw0(l2r0 l2r0Var, String str, boolean z) {
        this.a = l2r0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpw0)) {
            return false;
        }
        cpw0 cpw0Var = (cpw0) obj;
        return this.a == cpw0Var.a && u890.j(this.b, cpw0Var.b) && this.c == cpw0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
