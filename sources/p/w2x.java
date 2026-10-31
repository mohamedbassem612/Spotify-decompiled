package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class w2x implements jly0 {
    public static p2t A(x6o0 x6o0Var, ycc1 ycc1Var, a1r0 a1r0Var) {
        return new p2t(x6o0Var, ycc1Var, new i5w(a1r0Var, (byte) 10));
    }

    public static mr20 B(fdp fdpVar) {
        mr20 mr20Var = (mr20) fdpVar.l.get();
        c8o.m(mr20Var);
        return mr20Var;
    }

    public static nmk1 C(fdp fdpVar) {
        return new nmk1((jmk1) ((RetrofitMaker) ((kly0) fdpVar.a.c).get()).createWebgateService(jmk1.class, "android-endless-voicedata-impl"));
    }

    public static npm1 D() {
        return new npm1();
    }

    public static djh a(fdp fdpVar) {
        ie4 ie4Var = new ie4(he4.b, (luk) ((kly0) fdpVar.a.l).get());
        ddp ddpVar = (ddp) fdpVar.c.get();
        nxo nxoVar = fdpVar.d;
        int iOrdinal = ie4Var.a().ordinal();
        if (iOrdinal == 0) {
            return new fjh(nxoVar);
        }
        if (iOrdinal == 1) {
            return ddpVar;
        }
        eg.o();
        return null;
    }

    public static fpu b(fdp fdpVar) {
        fpu fpuVar = (fpu) fdpVar.e.get();
        c8o.m(fpuVar);
        return fpuVar;
    }

    public static fdp c(wzx wzxVar) {
        return new fdp(wzxVar);
    }

    public static b1y d(fdp fdpVar) {
        return new b1y(new lm4((luk) ((kly0) fdpVar.a.l).get()));
    }

    public static e1y e(fdp fdpVar) {
        return new e1y((ov20) ((kly0) fdpVar.a.b).get(), (fpu) fdpVar.e.get());
    }

    public static edp f(fdp fdpVar) {
        edp edpVar = (edp) fdpVar.g.get();
        c8o.m(edpVar);
        return edpVar;
    }

    public static p5y g() {
        return new p5y();
    }

    public static mr20 h(fdp fdpVar) {
        mr20 mr20Var = (mr20) fdpVar.i.get();
        c8o.m(mr20Var);
        return mr20Var;
    }

    public static wen0 i(fdp fdpVar) {
        wen0 wen0Var = (wen0) fdpVar.h.get();
        c8o.m(wen0Var);
        return wen0Var;
    }

    public static tdf0 j(fdp fdpVar) {
        tdf0 tdf0Var = (tdf0) fdpVar.j.get();
        c8o.m(tdf0Var);
        return tdf0Var;
    }

    public static wdf0 k(fdp fdpVar) {
        return new wdf0((Scheduler) ((kly0) fdpVar.a.h).get());
    }

    public static hrj0 l(fdp fdpVar) {
        hrj0 hrj0Var = (hrj0) fdpVar.k.get();
        c8o.m(hrj0Var);
        return hrj0Var;
    }

    public static hrj0 m(fdp fdpVar) {
        hrj0 hrj0Var = (hrj0) fdpVar.k.get();
        c8o.m(hrj0Var);
        return hrj0Var;
    }

    public static h21 n(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 28);
    }

    public static w7w o(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 1);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t2y p(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, kly0 kly0Var, kly0 kly0Var2, caq caqVar9) {
        t2y t2yVar = new t2y();
        t2yVar.a = caqVar;
        t2yVar.b = caqVar2;
        t2yVar.c = caqVar3;
        t2yVar.d = caqVar4;
        t2yVar.e = caqVar5;
        t2yVar.f = caqVar6;
        t2yVar.g = caqVar7;
        t2yVar.h = caqVar8;
        t2yVar.i = kly0Var;
        t2yVar.j = kly0Var2;
        t2yVar.k = caqVar9;
        return t2yVar;
    }

    public static k3y q(kly0 kly0Var) {
        k3y k3yVar = new k3y();
        k3yVar.a = kly0Var;
        return k3yVar;
    }

    public static d5y r(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, caq caqVar8, caq caqVar9, jly0 jly0Var, caq caqVar10, caq caqVar11, kly0 kly0Var, kly0 kly0Var2) {
        d5y d5yVar = new d5y();
        d5yVar.a = caqVar;
        d5yVar.b = caqVar2;
        d5yVar.c = caqVar3;
        d5yVar.d = caqVar4;
        d5yVar.e = caqVar5;
        d5yVar.f = caqVar6;
        d5yVar.g = caqVar7;
        d5yVar.h = caqVar8;
        d5yVar.i = caqVar9;
        d5yVar.j = jly0Var;
        d5yVar.k = caqVar10;
        d5yVar.l = caqVar11;
        d5yVar.m = kly0Var;
        d5yVar.n = kly0Var2;
        return d5yVar;
    }

    public static w7w s(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 2);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static cpu t(RetrofitMaker retrofitMaker) {
        return (cpu) retrofitMaker.createWebgateService(cpu.class, "android-endless-personaimpl");
    }

    public static xfx u(Context context, gw70 gw70Var, sua suaVar) {
        return new xfx(context, gw70Var, suaVar);
    }

    public static sua v() {
        return new sua((byte) 9);
    }

    public static k1y w(RetrofitMaker retrofitMaker) {
        return (k1y) retrofitMaker.createWebgateService(k1y.class, "android-endless-playerimpl");
    }

    public static f7y x(hdp hdpVar) {
        ekb ekbVar = new ekb((byte) 18);
        a0b a0bVar = new a0b((byte) 13);
        l8a l8aVar = hdpVar.a;
        return new f7y(new kzt(ekbVar, a0bVar, (yqg) l8aVar.b.get()), new ekb((byte) 18), new wcr((Context) l8aVar.a.get()));
    }

    public static thn y(d0q d0qVar) {
        return new thn(d0qVar, (byte) 28);
    }

    public static ar51 z(fdp fdpVar) {
        wzx wzxVar = fdpVar.a;
        return new ar51((yqg) ((kly0) wzxVar.d).get(), new mm4(0, 0, (luk) ((kly0) wzxVar.l).get()), (zeu0) ((kly0) wzxVar.k).get(), (xrc0) ((kly0) wzxVar.a).get());
    }
}
