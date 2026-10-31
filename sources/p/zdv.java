package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class zdv {
    public static final uvx a = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 26);
    public static final List b = p7h.M(new lia1[]{lia1.b, lia1.c, lia1.d, lia1.e});

    public static final void a(lia1 lia1Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-629477523);
        int i2 = i | (x340Var.e(lia1Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            scx scxVarM = pno1.m(x340Var);
            x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(1820156908, new nzd((Object) lia1Var, (Object) iu30Var, (Object) scxVarM, (byte) 23), x340Var), x340Var, (i2 >> 6) & 14, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((Object) lia1Var, (Object) iu30Var, (Object) function0, i, (byte) 25);
        }
    }

    public static final void b(lia1 lia1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1908092436);
        int i4 = i | (x340Var2.e(lia1Var.ordinal()) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("dsl_sort_sheet", qim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            jto1.b((qim0) null, a, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, kki.a, x340Var2, 64, 196608, 32765);
            x340Var = x340Var2;
            x340Var.i0(-493383014);
            List list = b;
            int i5 = 0;
            for (int size = list.size(); i5 < size; size = size) {
                lia1 lia1Var2 = (lia1) list.get(i5);
                boolean z2 = lia1Var2 == lia1Var;
                int iOrdinal = lia1Var2.ordinal();
                if (iOrdinal == 0) {
                    z = false;
                    i2 = -2118751633;
                    i3 = 2131964153;
                } else if (iOrdinal == 1) {
                    z = false;
                    i2 = -2118748239;
                    i3 = 2131964158;
                } else if (iOrdinal == 2) {
                    z = false;
                    i2 = -2118744525;
                    i3 = 2131964159;
                } else {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, -2118752406, false);
                    }
                    i2 = -2118740630;
                    i3 = 2131964160;
                    z = false;
                }
                String strK = x0d.k(x340Var, i2, i3, x340Var, z);
                boolean zE = ((i4 & 112) == 32) | x340Var.e(lia1Var2.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = new f2t(iu30Var, lia1Var2, (byte) 16);
                    x340Var.s0(objT);
                }
                gbx gbxVar = new gbx(new y50(strK), (Function0) objT);
                qim0 qim0VarN2 = anm1.N("dsl_sort_option_" + lia1Var2.name(), nim0.a);
                boolean zH = x340Var.h(z2);
                Object objT2 = x340Var.T();
                if (zH || objT2 == m4cVar) {
                    objT2 = new gy((byte) 19, z2);
                    x340Var.s0(objT2);
                }
                x340 x340Var3 = x340Var;
                jto1.b(s161.b(qim0VarN2, false, (iu30) objT2), a, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(711608326, new aw1((byte) 22, z2), x340Var), (xu30) null, (xu30) null, apo.r(-1000358365, new c2(strK, z2, (byte) 4), x340Var), x340Var3, 64, 196992, 28604);
                x340Var = x340Var3;
                i5++;
                list = list;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((Object) lia1Var, (Object) iu30Var, (Object) qim0Var, i, (byte) 26);
        }
    }
}
