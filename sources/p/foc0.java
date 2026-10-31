package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class foc0 implements iwt0 {
    public final s24 a;
    public final ozc0 b;
    public final xrc0 c;
    public final yqg d;
    public final b7r0 e;
    public final PlayOrigin f;

    public foc0(s24 s24Var, ozc0 ozc0Var, xrc0 xrc0Var, yqg yqgVar, b7r0 b7r0Var, PlayOrigin playOrigin) {
        this.a = s24Var;
        this.b = ozc0Var;
        this.c = xrc0Var;
        this.d = yqgVar;
        this.e = b7r0Var;
        this.f = playOrigin;
    }

    public final Object m(gwt0 gwt0Var, String str, onm onmVar) {
        String str2 = str;
        boolean z = gwt0Var instanceof dwt0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            ozc0 ozc0Var = this.b;
            trc0 trc0Var = ozc0Var.c;
            PreparePlayOptions.Builder builderSkipTo = PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUid(ozc0Var.b).build());
            int i = t380.c;
            PreparePlayOptions.Builder builderSuppressions = builderSkipTo.suppressions(new b291("mft"));
            PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            PreparePlayOptions preparePlayOptionsBuild = builderSuppressions.playerOptionsOverride(builder.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build()).build();
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            if (str2 == null) {
                str2 = "";
            }
            cozVarR.n(str2);
            y6r0 y6r0Var = this.e.get();
            String str3 = y6r0Var != null ? y6r0Var.a : null;
            cozVarR.q(str3 != null ? str3 : "");
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(this.d.b());
            cozVarR.t(qpzVarP);
            EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
            String str4 = ozc0Var.a;
            preparePlayOptionsBuild.getClass();
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsA = lyg.A(preparePlayOptionsBuild);
            EsPlayOrigin.PlayOrigin playOriginA = tot0.a(this.f);
            loggingParamsBuild.getClass();
            Object objB = xrc0.b(this.c, str4, trc0Var, preparePlayOptionsA, playOriginA, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParamsBuild, (ayc0) null, onmVar, 176);
            if (objB != d9nVar) {
                objB = rih1Var;
            }
            if (objB == d9nVar) {
                return objB;
            }
        } else {
            Object objM = this.a.m(gwt0Var, str2, onmVar);
            if (objM == d9nVar) {
                return objM;
            }
        }
        return rih1Var;
    }
}
