package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y8p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ w9u0 a;

    public y8p0(w9u0 w9u0Var) {
        this.a = w9u0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objJ = fc11.j(this.a.a(new j9u0(SeekToCommand.builder(15000L).relative(SeekToCommand.Relative.CURRENT).build())), onmVar);
        return objJ == d9n.a ? objJ : rih1.a;
    }
}
