package defpackage;

import p.b0k;
import p.bw91;
import p.c380;
import p.c97;
import p.fkj0;
import p.h311;
import p.iu30;
import p.j0o1;
import p.jsg;
import p.lnm;
import p.m4c;
import p.nim0;
import p.o95;
import p.qim0;
import p.qxd0;
import p.rih1;
import p.u291;
import p.vu30;
import p.x340;
import p.xto;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class f {
    public static final jsg a = yoi1.J(32.0f, 72.0f);

    public static final void a(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-19188011);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | 48;
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.p();
                x340Var.s0(objT);
            }
            bw91 bw91Var = (bw91) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = c97.b(0.0f);
                x340Var.s0(objT2);
            }
            o95 o95Var = (o95) objT2;
            boolean zI = x340Var.i(o95Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new b(o95Var, (lnm) null, (byte) 0);
                x340Var.s0(objT3);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) objT3);
            boolean zI2 = x340Var.i(o95Var) | ((i2 & 14) == 4);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new c(o95Var, bw91Var, c380Var, null);
                x340Var.s0(objT4);
            }
            qxd0.t(rih1Var, x340Var, (vu30) objT4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zI3 = x340Var.i(o95Var);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new d(o95Var, bw91Var, b);
                x340Var.s0(objT5);
            }
            j0o1.b(0, x340Var, (iu30) objT5, qim0VarD);
            qim0Var = nim0Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 0);
        }
    }
}
