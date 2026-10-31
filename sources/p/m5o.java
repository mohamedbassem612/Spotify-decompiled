package p;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m5o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CancellationSignal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5o(CancellationSignal cancellationSignal, byte b) {
        super(1);
        this.a = b;
        this.b = cancellationSignal;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        CancellationSignal cancellationSignal = this.b;
        switch (b) {
            case 0:
                cancellationSignal.cancel();
                break;
            case 1:
                cancellationSignal.cancel();
                break;
            default:
                cancellationSignal.cancel();
                break;
        }
        return rih1Var;
    }
}
