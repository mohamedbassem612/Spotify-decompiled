package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xlp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zlp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xlp0(zlp0 zlp0Var, byte b) {
        super(0);
        this.a = b;
        this.b = zlp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zlp0 zlp0Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(zlp0Var.e);
            case 1:
                return new DispatcherWorker(zlp0Var.f);
            default:
                return new uvk0(zlp0Var.c);
        }
    }
}
