package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ip91 {
    public final yqg a;
    public final xrc0 b;
    public final jo91 c;
    public final iyc0 d;
    public final qn91 e;
    public final hn91 f;
    public final Observable g;
    public final Scheduler h;
    public final RxRouter i;
    public final q7j0 j;
    public final kt91 k;
    public final Subject l = new PublishSubject().c();
    public final Object m = new Object();
    public final ArrayList n = new ArrayList();
    public final Subject o = new PublishSubject().c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f41p = new idd1(new fe81(this, (byte) 21));
    public final idd1 q = new idd1(new l5v0(this, (byte) 22));

    public ip91(yqg yqgVar, xrc0 xrc0Var, jo91 jo91Var, iyc0 iyc0Var, qn91 qn91Var, hn91 hn91Var, Observable observable, Scheduler scheduler, RxRouter rxRouter, q7j0 q7j0Var, kt91 kt91Var) {
        this.a = yqgVar;
        this.b = xrc0Var;
        this.c = jo91Var;
        this.d = iyc0Var;
        this.e = qn91Var;
        this.f = hn91Var;
        this.g = observable;
        this.h = scheduler;
        this.i = rxRouter;
        this.j = q7j0Var;
        this.k = kt91Var;
    }

    public static phc m(String str) {
        hhc m231Var;
        try {
            byte[] bArrA = raa.b.g().a(str);
            m231Var = phc.e(0, bArrA, bArrA.length);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Error decoding itemId from hex string, using utf8 instead.", new Object[0]);
            m231Var = phc.i(str);
        }
        return (phc) m231Var;
    }

    public final CompletableAndThenCompletable a(String str, String str2, String str3) {
        return new CompletableFromAction(new fp91((byte) 0, str2, this)).c(d(str3).firstOrError().flatMapCompletable(new ep91(this, str3, str, str2, (byte) 0)));
    }

    public final Observable b(String str, String str2) {
        jo91 jo91Var = this.c;
        if (jo91Var.b()) {
            return l().map(o9x0.N0);
        }
        return ((t35) jo91Var.a.get()).F() ? d(str2).switchMap(new dp91(this, str2, str, (byte) 3)) : Observable.just(new to91());
    }

    public final Observable c(String str, String str2) {
        jo91 jo91Var = this.c;
        if (jo91Var.b()) {
            return l().map(u9x0.N0);
        }
        return ((t35) jo91Var.a.get()).F() ? d(str2).switchMap(new dp91(this, str2, str, (byte) 4)) : Observable.just(new to91());
    }

    public final Observable d(String str) {
        return this.g.map(new mcn1(str, (byte) 9)).distinctUntilChanged();
    }

    public final Observable e(String str) {
        return ((Observable) this.f41p.getValue()).map(new vdn1(str, (byte) 16)).distinctUntilChanged();
    }

    public final Single f(String str) {
        Single map;
        if (this.j.b(str)) {
            map = Single.just(Boolean.FALSE);
        } else {
            map = q7j0.c(str) ? rqt0.G(new sb91(this, str, (lnm) null, (byte) 3)).map(ybx0.O0) : Single.just(Boolean.TRUE);
        }
        map.getClass();
        return map;
    }

    public final Observable g(String str, String str2) {
        if (!q7j0.c(str2)) {
            Observable observableJust = Observable.just(z6x.a);
            observableJust.getClass();
            return observableJust;
        }
        hru0 hru0Var = (hru0) PlaylistRequestDecorationPolicy.n().toBuilder();
        vwu0 vwu0Var = (vwu0) PlaylistTrackDecorationPolicy.p().toBuilder();
        vwu0Var.B();
        hru0Var.y((PlaylistTrackDecorationPolicy) vwu0Var.build());
        Observable observableDistinctUntilChanged = yoi1.i(((rsc0) this.b).m(str2, str, (PlaylistRequestDecorationPolicy) hru0Var.build()), o6x.a).map(hcx0.O0).distinctUntilChanged();
        observableDistinctUntilChanged.getClass();
        return observableDistinctUntilChanged;
    }

    public final Completable h(String str, String str2, String str3, String str4) {
        return k(str4, str2, str3).flatMapCompletable(new ep91(this, str, str2, str4, (byte) 1));
    }

    public final Observable i(String str, String str2, String str3, Boolean bool) {
        if (!this.c.b()) {
            return d(str3).switchMap(new gp91(this, str3, str, str2, bool)).distinctUntilChanged();
        }
        Observable observableSwitchMap = this.g.distinctUntilChanged((BiPredicate) icx0.N0).switchMap(new gp91(str3, str2, str, this, bool));
        observableSwitchMap.getClass();
        return observableSwitchMap;
    }

    public final Completable j() {
        return this.g.firstOrError().flatMapCompletable(new xq81(this, (byte) 2));
    }

    public final Single k(String str, String str2, String str3) {
        Single singleFirstOrError = this.e.c.distinctUntilChanged().firstOrError();
        if (!str.equals("reset") && str2 != null && str3 != null) {
            if (str.equals("plus") || str.equals("tap")) {
                singleFirstOrError = singleFirstOrError.compose(new dp91(str2, this, str3, (byte) 2));
            } else if (str.equals("minus")) {
                singleFirstOrError = singleFirstOrError.compose(new bp91((byte) 0, str2, this));
            }
        }
        return singleFirstOrError.flatMap(new n801(this, (byte) 28));
    }

    public final Observable l() {
        jcx0 jcx0Var = jcx0.O0;
        Observable observable = this.g;
        return Observable.combineLatest((ObservableSource) observable.distinctUntilChanged((Function) jcx0Var).switchMapSingle(new pas(this, (byte) 1)), (ObservableSource) observable, (BiFunction) new ejb(this, (byte) 25)).distinctUntilChanged();
    }
}
