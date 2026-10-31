package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ohk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ Context a;

    public ohk(Context context) {
        this.a = context;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        if (obj != null) {
            bhn0.d();
            return null;
        }
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new p82(this.a, null, (byte) 2), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
