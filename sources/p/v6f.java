package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6f(q8n q8nVar, byte b) {
        super(0);
        this.a = b;
        this.b = q8nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(q8nVar);
            case 1:
                return new DispatcherWorker(q8nVar);
            case 2:
                return new DispatcherWorker(q8nVar);
            case 3:
                return new DispatcherWorker(q8nVar);
            case 4:
                return new DispatcherWorker(q8nVar);
            case 5:
                return new DispatcherWorker(q8nVar);
            default:
                return new hgu(q8nVar);
        }
    }
}
