package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nf0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf0(ven0 ven0Var, byte b) {
        super(3);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                jf0 jf0Var = (jf0) ven0Var.getValue();
                x340 x340Var = (b0k) obj2;
                if (jf0Var == null) {
                    x340Var.i0(-1747658944);
                } else {
                    x340Var.i0(-1747658943);
                    rf0.b(jf0Var.a, jf0Var.b, null, x340Var, 0);
                }
                x340Var.r(false);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                float fM = dsa0.m((b0k) obj2, 2131166901);
                float fD = ((i2c) obj).d();
                pzm.k((fD - zjy.j((fD - 0.0f) - 0.0f, new p3v(fM)).a) / 2.0f, ven0Var);
                return rih1Var;
            case 2:
                ifh0 ifh0Var = (ifh0) obj;
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                y9e1 y9e1Var = (y9e1) ven0Var.getValue();
                if (y9e1Var == null || (i = y9e1Var.b.f) <= 1) {
                    return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new f2(q5t0VarH, (byte) 10));
                }
                lr80 it = yoi1.Q(0, i).iterator();
                sr80 sr80Var = (sr80) it;
                if (!sr80Var.c) {
                    hhg1.k();
                    return null;
                }
                lr80 lr80Var = it;
                float fG = y9e1Var.g(lr80Var.nextInt());
                while (sr80Var.c) {
                    fG = Math.min(fG, y9e1Var.g(lr80Var.nextInt()));
                }
                lr80 it2 = yoi1.Q(0, i).iterator();
                sr80 sr80Var2 = (sr80) it2;
                if (!sr80Var2.c) {
                    hhg1.k();
                    return null;
                }
                lr80 lr80Var2 = it2;
                float fH = y9e1Var.h(lr80Var2.nextInt());
                while (sr80Var2.c) {
                    fH = Math.max(fH, y9e1Var.h(lr80Var2.nextInt()));
                }
                return ifh0Var.S((int) Math.ceil(fH - fG), q5t0VarH.b, b7xVar, new ci6(q5t0VarH, fG, (byte) 1));
            case 3:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                boolean zI = x340Var2.i(ven0Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new hnf(ven0Var, (byte) 24);
                    x340Var2.s0(objT);
                }
                itu.a((Function0) objT, x340Var2, 0);
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    qim0 qim0VarN = anm1.N("groupable-device-trailing", nim0Var);
                    Object objT2 = x340Var4.T();
                    if (objT2 == fkj0.X) {
                        objT2 = em50.h;
                        x340Var4.s0(objT2);
                    }
                    yoi1.b(zBooleanValue, (Function0) null, s161.b(qim0VarN, false, (iu30) objT2), false, (idn0) null, x340Var4, 48, 24);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(hjl.b(j, 0, 0, 0, ((Number) ven0Var.getValue()).intValue() + hjl.h(j), 7));
                return ((ifh0) obj).S(q5t0VarH2.a, q5t0VarH2.b, b7xVar, new fz40(q5t0VarH2, ven0Var, (byte) 15));
            case 6:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.b(18, apo.r(525289533, new xd2(ven0Var, (byte) 16), b0kVar), b0kVar, 54);
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                for (Object obj4 : sc11.b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    sc11 sc11Var = (sc11) obj4;
                    boolean zContains = ((Set) ven0Var.getValue()).contains(sc11Var);
                    x340 x340Var6 = x340Var5;
                    boolean zI2 = x340Var6.i(ven0Var) | x340Var6.e(sc11Var.ordinal());
                    Object objT3 = x340Var6.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new nt01(sc11Var, ven0Var, (byte) 6);
                        x340Var6.s0(objT3);
                    }
                    poo1.g(zContains, (iu30) objT3, new nex(6), yoo1.z(x340Var6), anm1.N("reflection_survey_sheet_adjective_" + i2, nim0Var), 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1033380771, new ziz0(sc11Var, (byte) 20), x340Var6), x340Var6, 0, 196608, 32736);
                    i2 = i3;
                }
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var8, 48);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, nim0Var);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(hmb0.t1);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(jw31VarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    nsx nsxVar = nsx.c;
                    zov0 zov0Var = cbx.b(x340Var8).g;
                    w0h1.a(nsxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var8).b.a, 0L, false, x340Var8, nsx.d | 48, 48);
                    uwo1.e(cwl1.o0(x340Var8, 2131963332), new wnb0(1.0f, true), cbx.d(x340Var8).g, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2032);
                    hux huxVar = no80.c(ven0Var) ? qlx.c : mlx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var8, 2131963332));
                    zov0 zov0Var2 = cbx.b(x340Var8).g;
                    w0h1.a(huxVar, jslVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var8).b.a, 0L, false, x340Var8, 8, 48);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }
}
