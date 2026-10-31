package p;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pq10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ uq10 a;

    public pq10(uq10 uq10Var) {
        this.a = uq10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ((ClipboardManager) this.a.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, ((hq10) obj).a));
        return rih1.a;
    }
}
