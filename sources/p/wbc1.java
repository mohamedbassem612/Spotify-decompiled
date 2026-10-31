package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wbc1 implements o1i {
    public final cce a;
    public final q9l1 b;
    public final mv2 c;
    public final hcl1 d;
    public final t75 e;

    public wbc1(cce cceVar, q9l1 q9l1Var, mv2 mv2Var, hcl1 hcl1Var, t75 t75Var) {
        this.a = cceVar;
        this.b = q9l1Var;
        this.c = mv2Var;
        this.d = hcl1Var;
        this.e = t75Var;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "storytelling_default_layout", ((ubc1) z0iVar).h, null, 8));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ubc1 ubc1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ubc1 ubc1Var2 = ubc1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1838178502);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ubc1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new gga1(this, (byte) 28);
                x340Var.s0(objT);
            }
            int i4 = i3 & 112;
            ajo1.p(this.a, o0iVar, ubc1Var, (Function0) objT, this.b.h, qim0Var, x340Var, 64 | i4 | ((i3 << 6) & 896) | ((i3 << 9) & 458752));
            ubc1Var2 = ubc1Var;
            int i5 = i3 & 14;
            boolean zI2 = x340Var.i(this) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar))) | (i5 == 4);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new ny51(this, o0iVar, ubc1Var2, (byte) 26);
                x340Var.s0(objT2);
            }
            oto1.c(ubc1Var2, o0iVar, (iu30) objT2, x340Var, i5 | 64 | i4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, ubc1Var2, o0iVar, qim0Var, (byte) 28);
        }
    }
}
