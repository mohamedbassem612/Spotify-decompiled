package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nnd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnd(pnd pndVar, byte b) {
        super(1);
        this.a = b;
        this.b = pndVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pnd pndVar = this.b;
        switch (b) {
            case 0:
                FlowableMap flowableMapJ = pndVar.c.x(uml1.N0).J(pbo1.Z);
                Function function = Functions.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableMapJ.t(function);
                Flowable flowableX = flowableDistinctUntilChangedT.t(function).X(new zwa(pndVar, (byte) 7));
                flowableX.getClass();
                Flowable flowableG = Flowable.g(flowableDistinctUntilChangedT, flowableX.t(function), pndVar.d.i, yoi1.h(pndVar.g.h(), o6x.a), new mp8(pndVar, (byte) 12));
                flowableG.getClass();
                Flowable flowableK = Flowable.K(flowableG.t(function), pndVar.h);
                flowableK.getClass();
                return flowableK.t(function);
            default:
                rwq0.z((qtr) obj, new hp9(pndVar, (byte) 24));
                return rih1.a;
        }
    }
}
