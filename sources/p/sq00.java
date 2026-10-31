package p;

import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sq00 {
    public final Flowable a;
    public final m7p0 b;
    public final siq c;
    public final d7p0 d;

    public sq00(Flowable flowable, m7p0 m7p0Var, siq siqVar, d7p0 d7p0Var) {
        this.a = flowable;
        this.b = m7p0Var;
        this.c = siqVar;
        this.d = d7p0Var;
    }

    public final void a(boolean z, u6p0 u6p0Var, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-512884740);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(u6p0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        boolean z2 = true;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Function0 function0 = u6p0Var.a;
            boolean zI = ((i2 & 112) == 32) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new f0z(this, u6p0Var, (byte) 22);
                x340Var.s0(objT);
            }
            qxd0.i(function0, (iu30) objT, x340Var);
            int i3 = i2 << 9;
            siq siqVar = this.c;
            boolean zG = x340Var.g(siqVar);
            Flowable flowable = this.a;
            boolean zG2 = zG | x340Var.g(flowable);
            if ((((i3 & 7168) ^ 3072) <= 2048 || !x340Var.h(z)) && (i3 & 3072) != 2048) {
                z2 = false;
            }
            boolean z3 = zG2 | z2;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == obj) {
                objT2 = new l0g0(siqVar, flowable, this.b, z);
                x340Var.s0(objT2);
            }
            mue1.l((l0g0) objT2, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs(this, z, u6p0Var, i, (byte) 17);
        }
    }
}
