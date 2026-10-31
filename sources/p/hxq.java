package p;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hxq implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nxq a;

    public hxq(nxq nxqVar) {
        this.a = nxqVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cp31 cp31Var = this.a.a;
        ((ClipboardManager) ((ero) cp31Var.b).a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", ((axq) obj).c));
        cp31Var.N(2131954818);
        return rih1.a;
    }
}
