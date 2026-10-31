package p;

import com.spotify.player.model.PlayOrigin;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zjt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ckt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zjt0(ckt0 ckt0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ckt0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ckt0 ckt0Var = this.b;
        switch (b) {
            case 0:
                return ckt0Var.d.a(ckt0Var.h, r6h1.c);
            default:
                return ckt0Var.a.a(ckt0Var.h.getLifecycle(), false, false, (PlayOrigin) ckt0Var.f.get());
        }
    }
}
