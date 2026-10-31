package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m7j0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7j0(res resVar, byte b) {
        super(0);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke() {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new DispatcherWorker((q8n) resVar.h);
    }
}
