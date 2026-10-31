package p;

import com.spotify.mobius.runners.WorkRunner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gvn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvn(kvn kvnVar, byte b) {
        super(0);
        this.a = b;
        this.b = kvnVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kvn kvnVar = this.b;
        switch (b) {
            case 0:
                return (WorkRunner) kvnVar.z.get();
            default:
                return (WorkRunner) kvnVar.A.get();
        }
    }
}
