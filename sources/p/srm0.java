package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class srm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wrm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ srm0(wrm0 wrm0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wrm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wrm0 wrm0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker(wrm0Var.e);
    }
}
