package p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ubj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ccj0 a;

    public ubj0(ccj0 ccj0Var) {
        this.a = ccj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hcj0 hcj0Var = (hcj0) obj;
        ccj0 ccj0Var = this.a;
        kt91 kt91Var = (kt91) ccj0Var.f.get();
        Resources resources = ccj0Var.b;
        kt91Var.k(new er91((fs91) null, resources.getString(2131958574, hcj0Var.a), (Integer) null, resources.getString(2131958585), (Integer) null, new t230(ccj0Var, hcj0Var, (byte) 16), (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
