package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ip71 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip71(kp71 kp71Var, byte b) {
        super(0);
        this.a = b;
        this.b = kp71Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kp71 kp71Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(kp71Var.h);
            case 1:
                return new DispatcherWorker(kp71Var.i);
            default:
                kp71Var.g.getClass();
                return new q251(w151.a);
        }
    }
}
