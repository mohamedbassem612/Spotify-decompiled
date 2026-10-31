package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class epw0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fpw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epw0(fpw0 fpw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = fpw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        fpw0 fpw0Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(fpw0Var.c);
            default:
                return new DispatcherWorker(fpw0Var.b);
        }
    }
}
