package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u9u0 {
    public final b7r0 a;
    public final w9u0 b;
    public final Flowable c;
    public final muz d;

    public u9u0(cyp cypVar, b7r0 b7r0Var, w9u0 w9u0Var, Flowable flowable) {
        this.a = b7r0Var;
        this.b = w9u0Var;
        this.c = flowable;
        this.d = cypVar.d();
    }

    public final kge a() {
        FlowableMap flowableMapJ = this.c.J(new v9c(this, (byte) 19));
        vbm[] vbmVarArr = q601.a;
        return new kge(flowableMapJ);
    }

    public final LoggingParams b(ou80 ou80Var) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(ou80Var.a);
        y6r0 y6r0Var = this.a.get();
        String str = y6r0Var != null ? y6r0Var.a : null;
        if (str == null) {
            str = "";
        }
        return builderInteractionId.pageInstanceId(str).build();
    }

    public final Object c(tv80 tv80Var, onm onmVar) {
        Object objI = fc11.i(this.b.a(new e9u0(PauseCommand.builder().loggingParams(b(tv80Var.a)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("concerts-entity").build()).build())).ignoreElement(), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public final Object d(String str, tv80 tv80Var, onm onmVar) {
        Object objI = fc11.i(this.d.a(PlayCommand.builder(Context.fromUri(str), PlayOrigin.builder("concerts-entity").build()).loggingParams(b(tv80Var.a)).build()).ignoreElement(), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public final Object e(tv80 tv80Var, onm onmVar) {
        Object objI = fc11.i(this.b.a(new h9u0(ResumeCommand.builder().loggingParams(b(tv80Var.a)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("concerts-entity").build()).build())).ignoreElement(), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
