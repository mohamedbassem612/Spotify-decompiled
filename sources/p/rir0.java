package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rir0 implements xnh1 {
    public final y6r0 a;
    public final n6r0 b;
    public final long c;
    public final qir0 d;
    public final qir0 e;
    public final var0 f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final u8h1 j;

    public /* synthetic */ rir0(y6r0 y6r0Var, n6r0 n6r0Var, long j, qir0 qir0Var, var0 var0Var, List list, boolean z, u8h1 u8h1Var, int i) {
        this(y6r0Var, n6r0Var, j, qir0Var, null, (i & 32) != 0 ? null : var0Var, (i & 64) != 0 ? z6x.a : list, z, (i & 256) == 0, u8h1Var);
    }

    public static rir0 d(rir0 rir0Var, qir0 qir0Var, qir0 qir0Var2, int i) {
        y6r0 y6r0Var = rir0Var.a;
        n6r0 n6r0Var = rir0Var.b;
        long j = rir0Var.c;
        if ((i & 8) != 0) {
            qir0Var = rir0Var.d;
        }
        qir0 qir0Var3 = qir0Var;
        if ((i & 16) != 0) {
            qir0Var2 = rir0Var.e;
        }
        return new rir0(y6r0Var, n6r0Var, j, qir0Var3, qir0Var2, rir0Var.f, rir0Var.g, rir0Var.h, rir0Var.i, rir0Var.j);
    }

    @Override // p.xnh1
    public final n6r0 a() {
        return this.b;
    }

    @Override // p.xnh1
    public final xnh1 b(qir0 qir0Var) {
        return d(this, qir0Var, null, 1015);
    }

    @Override // p.xnh1
    public final xnh1 c(qir0 qir0Var) {
        return d(this, null, qir0Var, 1007);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rir0)) {
            return false;
        }
        rir0 rir0Var = (rir0) obj;
        return u890.j(this.a, rir0Var.a) && u890.j(this.b, rir0Var.b) && this.c == rir0Var.c && u890.j(this.d, rir0Var.d) && u890.j(this.e, rir0Var.e) && u890.j(this.f, rir0Var.f) && u890.j(this.g, rir0Var.g) && this.h == rir0Var.h && this.i == rir0Var.i && u890.j(this.j, rir0Var.j);
    }

    @Override // p.xnh1
    public final qir0 getPageUri() {
        return this.d;
    }

    public final int hashCode() {
        int iF = cy30.f((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, this.c, 31);
        qir0 qir0Var = this.d;
        int iHashCode = (iF + (qir0Var == null ? 0 : qir0Var.a.hashCode())) * 31;
        qir0 qir0Var2 = this.e;
        int iHashCode2 = (iHashCode + (qir0Var2 == null ? 0 : qir0Var2.a.hashCode())) * 31;
        var0 var0Var = this.f;
        int iG = xcg1.g(xcg1.g(f4i1.b((iHashCode2 + (var0Var == null ? 0 : var0Var.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        u8h1 u8h1Var = this.j;
        return iG + (u8h1Var != null ? u8h1Var.hashCode() : 0);
    }

    public rir0(y6r0 y6r0Var, n6r0 n6r0Var, long j, qir0 qir0Var, qir0 qir0Var2, var0 var0Var, List list, boolean z, boolean z2, u8h1 u8h1Var) {
        this.a = y6r0Var;
        this.b = n6r0Var;
        this.c = j;
        this.d = qir0Var;
        this.e = qir0Var2;
        this.f = var0Var;
        this.g = list;
        this.h = z;
        this.i = z2;
        this.j = u8h1Var;
    }
}
