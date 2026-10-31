package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w8o0 extends qx81 implements wod {
    public final int b;
    public final x8o0 c;
    public final gmh1 d;
    public final e0h1 e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public w8o0(int i, x8o0 x8o0Var, gmh1 gmh1Var, e0h1 e0h1Var, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            e0h1.b.getClass();
            e0h1Var = e0h1.c;
        }
        this(i, x8o0Var, gmh1Var, e0h1Var, (i2 & 16) != 0 ? false : z, false);
    }

    @Override // p.qx81
    /* JADX INFO: renamed from: A0 */
    public final qx81 x0(boolean z) {
        return new w8o0(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: B0 */
    public final qx81 z0(e0h1 e0h1Var) {
        return new w8o0(this.b, this.c, this.d, e0h1Var, this.f, this.g);
    }

    @Override // p.gmh1
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final w8o0 y0(g8b0 g8b0Var) {
        x8o0 x8o0Var = this.c;
        e1h1 e1h1VarD = x8o0Var.a.d(g8b0Var);
        vqb0 vqb0Var = x8o0Var.b != null ? new vqb0(x8o0Var, g8b0Var, (byte) 3) : null;
        x8o0 x8o0Var2 = x8o0Var.c;
        if (x8o0Var2 == null) {
            x8o0Var2 = x8o0Var;
        }
        x8o0 x8o0Var3 = new x8o0(e1h1VarD, (Function0) vqb0Var, x8o0Var2, x8o0Var.d);
        gmh1 gmh1Var = this.d;
        return new w8o0(this.b, x8o0Var3, gmh1Var != null ? gmh1Var : null, this.e, this.f, 32);
    }

    @Override // p.a8b0
    public final zpi0 E() {
        return bkz.a(1, true, new String[0]);
    }

    @Override // p.a8b0
    public final List r0() {
        return z6x.a;
    }

    @Override // p.a8b0
    public final e0h1 s0() {
        return this.e;
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return this.c;
    }

    @Override // p.a8b0
    public final boolean u0() {
        return this.f;
    }

    @Override // p.qx81, p.gmh1
    public final gmh1 x0(boolean z) {
        return new w8o0(this.b, this.c, this.d, this.e, z, 32);
    }

    public w8o0(int i, x8o0 x8o0Var, gmh1 gmh1Var, e0h1 e0h1Var, boolean z, boolean z2) {
        this.b = i;
        this.c = x8o0Var;
        this.d = gmh1Var;
        this.e = e0h1Var;
        this.f = z;
        this.g = z2;
    }
}
