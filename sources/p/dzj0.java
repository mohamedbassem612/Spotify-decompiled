package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public dzj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        k0k0 k0k0Var = (k0k0) obj;
        otu otuVar = this.a.g;
        lzn0 lzn0Var = (lzn0) otuVar.b;
        lzn0Var.e();
        cbk0 cbk0Var = (cbk0) otuVar.c;
        if (!cbk0Var.f) {
            String strC = ktv.c(cbk0Var.a);
            tv80 tv80Var = k0k0Var.a;
            lzn0Var.f(new dwn0(strC, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
        }
        return rih1.a;
    }
}
