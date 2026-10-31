package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x410 implements Function {
    public final /* synthetic */ z410 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ LoggingParams d;

    public x410(z410 z410Var, Context context, PlayOrigin playOrigin, LoggingParams loggingParams) {
        this.a = z410Var;
        this.b = context;
        this.c = playOrigin;
        this.d = loggingParams;
    }

    public final Object apply(Object obj) {
        return this.a.k.a(PlayCommand.builder(this.b, this.c).options((PreparePlayOptions) obj).loggingParams(this.d).build());
    }
}
