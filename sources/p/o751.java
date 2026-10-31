package p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PlayCommand$Builder;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o751 {
    public final muz a;
    public final PlayOrigin b;
    public final e8r0 c;
    public final vku d;
    public final nbu0 e;
    public final di4 f;
    public final xrc0 g;
    public final z281 h;
    public final tgt0 i = new tgt0(a());

    public o751(muz muzVar, w9u0 w9u0Var, PlayOrigin playOrigin, e8r0 e8r0Var, vku vkuVar, nbu0 nbu0Var, di4 di4Var, h5q h5qVar, Scheduler scheduler, xrc0 xrc0Var, z281 z281Var) {
        this.a = muzVar;
        this.b = playOrigin;
        this.c = e8r0Var;
        this.d = vkuVar;
        this.e = nbu0Var;
        this.f = di4Var;
        this.g = xrc0Var;
        this.h = z281Var;
        h5qVar.a(muzVar);
    }

    public static EsPlayOrigin.PlayOrigin c(PlayOrigin playOrigin) {
        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
        zpzVarY.s(playOrigin.featureIdentifier());
        zpzVarY.t(playOrigin.featureVersion());
        zpzVarY.w(playOrigin.viewUri());
        zpzVarY.r(playOrigin.externalReferrer());
        zpzVarY.u(playOrigin.referrerIdentifier());
        zpzVarY.q(playOrigin.deviceIdentifier());
        zpzVarY.v(playOrigin.restrictionIdentifier());
        zpzVarY.n(playOrigin.featureClasses());
        return zpzVarY.build();
    }

    public static beh f(Throwable th) {
        n57.g("Cannot start playing from PlayAction", th);
        return new beh(l1d.m("Cannot start playing from PlayAction", th.getLocalizedMessage()));
    }

    public final PlayOrigin a() {
        return this.b.toBuilder().viewUri(this.c.a().e).referrerIdentifier("search").build();
    }

    public final PlayCommand b(Context context, tv80 tv80Var, long j, PreparePlayOptions preparePlayOptions) {
        ou80 ou80Var;
        PlayCommand$Builder playCommand$BuilderBuilder = PlayCommand.builder(context, this.i.a);
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().commandInitiatedTime(Long.valueOf(j));
        y6r0 y6r0Var = this.e.a.get();
        String str = null;
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        LoggingParams.Builder builderPageInstanceId = builderCommandInitiatedTime.pageInstanceId(str2);
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            str = ou80Var.a;
        }
        return playCommand$BuilderBuilder.loggingParams(builderPageInstanceId.interactionId(str != null ? str : "").build()).options(preparePlayOptions).playOrigin(a()).build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(String str, tv80 tv80Var, long j, boolean z, onm onmVar) {
        m751 m751Var;
        if (onmVar instanceof m751) {
            m751Var = (m751) onmVar;
            int i = m751Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m751Var.c = i - Integer.MIN_VALUE;
            } else {
                m751Var = new m751(this, onmVar);
            }
        } else {
            m751Var = new m751(this, onmVar);
        }
        m751 m751Var2 = m751Var;
        Object objB = m751Var2.a;
        int i2 = m751Var2.c;
        if (i2 == 0) {
            hm5.M(objB);
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("pointer.npv_mode", "standalone");
            if (z) {
                xkg0Var.put("is_single_track_video_content", "true");
            }
            xkg0 xkg0VarB = xkg0Var.b();
            trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, new rrc0(f46.S0(new dlc0[]{dlc0.t, dlc0.g})), hqz0.a, (prc0) null, 0, (List) null, 462);
            EsPlayOrigin.PlayOrigin playOriginC = c(a());
            EsLoggingParams.LoggingParams loggingParamsA = this.e.a(j, tv80Var);
            m751Var2.c = 1;
            objB = xrc0.b(this.g, str, trc0Var, (EsPreparePlayOptions.PreparePlayOptions) null, playOriginC, (EsPlayOptions.PlayOptions) null, xkg0VarB, loggingParamsA, (ayc0) null, m751Var2, 148);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return Boolean.valueOf(((py21) objB).c() != null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(String str, tv80 tv80Var, long j, boolean z, boolean z2, onm onmVar) {
        n751 n751Var;
        if (onmVar instanceof n751) {
            n751Var = (n751) onmVar;
            int i = n751Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n751Var.c = i - Integer.MIN_VALUE;
            } else {
                n751Var = new n751(this, onmVar);
            }
        } else {
            n751Var = new n751(this, onmVar);
        }
        n751 n751Var2 = n751Var;
        Object objB = n751Var2.a;
        int i2 = n751Var2.c;
        if (i2 == 0) {
            hm5.M(objB);
            xj61 xj61Var = new xj61();
            xj61Var.add(dlc0.d);
            if (this.f.M()) {
                xj61Var.add(dlc0.f);
            }
            trc0 trc0Var = new trc0(PlaylistRequestDecorationPolicy.n(), (g3d0) null, (Set) null, false, new rrc0(cwl1.j(xj61Var)), hqz0.a, (prc0) null, 0, (List) null, 462);
            EsPlayOrigin.PlayOrigin playOriginC = c(a());
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put("format_list_type", "track");
            xkg0Var.put("reporting.uri", "spotify:search");
            if (z) {
                xkg0Var.put("is_single_track_video_content", "true");
            }
            xkg0 xkg0VarB = xkg0Var.b();
            EsLoggingParams.LoggingParams loggingParamsA = this.e.a(j, tv80Var);
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
            wrzVarP.t(str);
            lqzVarS.C(wrzVarP.build());
            imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            imzVarO.n(z2 ? Collections.singletonMap("media", "audio") : b7x.a);
            lqzVarS.x(imzVarO.build());
            EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsBuild = lqzVarS.build();
            n751Var2.c = 1;
            objB = xrc0.b(this.g, str, trc0Var, preparePlayOptionsBuild, playOriginC, (EsPlayOptions.PlayOptions) null, xkg0VarB, loggingParamsA, (ayc0) null, n751Var2, 144);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        return Boolean.valueOf(((py21) objB).c() != null);
    }
}
