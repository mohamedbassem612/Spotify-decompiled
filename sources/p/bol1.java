package p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class bol1 implements jly0 {
    public static fcm1 A(j0q j0qVar) {
        return new fcm1(j0qVar);
    }

    public static vwm1 B(CallbackRouter callbackRouter) {
        return new vwm1(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 9)));
    }

    public static dmg1 a(ynb0 ynb0Var) {
        dmg1 dmg1Var = new dmg1((byte) 23);
        dmg1Var.b = ynb0Var;
        return dmg1Var;
    }

    public static j4m1 b(r7q r7qVar, g5t g5tVar, kly0 kly0Var, r7q r7qVar2, kly0 kly0Var2, caq caqVar, r7q r7qVar3, kly0 kly0Var3, r7q r7qVar4, caq caqVar2, r7q r7qVar5, r7q r7qVar6, r7q r7qVar7) {
        j4m1 j4m1Var = new j4m1();
        j4m1Var.a = r7qVar;
        j4m1Var.b = g5tVar;
        j4m1Var.c = kly0Var;
        j4m1Var.d = r7qVar2;
        j4m1Var.e = kly0Var2;
        j4m1Var.f = caqVar;
        j4m1Var.g = r7qVar3;
        j4m1Var.h = kly0Var3;
        j4m1Var.i = r7qVar4;
        j4m1Var.j = caqVar2;
        j4m1Var.k = r7qVar5;
        j4m1Var.l = r7qVar6;
        j4m1Var.m = r7qVar7;
        return j4m1Var;
    }

    public static lvm1 c(caq caqVar, kly0 kly0Var, r7q r7qVar, caq caqVar2, r7q r7qVar2, r7q r7qVar3, jo80 jo80Var, kly0 kly0Var2, r7q r7qVar4, r7q r7qVar5, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, r7q r7qVar6, r7q r7qVar7, kly0 kly0Var3, caq caqVar9, kly0 kly0Var4, caq caqVar10, caq caqVar11, kly0 kly0Var5, r7q r7qVar8, r7q r7qVar9, kly0 kly0Var6, caq caqVar12, caq caqVar13, kly0 kly0Var7, caq caqVar14, r7q r7qVar10, kly0 kly0Var8, caq caqVar15, caq caqVar16, caq caqVar17, kly0 kly0Var9, jo80 jo80Var2, jo80 jo80Var3, r7q r7qVar11, caq caqVar18, kly0 kly0Var10, caq caqVar19, r7q r7qVar12, caq caqVar20, kly0 kly0Var11, r7q r7qVar13, caq caqVar21, caq caqVar22, r7q r7qVar14, kly0 kly0Var12, kly0 kly0Var13, kly0 kly0Var14, g5t g5tVar, caq caqVar23, r7q r7qVar15, r7q r7qVar16, r7q r7qVar17, caq caqVar24, caq caqVar25, r7q r7qVar18, caq caqVar26, r7q r7qVar19, r7q r7qVar20, r7q r7qVar21, jly0 jly0Var, r7q r7qVar22, caq caqVar27, r7q r7qVar23, r7q r7qVar24, caq caqVar28, r7q r7qVar25, r7q r7qVar26, r7q r7qVar27, caq caqVar29, r7q r7qVar28, caq caqVar30, r7q r7qVar29, kly0 kly0Var15, r7q r7qVar30, r7q r7qVar31, caq caqVar31, kly0 kly0Var16, r7q r7qVar32, r7q r7qVar33, caq caqVar32, kly0 kly0Var17, kly0 kly0Var18, caq caqVar33) {
        lvm1 lvm1Var = new lvm1();
        lvm1Var.a = caqVar;
        lvm1Var.b = kly0Var;
        lvm1Var.c = r7qVar;
        lvm1Var.d = caqVar2;
        lvm1Var.e = r7qVar2;
        lvm1Var.f = r7qVar3;
        lvm1Var.g = jo80Var;
        lvm1Var.h = kly0Var2;
        lvm1Var.i = r7qVar4;
        lvm1Var.j = r7qVar5;
        lvm1Var.k = caqVar3;
        lvm1Var.l = caqVar4;
        lvm1Var.m = caqVar5;
        lvm1Var.n = caqVar6;
        lvm1Var.o = caqVar7;
        lvm1Var.p = caqVar8;
        lvm1Var.q = r7qVar6;
        lvm1Var.r = r7qVar7;
        lvm1Var.s = kly0Var3;
        lvm1Var.t = caqVar9;
        lvm1Var.u = kly0Var4;
        lvm1Var.v = caqVar10;
        lvm1Var.w = caqVar11;
        lvm1Var.x = kly0Var5;
        lvm1Var.y = r7qVar8;
        lvm1Var.z = r7qVar9;
        lvm1Var.A = kly0Var6;
        lvm1Var.B = caqVar12;
        lvm1Var.C = caqVar13;
        lvm1Var.D = kly0Var7;
        lvm1Var.E = caqVar14;
        lvm1Var.F = r7qVar10;
        lvm1Var.G = kly0Var8;
        lvm1Var.H = caqVar15;
        lvm1Var.I = caqVar16;
        lvm1Var.J = caqVar17;
        lvm1Var.K = kly0Var9;
        lvm1Var.L = jo80Var2;
        lvm1Var.M = jo80Var3;
        lvm1Var.N = r7qVar11;
        lvm1Var.O = caqVar18;
        lvm1Var.P = kly0Var10;
        lvm1Var.Q = caqVar19;
        lvm1Var.R = r7qVar12;
        lvm1Var.S = caqVar20;
        lvm1Var.T = kly0Var11;
        lvm1Var.U = r7qVar13;
        lvm1Var.V = caqVar21;
        lvm1Var.W = caqVar22;
        lvm1Var.X = r7qVar14;
        lvm1Var.Y = kly0Var12;
        lvm1Var.Z = kly0Var13;
        lvm1Var.a0 = kly0Var14;
        lvm1Var.b0 = g5tVar;
        lvm1Var.c0 = caqVar23;
        lvm1Var.d0 = r7qVar15;
        lvm1Var.e0 = r7qVar16;
        lvm1Var.f0 = r7qVar17;
        lvm1Var.g0 = caqVar24;
        lvm1Var.h0 = caqVar25;
        lvm1Var.i0 = r7qVar18;
        lvm1Var.j0 = caqVar26;
        lvm1Var.k0 = r7qVar19;
        lvm1Var.l0 = r7qVar20;
        lvm1Var.m0 = r7qVar21;
        lvm1Var.n0 = jly0Var;
        lvm1Var.o0 = r7qVar22;
        lvm1Var.p0 = caqVar27;
        lvm1Var.q0 = r7qVar23;
        lvm1Var.r0 = r7qVar24;
        lvm1Var.s0 = caqVar28;
        lvm1Var.t0 = r7qVar25;
        lvm1Var.u0 = r7qVar26;
        lvm1Var.v0 = r7qVar27;
        lvm1Var.w0 = caqVar29;
        lvm1Var.x0 = r7qVar28;
        lvm1Var.y0 = caqVar30;
        lvm1Var.z0 = r7qVar29;
        lvm1Var.A0 = kly0Var15;
        lvm1Var.B0 = r7qVar30;
        lvm1Var.C0 = r7qVar31;
        lvm1Var.D0 = caqVar31;
        lvm1Var.E0 = kly0Var16;
        lvm1Var.F0 = r7qVar32;
        lvm1Var.G0 = r7qVar33;
        lvm1Var.H0 = caqVar32;
        lvm1Var.I0 = kly0Var17;
        lvm1Var.J0 = kly0Var18;
        lvm1Var.K0 = caqVar33;
        return lvm1Var;
    }

    public static bum1 d(kly0 kly0Var, r7q r7qVar) {
        bum1 bum1Var = new bum1((byte) 2);
        bum1Var.b = kly0Var;
        bum1Var.c = r7qVar;
        return bum1Var;
    }

    public static opm1 e() {
        return new opm1();
    }

    public static d0r f(i2i1 i2i1Var) {
        return (rzq) i2i1Var.b;
    }

    public static List g(ipg ipgVar, jcc0 jcc0Var, spm1 spm1Var, ipg ipgVar2, z0t z0tVar) {
        smc0 smc0VarN = k4p1.n();
        fvm1 fvm1Var = z0tVar.a;
        if (!fvm1Var.j()) {
            smc0VarN.add(jcc0Var);
        }
        if (!fvm1Var.p()) {
            smc0VarN.add(spm1Var);
        }
        smc0VarN.add(ipgVar2);
        smc0VarN.add(ipgVar);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        c8o.m(smc0VarK);
        return smc0VarK;
    }

    public static iyh1 h(mzp mzpVar) {
        return new iyh1(mzpVar, (byte) 20);
    }

    public static iyh1 i(h0q h0qVar) {
        return new iyh1(h0qVar, (byte) 19);
    }

    public static iyh1 j(l0q l0qVar) {
        return new iyh1(l0qVar, (byte) 21);
    }

    public static iyh1 k(m0q m0qVar) {
        return new iyh1(m0qVar, (byte) 25);
    }

    public static iyh1 l(n0q n0qVar) {
        return new iyh1(n0qVar, (byte) 29);
    }

    public static iyh1 m(k3q k3qVar) {
        return new iyh1(k3qVar, (byte) 22);
    }

    public static iyh1 n(l3q l3qVar) {
        return new iyh1(l3qVar, (byte) 23);
    }

    public static iyh1 o(w7q w7qVar) {
        return new iyh1(w7qVar, (byte) 24);
    }

    public static iyh1 p(jbq jbqVar) {
        return new iyh1(jbqVar, (byte) 26);
    }

    public static iyh1 q(ujq ujqVar) {
        return new iyh1(ujqVar, (byte) 27);
    }

    public static hhm1 r(xzp xzpVar) {
        return new hhm1(xzpVar, (byte) 1);
    }

    public static hhm1 s(jbq jbqVar) {
        return new hhm1(jbqVar, (byte) 0);
    }

    public static iyh1 t(k3q k3qVar) {
        return new iyh1(k3qVar, (byte) 28);
    }

    public static yh71 u(Activity activity) {
        return new yh71(activity);
    }

    public static jge v(tp41 tp41Var, j810 j810Var, pl01 pl01Var, fk41 fk41Var) {
        return hu20.e(new x010(pl01Var.a, fk41Var.a, new irp0(3, (lnm) null, (byte) 28), (byte) 1), new afb1((lnm) null, hu20.e(rqt0.u(i6p1.u(zro1.w(j810Var), Boolean.FALSE)), new af01((lnm) null, new m7y0(tp41Var, j810Var, (byte) 20), (byte) 8)), (byte) 20));
    }

    public static p8m1 w(Context context, gw70 gw70Var, w5b1 w5b1Var, pe peVar, tjs0 tjs0Var, woa woaVar, v290 v290Var, zxl1 zxl1Var, bih1 bih1Var, ti31 ti31Var, kj31 kj31Var, cik1 cik1Var, zle1 zle1Var, qpj1 qpj1Var, obm1 obm1Var, xgm1 xgm1Var, ohm1 ohm1Var, py7 py7Var, njx0 njx0Var, tmd0 tmd0Var, sme1 sme1Var, ard1 ard1Var, vhd0 vhd0Var, idm1 idm1Var, tjz tjzVar, ryc1 ryc1Var, xf6 xf6Var, t2j0 t2j0Var) {
        cxc cxcVarC = w5b1Var.d.c();
        eb80 eb80Var = new eb80(tmd0Var, (byte) 12);
        cpr cprVar = new cpr(t2j0Var);
        zgl1 zgl1Var = new zgl1(1, py7Var, py7.class, "resolveAudioUrl", "resolveAudioUrl(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 11);
        cfg cfgVar = new cfg(peVar, tjs0Var, gw70Var, cxcVarC, woaVar, v290Var, bih1Var, ti31Var, kj31Var, qpj1Var, ryc1Var, zxl1Var, new sjf1(0, obm1Var, obm1.class, "onInteraction", "onInteraction()V", 0, (byte) 21), new mim1(xgm1Var, (byte) 0), new fak1(xgm1Var, (byte) 21));
        ajh1 ajh1Var = new ajh1(cik1Var);
        se8 se8Var = new se8(peVar, tjs0Var, cxcVarC, ti31Var, kj31Var);
        yhd0 yhd0Var = new yhd0(peVar, tjs0Var, ti31Var, kj31Var, zxl1Var);
        f6f1 f6f1Var = new f6f1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, ard1Var);
        g7f1 g7f1Var = new g7f1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, ard1Var, xgm1Var);
        t7f1 t7f1Var = new t7f1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 0);
        se8 se8Var2 = new se8(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 0);
        se8 se8Var3 = new se8(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 1);
        pcf1 pcf1Var = new pcf1(gw70Var, woaVar, v290Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, xgm1Var, tjzVar);
        xcf1 xcf1Var = new xcf1(gw70Var, woaVar, v290Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, xgm1Var, tjzVar);
        be6 be6Var = new be6(gw70Var, ti31Var, kj31Var, peVar, tjs0Var, cxcVarC, bih1Var);
        vh6 vh6Var = new vh6(gw70Var, ti31Var, kj31Var, peVar, tjs0Var, cxcVarC, xf6Var);
        oe6 oe6Var = new oe6(gw70Var, ti31Var, kj31Var, peVar, tjs0Var, cxcVarC, xf6Var, xgm1Var);
        ebf1 ebf1Var = new ebf1(ti31Var, kj31Var, peVar, tjs0Var, cxcVarC, ard1Var);
        idf1 idf1Var = new idf1();
        hb90 hb90Var = new hb90(gw70Var, woaVar, ti31Var, kj31Var, peVar, tjs0Var, cxcVarC, xgm1Var);
        xbf1 xbf1Var = new xbf1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, ard1Var, xgm1Var);
        t7f1 t7f1Var2 = new t7f1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 1);
        o9f1 o9f1Var = new o9f1(peVar, cxcVarC, gw70Var, tjs0Var, ti31Var, kj31Var, xgm1Var);
        se8 se8Var4 = new se8(ti31Var, kj31Var, peVar, tjs0Var, cxcVarC);
        return new p8m1(zle1Var, new oim1(py7Var, njx0Var), new oim1(njx0Var, py7Var), cfgVar, ajh1Var, se8Var, yhd0Var, f6f1Var, g7f1Var, t7f1Var, se8Var2, se8Var3, be6Var, vh6Var, oe6Var, ebf1Var, idf1Var, hb90Var, xbf1Var, t7f1Var2, o9f1Var, new jaf1(gw70Var, peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, ard1Var, xgm1Var), pcf1Var, xcf1Var, se8Var4, new se8(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 4), new qla(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, ohm1Var, xgm1Var, vhd0Var), new qme1(peVar, tjs0Var, w5b1Var.c.c(), ti31Var, kj31Var, xgm1Var, ohm1Var, sme1Var), new se8(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 6), new odm1(peVar, tjs0Var, gw70Var, context, cxcVarC, idm1Var), new se8(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, (byte) 5), new vh6(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, xgm1Var), new rb90(peVar, tjs0Var, ti31Var, kj31Var, cxcVarC, xgm1Var), new vh6(peVar, cxcVarC, gw70Var, tjs0Var, ti31Var, kj31Var, xgm1Var), new oe6(peVar, tjs0Var, cxcVarC, ti31Var, kj31Var, eb80Var, cprVar, new mim1(xgm1Var, (byte) 1)), new rb90(peVar, tjs0Var, cxcVarC, ti31Var, kj31Var, new mim1(xgm1Var, (byte) 2)), new vh6(peVar, tjs0Var, gw70Var, cxcVarC, ti31Var, kj31Var, new mim1(xgm1Var, (byte) 3)), zgl1Var);
    }

    public static aol1 x(RetrofitMaker retrofitMaker) {
        return (aol1) retrofitMaker.createWebgateService(aol1.class, "android-device-predictability-where-to-play-impl");
    }

    public static vql1 y(Activity activity) {
        return Build.VERSION.SDK_INT >= 30 ? new xql1(activity.getWindow().getDecorView()) : new yql1();
    }

    public static kyl1 z(fn20 fn20Var, ytw0 ytw0Var, vpp0 vpp0Var, xrc0 xrc0Var, RetrofitMaker retrofitMaker, Context context) {
        return new kyl1(fn20Var, ytw0Var, vpp0Var, xrc0Var, retrofitMaker, context);
    }
}
