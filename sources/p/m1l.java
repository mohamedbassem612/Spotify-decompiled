package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class m1l {
    public static final String a = nik1.s6.a;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        oex oexVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-506539747);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952804);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).b.e;
            if (z) {
                b0kVar3.i0(-2105195264);
                boolean zF = b0kVar3.f(j);
                Object objT = b0kVar3.T();
                if (zF || objT == m4cVar) {
                    objT = new sre((byte) 9, j);
                    b0kVar3.s0(objT);
                }
                vu30 vu30Var = (vu30) objT;
                vu30 vu30Var2 = ((pgx) ogx.e).b;
                boolean zF2 = b0kVar3.f(j);
                Object objT2 = b0kVar3.T();
                if (zF2 || objT2 == m4cVar) {
                    objT2 = new sre((byte) 10, j);
                    b0kVar3.s0(objT2);
                }
                oexVar = new oex(0, vu30Var, vu30Var2, (vu30) objT2, 1);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-2104998879);
                b0kVar3.r(false);
                oexVar = pex.b;
            }
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            lex lexVarZ = yoo1.z(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, oexVar, lexVarZ, anm1.N("connect_apps_chip", qim0Var3), 0, (String) null, (max) null, apo.r(-683696155, new dr0((byte) 16, z), b0kVar3), (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1361082952, new pji(strO0, (byte) 15), b0kVar3), b0kVar2, 12582912, 3072, 8048);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var2, i, (byte) 6);
        }
    }
}
