package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class do7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fo7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do7(fo7 fo7Var, byte b) {
        super(0);
        this.a = b;
        this.b = fo7Var;
    }

    public final Object invoke() {
        byte b = this.a;
        fo7 fo7Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(fo7Var.a);
            default:
                return new DispatcherWorker(fo7Var.b);
        }
    }
}
