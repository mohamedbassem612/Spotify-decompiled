package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeArrayDelayError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSkip;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fc00 {
    public final Set a;
    public final qfl1 b;
    public final zq4 c;
    public final Observable d;
    public final nty e;
    public final zia f = new zia();
    public Disposable g = e();
    public final CompositeDisposable h = new CompositeDisposable();

    public fc00(Set set, qfl1 qfl1Var, zq4 zq4Var, Observable observable, nty ntyVar) {
        this.a = set;
        this.b = qfl1Var;
        this.c = zq4Var;
        this.d = observable;
        this.e = ntyVar;
    }

    public static boolean d(Throwable th) {
        if (th instanceof IOException) {
            return true;
        }
        if (!(th instanceof CompositeException)) {
            return false;
        }
        List<Throwable> list = ((CompositeException) th).a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Throwable th2 : list) {
            th2.getClass();
            if (!d(th2)) {
                return false;
            }
        }
        return true;
    }

    public static CompletableMergeArrayDelayError h(Set set, iu30 iu30Var) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(new CompletableFromAction(new bm0(iu30Var, (dc00) it.next(), (byte) 24)));
        }
        Completable[] completableArr = (Completable[]) arrayList.toArray(new Completable[0]);
        return new CompletableMergeArrayDelayError((CompletableSource[]) Arrays.copyOf(completableArr, completableArr.length));
    }

    public final Disposable e() {
        CompletableMergeArrayDelayError completableMergeArrayDelayErrorH = h(this.a, new nty(this, (byte) 25));
        Scheduler scheduler = Schedulers.c;
        return completableMergeArrayDelayErrorH.s(scheduler).n(scheduler).subscribe(new f72(this, (byte) 21), new cfs(this, (byte) 22));
    }

    public final void f() {
        CompositeDisposable compositeDisposable = this.h;
        compositeDisposable.g();
        boolean zIsDisposed = this.g.isDisposed();
        zia ziaVar = this.f;
        if (zIsDisposed && !ziaVar.c()) {
            this.g.dispose();
            this.g = e();
        }
        Flowable flowable = Observable.combineLatest(ziaVar, Observable.interval(30L, 30L, TimeUnit.SECONDS, Schedulers.b).startWithItem(0L), this.d.filter(t9w.c1).map(e4y.d1).startWithItem(rih1.a), fkj0.S0).toFlowable(BackpressureStrategy.b);
        flowable.getClass();
        FlowableSkip flowableSkip = new FlowableSkip(flowable);
        Scheduler scheduler = Schedulers.c;
        FlowableObserveOn flowableObserveOnL = flowableSkip.W(scheduler).L(scheduler);
        fey feyVar = new fey(this, (byte) 4);
        ObjectHelper.a(2, "prefetch");
        compositeDisposable.b(new FlowableConcatMapCompletable(flowableObserveOnL, feyVar).subscribe(new c72(this, (byte) 2), new xu(this, (byte) 26)));
    }

    public final void g() {
        this.h.g();
        this.g.dispose();
    }
}
