package p;

import com.spotify.messages.QuickstartPivotClientPlaybackResult;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lgz0 implements jgz0 {
    public final l0x0 a;
    public final muz b;
    public final ruz c;
    public final mpm1 d;
    public final zwz0 e;
    public final v1k f;
    public final Single g;
    public final Single h;
    public final ii9 i;
    public final zle1 j;
    public final Flowable k;
    public final npm1 l;
    public final xrc0 m;
    public final b7r0 n;
    public final kly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q8n f54p;
    public t45 q;

    public lgz0(l0x0 l0x0Var, muz muzVar, ruz ruzVar, mpm1 mpm1Var, zwz0 zwz0Var, v1k v1kVar, Single single, Single single2, ii9 ii9Var, zle1 zle1Var, Flowable flowable, npm1 npm1Var, xrc0 xrc0Var, b7r0 b7r0Var, caq caqVar, q8n q8nVar) {
        this.a = l0x0Var;
        this.b = muzVar;
        this.c = ruzVar;
        this.d = mpm1Var;
        this.e = zwz0Var;
        this.f = v1kVar;
        this.g = single;
        this.h = single2;
        this.i = ii9Var;
        this.j = zle1Var;
        this.k = flowable;
        this.l = npm1Var;
        this.m = xrc0Var;
        this.n = b7r0Var;
        this.o = caqVar;
        this.f54p = q8nVar;
    }

    public final void b(LoggingParams loggingParams, PlayOrigin playOrigin, ogz0 ogz0Var, int i) {
        igz0 igz0VarP = blo1.p((String) loggingParams.interactionId().e(""), playOrigin.featureIdentifier(), ogz0Var, i);
        t2j0 t2j0Var = this.i.a;
        ggz0 ggz0VarN = QuickstartPivotClientPlaybackResult.n();
        ggz0VarN.r(igz0VarP.c());
        ggz0VarN.q(igz0VarP.b());
        ggz0VarN.s(igz0VarP.d());
        ggz0VarN.n(igz0VarP.a());
        QuickstartPivotClientPlaybackResult quickstartPivotClientPlaybackResultBuild = ggz0VarN.build();
        Objects.toString(quickstartPivotClientPlaybackResultBuild);
        t2j0Var.a(quickstartPivotClientPlaybackResultBuild);
        t45 t45Var = this.q;
        if (t45Var != null) {
            String strD = igz0VarP.d();
            Locale locale = Locale.ROOT;
            t45Var.a("result", strD.toLowerCase(locale));
            t45Var.a("detailed_result", igz0VarP.a().toLowerCase(locale));
        }
    }

    public final Single c(PlayOrigin playOrigin, LoggingParams loggingParams, String str, String str2, String str3, Long l, boolean z, boolean z2, boolean z3, String str4) {
        Context contextFromUri = str2 == null ? Context.fromUri(str) : Context.builder(str).url(str2).build();
        PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
        builder.playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.valueOf(z)).repeatingContext(Boolean.valueOf(z2)).repeatingTrack(Boolean.valueOf(z3)).build());
        if (str3 != null) {
            builder.skipTo(SkipToTrack.fromUri(str3));
        }
        if (l != null) {
            builder.seekTo(l);
        }
        builder.suppressions(Collections.singleton("mft/inject_track_on_start_play"));
        PreparePlayOptions preparePlayOptionsBuild = builder.build();
        if (str4 == null || !((mz4) this.o.get()).a()) {
            return this.b.a(PlayCommand.builder(contextFromUri, playOrigin).options(preparePlayOptionsBuild).loggingParams(loggingParams).build());
        }
        preparePlayOptionsBuild.getClass();
        return rqt0.F(this.f54p, new af0(this, str, new trc0(null, null, null, false, null, hqz0.a, null, 0, k4p1.x(str4), 223), preparePlayOptionsBuild, playOrigin, loggingParams, (lnm) null, (byte) 22)).map(ybx0.d);
    }
}
