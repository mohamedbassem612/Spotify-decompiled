package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PlayTrigger;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n410 implements Function {
    public final /* synthetic */ q410 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ LoggingParams d;
    public final /* synthetic */ Map e;

    public n410(q410 q410Var, String str, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        this.a = q410Var;
        this.b = str;
        this.c = playOrigin;
        this.d = loggingParams;
        this.e = map;
    }

    public final Object apply(Object obj) {
        PlayOptions playOptionsBuild = PlayOptions.builder().trigger(PlayTrigger.ADVANCED_PAST_TRACK).build();
        Set set = q410.n;
        q410 q410Var = this.a;
        return q410Var.a.a.firstOrError().flatMap(new p410(q410Var, this.b, (Object) null, this.e, this.d, this.c, playOptionsBuild, (byte) 0));
    }
}
