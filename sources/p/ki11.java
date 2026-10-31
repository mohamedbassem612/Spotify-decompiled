package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ki11 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mi11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki11(mi11 mi11Var, byte b) {
        super(4);
        this.a = b;
        this.b = mi11Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        mi11 mi11Var = this.b;
        switch (b) {
            case 0:
                Flowable flowable = mi11Var.a;
                return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new rut0(mi11Var, (byte) 25));
            default:
                return new l3((Context) obj2, (d75) obj, (iu30) obj4, mi11Var);
        }
    }
}
