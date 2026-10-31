package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ux00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zx00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux00(zx00 zx00Var, byte b) {
        super(0);
        this.a = b;
        this.b = zx00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zx00 zx00Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(zx00Var.g);
            default:
                return new DispatcherWorker(zx00Var.h);
        }
    }
}
