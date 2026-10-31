package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dcd0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gcd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dcd0(gcd0 gcd0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gcd0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gcd0 gcd0Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(gcd0Var.g);
            default:
                return new DispatcherWorker(gcd0Var.h);
        }
    }
}
