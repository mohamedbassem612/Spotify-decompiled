package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j6i1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m6i1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6i1(m6i1 m6i1Var, byte b) {
        super(0);
        this.a = b;
        this.b = m6i1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        m6i1 m6i1Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(m6i1Var.c);
            default:
                return new DispatcherWorker(m6i1Var.d);
        }
    }
}
