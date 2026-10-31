package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fdw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public fdw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objJ = fc11.j(this.a.d.a(new d9u0("audiobrowse-client-native-preview-coordinator", false)), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objJ != d9nVar) {
            objJ = rih1Var;
        }
        return objJ == d9nVar ? objJ : rih1Var;
    }
}
