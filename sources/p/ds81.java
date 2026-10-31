package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ds81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ s631 a;

    public ds81(s631 s631Var) {
        this.a = s631Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objJ;
        s631 s631Var = this.a;
        boolean zH = s631Var.b.a.h();
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (!zH || (objJ = fc11.j(s631Var.a.a(new h9u0(ResumeCommand.builder().options(CommandOptions.builder().systemInitiated(true).build()).build())), onmVar)) != d9nVar) {
            objJ = rih1Var;
        }
        return objJ == d9nVar ? objJ : rih1Var;
    }
}
