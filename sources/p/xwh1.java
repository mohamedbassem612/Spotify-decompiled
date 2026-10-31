package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwh1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwh1(yxb0 yxb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker((q8n) yxb0Var.e);
            default:
                return new DispatcherWorker((q8n) yxb0Var.d);
        }
    }
}
