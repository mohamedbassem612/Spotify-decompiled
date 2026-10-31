package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public zt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((ht10) obj).a));
        intent.addFlags(268435456);
        this.a.a.a(intent);
        return rih1.a;
    }
}
