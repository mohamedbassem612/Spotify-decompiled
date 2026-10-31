package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ll41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kls0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll41(kls0 kls0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kls0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kls0 kls0Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker((q8n) kls0Var.b);
            default:
                return new DispatcherWorker((q8n) kls0Var.c);
        }
    }
}
