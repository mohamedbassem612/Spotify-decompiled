package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mzs0 {
    public static final void a(b1t0 b1t0Var, iu30 iu30Var, q8n q8nVar, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1109164911);
        int i2 = i | (x340Var.g(b1t0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(q8nVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = v0r0.c1;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = mgo1.e(0, 1, 0, 5);
                x340Var.s0(objT2);
            }
            mr20 mr20Var = (sen0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                abh0 abh0Var = new abh0(ven0Var, (byte) 23);
                azr0 azr0Var = new azr0(iu30Var, (byte) 7);
                z = false;
                FlowEventSources.a.getClass();
                objT3 = q1o1.u(new u63(abh0Var, azr0Var, new b(q8nVar, new mr20[]{mr20Var})), null, null, 7);
                x340Var.s0(objT3);
            } else {
                z = false;
            }
            xpw xpwVar = (xpw) objT3;
            n1t0 n1t0Var = b1t0Var.a;
            boolean zI = ((i2 & 14) != 4 ? z : true) | x340Var.i(mr20Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj) {
                objT4 = new tv1(b1t0Var, mr20Var, null);
                x340Var.s0(objT4);
            }
            qxd0.t(n1t0Var, x340Var, (vu30) objT4);
            boolean zG = x340Var.g((String) ven0Var.getValue());
            Object objT5 = x340Var.T();
            if (zG || objT5 == obj) {
                objT5 = new pys0((String) ven0Var.getValue(), kzs0.a, null);
                x340Var.s0(objT5);
            }
            otw.c(xpwVar, (pys0) objT5, (qim0) null, (ipb1) null, x340Var, 64, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(b1t0Var, iu30Var, q8nVar, i, (byte) 7);
        }
    }

    public static final void b(b1t0 b1t0Var, iu30 iu30Var, ae30 ae30Var, q8n q8nVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1384034452);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(b1t0Var) : b0kVar3.i(b1t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(ae30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(q8nVar) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new q1t0();
                b0kVar3.s0(objT);
            }
            q1t0 q1t0Var = (q1t0) objT;
            boolean z = (i2 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new g0s0(iu30Var, (byte) 20);
                b0kVar3.s0(objT2);
            }
            q3p1.b(0, 1, (Function0) objT2, b0kVar3, false);
            WeakHashMap weakHashMap = osl1.x;
            b0kVar2 = b0kVar3;
            irn1.u(null, apo.r(1553897921, new hws0(es41VarC, iu30Var, (byte) 3), b0kVar3), null, lhc.g(b0kVar3).g, apo.r(500924091, new mse(es41VarC, b1t0Var, iu30Var, q8nVar, q1t0Var, ae30Var, (byte) 8), b0kVar3), b0kVar2, 24624, 5);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, b1t0Var, iu30Var, ae30Var, q8nVar, (byte) 0);
        }
    }
}
