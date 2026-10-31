package p;

import android.app.Application;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class yx61 implements jly0 {
    public static h5a1 A(wpq wpqVar) {
        return new h5a1(wpqVar.c().q(), (byte) 18);
    }

    public static ekb B(nn61 nn61Var) {
        c8o.l((xrc0) nn61Var.b);
        return new ekb((byte) 24);
    }

    public static ubc C(nn61 nn61Var) {
        iyc0 iyc0Var = (iyc0) nn61Var.c;
        c8o.l(iyc0Var);
        return new ubc(iyc0Var, (byte) 24);
    }

    public static wpq D(c42 c42Var) {
        return new wpq(c42Var);
    }

    public static qpa1 a(RetrofitMaker retrofitMaker) {
        return (qpa1) retrofitMaker.createWebgateService(qpa1.class, "android-campfire-element-sharedbychip-impl");
    }

    public static k4z0 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 10);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 c(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 6);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static sh71 d(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        sh71 sh71Var = new sh71();
        sh71Var.a = kly0Var;
        sh71Var.b = r7qVar;
        sh71Var.c = caqVar;
        sh71Var.d = kly0Var2;
        sh71Var.e = r7qVar2;
        sh71Var.f = caqVar2;
        return sh71Var;
    }

    public static fj71 e(caq caqVar, kly0 kly0Var, jo80 jo80Var, jo80 jo80Var2, caq caqVar2, caq caqVar3, r7q r7qVar, caq caqVar4, caq caqVar5, kly0 kly0Var2, caq caqVar6, jo80 jo80Var3, kly0 kly0Var3, caq caqVar7, caq caqVar8, kly0 kly0Var4, caq caqVar9, caq caqVar10, kly0 kly0Var5, kly0 kly0Var6, caq caqVar11, g5t g5tVar, caq caqVar12, caq caqVar13, caq caqVar14, caq caqVar15, caq caqVar16, g5t g5tVar2, caq caqVar17, caq caqVar18, caq caqVar19, caq caqVar20, caq caqVar21, caq caqVar22, caq caqVar23, kly0 kly0Var7, caq caqVar24, caq caqVar25, g5t g5tVar3, caq caqVar26, caq caqVar27, caq caqVar28, kly0 kly0Var8, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var9, kly0 kly0Var10, kly0 kly0Var11, gbp gbpVar, kly0 kly0Var12, caq caqVar29, caq caqVar30, gbp gbpVar2, gbp gbpVar3, caq caqVar31, kly0 kly0Var13, caq caqVar32, caq caqVar33, g5t g5tVar4, caq caqVar34, caq caqVar35, caq caqVar36, caq caqVar37, caq caqVar38, caq caqVar39, r7q r7qVar4, gbp gbpVar4, kly0 kly0Var14, caq caqVar40, kly0 kly0Var15, r7q r7qVar5, r7q r7qVar6, kly0 kly0Var16, caq caqVar41, caq caqVar42, caq caqVar43, kly0 kly0Var17, caq caqVar44, kly0 kly0Var18, caq caqVar45) {
        fj71 fj71Var = new fj71();
        fj71Var.a = caqVar;
        fj71Var.b = kly0Var;
        fj71Var.c = jo80Var;
        fj71Var.d = jo80Var2;
        fj71Var.e = caqVar2;
        fj71Var.f = caqVar3;
        fj71Var.g = r7qVar;
        fj71Var.h = caqVar4;
        fj71Var.i = caqVar5;
        fj71Var.j = kly0Var2;
        fj71Var.k = caqVar6;
        fj71Var.l = jo80Var3;
        fj71Var.m = kly0Var3;
        fj71Var.n = caqVar7;
        fj71Var.o = caqVar8;
        fj71Var.f5p = kly0Var4;
        fj71Var.q = caqVar9;
        fj71Var.r = caqVar10;
        fj71Var.s = kly0Var5;
        fj71Var.t = kly0Var6;
        fj71Var.u = caqVar11;
        fj71Var.v = g5tVar;
        fj71Var.w = caqVar12;
        fj71Var.x = caqVar13;
        fj71Var.y = caqVar14;
        fj71Var.z = caqVar15;
        fj71Var.A = caqVar16;
        fj71Var.B = g5tVar2;
        fj71Var.C = caqVar17;
        fj71Var.D = caqVar18;
        fj71Var.E = caqVar19;
        fj71Var.F = caqVar20;
        fj71Var.G = caqVar21;
        fj71Var.H = caqVar22;
        fj71Var.I = caqVar23;
        fj71Var.J = kly0Var7;
        fj71Var.K = caqVar24;
        fj71Var.L = caqVar25;
        fj71Var.M = g5tVar3;
        fj71Var.N = caqVar26;
        fj71Var.O = caqVar27;
        fj71Var.P = caqVar28;
        fj71Var.Q = kly0Var8;
        fj71Var.R = r7qVar2;
        fj71Var.S = r7qVar3;
        fj71Var.T = kly0Var9;
        fj71Var.U = kly0Var10;
        fj71Var.V = kly0Var11;
        fj71Var.W = gbpVar;
        fj71Var.X = kly0Var12;
        fj71Var.Y = caqVar29;
        fj71Var.Z = caqVar30;
        fj71Var.a0 = gbpVar2;
        fj71Var.b0 = gbpVar3;
        fj71Var.c0 = caqVar31;
        fj71Var.d0 = kly0Var13;
        fj71Var.e0 = caqVar32;
        fj71Var.f0 = caqVar33;
        fj71Var.g0 = g5tVar4;
        fj71Var.h0 = caqVar34;
        fj71Var.i0 = caqVar35;
        fj71Var.j0 = caqVar36;
        fj71Var.k0 = caqVar37;
        fj71Var.l0 = caqVar38;
        fj71Var.m0 = caqVar39;
        fj71Var.n0 = r7qVar4;
        fj71Var.o0 = gbpVar4;
        fj71Var.p0 = kly0Var14;
        fj71Var.q0 = caqVar40;
        fj71Var.r0 = kly0Var15;
        fj71Var.s0 = r7qVar5;
        fj71Var.t0 = r7qVar6;
        fj71Var.u0 = kly0Var16;
        fj71Var.v0 = caqVar41;
        fj71Var.w0 = caqVar42;
        fj71Var.x0 = caqVar43;
        fj71Var.y0 = kly0Var17;
        fj71Var.z0 = caqVar44;
        fj71Var.A0 = kly0Var18;
        fj71Var.B0 = caqVar45;
        return fj71Var;
    }

    public static Context f(Context context) {
        return context.getApplicationContext();
    }

    public static gya g(xpq xpqVar) {
        mzr0 mzr0Var = xpqVar.a;
        Context context = (Context) mzr0Var.b;
        fya fyaVar = new fya(xpqVar.a());
        uf0 uf0Var = new uf0((Context) mzr0Var.b);
        q8n q8nVar = (q8n) mzr0Var.g;
        c8o.l(q8nVar);
        return new gya(context, fyaVar, uf0Var, q8nVar, new y1t0((ajg) mzr0Var.d, (byte) 11), new mjv(q8nVar, (byte) 25));
    }

    public static t7y h(xpq xpqVar) {
        mzr0 mzr0Var = xpqVar.a;
        cxc cxcVar = (cxc) mzr0Var.f;
        q8n q8nVar = (q8n) mzr0Var.g;
        c8o.l(q8nVar);
        return new t7y(cxcVar, q8nVar, (byte) 22);
    }

    public static cn3 i(xpq xpqVar) {
        return new cn3((Context) xpqVar.a.b, false);
    }

    public static dma1 j(dqq dqqVar) {
        dma1 dma1VarC = ((ut71) dqqVar.b.get()).c((Application) dqqVar.a.a.get());
        c8o.m(dma1VarC);
        return dma1VarC;
    }

    public static uo5 k(xpq xpqVar) {
        oi oiVarA = xpqVar.a();
        mzr0 mzr0Var = xpqVar.a;
        return new uo5(oiVarA, new y1t0((ajg) mzr0Var.d, (byte) 11), new uf0((Context) mzr0Var.b), (byte) 22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e5b0 l(q0d0 q0d0Var, l27 l27Var, l27 l27Var2, co9 co9Var, t380 t380Var) {
        return new e5b0(30, o7h.N0(t380Var, p7h.M(new qua0[]{q0d0Var, l27Var, l27Var2, co9Var})), (List) null);
    }

    public static jf11 m(l3q l3qVar) {
        return new jf11(l3qVar, (byte) 22);
    }

    public static jf11 n(jbq jbqVar) {
        return new jf11(jbqVar, (byte) 24);
    }

    public static y1t0 o(xpq xpqVar) {
        return new y1t0((ajg) xpqVar.a.d, (byte) 11);
    }

    public static tz61 p() {
        return new tz61();
    }

    public static e821 q(r4p r4pVar) {
        wdm wdmVar = new wdm(r4pVar);
        ipq ipqVar = (ipq) wdmVar.c;
        ipq ipqVar2 = (ipq) wdmVar.d;
        ipq ipqVar3 = (ipq) wdmVar.e;
        ipq ipqVar4 = (ipq) wdmVar.f;
        ipq ipqVar5 = (ipq) wdmVar.g;
        ipq ipqVar6 = (ipq) wdmVar.h;
        ipq ipqVar7 = (ipq) wdmVar.i;
        ipq ipqVar8 = (ipq) wdmVar.t;
        ipq ipqVar9 = (ipq) wdmVar.X;
        p15 p15Var = new p15((luk) r4pVar.q);
        Set set = rud.a;
        xkg0 xkg0Var = new xkg0();
        Iterator it = rud.a.iterator();
        while (it.hasNext()) {
            xkg0Var.put(new mmr0((blc0) it.next(), rc11.a.b(vsd.class)), new qud(ipqVar, (byte) 2));
            p15Var = p15Var;
        }
        p15 p15Var2 = p15Var;
        if (p15Var2.b()) {
            xkg0Var.put(new mmr0(blc0.ig, rc11.a.b(ysd.class)), new qud(ipqVar2, (byte) 6));
        }
        if (p15Var2.c()) {
            for (Iterator it2 = rud.b.iterator(); it2.hasNext(); it2 = it2) {
                xkg0Var.put(new mmr0((blc0) it2.next(), rc11.a.b(ysd.class)), new qud(ipqVar3, (byte) 7));
            }
            for (Iterator it3 = rud.c.iterator(); it3.hasNext(); it3 = it3) {
                xkg0Var.put(new mmr0((blc0) it3.next(), rc11.a.b(xsd.class)), new qud(ipqVar3, (byte) 8));
            }
        }
        if (p15Var2.d()) {
            xkg0Var.put(new mmr0(blc0.ng, rc11.a.b(vsd.class)), new qud(ipqVar, (byte) 9));
        }
        if (p15Var2.e()) {
            xkg0Var.put(new mmr0(blc0.pg, rc11.a.b(ysd.class)), new qud(ipqVar4, (byte) 10));
        }
        if (p15Var2.f()) {
            xkg0Var.put(new mmr0(blc0.ug, rc11.a.b(ysd.class)), new qud(ipqVar5, (byte) 11));
        }
        if (p15Var2.g()) {
            xkg0Var.put(new mmr0(blc0.wg, rc11.a.b(ysd.class)), new qud(ipqVar6, (byte) 12));
        }
        if (p15Var2.h()) {
            Iterator it4 = rud.d.iterator();
            while (it4.hasNext()) {
                xkg0Var.put(new mmr0((blc0) it4.next(), rc11.a.b(wsd.class)), new qud(ipqVar7, (byte) 13));
            }
        }
        if (p15Var2.i()) {
            xkg0Var.put(new mmr0(blc0.jg, rc11.a.b(ysd.class)), new qud(ipqVar9, (byte) 3));
        }
        if (p15Var2.j()) {
            blc0 blc0Var = blc0.Eg;
            jd11 jd11Var = rc11.a;
            xkg0Var.put(new mmr0(blc0Var, jd11Var.b(xsd.class)), new qud(ipqVar8, (byte) 4));
            xkg0Var.put(new mmr0(blc0Var, jd11Var.b(ysd.class)), new qud(ipqVar8, (byte) 5));
        }
        xkg0 xkg0VarB = xkg0Var.b();
        ipq ipqVar10 = (ipq) wdmVar.Y;
        Set set2 = rud.a;
        Set set3 = o6g1.a;
        int iS = zno1.s(q7h.U(set3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : set3) {
            linkedHashMap.put(obj, new qud(ipqVar10, (byte) 0));
        }
        ipq ipqVar11 = (ipq) wdmVar.Y;
        Set set4 = rud.a;
        Set set5 = o6g1.b;
        int iS2 = zno1.s(q7h.U(set5, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
        for (Object obj2 : set5) {
            linkedHashMap2.put(obj2, new qud(ipqVar11, (byte) 1));
        }
        d0r d0rVar = (d0r) r4pVar.b;
        c8o.l(d0rVar);
        ipq ipqVar12 = (ipq) wdmVar.Z;
        new lfb((byte) 7);
        qud qudVar = new qud(ipqVar12, (byte) 14);
        e821 e821Var = new e821();
        e821Var.b = xkg0VarB;
        e821Var.a = linkedHashMap;
        e821Var.c = linkedHashMap2;
        e821Var.d = d0rVar;
        e821Var.e = qudVar;
        return e821Var;
    }

    public static d771 r(xh71 xh71Var, boolean z) {
        return new d771(xh71Var, z);
    }

    public static f771 s(tzo tzoVar) {
        nn61 nn61Var = (nn61) tzoVar.b;
        vhc vhcVar = (vhc) nn61Var.b;
        dv00 dv00Var = (dv00) nn61Var.c;
        c8o.l(dv00Var);
        return new f771(vhcVar, dv00Var);
    }

    public static xpq t(mzr0 mzr0Var) {
        return new xpq(mzr0Var);
    }

    public static o771 u(xpq xpqVar) {
        oi oiVarA = xpqVar.a();
        mzr0 mzr0Var = xpqVar.a;
        Context context = (Context) mzr0Var.a;
        c8o.l(context);
        y441 y441Var = new y441(context, xpqVar.a());
        yqg yqgVar = (yqg) mzr0Var.e;
        q8n q8nVar = (q8n) mzr0Var.g;
        c8o.l(q8nVar);
        return new o771(oiVarA, y441Var, yqgVar, q8nVar);
    }

    public static eyh0 v(xpq xpqVar) {
        oi oiVarA = xpqVar.a();
        mzr0 mzr0Var = xpqVar.a;
        Context context = (Context) mzr0Var.a;
        c8o.l(context);
        y441 y441Var = new y441(context, xpqVar.a());
        q8n q8nVar = (q8n) mzr0Var.g;
        c8o.l(q8nVar);
        return new eyh0(oiVarA, y441Var, q8nVar, (byte) 5);
    }

    public static g2z w(mzr0 mzr0Var) {
        return new g2z((gw70) mzr0Var.e, (woa) mzr0Var.f, (kma) mzr0Var.d, (yqg) mzr0Var.c, (ypq) ((jly0) new a1q(mzr0Var).c).get(), (ruz) mzr0Var.g);
    }

    public static hd71 x() {
        return new hd71();
    }

    public static tzo y(nn61 nn61Var) {
        return new tzo(nn61Var, (byte) 2);
    }

    public static jd71 z(n801 n801Var) {
        return new jd71(new xgc((byte) 24), new nbc(new v9c((ubc) n801Var.b, (byte) 24), (byte) 24));
    }
}
