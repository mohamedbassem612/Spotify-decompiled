package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDelay;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w2h implements Connection {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ Object e;

    public w2h(xqd0 xqd0Var, Consumer consumer) {
        this.a = (byte) 2;
        this.d = xqd0Var;
        this.e = consumer;
        this.b = new vku();
        this.c = smo1.e(flo1.l(guo1.B(), xqd0Var.d));
        x350 x350Var = xqd0Var.g;
        synchronized (x350Var) {
            if (!x350Var.h) {
                try {
                    try {
                        Logger.b("[LiveSharing] Registering meeting status listener.", new Object[0]);
                        ((j02) x350Var.b.get()).registerMeetingStatusListener(x350Var.a, new w350(x350Var), Optional.empty());
                    } catch (IllegalStateException e) {
                        x350Var.c("[LiveSharing] Registering", e);
                    }
                    x350Var.h = true;
                } catch (Throwable th) {
                    x350Var.h = true;
                    throw th;
                }
            }
        }
    }

    public void a(boolean z) {
        Logger.b("[LiveSharing] Leaving live-sharing.", new Object[0]);
        xqd0 xqd0Var = (xqd0) this.d;
        x350 x350Var = xqd0Var.g;
        Completable completableB = x350Var.g.h() == u311.c ? x350Var.b(q02.b) : x350Var.b(q02.a);
        if (z) {
            completableB = new CompletableDoFinally(completableB, new v350(x350Var, (byte) 1));
        }
        ((vku) this.b).a(completableB.s(xqd0Var.c).subscribe(new wqd0((Consumer) this.e, (byte) 0)));
    }

    public final void accept(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                i2h i2hVar = (i2h) obj;
                ((cn) obj5).accept(i2hVar);
                ((rp) obj4).accept(i2hVar);
                q2r0 q2r0Var = i2hVar.a;
                if (!(q2r0Var instanceof q2r0)) {
                    hhg1.n("Failed requirement.");
                } else {
                    PublishSubject publishSubject = (PublishSubject) ((cr6) obj3).g;
                    q2r0 q2r0Var2 = q2r0Var;
                    goc0 goc0Var = q2r0Var2.b;
                    boolean z = goc0Var.a.isEmpty() && goc0Var.b.isEmpty();
                    String str = q2r0Var2.a.a;
                    if (str == null) {
                        str = "";
                    }
                    publishSubject.onNext(new v2h(z, str));
                }
                break;
            case 1:
                s0w s0wVar = (s0w) obj;
                ((PublishSubject) obj5).onNext(s0wVar);
                ((a2w) obj4).Z.setEnabled(s0wVar.D);
                break;
            case 2:
                xsd0 xsd0Var = (xsd0) obj;
                vku vkuVar = (vku) obj5;
                xqd0 xqd0Var = (xqd0) obj2;
                x350 x350Var = xqd0Var.g;
                Scheduler scheduler = xqd0Var.c;
                Logger.b("[LiveSharing] Accepting effect: " + xsd0Var + ".", new Object[0]);
                if (xsd0Var instanceof qsd0) {
                    vkuVar.c();
                    vkuVar.a(Observable.combineLatest(Observable.combineLatest(x350Var.f.distinctUntilChanged(), x350Var.g.distinctUntilChanged(), new laz(x350Var, (byte) 16)).distinctUntilChanged().doOnNext(new dy40(x350Var, (byte) 1)).mergeWith(x350Var.c).distinctUntilChanged(), yoi1.i(xqd0Var.e.e.a(), o6xVar), yb10.X).distinctUntilChanged().subscribeOn(scheduler).subscribe(new qg7((Object) xqd0Var, obj3, (Object) this, (byte) 15)));
                } else if (xsd0Var instanceof wsd0) {
                    Maybe maybeOnErrorComplete = rqt0.F(w0h1.h(scheduler), new p6d0(xqd0Var, (lnm) null, (byte) 3)).onErrorComplete();
                    zc80 zc80Var = new zc80(xqd0Var, (byte) 12);
                    maybeOnErrorComplete.getClass();
                    vkuVar.a(new MaybeFlatMapCompletable(maybeOnErrorComplete, zc80Var).s(scheduler).subscribe());
                } else if (xsd0Var instanceof rsd0) {
                    x350Var.d(ksd0.a);
                    vkuVar.a(x350Var.a(s350.c, (z2p1) null).s(scheduler).subscribe());
                } else if (xsd0Var instanceof usd0) {
                    fn31.T((llm) obj4, (o8n) null, 0, new iyb0(xqd0Var, (lnm) null, (byte) 4), 3);
                } else if (xsd0Var instanceof vsd0) {
                    Maybe maybeFirstElement = ((lx91) xqd0Var.t.a).k.f().distinctUntilChanged().filter(xpv0.h).firstElement();
                    maybeFirstElement.getClass();
                    MaybeIgnoreElementCompletable maybeIgnoreElementCompletable = new MaybeIgnoreElementCompletable(maybeFirstElement);
                    long jB = xqd0Var.X.b();
                    Scheduler scheduler2 = Schedulers.b;
                    Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
                    Objects.requireNonNull(scheduler2, "scheduler is null");
                    new CompletableDelay(maybeIgnoreElementCompletable, jB, scheduler2).s(scheduler).g(new f72(this, (byte) 29)).subscribe().getClass();
                } else if (xsd0Var instanceof ssd0) {
                    a(false);
                } else if (!(xsd0Var instanceof tsd0)) {
                    eg.o();
                } else {
                    Logger.b("[LiveSharing] Leaving social-listening.", new Object[0]);
                    ((up90) xqd0Var.t.b).e.p.onNext(new z3a1(hr90.f));
                }
                break;
            default:
                Consumer consumer = (Consumer) obj3;
                cr6 cr6Var = (cr6) obj2;
                vku vkuVar2 = (vku) obj5;
                zzd0 zzd0Var = ((rwd0) obj).a;
                String str2 = zzd0Var.a.c;
                if (!"spotify:room:58z5rSz7BvXdayPbEUf8Xv".equals(str2) && vkuVar2.a.i() == 0) {
                    boolean z2 = zzd0Var.h;
                    int i = zzd0Var.k.f;
                    vkuVar2.a(((o241) cr6Var.g).a.map(xi10.X).startWithItem(Boolean.valueOf(z2)).distinctUntilChanged().skip(1L).map(dj10.X).onErrorComplete().subscribe(new dn(consumer, (byte) 26)));
                    vkuVar2.a(yoi1.i(((zwz0) cr6Var.d).c(), o6xVar).map(fj10.X).subscribe(new dn(consumer, (byte) 27)));
                    if (zzd0Var.m) {
                        vkuVar2.a(new ObservableFromPublisher((Flowable) cr6Var.e).map(ok10.t).distinctUntilChanged().subscribe(new dn(consumer, (byte) 28)));
                    }
                    vkuVar2.a(yoi1.i((mr20) cr6Var.f, o6xVar).filter(new k9p1(str2, (byte) 14)).map(sl10.N0).doOnError(zzc0.c).onErrorComplete().subscribe(new dn(consumer, (byte) 25)));
                    fn31.T((llm) obj4, (o8n) null, 0, new fe6((Object) cr6Var, (Object) str2, (Object) consumer, i, (lnm) null, (byte) 10), 3);
                    break;
                }
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((cn) obj3).dispose();
                ((Disposable) obj).dispose();
                break;
            case 1:
                ((ydb) obj).e();
                a2w a2wVar = (a2w) obj2;
                a2wVar.i.getViewTreeObserver().removeOnGlobalLayoutListener(a2wVar.W0);
                mzr0 mzr0Var = a2wVar.d;
                mzr0Var.u((kf) null, (kf) null);
                mzr0Var.c();
                ((CompositeDisposable) this.e).dispose();
                break;
            case 2:
                Logger.b("[LiveSharing] Disposing the connectable.", new Object[0]);
                smo1.p((llm) obj2, (CancellationException) null);
                ((vku) obj3).c();
                Logger.b("[LiveSharing] Leaving social-listening.", new Object[0]);
                ((up90) ((xqd0) obj).t.b).e.p.onNext(new z3a1(hr90.f));
                a(true);
                break;
            default:
                ((vku) obj3).c();
                smo1.p((llm) obj2, (CancellationException) null);
                break;
        }
    }

    public w2h(cr6 cr6Var, Consumer consumer, byte b) {
        this.a = (byte) 3;
        this.d = cr6Var;
        this.e = consumer;
        this.b = new vku();
        this.c = smo1.e(flo1.l(guo1.B(), b3s.c));
    }

    public w2h(cr6 cr6Var, Consumer consumer) {
        this.a = (byte) 0;
        this.e = cr6Var;
        this.b = ((g0h) cr6Var.c).L(consumer);
        this.c = (rp) ((sp) cr6Var.d).L(consumer);
        this.d = ((PublishSubject) cr6Var.g).distinctUntilChanged().subscribe(new mba(cr6Var, (byte) 24));
    }

    public w2h(PublishSubject publishSubject, a2w a2wVar, ydb ydbVar, CompositeDisposable compositeDisposable) {
        this.a = (byte) 1;
        this.b = publishSubject;
        this.c = a2wVar;
        this.d = ydbVar;
        this.e = compositeDisposable;
    }
}
