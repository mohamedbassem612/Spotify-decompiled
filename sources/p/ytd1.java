package p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ytd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fud1 a;

    public ytd1(fud1 fud1Var) {
        this.a = fud1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vtd1 vtd1Var = (vtd1) obj;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(vtd1Var.a));
            intent.addFlags(268435456);
            this.a.c.a(intent);
        } catch (ActivityNotFoundException e) {
            Logger.l(e, "No activity found to handle URL: %s", new Object[]{vtd1Var.a});
        }
        return rih1.a;
    }
}
