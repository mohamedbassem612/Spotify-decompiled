package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dgs {
    public final lzn0 a;
    public final dsb1 b;
    public final eny c;
    public final zfr d;
    public final dir e;
    public final xhr f;
    public final kt8 g;
    public final eqs h;
    public final h0s i;
    public final otr j;
    public final boolean k;
    public final boolean l;
    public final frh1 m;
    public final nvh1 n;
    public final q8n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Scheduler f14p;
    public final PublishSubject q = new PublishSubject();
    public final BehaviorSubject r = BehaviorSubject.f();
    public final BehaviorSubject s = BehaviorSubject.g(Boolean.FALSE);
    public final BehaviorSubject t = BehaviorSubject.g(h8v0.a);
    public final CompositeDisposable u = new CompositeDisposable();

    public dgs(lzn0 lzn0Var, dsb1 dsb1Var, eny enyVar, zfr zfrVar, dir dirVar, xhr xhrVar, kt8 kt8Var, eqs eqsVar, h0s h0sVar, otr otrVar, boolean z, boolean z2, frh1 frh1Var, nvh1 nvh1Var, kuw0 kuw0Var, q8n q8nVar, Scheduler scheduler) {
        this.a = lzn0Var;
        this.b = dsb1Var;
        this.c = enyVar;
        this.d = zfrVar;
        this.e = dirVar;
        this.f = xhrVar;
        this.g = kt8Var;
        this.h = eqsVar;
        this.i = h0sVar;
        this.j = otrVar;
        this.k = z;
        this.l = z2;
        this.m = frh1Var;
        this.n = nvh1Var;
        this.o = q8nVar;
        this.f14p = scheduler;
    }

    public final void a() {
        this.u.g();
        otr otrVar = this.j;
        xab1 xab1Var = otrVar.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        otrVar.e = null;
    }

    public final void b(String str, tjq tjqVar) {
        bgs bgsVar = new bgs(this, str, null, (byte) 1);
        q8n q8nVar = this.o;
        Single singleF = rqt0.F(q8nVar, bgsVar);
        Boolean bool = Boolean.FALSE;
        Disposable disposableSubscribe = singleF.onErrorReturnItem(bool).subscribe(new cgs(this, (byte) 3));
        CompositeDisposable compositeDisposable = this.u;
        compositeDisposable.b(disposableSubscribe);
        if (this.k || this.l) {
            compositeDisposable.b(rqt0.F(q8nVar, new bgs(this, str, null, (byte) 2)).onErrorReturnItem(bool).subscribe(new lgr(this, str, (byte) 7)));
        }
        dsb1 dsb1Var = this.b;
        boolean z = dsb1Var.b;
        Resources resources = dsb1Var.c;
        er61 er61Var = new er61(ar61.a, z, resources.getString(2131960221), resources.getString(2131960227), str.concat(":markasplayed"));
        air airVar = dsb1Var.a;
        dir dirVar = airVar.a;
        compositeDisposable.b(Observable.combineLatest(Single.zip(dirVar.d.b("offline").map(vgp1.U0).first(bool), dirVar.b.c(Collections.singletonList(str), dir.f), dirVar.e.b(new oi("autodownload-content-experience", false, new i3o(str, (byte) 6))).filter(wcp1.T0).map(new k9p1(str, (byte) 7)).first(ktl.a), new zfr(str, dirVar, (byte) 1)).flatMapObservable(zp8.V0).flatMapSingle(new zwa(airVar, (byte) 28)).map(xbp1.U0).map(new c681(er61Var, (byte) 14)).onErrorReturnItem(er61Var), this.c.a(str, blc0.fh).toObservable(), this.r.distinctUntilChanged(), this.s.distinctUntilChanged(), this.t.distinctUntilChanged(), new yjp1((byte) 3, this, str)).observeOn(this.f14p).subscribe(new cfs(tjqVar, (byte) 2)));
        compositeDisposable.b(this.q.flatMapCompletable(new wcr(this, (byte) 10)).subscribe());
        tjqVar.e = new y0o(this, str, (byte) 26);
    }
}
