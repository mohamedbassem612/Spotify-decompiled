package p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzo0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qzo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzo0(qzo0 qzo0Var, byte b) {
        super(4);
        this.a = b;
        this.b = qzo0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        qzo0 qzo0Var = this.b;
        switch (b) {
            case 0:
                izo0 izo0Var = (izo0) obj;
                jzo0 jzo0Var = (jzo0) obj2;
                fzo0 fzo0Var = (fzo0) obj3;
                tqw tqwVar = (tqw) obj4;
                FlowableFilter flowableFilter = qzo0Var.a;
                if (fzo0Var instanceof czo0) {
                    return new FlowableSingleSingle(new FlowableTake(flowableFilter)).flatMapCompletable(new ewn0((Object) qzo0Var, (byte) 5));
                }
                if (fzo0Var instanceof dzo0) {
                    return new FlowableSingleSingle(new FlowableTake(flowableFilter)).flatMapCompletable(new svh0(qzo0Var, !jzo0Var.d, (byte) 2));
                }
                if (fzo0Var instanceof ezo0) {
                    if (!jzo0Var.a.c.b) {
                        return CompletableEmpty.a;
                    }
                    k811 k811Var = qzo0Var.f;
                    return ((rh11) k811Var.d).d().filter(vbx0.f).flatMapCompletable(new hyy0(k811Var, tqwVar != null ? n3o1.y(tqwVar) : null, (byte) 18));
                }
                if (fzo0Var.equals(bzo0.a)) {
                    return new CompletableFromAction(new wf0(izo0Var, tqwVar, qzo0Var, (byte) 8));
                }
                eg.o();
                return null;
            case 1:
                ((Number) obj3).intValue();
                return qzo0Var.t;
            default:
                return new u3((Context) obj2, qzo0Var, (iu30) obj4);
        }
    }
}
