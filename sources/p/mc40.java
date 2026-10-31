package p;

import android.app.Activity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class mc40 implements jly0 {
    public static l1s0 A(RetrofitMaker retrofitMaker) {
        return (l1s0) retrofitMaker.createWebgateService(l1s0.class, "android-partner-account-linking-googleassistant");
    }

    public static gj5 B(Activity activity) {
        return (gj5) activity;
    }

    public static ezc C(hk4 hk4Var) {
        Observable observableH;
        if (hk4Var.i != null) {
            observableH = ((Observable) hk4Var.k.getValue()).map(ios.f).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(hk4Var.h);
        }
        return yoi1.g(observableH);
    }

    public static x0w a(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 22);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 3);
    }

    public static ch50 c(jo80 jo80Var, kly0 kly0Var, jly0 jly0Var, kly0 kly0Var2, kly0 kly0Var3, g5t g5tVar, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, caq caqVar2) {
        ch50 ch50Var = new ch50();
        ch50Var.a = jo80Var;
        ch50Var.b = kly0Var;
        ch50Var.c = jly0Var;
        ch50Var.d = kly0Var2;
        ch50Var.e = kly0Var3;
        ch50Var.f = g5tVar;
        ch50Var.g = jly0Var2;
        ch50Var.h = jly0Var3;
        ch50Var.i = caqVar;
        ch50Var.j = caqVar2;
        return ch50Var;
    }

    public static eh50 d(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 0);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static mi50 e(jo80 jo80Var, r7q r7qVar, caq caqVar, gbp gbpVar, gbp gbpVar2, r7q r7qVar2, r7q r7qVar3, caq caqVar2, caq caqVar3, caq caqVar4, r7q r7qVar4, caq caqVar5, caq caqVar6, caq caqVar7) {
        mi50 mi50Var = new mi50();
        mi50Var.a = jo80Var;
        mi50Var.b = r7qVar;
        mi50Var.c = caqVar;
        mi50Var.d = gbpVar;
        mi50Var.e = gbpVar2;
        mi50Var.f = r7qVar2;
        mi50Var.g = r7qVar3;
        mi50Var.h = caqVar2;
        mi50Var.i = caqVar3;
        mi50Var.j = caqVar4;
        mi50Var.k = r7qVar4;
        mi50Var.l = caqVar5;
        mi50Var.m = caqVar6;
        mi50Var.n = caqVar7;
        return mi50Var;
    }

    public static pi50 f(caq caqVar, caq caqVar2, r7q r7qVar, jo80 jo80Var, r7q r7qVar2, caq caqVar3, gbp gbpVar, gbp gbpVar2, g5t g5tVar, r7q r7qVar3, caq caqVar4, caq caqVar5, caq caqVar6) {
        pi50 pi50Var = new pi50();
        pi50Var.a = caqVar;
        pi50Var.b = caqVar2;
        pi50Var.c = r7qVar;
        pi50Var.d = jo80Var;
        pi50Var.e = r7qVar2;
        pi50Var.f = caqVar3;
        pi50Var.g = gbpVar;
        pi50Var.h = gbpVar2;
        pi50Var.i = g5tVar;
        pi50Var.j = r7qVar3;
        pi50Var.k = caqVar4;
        pi50Var.l = caqVar5;
        pi50Var.m = caqVar6;
        return pi50Var;
    }

    public static ek50 g(kly0 kly0Var, jly0 jly0Var, kly0 kly0Var2, g5t g5tVar, jly0 jly0Var2, jly0 jly0Var3, kly0 kly0Var3, caq caqVar, caq caqVar2) {
        ek50 ek50Var = new ek50();
        ek50Var.a = kly0Var;
        ek50Var.b = jly0Var;
        ek50Var.c = kly0Var2;
        ek50Var.d = g5tVar;
        ek50Var.e = jly0Var2;
        ek50Var.f = jly0Var3;
        ek50Var.g = kly0Var3;
        ek50Var.h = caqVar;
        ek50Var.i = caqVar2;
        return ek50Var;
    }

    public static t700 h(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 4);
    }

    public static eh50 i(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 2);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static t700 j(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 6);
    }

    public static eh50 k(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 3);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static j02 l(n350 n350Var) {
        j02 j02VarA;
        if (n350Var.a()) {
            Object obj = k02.a;
            j02VarA = k02.a(Optional.empty(), Optional.empty());
        } else {
            j02VarA = tev.a;
        }
        j02VarA.getClass();
        return j02VarA;
    }

    public static d0r m(hl00 hl00Var) {
        return (rzq) hl00Var.b;
    }

    public static nzf n(ejp ejpVar) {
        return new nzf((ov20) ((kly0) ejpVar.a.i).get());
    }

    public static List o(eea0 eea0Var, lhc lhcVar, sua suaVar, xq81 xq81Var, twa twaVar, av8 av8Var, y281 y281Var, djm djmVar, h5a1 h5a1Var) {
        n0v0 n0v0Var = new n0v0(djmVar, (byte) 0);
        uo5 uo5VarP = r6p1.p(y281Var, new n0v0(h5a1Var, (byte) 0));
        uo5 uo5Var = new uo5(new tve0(n0v0Var), (byte) 16);
        uo5Var.d = uo5VarP;
        uve0 uve0Var = new uve0(uo5Var);
        n0v0 n0v0Var2 = new n0v0(eea0Var, (byte) 0);
        uo5 uo5Var2 = new uo5(uve0Var, (byte) 16);
        uo5Var2.c = new uo5(n0v0Var2);
        uve0 uve0Var2 = new uve0(uo5Var2);
        n0v0 n0v0Var3 = new n0v0(lhcVar, (byte) 0);
        uo5 uo5Var3 = new uo5(uve0Var2, (byte) 16);
        uo5Var3.c = new uo5(n0v0Var3);
        uve0 uve0Var3 = new uve0(uo5Var3);
        n0v0 n0v0Var4 = new n0v0(xq81Var, (byte) 0);
        uo5 uo5Var4 = new uo5(uve0Var3, (byte) 16);
        uo5Var4.c = new uo5(n0v0Var4);
        return Collections.singletonList(new k1v0(av8Var, new uve0(new uo5(uo5Var4).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)))));
    }

    public static aan1 p(Activity activity) {
        return new aan1(activity, new fan1());
    }

    public static ifl1 q(ejp ejpVar) {
        return new ifl1((ov20) ((kly0) ejpVar.a.i).get(), (byte) 13);
    }

    public static uu40 r(f95 f95Var, bps0 bps0Var, v680 v680Var) {
        return f95Var.f() ? v680Var : bps0Var;
    }

    public static void s() {
        Object obj = lz40.d;
    }

    public static FlowableDoOnLifecycle t(sjq0 sjq0Var) {
        return ((BehaviorProcessor) sjq0Var.c).w(new ixp0(sjq0Var, (byte) 11));
    }

    public static h250 u() {
        h250 h250Var = new h250();
        h250Var.b = new WeakReference(null);
        return h250Var;
    }

    public static bm00 v(ejp ejpVar) {
        bm00 bm00Var = new bm00((o241) ((kly0) ejpVar.a.t).get(), (byte) 12);
        PublishSubject publishSubject = za50.a;
        return bm00Var;
    }

    public static PublishSubject w() {
        PublishSubject publishSubject = za50.a;
        c8o.m(publishSubject);
        return publishSubject;
    }

    public static x5u x(caq caqVar) {
        return new x5u(caqVar, (byte) 9);
    }

    public static mqd0 y(ugt0 ugt0Var, yfu yfuVar, x5u x5uVar) {
        return ((Boolean) x5uVar.invoke()).booleanValue() ? yfuVar : ugt0Var;
    }

    public static rjn0 z() {
        return new rjn0();
    }
}
