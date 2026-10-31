package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.model.command.options.SkipToTrack$Builder;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l410 implements Function {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ q410 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PreparePlayOptions d;
    public final /* synthetic */ PlayOrigin e;
    public final /* synthetic */ LoggingParams f;
    public final /* synthetic */ Map g;

    public l410(q410 q410Var, PreparePlayOptions preparePlayOptions, String str, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        this.b = q410Var;
        this.d = preparePlayOptions;
        this.c = str;
        this.e = playOrigin;
        this.f = loggingParams;
        this.g = map;
    }

    public final Object apply(Object obj) {
        SkipToTrack$Builder skipToTrack$BuilderBuilder;
        PreparePlayOptions.Builder builder;
        spq0 spq0VarSkipTo;
        SkipToTrack skipToTrack = null;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Set set = q410.n;
                int length = str.length();
                PreparePlayOptions preparePlayOptionsBuild = this.d;
                if (length != 0) {
                    if (preparePlayOptionsBuild != null && (spq0VarSkipTo = preparePlayOptionsBuild.skipTo()) != null) {
                        skipToTrack = (SkipToTrack) spq0VarSkipTo.h();
                    }
                    if (skipToTrack == null || (skipToTrack$BuilderBuilder = skipToTrack.toBuilder()) == null) {
                        skipToTrack$BuilderBuilder = SkipToTrack.builder();
                    }
                    SkipToTrack skipToTrackBuild = skipToTrack$BuilderBuilder.trackUid(str).build();
                    if (preparePlayOptionsBuild == null || (builder = preparePlayOptionsBuild.toBuilder()) == null) {
                        builder = PreparePlayOptions.builder();
                    }
                    preparePlayOptionsBuild = builder.skipTo(skipToTrackBuild).build();
                } else if (preparePlayOptionsBuild == null) {
                    preparePlayOptionsBuild = PreparePlayOptions.EMPTY;
                }
                return q410.d(this.b, this.e, this.f, this.g, this.c, preparePlayOptionsBuild);
            default:
                Map map = (Map) obj;
                q410 q410Var = this.b;
                q8n q8nVar = q410Var.j;
                String str2 = this.c;
                return rqt0.F(q8nVar, new o410(q410Var, str2, null, (byte) 0)).flatMap(new goq((Object) q410Var, (Object) str2, (Object) this.d, (Object) this.e, (Object) this.f, (Object) this.g, (Object) map, (byte) 29));
        }
    }

    public l410(q410 q410Var, String str, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        this.b = q410Var;
        this.c = str;
        this.d = preparePlayOptions;
        this.e = playOrigin;
        this.f = loggingParams;
        this.g = map;
    }
}
