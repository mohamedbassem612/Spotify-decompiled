package defpackage;

import kotlin.jvm.functions.Function0;
import p.a0e1;
import p.apo;
import p.b0k;
import p.c9n;
import p.cbx;
import p.een;
import p.gfx;
import p.h311;
import p.h36;
import p.hmb0;
import p.hzj;
import p.jbh;
import p.mbh;
import p.nim0;
import p.nko1;
import p.qim0;
import p.tgp1;
import p.uwo1;
import p.uwr;
import p.uyn1;
import p.vy71;
import p.x340;
import p.xos0;
import p.y580;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o {
    public static final void a(String str, String str2, String str3, String str4, c9n c9nVar, vy71 vy71Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1364616419);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.i(c9nVar) ? 16384 : 8192) | (x340Var.i(vy71Var) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(qim0Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str, uyn1.y(nim0Var, 16.0f, 16.0f), cbx.d(x340Var).d, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            uwo1.e(str2, uyn1.y(nim0Var, 16.0f, 16.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            uwo1.e(str3, uyn1.y(nim0Var, 16.0f, 16.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 6) & 14, 0, 2016);
            gfx.g(4, apo.r(724882016, new m(qim0Var, str4, c9nVar, vy71Var, function0, (byte) 0), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, str2, str3, str4, c9nVar, vy71Var, function0, qim0Var, i, (byte) 0);
        }
    }
}
