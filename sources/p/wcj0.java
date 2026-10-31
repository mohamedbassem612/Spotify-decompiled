package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wcj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wcj0(ldo ldoVar, byte b) {
        super(0);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker((q8n) ldoVar.d);
            default:
                return new DispatcherWorker((q8n) ldoVar.c);
        }
    }
}
