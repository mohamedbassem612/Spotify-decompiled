package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x090 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lzn0 a;
    public final /* synthetic */ boolean b;

    public x090(lzn0 lzn0Var, boolean z) {
        this.a = lzn0Var;
        this.b = z;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rcw rcwVar = (rcw) obj;
        dwn0 dwn0Var = new dwn0(rcwVar.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("extra_internal_injected", Boolean.TRUE), new mmr0("bypass_product_state_check", Boolean.valueOf(this.b)), new mmr0("ChatSource", rcwVar.b)});
        lzn0 lzn0Var = this.a;
        lzn0Var.i(dwn0Var, bundleH);
        lzn0Var.d(blc0.j3);
        return rih1.a;
    }
}
