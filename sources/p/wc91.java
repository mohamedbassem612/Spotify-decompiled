package p;

import com.spotify.home.slotloading.SlotEffect$UpdateOnDemandSet;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wc91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ String a;
    public final /* synthetic */ cd91 b;

    public wc91(String str, cd91 cd91Var) {
        this.a = str;
        this.b = cd91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA;
        return (u890.j(this.a, "default") && (objA = this.b.d.a(((SlotEffect$UpdateOnDemandSet) obj).getOnDemandSet(), onmVar)) == d9n.a) ? objA : rih1.a;
    }
}
