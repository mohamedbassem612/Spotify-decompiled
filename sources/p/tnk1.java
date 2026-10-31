package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tnk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hok1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnk1(hok1 hok1Var, byte b) {
        super(0);
        this.a = b;
        this.b = hok1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hok1 hok1Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker(hok1Var.e);
    }
}
