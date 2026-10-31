package p;

import java.io.Closeable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ry21 implements Closeable {
    public final i25 N0;
    public final a6g1 O0;
    public upc P0;
    public final boolean Q0;
    public final boolean R0;
    public final ry21 X;
    public final long Y;
    public final long Z;
    public final ln21 a;
    public final bjy0 b;
    public final String c;
    public final int d;
    public final ms50 e;
    public final v360 f;
    public final uz21 g;
    public final a6a1 h;
    public final ry21 i;
    public final ry21 t;

    public ry21(ln21 ln21Var, bjy0 bjy0Var, String str, int i, ms50 ms50Var, v360 v360Var, uz21 uz21Var, a6a1 a6a1Var, ry21 ry21Var, ry21 ry21Var2, ry21 ry21Var3, long j, long j2, i25 i25Var, a6g1 a6g1Var) {
        this.a = ln21Var;
        this.b = bjy0Var;
        this.c = str;
        this.d = i;
        this.e = ms50Var;
        this.f = v360Var;
        this.g = uz21Var;
        this.h = a6a1Var;
        this.i = ry21Var;
        this.t = ry21Var2;
        this.X = ry21Var3;
        this.Y = j;
        this.Z = j2;
        this.N0 = i25Var;
        this.O0 = a6g1Var;
        boolean z = true;
        this.Q0 = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.R0 = z;
    }

    public final upc a() {
        upc upcVar = this.P0;
        if (upcVar != null) {
            return upcVar;
        }
        upc upcVar2 = upc.n;
        upc upcVarY = nyn1.Y(this.f);
        this.P0 = upcVarY;
        return upcVarY;
    }

    public final zx21 c() {
        zx21 zx21Var = new zx21();
        zx21Var.c = -1;
        zx21Var.g = uz21.a;
        zx21Var.o = a6g1.u0;
        zx21Var.a = this.a;
        zx21Var.b = this.b;
        zx21Var.c = this.d;
        zx21Var.d = this.c;
        zx21Var.e = this.e;
        zx21Var.f = m5n1.i(this.f);
        zx21Var.g = this.g;
        zx21Var.h = this.h;
        zx21Var.i = this.i;
        zx21Var.j = this.t;
        zx21Var.k = this.X;
        zx21Var.l = this.Y;
        zx21Var.m = this.Z;
        zx21Var.n = this.N0;
        zx21Var.o = this.O0;
        return zx21Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
