package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yz90 {
    public final yqg a;
    public final e831 b;
    public final xrc0 c;
    public final Flowable d;
    public final g2z e;
    public final t8u0 f;
    public final b7r0 g;
    public final q8n h;

    public yz90(yqg yqgVar, e831 e831Var, xrc0 xrc0Var, Flowable flowable, g2z g2zVar, t8u0 t8u0Var, b7r0 b7r0Var, q8n q8nVar) {
        this.a = yqgVar;
        this.b = e831Var;
        this.c = xrc0Var;
        this.d = flowable;
        this.e = g2zVar;
        this.f = t8u0Var;
        this.g = b7r0Var;
        this.h = q8nVar;
    }

    public final PlayCommand a(String str, String str2, String str3, Context context) {
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        if (str2 != null) {
            builder.skipTo(SkipToTrack.fromUri(str2));
        }
        PreparePlayOptions preparePlayOptionsBuild = builder.build();
        LoggingParams.Builder builder2 = LoggingParams.builder();
        y6r0 y6r0Var = this.g.get();
        String str4 = y6r0Var != null ? y6r0Var.a : null;
        if (str4 == null) {
            str4 = "";
        }
        return PlayCommand.builder(context, PlayOrigin.builder(str3).build()).options(preparePlayOptionsBuild).loggingParams(builder2.pageInstanceId(str4).interactionId(str).build()).build();
    }

    public final muz b() {
        g0i g0iVarA = this.b.a();
        g0i g0iVar = g0iVarA instanceof g0i ? g0iVarA : null;
        if (g0iVar != null) {
            return this.f.a(((f0i) g0iVar).a).d();
        }
        return null;
    }
}
