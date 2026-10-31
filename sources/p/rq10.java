package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rq10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uq10 a;

    public rq10(uq10 uq10Var) {
        this.a = uq10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/legal/privacy-policy"));
        intent.addFlags(268435456);
        this.a.a.startActivity(intent);
        return rih1.a;
    }
}
