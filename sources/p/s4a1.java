package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class s4a1 implements jly0 {
    public static llm A(u9c0 u9c0Var) {
        fns fnsVar = igu.a;
        j0d1 j0d1Var = new j0d1(op71.z(u9c0Var.b));
        fnsVar.getClass();
        return smo1.e(flo1.l(fnsVar, j0d1Var));
    }

    public static oqa1 B(xq81 xq81Var) {
        j95 j95Var = (j95) xq81Var.b;
        boolean zD = j95Var.d();
        boolean zI = j95Var.i();
        boolean zF = j95Var.f();
        boolean zE = j95Var.e();
        boolean zB = j95Var.b();
        boolean zJ = j95Var.j();
        boolean zA = j95Var.a();
        boolean zH = j95Var.h();
        int iOrdinal = j95Var.g().ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                }
            } else {
                i = 2;
            }
        }
        return new oqa1(zD, zI, zF, zE, zB, zJ, zA, zH, i);
    }

    public static pta1 C(caq caqVar, caq caqVar2, f6v0 f6v0Var) {
        pta1 pta1Var = f6v0Var.a() ? (pta1) caqVar2.get() : (pta1) caqVar.get();
        c8o.m(pta1Var);
        return pta1Var;
    }

    public static lua1 D(b2q b2qVar) {
        return new lua1(b2qVar);
    }

    public static uww0 a(ynb0 ynb0Var) {
        return new uww0(ynb0Var, (byte) 19);
    }

    public static k4z0 b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        k4z0 k4z0Var = new k4z0((byte) 13);
        k4z0Var.b = ynb0Var;
        k4z0Var.c = ynb0Var2;
        return k4z0Var;
    }

    public static g561 c(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 12);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static v8a1 d(caq caqVar, r7q r7qVar, jly0 jly0Var, r7q r7qVar2, r7q r7qVar3, jly0 jly0Var2, r7q r7qVar4, caq caqVar2, r7q r7qVar5, r7q r7qVar6, kly0 kly0Var, r7q r7qVar7) {
        v8a1 v8a1Var = new v8a1();
        v8a1Var.a = caqVar;
        v8a1Var.b = r7qVar;
        v8a1Var.c = jly0Var;
        v8a1Var.d = r7qVar2;
        v8a1Var.e = r7qVar3;
        v8a1Var.f = jly0Var2;
        v8a1Var.g = r7qVar4;
        v8a1Var.h = caqVar2;
        v8a1Var.i = r7qVar5;
        v8a1Var.j = r7qVar6;
        v8a1Var.k = kly0Var;
        v8a1Var.l = r7qVar7;
        return v8a1Var;
    }

    public static qda1 e(r7q r7qVar, caq caqVar, kly0 kly0Var, caq caqVar2, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var2, caq caqVar3, r7q r7qVar5, kly0 kly0Var3, caq caqVar4, caq caqVar5) {
        qda1 qda1Var = new qda1();
        qda1Var.a = r7qVar;
        qda1Var.b = caqVar;
        qda1Var.c = kly0Var;
        qda1Var.d = caqVar2;
        qda1Var.e = r7qVar2;
        qda1Var.f = r7qVar3;
        qda1Var.g = r7qVar4;
        qda1Var.h = kly0Var2;
        qda1Var.i = caqVar3;
        qda1Var.j = r7qVar5;
        qda1Var.k = kly0Var3;
        qda1Var.l = caqVar4;
        qda1Var.m = caqVar5;
        return qda1Var;
    }

    public static ffa1 f(r7q r7qVar) {
        ffa1 ffa1Var = new ffa1();
        ffa1Var.a = r7qVar;
        return ffa1Var;
    }

    public static mqa1 g(jly0 jly0Var, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, g5t g5tVar) {
        mqa1 mqa1Var = new mqa1();
        mqa1Var.a = jly0Var;
        mqa1Var.b = caqVar;
        mqa1Var.c = caqVar2;
        mqa1Var.d = caqVar3;
        mqa1Var.e = caqVar4;
        mqa1Var.f = caqVar5;
        mqa1Var.g = caqVar6;
        mqa1Var.h = g5tVar;
        return mqa1Var;
    }

    public static zta1 h(r7q r7qVar, r7q r7qVar2, caq caqVar, r7q r7qVar3, kly0 kly0Var, r7q r7qVar4) {
        zta1 zta1Var = new zta1();
        zta1Var.a = r7qVar;
        zta1Var.b = r7qVar2;
        zta1Var.c = caqVar;
        zta1Var.d = r7qVar3;
        zta1Var.e = kly0Var;
        zta1Var.f = r7qVar4;
        return zta1Var;
    }

    public static eua1 i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        eua1 eua1Var = new eua1();
        eua1Var.a = ynb0Var;
        eua1Var.b = ynb0Var2;
        return eua1Var;
    }

    public static qua1 j(jo80 jo80Var, jly0 jly0Var, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, jly0 jly0Var2, jly0 jly0Var3, g5t g5tVar) {
        qua1 qua1Var = new qua1();
        qua1Var.a = jo80Var;
        qua1Var.b = jly0Var;
        qua1Var.c = caqVar;
        qua1Var.d = caqVar2;
        qua1Var.e = caqVar3;
        qua1Var.f = caqVar4;
        qua1Var.g = caqVar5;
        qua1Var.h = caqVar6;
        qua1Var.i = jly0Var2;
        qua1Var.j = jly0Var3;
        qua1Var.k = g5tVar;
        return qua1Var;
    }

    public static rua1 k(caq caqVar, caq caqVar2, caq caqVar3, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar4, kly0 kly0Var, thq thqVar, thq thqVar2, r7q r7qVar6, caq caqVar5, kly0 kly0Var2, kly0 kly0Var3, r7q r7qVar7, r7q r7qVar8) {
        rua1 rua1Var = new rua1();
        rua1Var.a = caqVar;
        rua1Var.b = caqVar2;
        rua1Var.c = caqVar3;
        rua1Var.d = r7qVar;
        rua1Var.e = r7qVar2;
        rua1Var.f = r7qVar3;
        rua1Var.g = r7qVar4;
        rua1Var.h = r7qVar5;
        rua1Var.i = caqVar4;
        rua1Var.j = kly0Var;
        rua1Var.k = thqVar;
        rua1Var.l = thqVar2;
        rua1Var.m = r7qVar6;
        rua1Var.n = caqVar5;
        rua1Var.o = kly0Var2;
        rua1Var.f61p = kly0Var3;
        rua1Var.q = r7qVar7;
        rua1Var.r = r7qVar8;
        return rua1Var;
    }

    public static g561 l(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 13);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static g561 m(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 14);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static x6a1 n(hp91 hp91Var) {
        return new x6a1(new lbq(hp91Var));
    }

    public static rea1 o(ab71 ab71Var) {
        return new rea1(new lbq(ab71Var));
    }

    public static uh61 p(fjb fjbVar) {
        return new uh61(fjbVar, (byte) 11);
    }

    public static uh61 q(sjb sjbVar) {
        return new uh61(sjbVar, (byte) 12);
    }

    public static uh61 r(ekb ekbVar) {
        return new uh61(ekbVar, (byte) 13);
    }

    public static uh61 s(pob pobVar) {
        return new uh61(pobVar, (byte) 14);
    }

    public static hq81 t(b1q b1qVar) {
        return new hq81(b1qVar, (byte) 7);
    }

    public static hq81 u(l3q l3qVar) {
        return new hq81(l3qVar, (byte) 9);
    }

    public static q4a1 v(d0q d0qVar) {
        return new q4a1(d0qVar);
    }

    public static r4a1 w(d0q d0qVar) {
        return new r4a1(d0qVar);
    }

    public static Single x(ut71 ut71Var, joo jooVar, Context context) {
        Single singleF = rqt0.F(igu.b, new bj81(ut71Var, context, jooVar, (lnm) null, (byte) 2));
        c8o.m(singleF);
        return singleF;
    }

    public static taa1 y(RetrofitMaker retrofitMaker) {
        return (taa1) retrofitMaker.createWebgateService(taa1.class, "android-songdna-feedback");
    }

    public static qna1 z(RetrofitMaker retrofitMaker) {
        return (qna1) retrofitMaker.createWebgateService(qna1.class, "android-voiceassistants-speakeasy-endpoints");
    }
}
