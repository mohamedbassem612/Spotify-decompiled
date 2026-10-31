package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l9s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9s(l9s l9sVar, byte b) {
        super(0);
        this.a = b;
        this.b = l9sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        l9s l9sVar = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(l9sVar.a);
            case 1:
                return new DispatcherWorker(l9sVar.a);
            default:
                zic zicVar = l9sVar.b;
                return zicVar.b.a(zicVar.a, l9sVar.d, zicVar.c, fxf.b, true);
        }
    }
}
