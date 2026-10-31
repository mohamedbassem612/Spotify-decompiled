package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yp91 {
    public final uvy a;
    public final q8n b;
    public final Flowable c;

    public yp91(Flowable flowable, uvy uvyVar, yu4 yu4Var, q8n q8nVar) {
        FlowableJust flowableJustT;
        this.a = uvyVar;
        this.b = q8nVar;
        if (yu4Var.a()) {
            Function function = Functions.a;
            Flowable flowableX = flowable.t(function).X(new vr51(this, (byte) 13));
            flowableX.getClass();
            flowableJustT = flowableX.t(function);
        } else {
            flowableJustT = Flowable.I(vp91.a);
        }
        this.c = flowableJustT;
    }
}
