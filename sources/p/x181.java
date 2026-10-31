package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x181 implements FlowableTransformer {
    public final yqg a;
    public final c3s b;
    public final h991 c;
    public final qes d;
    public final hy4 e;

    public x181(yqg yqgVar, c3s c3sVar, h991 h991Var, qes qesVar, hy4 hy4Var) {
        this.a = yqgVar;
        this.b = c3sVar;
        this.c = h991Var;
        this.d = qesVar;
        this.e = hy4Var;
    }

    @Override // io.reactivex.rxjava3.core.FlowableTransformer
    public final moy0 a(Flowable flowable) {
        ObjectHelper.a(2, "count");
        ObjectHelper.a(1, "skip");
        return new FlowableBuffer(flowable).J(kuw0.f).x(f4x0.t).J(new ij01(this, (byte) 27));
    }
}
