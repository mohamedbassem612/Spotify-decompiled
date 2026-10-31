package p;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ero a;

    public nhk(ero eroVar) {
        this.a = eroVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ero eroVar = this.a;
        try {
            eroVar.a().j(eroVar.a, Uri.parse(((sfk) obj).e));
        } catch (ActivityNotFoundException unused) {
            eroVar.a();
        }
        return rih1.a;
    }
}
