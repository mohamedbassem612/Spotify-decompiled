package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fw01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uxy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw01(uxy0 uxy0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uxy0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uxy0 uxy0Var = this.b;
        switch (b) {
            case 0:
                return ((Observable) uxy0Var.c).take(1L).toFlowable(BackpressureStrategy.d).J(icx0.e);
            default:
                ((qtr) obj).b(new k1(uxy0Var, (lnm) null, (byte) 28));
                return rih1.a;
        }
    }
}
