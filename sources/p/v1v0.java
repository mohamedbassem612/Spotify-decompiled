package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1v0 implements w310 {
    public final /* synthetic */ byte a;
    public final uw0 b;
    public final Object c;

    public v1v0(uw0 uw0Var) {
        this.a = (byte) 0;
        this.b = uw0Var;
        this.c = new idd1(new kks0(this, (byte) 26));
    }

    public final Single b(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((w310) ((idd1) obj).getValue()).b(r9cVar).map(sa20.c1);
            default:
                return new FlowableTake(((Flowable) obj).x(y1x0.Y0)).z().flatMap(new bih1(this, r9cVar, (byte) 28));
        }
    }

    public v1v0(uw0 uw0Var, Flowable flowable) {
        this.a = (byte) 1;
        this.b = uw0Var;
        this.c = flowable;
    }
}
