package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class en50 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en50(hn50 hn50Var, byte b) {
        super(0);
        this.a = b;
        this.b = hn50Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hn50 hn50Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(hn50Var.g);
            case 1:
                return new DispatcherWorker(hn50Var.i);
            default:
                return new uvk0(hn50Var.d);
        }
    }
}
