package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class veu0 implements FlowableTransformer {
    public final uwh a;
    public final qi4 b;
    public final BehaviorProcessor c;
    public final Flowable d;

    public veu0(uwh uwhVar, h690 h690Var, qi4 qi4Var) {
        this.a = uwhVar;
        this.b = qi4Var;
        BehaviorProcessor behaviorProcessorE0 = BehaviorProcessor.e0("");
        this.c = behaviorProcessorE0;
        this.d = Flowable.h(behaviorProcessorE0, h690Var, d710.a1);
    }

    public final moy0 a(Flowable flowable) {
        if (!this.b.a()) {
            return flowable.J(een.q1);
        }
        Flowable flowableX = flowable.v(new ixp0(this, (byte) 21)).x(new khc(this, (byte) 19)).X(new l1p0(this, (byte) 18)).X(new tym0(this, (byte) 24));
        flowableX.getClass();
        return new FlowableSwitchIfEmpty(flowableX.t(Functions.a).M(o610.Y0), Flowable.I(j5.a));
    }
}
