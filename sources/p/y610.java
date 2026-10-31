package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y610 {
    public final Flowable a;
    public final ynb0 b;
    public final t7y c;
    public final r410 d;
    public final ynb0 e;
    public final ynb0 f;
    public final ynb0 g;
    public final ynb0 h;
    public final ynb0 i;
    public final ynb0 j;
    public final ks21 k;
    public final q610 l;
    public final oo70 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Scheduler f98p;
    public ObservableRefCount v;
    public final Observable w;
    public final Observable x;
    public final x610 m = new x610(this);
    public final rku n = new rku();
    public Disposable q = EmptyDisposable.a;
    public final ArrayList r = new ArrayList(2);
    public final PublishSubject s = new PublishSubject();
    public final Object t = new Object();
    public v7v u = null;

    public y610(oo70 oo70Var, Scheduler scheduler, Flowable flowable, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, t7y t7yVar, r410 r410Var, ks21 ks21Var, q610 q610Var, Observable observable, Observable observable2) {
        this.o = oo70Var;
        this.f98p = scheduler;
        this.a = flowable;
        this.e = ynb0Var;
        this.f = ynb0Var2;
        this.g = ynb0Var3;
        this.h = ynb0Var4;
        this.i = ynb0Var5;
        this.j = ynb0Var6;
        this.b = ynb0Var7;
        this.c = t7yVar;
        this.d = r410Var;
        this.k = ks21Var;
        this.l = q610Var;
        this.w = observable;
        this.x = observable2;
    }

    public final Flowable a(final String str) {
        ObservableRefCount observableRefCountF;
        ((wo70) this.o).a(ozm0.a);
        synchronized (this.t) {
            try {
                observableRefCountF = this.v;
                if (observableRefCountF == null) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean();
                    observableRefCountF = this.w.filter(new n9v((byte) 18)).takeUntil(this.s).map(new nay(this, (byte) 12)).doOnNext(new v610(this, (byte) 0)).doOnTerminate(new w610(this, atomicBoolean, (byte) 0)).doOnDispose(new w610(this, atomicBoolean, (byte) 1)).doFinally(new w610(this, new AtomicBoolean(), (byte) 2)).replay(1).f();
                    this.v = observableRefCountF;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return observableRefCountF.subscribeOn(this.f98p).doOnSubscribe(new t610(this, str, (byte) 0)).doFinally(new Action() { // from class: p.u610
            @Override // io.reactivex.rxjava3.functions.Action
            public final void run() {
                ArrayList arrayList = this.a.r;
                String str2 = str;
                arrayList.remove(str2);
                Logger.b("Client disconnected: %s - all connected clients: %s", new Object[]{str2, arrayList});
            }
        }).toFlowable(BackpressureStrategy.d);
    }

    public final void b(AtomicBoolean atomicBoolean) {
        synchronized (this.t) {
            try {
                if (atomicBoolean.compareAndSet(false, true)) {
                    Logger.b("Sending shutdown signal to EisShutdownOperation", new Object[0]);
                    this.n.a();
                    Disposable disposable = this.q;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.l.e.a();
                    this.v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
