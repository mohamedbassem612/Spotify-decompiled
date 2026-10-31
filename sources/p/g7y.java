package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class g7y implements jly0 {
    public static nay A(nzp nzpVar) {
        return new nay(nzpVar, (byte) 2);
    }

    public static nay B(ozp ozpVar) {
        return new nay(ozpVar, (byte) 1);
    }

    public static nay C(t2q t2qVar) {
        return new nay(t2qVar, (byte) 3);
    }

    public static ufs D(zdp zdpVar) {
        g3z g3zVar = zdpVar.a;
        return new ufs((Context) g3zVar.b.get(), (yqg) g3zVar.c.get(), new ggv((Context) g3zVar.a.get()), (htr) g3zVar.f3p.get());
    }

    public static hdp a(l8a l8aVar) {
        return new hdp(l8aVar);
    }

    public static vdp b(p68 p68Var) {
        return new vdp(p68Var);
    }

    public static zdp c(g3z g3zVar) {
        return new zdp(g3zVar);
    }

    public static x0w d(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 3);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static w7w e(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 3);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static e9y f(caq caqVar, caq caqVar2, r7q r7qVar, caq caqVar3, kly0 kly0Var, kly0 kly0Var2, caq caqVar4, kly0 kly0Var3, caq caqVar5, kly0 kly0Var4, r7q r7qVar2, caq caqVar6) {
        e9y e9yVar = new e9y();
        e9yVar.a = caqVar;
        e9yVar.b = caqVar2;
        e9yVar.c = r7qVar;
        e9yVar.d = caqVar3;
        e9yVar.e = kly0Var;
        e9yVar.f = kly0Var2;
        e9yVar.g = caqVar4;
        e9yVar.h = kly0Var3;
        e9yVar.i = caqVar5;
        e9yVar.j = kly0Var4;
        e9yVar.k = r7qVar2;
        e9yVar.l = caqVar6;
        return e9yVar;
    }

    public static uqy g(kly0 kly0Var, r7q r7qVar, thq thqVar, kly0 kly0Var2, r7q r7qVar2, jly0 jly0Var, caq caqVar, kly0 kly0Var3, caq caqVar2, caq caqVar3, gbp gbpVar, caq caqVar4, kly0 kly0Var4, r7q r7qVar3, r7q r7qVar4, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar5, caq caqVar8, r7q r7qVar6, r7q r7qVar7, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7, kly0 kly0Var8, kly0 kly0Var9, r7q r7qVar8, r7q r7qVar9, r7q r7qVar10, r7q r7qVar11, caq caqVar9, thq thqVar2, jo80 jo80Var) {
        uqy uqyVar = new uqy();
        uqyVar.a = kly0Var;
        uqyVar.b = r7qVar;
        uqyVar.c = thqVar;
        uqyVar.d = kly0Var2;
        uqyVar.e = r7qVar2;
        uqyVar.f = jly0Var;
        uqyVar.g = caqVar;
        uqyVar.h = kly0Var3;
        uqyVar.i = caqVar2;
        uqyVar.j = caqVar3;
        uqyVar.k = gbpVar;
        uqyVar.l = caqVar4;
        uqyVar.m = kly0Var4;
        uqyVar.n = r7qVar3;
        uqyVar.o = r7qVar4;
        uqyVar.f46p = caqVar5;
        uqyVar.q = caqVar6;
        uqyVar.r = caqVar7;
        uqyVar.s = r7qVar5;
        uqyVar.t = caqVar8;
        uqyVar.u = r7qVar6;
        uqyVar.v = r7qVar7;
        uqyVar.w = kly0Var5;
        uqyVar.x = kly0Var6;
        uqyVar.y = kly0Var7;
        uqyVar.z = kly0Var8;
        uqyVar.A = kly0Var9;
        uqyVar.B = r7qVar8;
        uqyVar.C = r7qVar9;
        uqyVar.D = r7qVar10;
        uqyVar.E = r7qVar11;
        uqyVar.F = caqVar9;
        uqyVar.G = thqVar2;
        uqyVar.H = jo80Var;
        return uqyVar;
    }

    public static nsy h(jly0 jly0Var, kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar, kly0 kly0Var2, caq caqVar5, caq caqVar6, caq caqVar7, jly0 jly0Var2, caq caqVar8, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, jly0 jly0Var7, jly0 jly0Var8, jly0 jly0Var9, kly0 kly0Var3, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, kly0 kly0Var4, caq caqVar13, caq caqVar14, caq caqVar15, jly0 jly0Var10, jly0 jly0Var11, jly0 jly0Var12, jly0 jly0Var13) {
        nsy nsyVar = new nsy();
        nsyVar.a = jly0Var;
        nsyVar.b = kly0Var;
        nsyVar.c = caqVar;
        nsyVar.d = caqVar2;
        nsyVar.e = caqVar3;
        nsyVar.f = caqVar4;
        nsyVar.g = g5tVar;
        nsyVar.h = kly0Var2;
        nsyVar.i = caqVar5;
        nsyVar.j = caqVar6;
        nsyVar.k = caqVar7;
        nsyVar.l = jly0Var2;
        nsyVar.m = caqVar8;
        nsyVar.n = jly0Var3;
        nsyVar.o = jly0Var4;
        nsyVar.f23p = jly0Var5;
        nsyVar.q = jly0Var6;
        nsyVar.r = jly0Var7;
        nsyVar.s = jly0Var8;
        nsyVar.t = jly0Var9;
        nsyVar.u = kly0Var3;
        nsyVar.v = caqVar9;
        nsyVar.w = caqVar10;
        nsyVar.x = caqVar11;
        nsyVar.y = caqVar12;
        nsyVar.z = kly0Var4;
        nsyVar.A = caqVar13;
        nsyVar.B = caqVar14;
        nsyVar.C = caqVar15;
        nsyVar.D = jly0Var10;
        nsyVar.E = jly0Var11;
        nsyVar.F = jly0Var12;
        nsyVar.G = jly0Var13;
        return nsyVar;
    }

    public static puy i(r7q r7qVar, kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, g5t g5tVar, kly0 kly0Var2, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar2, caq caqVar8, jly0 jly0Var, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, r7q r7qVar6, r7q r7qVar7, r7q r7qVar8, kly0 kly0Var3, caq caqVar9, caq caqVar10, caq caqVar11, caq caqVar12, thq thqVar, r7q r7qVar9, kly0 kly0Var4, caq caqVar13, caq caqVar14, caq caqVar15, r7q r7qVar10, r7q r7qVar11) {
        puy puyVar = new puy();
        puyVar.a = r7qVar;
        puyVar.b = kly0Var;
        puyVar.c = caqVar;
        puyVar.d = caqVar2;
        puyVar.e = caqVar3;
        puyVar.f = caqVar4;
        puyVar.g = g5tVar;
        puyVar.h = kly0Var2;
        puyVar.i = caqVar5;
        puyVar.j = caqVar6;
        puyVar.k = caqVar7;
        puyVar.l = r7qVar2;
        puyVar.m = caqVar8;
        puyVar.n = jly0Var;
        puyVar.o = r7qVar3;
        puyVar.f28p = r7qVar4;
        puyVar.q = r7qVar5;
        puyVar.r = r7qVar6;
        puyVar.s = r7qVar7;
        puyVar.t = r7qVar8;
        puyVar.u = kly0Var3;
        puyVar.v = caqVar9;
        puyVar.w = caqVar10;
        puyVar.x = caqVar11;
        puyVar.y = caqVar12;
        puyVar.z = thqVar;
        puyVar.A = r7qVar9;
        puyVar.B = kly0Var4;
        puyVar.C = caqVar13;
        puyVar.D = caqVar14;
        puyVar.E = caqVar15;
        puyVar.F = r7qVar10;
        puyVar.G = r7qVar11;
        return puyVar;
    }

    public static k5z j(r7q r7qVar, jo80 jo80Var, r7q r7qVar2, caq caqVar, caq caqVar2) {
        k5z k5zVar = new k5z();
        k5zVar.a = r7qVar;
        k5zVar.b = jo80Var;
        k5zVar.c = r7qVar2;
        k5zVar.d = caqVar;
        k5zVar.e = caqVar2;
        return k5zVar;
    }

    public static x0w k(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 5);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static gd0 l(vdp vdpVar) {
        p68 p68Var = vdpVar.a;
        xd0 xd0Var = (xd0) p68Var.g;
        c8o.l(xd0Var);
        Flowable flowable = (Flowable) p68Var.e;
        c8o.l(flowable);
        q8n q8nVar = (q8n) p68Var.d;
        c8o.l(q8nVar);
        return new gd0(xd0Var, flowable, q8nVar);
    }

    public static re4 m(zdp zdpVar) {
        return new re4(false, false, (luk) zdpVar.a.q.get());
    }

    public static String n(Context context) {
        return upn1.n(context);
    }

    public static rzq o(lvc0 lvc0Var, kxc0 kxc0Var) {
        j3r j3rVar = rzq.y;
        bdc1 bdc1Var = bdc1.a;
        return l2p1.f(new w1k(new l2r[]{lvc0Var.a(bdc1Var), kxc0Var.a(bdc1Var)}));
    }

    public static ggv p(zdp zdpVar) {
        return new ggv((Context) zdpVar.a.a.get());
    }

    public static axr q(lgy lgyVar) {
        return new axr(lgyVar);
    }

    public static tgy r(RetrofitMaker retrofitMaker) {
        return (tgy) retrofitMaker.createWebgateService(tgy.class, "android-playlistediting-history-apiimpl");
    }

    public static iry s(vdp vdpVar) {
        p68 p68Var = vdpVar.a;
        Flowable flowable = (Flowable) p68Var.e;
        c8o.l(flowable);
        yqg yqgVar = (yqg) p68Var.f;
        c8o.l(yqgVar);
        q8n q8nVar = (q8n) p68Var.d;
        c8o.l(q8nVar);
        return new iry(flowable, yqgVar, q8nVar);
    }

    public static csy t(vdp vdpVar) {
        p68 p68Var = vdpVar.a;
        uvy uvyVar = (uvy) p68Var.b;
        c8o.l(uvyVar);
        hre1 hre1Var = (hre1) p68Var.c;
        c8o.l(hre1Var);
        boolean z = p68Var.a;
        q8n q8nVar = (q8n) p68Var.d;
        c8o.l(q8nVar);
        return new csy(uvyVar, hre1Var, z, q8nVar);
    }

    public static a7z u(zdp zdpVar) {
        g3z g3zVar = zdpVar.a;
        return new a7z((zmj0) g3zVar.h.get(), (lv00) g3zVar.i.get());
    }

    public static ogr v(udp udpVar) {
        w0d w0dVar;
        switch (udpVar.a) {
            case 0:
                t7p t7pVar = (t7p) ((lbp) udpVar.b).c;
                yqg yqgVar = ((qsy) t7pVar.b).j;
                c8o.l(yqgVar);
                zs11 zs11Var = ((qsy) t7pVar.b).k;
                c8o.l(zs11Var);
                zwp zwpVar = ((qsy) t7pVar.b).l;
                c8o.l(zwpVar);
                ycm ycmVar = ((qsy) t7pVar.b).m;
                c8o.l(ycmVar);
                xh71 xh71Var = ((qsy) t7pVar.b).n;
                c8o.l(xh71Var);
                qsy qsyVar = (qsy) t7pVar.b;
                w0dVar = new w0d(yqgVar, zs11Var, zwpVar, ycmVar, xh71Var, qsyVar.q, qsyVar.r);
                break;
            case 1:
                x2p x2pVar = (x2p) udpVar.b.c;
                yqg yqgVar2 = ((jty) x2pVar.c).a;
                c8o.l(yqgVar2);
                zs11 zs11Var2 = ((jty) x2pVar.c).b;
                c8o.l(zs11Var2);
                zwp zwpVar2 = ((jty) x2pVar.c).c;
                c8o.l(zwpVar2);
                ycm ycmVar2 = ((jty) x2pVar.c).d;
                c8o.l(ycmVar2);
                xh71 xh71Var2 = ((jty) x2pVar.c).e;
                c8o.l(xh71Var2);
                jty jtyVar = (jty) x2pVar.c;
                w0dVar = new w0d(yqgVar2, zs11Var2, zwpVar2, ycmVar2, xh71Var2, jtyVar.o, jtyVar.f14p);
                break;
            default:
                thq thqVar = udpVar.b;
                daq daqVar = thqVar.b;
                yqg yqgVar3 = (yqg) daqVar.J1.get();
                teq teqVar = thqVar.c;
                w0dVar = new w0d(yqgVar3, (zs11) teqVar.J8.get(), (zwp) teqVar.qf.get(), (ycm) teqVar.b.P.get(), (xh71) teqVar.N3.get(), ((Boolean) daqVar.So.get()).booleanValue(), ((Boolean) daqVar.zr.get()).booleanValue());
                break;
        }
        b6p b6pVar = new b6p(w0dVar);
        yqg yqgVar4 = (yqg) w0dVar.c;
        c8o.l(yqgVar4);
        zs11 zs11Var3 = (zs11) w0dVar.d;
        c8o.l(zs11Var3);
        zwp zwpVar3 = (zwp) w0dVar.e;
        c8o.l(zwpVar3);
        ycm ycmVar3 = (ycm) w0dVar.f;
        c8o.l(ycmVar3);
        return new ogr(new uqs(yqgVar4, zs11Var3, new uny(zwpVar3, ycmVar3, (odp) ((jly0) b6pVar.c).get(), (byte) 2), w0dVar.a, w0dVar.b), (byte) 26);
    }

    public static c7s w(zdp zdpVar) {
        g3z g3zVar = zdpVar.a;
        return new c7s((zxl) g3zVar.f.get(), (kt91) g3zVar.g.get(), (Context) g3zVar.b.get());
    }

    public static hum0 x(oep oepVar) {
        return new hum0((vbs) oepVar.a.a.get());
    }

    public static Map y(hv4 hv4Var, fza1 fza1Var, jxa jxaVar, yqg yqgVar) {
        Map mapJ = sqg0.J(new mmr0[]{new mmr0(Collections.singleton(dzy.f), a9o.Z), new mmr0(Collections.singleton(dzy.g), gny.t), new mmr0(Collections.singleton(dzy.t), new w3w(hv4Var, yqgVar, (byte) 22)), new mmr0(f46.S0(new dzy[]{dzy.a1, dzy.b1}), gny.X), new mmr0(Collections.singleton(dzy.i), gny.Y), new mmr0(Collections.singleton(dzy.N0), gny.Z), new mmr0(Collections.singleton(dzy.O0), gny.N0), new mmr0(Collections.singleton(dzy.R0), gny.O0), new mmr0(Collections.singleton(dzy.S0), new i5w(jxaVar, (byte) 25)), new mmr0(Collections.singleton(dzy.X0), vay.e1), new mmr0(Collections.singleton(dzy.c1), gny.b), new mmr0(f46.S0(new dzy[]{dzy.Y0, dzy.h, dzy.X, dzy.W0, dzy.e1}), gny.c), new mmr0(Collections.singleton(dzy.P0), gny.d), new mmr0(Collections.singleton(dzy.Z), gny.e), new mmr0(Collections.singleton(dzy.U0), new djx((Object) fza1Var, (Object) hv4Var, (Object) yqgVar, (byte) 3)), new mmr0(f46.S0(new dzy[]{dzy.Q0, dzy.Y, dzy.V0}), gny.f), new mmr0(Collections.singleton(dzy.Z0), new i5w(hv4Var, (byte) 24)), new mmr0(f46.S0(new dzy[]{dzy.n1, dzy.g1}), gny.g), new mmr0(f46.S0(new dzy[]{dzy.o1, dzy.h1}), gny.h), new mmr0(f46.S0(new dzy[]{dzy.p1, dzy.i1}), gny.i)});
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapJ.entrySet()) {
            Set set = (Set) entry.getKey();
            iu30 iu30Var = (iu30) entry.getValue();
            Set<dzy> set2 = set;
            ArrayList arrayList2 = new ArrayList(q7h.U(set2, 10));
            for (dzy dzyVar : set2) {
                arrayList2.add(new mmr0(dzyVar, iu30Var.invoke(dzyVar)));
            }
            r7h.W(arrayList2, arrayList);
        }
        return sqg0.T(arrayList);
    }

    public static n9v z(c9c c9cVar) {
        return new n9v(c9cVar, (byte) 9);
    }
}
