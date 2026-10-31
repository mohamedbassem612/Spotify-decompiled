package p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class id3 implements fd3 {
    public final xrc0 a;
    public final b7r0 b;
    public final yqg c;
    public final t7n0 d;
    public final buf0 e;
    public final g3q0 f;
    public final ruz g;
    public final String h;
    public final iac0 i;
    public final myq0 j;
    public final bpb1 k = gio1.b(new gd3(s7n0.a, PlayerState.EMPTY, false, c3q0.a));

    public id3(xrc0 xrc0Var, b7r0 b7r0Var, yqg yqgVar, t7n0 t7n0Var, buf0 buf0Var, g3q0 g3q0Var, zeu0 zeu0Var, ruz ruzVar, String str, iac0 iac0Var, myq0 myq0Var) {
        this.a = xrc0Var;
        this.b = b7r0Var;
        this.c = yqgVar;
        this.d = t7n0Var;
        this.e = buf0Var;
        this.f = g3q0Var;
        this.g = ruzVar;
        this.h = str;
        this.i = iac0Var;
        this.j = myq0Var;
        fn31.T(cto1.q(iac0Var), (o8n) null, 0, new hi2(this, zeu0Var, (lnm) null, (byte) 10), 3);
    }

    public static trc0 a() {
        return new trc0(PlaylistRequestDecorationPolicy.s().build(), (g3d0) null, f46.S0(new orc0[]{sqc0.a, xqc0.a, yqc0.a}), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 474);
    }

    public static String g(PlayerState playerState) {
        String strUid;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack == null || (strUid = contextTrack.uid()) == null) {
            return null;
        }
        String strZ0 = ihc1.Z0(strUid, ":");
        if (strZ0.length() == 0) {
            return null;
        }
        return strZ0;
    }

    public static String h(PlayerState playerState) {
        j380 j380VarMetadata;
        String str;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack != null && (j380VarMetadata = contextTrack.metadata()) != null && (str = (String) j380VarMetadata.get("audio_association")) != null) {
            return str;
        }
        ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
        String strUri = contextTrack2 != null ? contextTrack2.uri() : null;
        return strUri == null ? "" : strUri;
    }

    public final ad3 b() {
        ed3 ed3VarF = f(((gd3) this.k.getValue()).b, this.h);
        if (ed3VarF instanceof dd3) {
            return xc3.a;
        }
        if (ed3VarF instanceof cd3) {
            return zc3.a;
        }
        if (ed3VarF instanceof bd3) {
            return new yc3(null);
        }
        eg.o();
        return null;
    }

    public final boolean c() {
        s7n0 s7n0Var;
        gd3 gd3Var = (gd3) this.k.getValue();
        return gd3Var.c || (s7n0Var = gd3Var.a) == s7n0.b || s7n0Var == s7n0.c;
    }

    public final LoggingParams d(tv80 tv80Var) {
        String str;
        String str2;
        ou80 ou80Var;
        LoggingParams.Builder builder = LoggingParams.builder();
        String str3 = "unknown";
        if (tv80Var == null || (ou80Var = tv80Var.a) == null || (str = ou80Var.a) == null) {
            str = "unknown";
        }
        LoggingParams.Builder builderCommandInitiatedTime = builder.interactionId(str).commandInitiatedTime(Long.valueOf(this.c.b()));
        y6r0 y6r0Var = this.b.get();
        if (y6r0Var != null && (str2 = y6r0Var.a) != null) {
            str3 = str2;
        }
        return builderCommandInitiatedTime.pageInstanceId(str3).build();
    }

    public final Object e(ad3 ad3Var, tv80 tv80Var, onm onmVar) {
        String str;
        ou80 ou80Var;
        String str2;
        String str3;
        ou80 ou80Var2;
        String str4;
        boolean z = ad3Var instanceof yc3;
        myq0 myq0Var = this.j;
        rih1 rih1Var = rih1.a;
        if (!z) {
            boolean z2 = ad3Var instanceof xc3;
            iac0 iac0Var = this.i;
            if (z2) {
                fn31.T(cto1.q(iac0Var), (o8n) null, 0, new hi2(this, new e9u0(PauseCommand.builder().loggingParams(d(tv80Var)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder(myq0Var.get().featureIdentifier()).build()).build()), (lnm) null, (byte) 11), 3);
                return rih1Var;
            }
            if (ad3Var instanceof zc3) {
                fn31.T(cto1.q(iac0Var), (o8n) null, 0, new hi2(this, new h9u0(ResumeCommand.builder().loggingParams(d(tv80Var)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder(myq0Var.get().featureIdentifier()).build()).build()), (lnm) null, (byte) 11), 3);
                return rih1Var;
            }
            eg.o();
            return null;
        }
        e3q0 e3q0Var = ((gd3) this.k.getValue()).d;
        boolean zJ = u890.j(e3q0Var, c3q0.a);
        d9n d9nVar = d9n.a;
        b7r0 b7r0Var = this.b;
        String str5 = "unknown";
        if (zJ) {
            String str6 = ((yc3) ad3Var).a;
            trc0 trc0VarA = a();
            EsPlayOrigin.PlayOrigin playOriginA = tot0.a(myq0Var.get());
            Map mapSingletonMap = Collections.singletonMap("format_list_type", "album");
            coz cozVarR = EsLoggingParams.LoggingParams.r();
            y6r0 y6r0Var = b7r0Var.get();
            if (y6r0Var == null || (str3 = y6r0Var.a) == null) {
                str3 = "unknown";
            }
            cozVarR.q(str3);
            if (tv80Var != null && (ou80Var2 = tv80Var.a) != null && (str4 = ou80Var2.a) != null) {
                str5 = str4;
            }
            cozVarR.n(str5);
            EsLoggingParams.LoggingParams loggingParamsBuild = cozVarR.build();
            lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
            if (str6 != null) {
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(str6);
                lqzVarS.C(wrzVarP.build());
            }
            imz imzVarO = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            ppz ppzVarN = EsOptional.OptionalBoolean.n();
            ppzVarN.n(c());
            imzVarO.u(ppzVarN);
            lqzVarS.x(imzVarO.build());
            Object objB = xrc0.b(this.a, this.h, trc0VarA, lqzVarS.build(), playOriginA, (EsPlayOptions.PlayOptions) null, mapSingletonMap, loggingParamsBuild, (ayc0) null, onmVar, 144);
            if (objB != d9nVar) {
                objB = rih1Var;
            }
            if (objB == d9nVar) {
                return objB;
            }
        } else {
            if (!(e3q0Var instanceof d3q0)) {
                eg.o();
                return null;
            }
            String str7 = ((yc3) ad3Var).a;
            trc0 trc0VarA2 = a();
            EsPlayOrigin.PlayOrigin playOriginA2 = tot0.a(myq0Var.get());
            Map mapJ = sqg0.J(new mmr0[]{new mmr0("format_list_type", "album"), new mmr0("autoplay_candidate", "false")});
            coz cozVarR2 = EsLoggingParams.LoggingParams.r();
            y6r0 y6r0Var2 = b7r0Var.get();
            if (y6r0Var2 == null || (str = y6r0Var2.a) == null) {
                str = "unknown";
            }
            cozVarR2.q(str);
            if (tv80Var != null && (ou80Var = tv80Var.a) != null && (str2 = ou80Var.a) != null) {
                str5 = str2;
            }
            cozVarR2.n(str5);
            cozVarR2.r("on-demand-new-releases-play");
            EsLoggingParams.LoggingParams loggingParamsBuild2 = cozVarR2.build();
            lqz lqzVarS2 = EsPreparePlayOptions.PreparePlayOptions.s();
            lqzVarS2.q();
            if (str7 != null) {
                wrz wrzVarP2 = EsSkipToTrack.SkipToTrack.p();
                wrzVarP2.t(str7);
                lqzVarS2.C(wrzVarP2.build());
            }
            imz imzVarO2 = EsContextPlayerOptions.ContextPlayerOptionOverrides.o();
            ppz ppzVarN2 = EsOptional.OptionalBoolean.n();
            ppzVarN2.n(false);
            imzVarO2.u(ppzVarN2);
            lqzVarS2.x(imzVarO2.build());
            Object objB2 = xrc0.b(this.a, this.h, trc0VarA2, lqzVarS2.build(), playOriginA2, (EsPlayOptions.PlayOptions) null, mapJ, loggingParamsBuild2, (ayc0) null, onmVar, 144);
            if (objB2 != d9nVar) {
                objB2 = rih1Var;
            }
            if (objB2 == d9nVar) {
                return objB2;
            }
        }
        return rih1Var;
    }

    public final ed3 f(PlayerState playerState, String str) {
        if (!u890.j(playerState.contextUri(), str)) {
            return new bd3(c());
        }
        if (playerState.isPaused()) {
            return new cd3(h(playerState), g(playerState));
        }
        return playerState.isPlaying() ? new dd3(h(playerState), g(playerState)) : new bd3(c());
    }
}
