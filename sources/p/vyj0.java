package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vyj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public vyj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        q0k0 q0k0Var = (q0k0) obj;
        zhq0 zhq0Var = this.a.q;
        boolean z = q0k0Var.a;
        cbk0 cbk0Var = (cbk0) zhq0Var.b;
        String str = z ? cbk0Var.h : cbk0Var.g;
        if (str != null) {
            xh71.b((xh71) zhq0Var.c, new wa71(str, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, tm71.b, q0k0Var.b, (List) null, 18);
        }
        return rih1.a;
    }
}
