package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class es81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z9s0 a;

    public es81(z9s0 z9s0Var) {
        this.a = z9s0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objI;
        z9s0 z9s0Var = this.a;
        boolean zH = z9s0Var.b.a.h();
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (!zH || (objI = fc11.i(z9s0Var.a.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement(), onmVar)) != d9nVar) {
            objI = rih1Var;
        }
        return objI == d9nVar ? objI : rih1Var;
    }
}
