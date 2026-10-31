package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acl implements EventSource {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EventSource b;

    public acl(Flowable flowable, Flowable flowable2, uvy uvyVar, d0r d0rVar, q8n q8nVar, hv4 hv4Var, dma1 dma1Var) {
        this.a = (byte) 8;
        boolean zA = hv4Var.a();
        o3r o3rVar = ss51.a;
        mo9 mo9Var = mo9.Y;
        Flowable flowableG = Flowable.g(flowable.j(mo9Var).J(ybx0.t), flowable.j(weu0.a).x(hcx0.t).J(icx0.i), flowable.j(mo9.O0), flowable.j(mo9.S0), new wgz0((byte) 3, zA));
        flowableG.getClass();
        Function function = Functions.a;
        ObservableSource observableFromPublisher = new ObservableFromPublisher(flowableG.t(function).J(Functions.b(ns51.class)));
        Flowable flowableG2 = Flowable.g(flowable.j(mo9Var).J(rdx0.i), flowable2.J(wdx0.i), flowable.j(mo9.U0).t(function), flowable.j(mo9.T0), new wgz0((byte) 4, hv4Var.a()));
        flowableG2.getClass();
        ObservableSource observableFromPublisher2 = new ObservableFromPublisher(flowableG2.J(Functions.b(ns51.class)));
        FlowableDistinctUntilChanged flowableDistinctUntilChangedS = flowable.j(mo9Var).x(jcx0.t).J(kcx0.t).s(pdx0.t);
        vbm[] vbmVarArr = q601.a;
        this.b = RxEventSources.a(new ObservableSource[]{observableFromPublisher, observableFromPublisher2, new ObservableFromPublisher(yoi1.h(rqt0.u(hu20.e(new kge(flowableDistinctUntilChangedS), new c6e0((lnm) null, uvyVar, d0rVar, (byte) 20))), q8nVar).J(Functions.b(ns51.class))), new ObservableFromPublisher(yoi1.h(lgv.a(dma1Var), q8nVar).J(wbx0.t))});
    }

    public final Disposable a(Consumer consumer) {
        byte b = this.a;
        EventSource eventSource = this.b;
        switch (b) {
            case 0:
                return eventSource.a(consumer);
            case 1:
                return eventSource.a(consumer);
            case 2:
                return eventSource.a(consumer);
            case 3:
                return eventSource.a(consumer);
            case 4:
                return eventSource.a(new qjk(consumer, (byte) 1));
            case 5:
                return eventSource.a(consumer);
            case 6:
                return eventSource.a(consumer);
            case 7:
                return eventSource.a(consumer);
            case 8:
                return eventSource.a(consumer);
            case 9:
                return eventSource.a(consumer);
            default:
                return eventSource.a(consumer);
        }
    }

    public acl(Observable observable, byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = RxEventSources.a(new ObservableSource[]{observable.distinctUntilChanged().map(ybx0.g)});
                break;
            default:
                this.b = RxEventSources.a(new ObservableSource[]{observable.distinctUntilChanged().map(y1x0.c)});
                break;
        }
    }

    public acl(String str, pxr pxrVar, Scheduler scheduler) {
        this.a = (byte) 2;
        final xvy xvyVar = new xvy(pxrVar, str, scheduler, (byte) 2);
        final byte b = 1;
        this.b = RxEventSources.a(new ObservableSource[]{Observable.defer(new Supplier() { // from class: p.dfh0
            public final Object get() {
                byte b2 = b;
                Function0 function0 = xvyVar;
                switch (b2) {
                    case 0:
                        return function0.invoke();
                    default:
                        return (ObservableSource) function0.invoke();
                }
            }
        }).subscribeOn(Schedulers.c)});
    }

    public acl(String str, uu00 uu00Var) {
        this.a = (byte) 9;
        this.b = RxEventSources.a(new ObservableSource[]{Observable.defer(new xf0(uu00Var, str, (byte) 15)).map(new yjp1(str, (byte) 20)).doOnError(iqa1.Z).onErrorComplete()});
    }

    public acl(z141 z141Var) {
        this.a = (byte) 0;
        this.b = RxEventSources.a(new ObservableSource[]{z141Var.a.map(cq41.R0)});
    }

    public acl(hur hurVar, c9c c9cVar) {
        final byte b = 1;
        this.a = (byte) 1;
        final t3x t3xVar = new t3x(hurVar, c9cVar, (byte) 11);
        this.b = RxEventSources.a(new ObservableSource[]{Observable.defer(new Supplier() { // from class: p.dfh0
            public final Object get() {
                byte b2 = b;
                Function0 function0 = t3xVar;
                switch (b2) {
                    case 0:
                        return function0.invoke();
                    default:
                        return (ObservableSource) function0.invoke();
                }
            }
        }).subscribeOn(Schedulers.c)});
    }

    public acl(iir iirVar, String str) {
        this.a = (byte) 3;
        final hs20 hs20Var = new hs20(iirVar, str, (byte) 16);
        final byte b = 1;
        this.b = RxEventSources.a(new ObservableSource[]{Observable.defer(new Supplier() { // from class: p.dfh0
            public final Object get() {
                byte b2 = b;
                Function0 function0 = hs20Var;
                switch (b2) {
                    case 0:
                        return function0.invoke();
                    default:
                        return (ObservableSource) function0.invoke();
                }
            }
        }).subscribeOn(Schedulers.c)});
    }

    public acl(String str, fuw0 fuw0Var, uu00 uu00Var) {
        this.a = (byte) 10;
        this.b = RxEventSources.a(new ObservableSource[]{Observable.combineLatest(fuw0Var.a.distinctUntilChanged(), ((zu00) uu00Var).b(new oi("CWPTrailerEventSource", false, new ysf1(str, (byte) 7))).filter(new k0p1(str)), i5x0.S0).flatMap(new ptf1(str, uu00Var, (byte) 1)).map(p5x0.T0).onErrorReturn(r5x0.V0).distinctUntilChanged()});
    }

    public acl(EventSource eventSource) {
        this.a = (byte) 4;
        this.b = eventSource;
    }

    public acl(String str, mcs mcsVar) {
        this.a = (byte) 5;
        Observable observableA = mcsVar.a.a(str);
        b370 b370Var = mcsVar.b;
        String strConcat = "Notification state for ".concat(str);
        b370Var.getClass();
        this.b = RxEventSources.a(new ObservableSource[]{observableA.compose(new m5n(new zi50(new ry40(strConcat, (byte) 12), (byte) 21), new wck0(hh60.U0, (byte) 22))).flatMap(mi10.R0)});
    }
}
