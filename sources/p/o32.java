package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o32 {
    public final p32 a;
    public final int b;
    public final hux c;
    public final w32 d;
    public final n32 e;

    public /* synthetic */ o32(p32 p32Var, int i, hux huxVar, n32 n32Var, int i2) {
        this(p32Var, i, (i2 & 4) != 0 ? null : huxVar, (i2 & 8) != 0 ? v32.a : u32.a, n32Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o32)) {
            return false;
        }
        o32 o32Var = (o32) obj;
        return this.a == o32Var.a && this.b == o32Var.b && u890.j(this.c, o32Var.c) && u890.j(this.d, o32Var.d) && u890.j(this.e, o32Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        hux huxVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iF + (huxVar == null ? 0 : huxVar.hashCode())) * 31)) * 31);
    }

    public o32(p32 p32Var, int i, hux huxVar, w32 w32Var, n32 n32Var) {
        this.a = p32Var;
        this.b = i;
        this.c = huxVar;
        this.d = w32Var;
        this.e = n32Var;
    }
}
