package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dln extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gln b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dln(gln glnVar, byte b) {
        super(0);
        this.a = b;
        this.b = glnVar;
    }

    public final Object invoke() {
        byte b = this.a;
        gln glnVar = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(glnVar.i);
            case 1:
                return new DispatcherWorker(glnVar.t);
            default:
                glnVar.f.getClass();
                return new q251(v151.a);
        }
    }
}
