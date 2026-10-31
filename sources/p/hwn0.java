package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hwn0 {
    public final y6r0 a;
    public final gwn0 b;
    public final var0 c;
    public final boolean d;

    public hwn0(y6r0 y6r0Var, gwn0 gwn0Var, var0 var0Var, boolean z) {
        this.a = y6r0Var;
        this.b = gwn0Var;
        this.c = var0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwn0)) {
            return false;
        }
        hwn0 hwn0Var = (hwn0) obj;
        return u890.j(this.a, hwn0Var.a) && u890.j(this.b, hwn0Var.b) && u890.j(this.c, hwn0Var.c) && this.d == hwn0Var.d;
    }

    public final int hashCode() {
        y6r0 y6r0Var = this.a;
        int iHashCode = (this.b.hashCode() + ((y6r0Var == null ? 0 : y6r0Var.a.hashCode()) * 31)) * 31;
        var0 var0Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (var0Var != null ? var0Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ hwn0(y6r0 y6r0Var, gwn0 gwn0Var, boolean z, int i) {
        this(y6r0Var, gwn0Var, (var0) null, (i & 8) != 0 ? false : z);
    }
}
