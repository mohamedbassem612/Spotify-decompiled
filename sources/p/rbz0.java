package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rbz0 extends hab0 implements iu30 {
    public final /* synthetic */ sbz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbz0(sbz0 sbz0Var) {
        super(1);
        this.a = sbz0Var;
    }

    public final Object invoke(Object obj) {
        FlowableOnErrorReturn flowableOnErrorReturnI;
        sbz0 sbz0Var = this.a;
        f7f0 f7f0Var = sbz0Var.d;
        qbz0 qbz0Var = new qbz0(sbz0Var);
        c7f0 c7f0Var = new c7f0();
        t6z0 t6z0Var = f7f0Var.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(j5z0.class, new i6z0(t6z0Var, (byte) 9));
        subtypeEffectHandlerBuilderC.g(q5z0.class, new i6z0(t6z0Var, (byte) 13));
        subtypeEffectHandlerBuilderC.g(o5z0.class, new i6z0(t6z0Var, (byte) 14));
        subtypeEffectHandlerBuilderC.g(t5z0.class, new i6z0(t6z0Var, (byte) 17));
        subtypeEffectHandlerBuilderC.g(v4z0.class, new i6z0(t6z0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(t4z0.class, new i6z0(t6z0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(k5z0.class, new i6z0(t6z0Var, (byte) 10));
        subtypeEffectHandlerBuilderC.g(r5z0.class, new i6z0(t6z0Var, (byte) 16));
        subtypeEffectHandlerBuilderC.g(y4z0.class, new i6z0(t6z0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.g(d5z0.class, new i6z0(t6z0Var, (byte) 7));
        subtypeEffectHandlerBuilderC.g(b5z0.class, new i6z0(t6z0Var, (byte) 6));
        subtypeEffectHandlerBuilderC.g(u4z0.class, new i6z0(t6z0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(z4z0.class, new i6z0(t6z0Var, (byte) 5));
        subtypeEffectHandlerBuilderC.g(e5z0.class, new i6z0(t6z0Var, (byte) 8));
        subtypeEffectHandlerBuilderC.g(m5z0.class, new i6z0(t6z0Var, (byte) 11));
        subtypeEffectHandlerBuilderC.g(p5z0.class, new i6z0(t6z0Var, (byte) 15));
        subtypeEffectHandlerBuilderC.g(n5z0.class, new i6z0(t6z0Var, (byte) 12));
        subtypeEffectHandlerBuilderC.g(x4z0.class, new i6z0(t6z0Var, (byte) 3));
        wqd0 wqd0Var = new wqd0(qbz0Var, (byte) 29);
        Scheduler scheduler = t6z0Var.a;
        subtypeEffectHandlerBuilderC.b(w4z0.class, wqd0Var, scheduler);
        subtypeEffectHandlerBuilderC.b(i5z0.class, new wqd0(t6z0Var, (byte) 28), scheduler);
        MobiusLoop.Builder builderB = Mobius.d(c7f0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).d(new d7f0(f7f0Var)).b(new e7f0(f7f0Var));
        myq0 myq0Var = f7f0Var.b;
        EventSource eventSourceA = RxEventSources.a(new ObservableSource[]{Observable.combineLatest(new ObservableFromPublisher(((tuz) myq0Var.b).c), ((o241) myq0Var.c).a, yz10.X0).distinctUntilChanged().cast(z8z0.class)});
        tzr0 tzr0Var = f7f0Var.a;
        vbs vbsVar = f7f0Var.i;
        boolean z = vbsVar.a;
        boolean z2 = vbsVar.b;
        Flowable flowable = (Flowable) tzr0Var.b;
        FlowableMap flowableMapJ = flowable.J(dj20.X0);
        Function function = Functions.a;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableMapJ.t(function);
        jkp0 jkp0Var = new jkp0(tzr0Var, (byte) 15);
        int i = Flowable.a;
        Flowable flowableA = flowableDistinctUntilChangedT.A(jkp0Var, i, i);
        FlowableOnErrorReturn flowableOnErrorReturnN = flowable.J(yi20.Y0).t(function).X(new rut0(tzr0Var, (byte) 3)).N(ktl.a);
        if (z) {
            Flowable flowableX = flowable.t(cj20.Z0).X(new jxp0(tzr0Var, (byte) 9));
            flowableX.getClass();
            flowableOnErrorReturnI = flowableX.t(function).N(Boolean.FALSE);
        } else {
            flowableOnErrorReturnI = Flowable.I(Boolean.FALSE);
        }
        Flowable flowableG = Flowable.g(flowable, flowableA, flowableOnErrorReturnN, flowableOnErrorReturnI.J(new m980((byte) 24, z2)), bj20.Z0);
        EventSource eventSourceA2 = RxEventSources.a(new ObservableSource[]{x0d.j(flowableG, flowableG).map(new sks0(tzr0Var, (byte) 6)).distinctUntilChanged()});
        EventSource eventSourceA3 = RxEventSources.a(new ObservableSource[]{((cjs) f7f0Var.d.b).a().map(yi20.e).distinctUntilChanged().cast(z8z0.class)});
        sks0 sks0Var = f7f0Var.e;
        EventSource eventSourceA4 = RxEventSources.a(new ObservableSource[]{((waz0) sks0Var.b).c().map(new l7c(sks0Var, (byte) 21)).distinctUntilChanged().cast(z8z0.class)});
        zsc zscVar = f7f0Var.f;
        Flowable flowable2 = (Flowable) zscVar.b;
        return builderB.c(eventSourceA, new EventSource[]{eventSourceA2, eventSourceA3, eventSourceA4, RxEventSources.a(new ObservableSource[]{x0d.j(flowable2, flowable2).map(as10.O0).distinctUntilChanged().switchMap(new eea0(zscVar, (byte) 24)).distinctUntilChanged().cast(z8z0.class)}), new x030(f7f0Var, RxEventSources.a(new ObservableSource[]{(PublishSubject) t6z0Var.h.d}), (byte) 2)});
    }
}
