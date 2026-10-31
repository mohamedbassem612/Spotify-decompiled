package p;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class aan0 implements jly0 {
    public static ncn0 A(sua suaVar) {
        return new ncn0(suaVar, (byte) 0);
    }

    public static w2o0 B(d0q d0qVar) {
        return new w2o0(d0qVar);
    }

    public static t700 a(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 17);
    }

    public static z9n0 b(thq thqVar, r7q r7qVar, jo80 jo80Var, jly0 jly0Var, kly0 kly0Var, r7q r7qVar2, kly0 kly0Var2, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var3, r7q r7qVar5, kly0 kly0Var4, caq caqVar) {
        z9n0 z9n0Var = new z9n0();
        z9n0Var.a = thqVar;
        z9n0Var.b = r7qVar;
        z9n0Var.c = jo80Var;
        z9n0Var.d = jly0Var;
        z9n0Var.e = kly0Var;
        z9n0Var.f = r7qVar2;
        z9n0Var.g = kly0Var2;
        z9n0Var.h = r7qVar3;
        z9n0Var.i = r7qVar4;
        z9n0Var.j = kly0Var3;
        z9n0Var.k = r7qVar5;
        z9n0Var.l = kly0Var4;
        z9n0Var.m = caqVar;
        return z9n0Var;
    }

    public static egn0 c(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 1);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static ein0 d(caq caqVar, gbp gbpVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar2, caq caqVar3, caq caqVar4, r7q r7qVar, caq caqVar5, kly0 kly0Var3, r7q r7qVar2, kly0 kly0Var4, r7q r7qVar3) {
        ein0 ein0Var = new ein0();
        ein0Var.a = caqVar;
        ein0Var.b = gbpVar;
        ein0Var.c = kly0Var;
        ein0Var.d = kly0Var2;
        ein0Var.e = caqVar2;
        ein0Var.f = caqVar3;
        ein0Var.g = caqVar4;
        ein0Var.h = r7qVar;
        ein0Var.i = caqVar5;
        ein0Var.j = kly0Var3;
        ein0Var.k = r7qVar2;
        ein0Var.l = kly0Var4;
        ein0Var.m = r7qVar3;
        return ein0Var;
    }

    public static i2o0 e(r7q r7qVar, r7q r7qVar2, kly0 kly0Var) {
        i2o0 i2o0Var = new i2o0();
        i2o0Var.a = r7qVar;
        i2o0Var.b = kly0Var;
        i2o0Var.c = r7qVar2;
        return i2o0Var;
    }

    public static r3o0 f(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        r3o0 r3o0Var = new r3o0();
        r3o0Var.a = r7qVar;
        r3o0Var.b = kly0Var;
        r3o0Var.c = caqVar;
        r3o0Var.d = kly0Var2;
        r3o0Var.e = r7qVar2;
        r3o0Var.f = caqVar2;
        return r3o0Var;
    }

    public static e4o0 g(r7q r7qVar, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        e4o0 e4o0Var = new e4o0();
        e4o0Var.a = r7qVar;
        e4o0Var.b = kly0Var;
        e4o0Var.c = caqVar;
        e4o0Var.d = kly0Var2;
        e4o0Var.e = caqVar2;
        return e4o0Var;
    }

    public static j9o0 h(r7q r7qVar) {
        j9o0 j9o0Var = new j9o0();
        j9o0Var.a = r7qVar;
        return j9o0Var;
    }

    public static egn0 i(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 2);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static egn0 j(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 3);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static Observable k(jj4 jj4Var) {
        Observable observableI = yoi1.i((mr20) jj4Var.d.getValue(), o6x.a);
        c8o.m(observableI);
        return observableI;
    }

    public static gcn0 l(eu4 eu4Var) {
        return new gcn0(eu4Var.g());
    }

    public static cua m() {
        return new cua((byte) 17);
    }

    public static qtw n(gw70 gw70Var, woa woaVar, kma kmaVar) {
        return f6o1.A(new et90(gw70Var, woaVar, kmaVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
    }

    public static xrn0 o(lzn0 lzn0Var) {
        return new xrn0(new u98(2, lzn0Var, lzn0.class, "navigateToUri", "navigateToUri(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;Landroid/os/Bundle;)V", 0, (byte) 9), (byte) 0);
    }

    public static xrn0 p(lzn0 lzn0Var) {
        return new xrn0(new u98(2, lzn0Var, lzn0.class, "navigateToUri", "navigateToUri(Ljava/lang/String;Lcom/spotify/ubi/logger/InteractionLoggingResult;Landroid/os/Bundle;)V", 0, (byte) 10), (byte) 1);
    }

    public static Set q(xaz0 xaz0Var, kba kbaVar, rsm rsmVar) {
        return f46.S0(new uph[]{new uph(rsmVar.a, (byte) 1), new uph((mn1) xaz0Var.b, (byte) 2), new uph((tmh) kbaVar.b, (byte) 0)});
    }

    public static llm r() {
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        return smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
    }

    public static void s(g1n0 g1n0Var, Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public static p2o0 t(Activity activity, d3o0 d3o0Var, u210 u210Var, Scheduler scheduler) {
        return new p2o0(activity, new q2o0(activity, (byte) 0), d3o0Var, u210Var, scheduler);
    }

    public static o4o0 u(Application application, d3o0 d3o0Var) {
        return new o4o0(application, d3o0Var);
    }

    public static Observable v(drj0 drj0Var) {
        Observable map = Observable.combineLatest((Observable) drj0Var.b, (Observable) drj0Var.c, new ncn0((byte) 5)).startWithItem(Boolean.TRUE).distinctUntilChanged().skip(1L).filter(new nh61((byte) 4)).map(new ncn0((byte) 6));
        c8o.m(map);
        return map;
    }

    public static Observable w(dxz0 dxz0Var) {
        Observable observableE = dxz0Var.e();
        c8o.m(observableE);
        return observableE;
    }

    public static Single x(kqi0 kqi0Var) {
        Single singleFirstOrError = Observable.combineLatest((Observable) kqi0Var.b, (Observable) kqi0Var.d, (Observable) kqi0Var.c, new ncn0((byte) 7)).firstOrError();
        c8o.m(singleFirstOrError);
        return singleFirstOrError;
    }

    public static Observable y(Observable observable) {
        Observable observableDistinctUntilChanged = observable.map(new ncn0((byte) 15)).distinctUntilChanged();
        c8o.m(observableDistinctUntilChanged);
        return observableDistinctUntilChanged;
    }

    public static ArrayList z() {
        return new ArrayList();
    }
}
