package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a88 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a88(g7h g7hVar, byte b) {
        super(1);
        this.a = b;
        this.b = g7hVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        g7h g7hVar = this.b;
        switch (b) {
            case 0:
                x78 x78Var = (x78) obj;
                return g7h.d(g7hVar, "", new String[]{x78Var.a}).toFlowable(backpressureStrategy).J(new a42(x78Var, (byte) 28)).M(s321.t).t(Functions.a);
            case 1:
                vb8 vb8Var = (vb8) obj;
                return g7h.d(g7hVar, "", new String[]{vb8Var.a}).toFlowable(backpressureStrategy).J(new kr60(vb8Var, (byte) 23)).M(u321.t).t(Functions.a);
            default:
                e381 e381Var = (e381) obj;
                return g7h.d(g7hVar, "", new String[]{e381Var.a}).toFlowable(backpressureStrategy).J(new nl51(e381Var, (byte) 8)).J(r6x0.Y).M(y6x0.X).t(Functions.a);
        }
    }
}
