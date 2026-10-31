package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hxe0 {
    public final String a;
    public final uf8 b;
    public final l3f0 c;
    public final bk8 d;

    public hxe0(String str, uf8 uf8Var, l3f0 l3f0Var, bk8 bk8Var) {
        this.a = str;
        this.b = uf8Var;
        this.c = l3f0Var;
        this.d = bk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe0)) {
            return false;
        }
        hxe0 hxe0Var = (hxe0) obj;
        return u890.j(this.a, hxe0Var.a) && this.b.equals(hxe0Var.b) && u890.j(this.c, hxe0Var.c) && this.d == hxe0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        l3f0 l3f0Var = this.c;
        int iHashCode2 = (iHashCode + (l3f0Var == null ? 0 : l3f0Var.hashCode())) * 31;
        bk8 bk8Var = this.d;
        return iHashCode2 + (bk8Var != null ? bk8Var.hashCode() : 0);
    }
}
