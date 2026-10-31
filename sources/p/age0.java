package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class age0 implements Function {
    public final /* synthetic */ LoggingParams a;
    public final /* synthetic */ j2e0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ PreparePlayOptions d;
    public final /* synthetic */ PlayOrigin e;

    public age0(LoggingParams loggingParams, j2e0 j2e0Var, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin) {
        this.a = loggingParams;
        this.b = j2e0Var;
        this.c = context;
        this.d = preparePlayOptions;
        this.e = playOrigin;
    }

    public final Object apply(Object obj) {
        LoggingParams.Builder builder;
        ou80 ou80Var = (ou80) obj;
        LoggingParams loggingParams = this.a;
        if (loggingParams == null || (builder = loggingParams.toBuilder()) == null) {
            builder = LoggingParams.builder();
        }
        LoggingParams loggingParamsBuild = builder.interactionId(ou80Var.a).build();
        g710 g710Var = (a710) this.b.b;
        Context context = this.c;
        String strUri = context.uri();
        PlayOrigin playOrigin = this.e;
        if (playOrigin == null) {
            playOrigin = cge0.a;
        }
        return g710Var.e(new z610(strUri, context, null, this.d, playOrigin, loggingParamsBuild, 4));
    }
}
