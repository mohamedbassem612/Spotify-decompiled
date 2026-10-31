package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eee extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eee(iee ieeVar, byte b) {
        super(0);
        this.a = b;
        this.b = ieeVar;
    }

    public final Object invoke() {
        byte b = this.a;
        iee ieeVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker(ieeVar.a);
    }
}
