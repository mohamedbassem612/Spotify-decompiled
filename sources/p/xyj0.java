package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xyj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public xyj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        f3b f3bVar = this.a.r;
        tv80 tv80Var = ((p0k0) obj).a;
        lzn0 lzn0Var = f3bVar.a;
        if (tv80Var != null) {
            lzn0Var.a("spotify:watch-feed:mixing-education-videos:default?entrypointIdentifier=mixing_edit_page:header&presentAsOverlay=true", tv80Var, (Bundle) null);
        } else {
            lzn0Var.h("spotify:watch-feed:mixing-education-videos:default?entrypointIdentifier=mixing_edit_page:header&presentAsOverlay=true");
        }
        return rih1.a;
    }
}
