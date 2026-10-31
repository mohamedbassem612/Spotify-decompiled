package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pq implements dwo {
    public final Flowable a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final n4f0 e;
    public final vku f;
    public String g;
    public boolean h;

    public pq(Flowable flowable, jly0 jly0Var, fwo fwoVar, fwo fwoVar2, fwo fwoVar3, fwo fwoVar4, fwo fwoVar5, fwo fwoVar6, n4f0 n4f0Var) {
        Observable observableFromPublisher;
        this.a = flowable;
        this.b = jly0Var;
        this.c = fwoVar5;
        this.d = fwoVar6;
        this.e = n4f0Var;
        vku vkuVar = new vku();
        this.f = vkuVar;
        boolean zBooleanValue = ((Boolean) fwoVar2.get()).booleanValue();
        ohv ohvVar = ohv.ACCOUNT_SWITCHING;
        boolean z = zBooleanValue && !((mya1) fwoVar.get()).a().contains(ohvVar);
        Object obj = fwoVar2.get();
        ((mya1) fwoVar.get()).a().contains(ohvVar);
        Objects.toString(obj);
        if (!((yv) fwoVar4.get()).a.a()) {
            ((oq) jly0Var.get()).l();
            observableFromPublisher = Observable.empty();
            observableFromPublisher.getClass();
        } else if (z) {
            observableFromPublisher = yoi1.i(((mya1) fwoVar.get()).b(ohvVar), o6x.a).doOnNext(nm.c).filter(fkj0.d).switchMap(new bv40(this, (byte) 2));
            observableFromPublisher.getClass();
        } else {
            observableFromPublisher = new ObservableFromPublisher(flowable);
        }
        Completable completableFlatMapCompletable = observableFromPublisher.subscribeOn((Scheduler) fwoVar3.get()).distinctUntilChanged().flatMapCompletable(new cp5(this, (byte) 2));
        completableFlatMapCompletable.getClass();
        Predicate predicate = Functions.h;
        vkuVar.a(completableFlatMapCompletable.o(predicate).subscribe());
        Completable completableFlatMapCompletable2 = ((wbd1) fwoVar5.get()).b.filter(j561.c).distinctUntilChanged().flatMapCompletable(new gid(observableFromPublisher, this, (byte) 6));
        completableFlatMapCompletable2.getClass();
        vkuVar.a(completableFlatMapCompletable2.o(predicate).subscribe());
    }

    public final void shutdown() {
        this.f.c();
        yg8 yg8Var = this.e.h;
        if (this.h || this.g == null || yg8Var == null || fyo1.j(yg8Var)) {
            return;
        }
        try {
            vbd1 vbd1Var = (vbd1) this.d.get();
            vbd1Var.a.onNext(dwo0.a);
            oq oqVar = (oq) this.b.get();
            String str = this.g;
            if (str == null) {
                str = "";
            }
        } catch (Exception e) {
            Logger.d("AccountSwitching: Failed to remove credentials in shutdown", e);
        }
    }
}
