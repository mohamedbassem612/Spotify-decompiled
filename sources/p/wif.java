package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wif extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wif(xif xifVar, byte b) {
        super(0);
        this.a = b;
        this.b = xifVar;
    }

    public final Object invoke() {
        byte b = this.a;
        xif xifVar = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(xifVar.h);
            default:
                return new DispatcherWorker(xifVar.i);
        }
    }
}
