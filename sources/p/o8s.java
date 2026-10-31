package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o8s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r8s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8s(r8s r8sVar, byte b) {
        super(0);
        this.a = b;
        this.b = r8sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        r8s r8sVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker((q8n) r8sVar.d);
    }
}
