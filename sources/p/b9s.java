package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9s(g9s g9sVar, byte b) {
        super(0);
        this.a = b;
        this.b = g9sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        g9s g9sVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker(g9sVar.a);
    }
}
