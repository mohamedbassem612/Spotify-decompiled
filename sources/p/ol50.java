package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ol50 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zo10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol50(zo10 zo10Var, byte b) {
        super(0);
        this.a = b;
        this.b = zo10Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zo10 zo10Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(zo10Var.c);
            default:
                return new DispatcherWorker(zo10Var.d);
        }
    }
}
