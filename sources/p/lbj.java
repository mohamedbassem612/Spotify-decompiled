package p;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lbj extends hab0 implements xu30 {
    public static final lbj N0;
    public static final lbj O0;
    public static final lbj P0;
    public static final lbj Q0;
    public static final lbj R0;
    public static final lbj S0;
    public static final lbj T0;
    public static final lbj U0;
    public static final lbj V0;
    public static final lbj W0;
    public static final lbj X;
    public static final lbj X0;
    public static final lbj Y;
    public static final lbj Y0;
    public static final lbj Z;
    public static final lbj Z0;
    public static final lbj a1;
    public static final lbj b;
    public static final lbj b1;
    public static final lbj c;
    public static final lbj c1;
    public static final lbj d;
    public static final lbj d1;
    public static final lbj e;
    public static final lbj e1;
    public static final lbj f;
    public static final lbj g;
    public static final lbj h;
    public static final lbj i;
    public static final lbj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new lbj(i2, (byte) 0);
        c = new lbj(i2, (byte) 1);
        d = new lbj(i2, (byte) 2);
        e = new lbj(i2, (byte) 3);
        f = new lbj(i2, (byte) 4);
        g = new lbj(i2, (byte) 5);
        h = new lbj(i2, (byte) 6);
        i = new lbj(i2, (byte) 7);
        t = new lbj(i2, (byte) 8);
        X = new lbj(i2, (byte) 9);
        Y = new lbj(i2, (byte) 10);
        Z = new lbj(i2, (byte) 11);
        N0 = new lbj(i2, (byte) 12);
        O0 = new lbj(i2, (byte) 13);
        P0 = new lbj(i2, (byte) 14);
        Q0 = new lbj(i2, (byte) 15);
        R0 = new lbj(i2, (byte) 16);
        S0 = new lbj(i2, (byte) 17);
        T0 = new lbj(i2, (byte) 18);
        U0 = new lbj(i2, (byte) 19);
        V0 = new lbj(i2, (byte) 20);
        W0 = new lbj(i2, (byte) 21);
        X0 = new lbj(i2, (byte) 22);
        Y0 = new lbj(i2, (byte) 23);
        Z0 = new lbj(i2, (byte) 24);
        a1 = new lbj(i2, (byte) 25);
        b1 = new lbj(i2, (byte) 26);
        c1 = new lbj(i2, (byte) 27);
        d1 = new lbj(i2, (byte) 28);
        e1 = new lbj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                b6p1.g(oep0.a, anm1.N("loading", u291.h(u291.f(nim0Var, 1.0f), 256.0f)), 0.0f, 0.0f, (dqz0) null, (b0k) obj2, 0);
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                lro1.c(cwl1.o0(b0kVar, 2131955625), (qim0) null, (xu30) null, b0kVar, 0, 6);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                lro1.c(cwl1.o0(b0kVar2, 2131955626), (qim0) null, (xu30) null, b0kVar2, 0, 6);
                return rih1Var;
            case 3:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(b0kVar3, 2131955648);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar3).e;
                cjc0 cjc0Var = new cjc0(1);
                float f2 = cbx.b(b0kVar3).e.b;
                cvx cvxVar = cbx.b(b0kVar3).b;
                uwo1.e(strO0, uyn1.y(nim0Var, f2, 16.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, b0kVar3, 0, 0, 1784);
                return rih1Var;
            case 4:
                ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qro1.i(0, 3, (String) null, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    rqo1.g(0, 0, x340Var6, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var8).b;
                    rqo1.g(0, 0, x340Var8, uyn1.z(0.0f, 8.0f, 1, nim0Var));
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var9, 0);
                x340 x340Var10 = x340Var9;
                int iHashCode = Long.hashCode(x340Var10.T);
                xos0 xos0VarM = x340Var10.m();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var9, nim0Var2);
                hzj.A.getClass();
                x340 x340Var11 = x340Var9;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var9, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var9, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var9, lljVar3);
                nko1.F(x340Var9);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var9, lljVar4);
                l4p1.k(180.0f, 13.0f, 0, 0, x340Var9, uyn1.B(nim0Var2, 0.0f, 15.0f, 0.0f, 0.0f, 13));
                uwr uwrVar4 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var9).b;
                l4p1.k(150.0f, 13.0f, 0, 0, x340Var9, uyn1.B(nim0Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13));
                cvx cvxVar5 = cbx.b(x340Var9).b;
                l4p1.k(90.0f, 13.0f, 0, 0, x340Var9, uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                jw31 jw31VarA = ew31.a(h36.b, een.Z, x340Var9, 0);
                int iHashCode2 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM2 = x340Var11.m();
                qim0 qim0VarE2 = zr7.E(x340Var9, qim0VarF);
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(jw31VarA, x340Var9, lljVar);
                nko1.H(xos0VarM2, x340Var9, lljVar2);
                i3a.l(iHashCode2, x340Var9, lljVar3, x340Var9);
                nko1.H(qim0VarE2, x340Var9, lljVar4);
                l4p1.l(cbx.b(x340Var9).b.c, 0, 2, x340Var9, (qim0) null);
                x340Var11.r(true);
                x340Var11.r(true);
                return rih1Var;
            case 11:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar5 = cbx.a;
                float f3 = cbx.b(b0kVar4).b.c;
                cvx cvxVar6 = cbx.b(b0kVar4).b;
                l4p1.l(f3, 0, 0, b0kVar4, uyn1.z(8.0f, 0.0f, 2, nim0Var));
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                l4p1.k(130.0f, 13.0f, 0, 4, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                l4p1.k(140.0f, 16.0f, 0, 4, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                l4p1.k(140.0f, 16.0f, 0, 4, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                l4p1.k(130.0f, 13.0f, 0, 4, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 16:
                ((Number) obj3).intValue();
                l4p1.k(48.0f, 48.0f, 0, 4, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 17:
                x340 x340Var12 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                x340 x340Var13 = x340Var12;
                u85 u85Var = (erl1) x340Var13.k(szf0.b);
                if (u85Var == null) {
                    x340Var13.i0(-241884180);
                    WeakHashMap weakHashMap = osl1.x;
                    u85Var = lhc.g(x340Var13).g;
                } else {
                    x340Var13.i0(-241885792);
                }
                x340Var13.r(false);
                op71.g(x340Var12, yoo1.D(qim0VarF2, u85Var));
                return rih1Var;
            case 18:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    clx clxVar = clx.c;
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var15).g;
                    w0h1.a(clxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var15).b.a, 0L, false, x340Var15, clx.d | 48, 48);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    cr31 cr31Var = er31.a;
                    ogx ogxVar = ogx.e;
                    gra graVar = een.h;
                    uwr uwrVar7 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var17).b;
                    cwl1.b((qim0) null, graVar, cr31Var, ogxVar, new zzq0(12.0f, 12.0f, 12.0f, 12.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, cdj.b, x340Var17, 3120, 48, 2017);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 20:
                g2c g2cVar = (g2c) obj;
                x340 x340Var18 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var18.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    qim0 qim0VarA = g2cVar.a(nim0Var, een.h);
                    String strO1 = cwl1.o0(x340Var19, 2131957827);
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(strO1, qim0VarA, cbx.d(x340Var19).h, cbx.a(x340Var19).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2016);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 21:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar9 = cbx.a;
                w0h1.a(plxVar, isl.a, nim0.a, cbx.a(b0kVar5).b.a, 0L, false, b0kVar5, plx.d | 432, 48);
                return rih1Var;
            case 22:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarL0 = cwl1.l0(nim0Var, 0L, (hw61) null, 15);
                uwr uwrVar10 = cbx.a;
                uwo1.e(nhc1.V(40, " "), qim0VarL0, cbx.d(b0kVar6).g, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar6, 0, 0, 1720);
                return rih1Var;
            case 23:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                as80 as80Var = mif1.P0;
                Uri uri = Uri.EMPTY;
                ltx ltxVar = ltx.c;
                nux nuxVar = new nux(ltxVar, ltxVar);
                uwr uwrVar11 = cbx.a;
                cua cuaVar = cbx.b(b0kVar7).f;
                qim0 qim0VarQ = i1p1.q(nim0Var, er31.b(4.0f));
                cbx.a.getClass();
                eso1.e(uri, isl.a, anm1.N("artwork", hno1.f(qim0VarQ, uwr.a())), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar7, 1073741872, 0, 3512);
                return rih1Var;
            case 24:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var20, 0);
                x340 x340Var21 = x340Var20;
                int iHashCode3 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM3 = x340Var21.m();
                qim0 qim0VarE3 = zr7.E(x340Var20, nim0Var);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(mbhVarA2, x340Var20, y580.O0);
                nko1.H(xos0VarM3, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE3, x340Var20, y580.Y);
                qim0 qim0VarL1 = cwl1.l0(nim0Var, 0L, (hw61) null, 15);
                uwr uwrVar12 = cbx.a;
                uwo1.e(nhc1.V(40, " "), qim0VarL1, cbx.d(x340Var20).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var20, 0, 0, 1720);
                uwo1.e(nhc1.V(20, " "), cwl1.l0(nim0Var, 0L, (hw61) null, 15), cbx.d(x340Var20).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var20, 0, 0, 1720);
                x340Var22.r(true);
                return rih1Var;
            case 25:
                ((Number) obj3).intValue();
                return rih1Var;
            case 26:
                b0k b0kVar8 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar2 = plx.c;
                uwr uwrVar13 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar8).g;
                w0h1.a(plxVar2, isl.a, u291.r(nim0Var, 16.0f), cbx.a(b0kVar8).c.b, 0L, false, b0kVar8, plx.d | 48, 48);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Bitmap bitmap = (Bitmap) obj;
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (bitmap != null) {
                    x340 x340Var24 = x340Var23;
                    x340Var24.i0(-1038228660);
                    cwl1.g(new yk4(bitmap), (String) null, u291.d(nim0Var, 1.0f), mif1.P0, 0, x340Var24, 48, 232);
                    x340Var24.r(false);
                } else {
                    x340 x340Var25 = x340Var23;
                    x340Var25.i0(-1038049852);
                    t1c.a(u291.d(nim0Var, 1.0f), x340Var25, 0);
                    x340Var25.r(false);
                }
                return rih1Var;
            case 28:
                x340 x340Var26 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var27 = x340Var26;
                if (!x340Var27.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x340Var27.b0();
                }
                return rih1Var;
            default:
                b0k b0kVar9 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar14 = cbx.a;
                uwo1.e(cwl1.o0(b0kVar9, 2131962795), (qim0) null, cbx.d(b0kVar9).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar9, 0, 0, 2042);
                return rih1Var;
        }
    }
}
