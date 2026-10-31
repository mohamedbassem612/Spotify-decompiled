package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y931 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ca31 a;

    public y931(ca31 ca31Var) {
        this.a = ca31Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s931 s931Var = (s931) obj;
        String str = s931Var.a;
        boolean z = s931Var.b;
        z6m0 z6m0Var = this.a.d;
        if (z) {
            zhq0 zhq0Var = z6m0Var.f;
            if (zhq0Var == null) {
                u890.C("playCommandHandler");
                throw null;
            }
            zhq0Var.o(jgt0.a);
        }
        Uri uri = Uri.parse(str);
        zhq0 zhq0Var2 = z6m0Var.f;
        if (zhq0Var2 != null) {
            zhq0Var2.o(new mgt0(uri, true));
            return rih1.a;
        }
        u890.C("playCommandHandler");
        throw null;
    }
}
