package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g710 implements a710 {
    public final Flowable a;
    public final kly0 b;
    public final yqg c;
    public final z410 d;
    public final q610 e;
    public final mpm1 f;
    public final jgz0 g;
    public final ynb0 h;
    public final suz j;
    public final ruz k;
    public final BehaviorProcessor i = new BehaviorProcessor();
    public final idd1 l = new idd1(new f710(this, (byte) 0));

    public g710(cyp cypVar, Flowable flowable, chp chpVar, yqg yqgVar, z410 z410Var, q610 q610Var, mpm1 mpm1Var, jgz0 jgz0Var, ynb0 ynb0Var) {
        this.a = flowable;
        this.b = chpVar;
        this.c = yqgVar;
        this.d = z410Var;
        this.e = q610Var;
        this.f = mpm1Var;
        this.g = jgz0Var;
        this.h = ynb0Var;
        this.j = cypVar.c();
        this.k = cypVar.a();
    }

    public static List b(feh fehVar) {
        if (fehVar.c()) {
            return f46.Q0(h710.a().split(fehVar.a().g()));
        }
        return null;
    }

    public final Single a(z610 z610Var) {
        Context contextA = z610Var.a();
        z410 z410Var = this.d;
        if (contextA != null) {
            PreparePlayOptions preparePlayOptionsF = z610Var.f();
            PlayOrigin playOriginE = z610Var.e();
            LoggingParams loggingParamsC = z610Var.c();
            if (loggingParamsC == null) {
                loggingParamsC = LoggingParams.EMPTY;
            }
            loggingParamsC.getClass();
            return z410Var.b(contextA, preparePlayOptionsF, playOriginE, loggingParamsC);
        }
        if (z610Var.g().length() == 0) {
            Logger.k("playUri should be called with a valid context-uri. Issuing 'playSomething()' command instead", new Object[0]);
            PlayOrigin playOriginE2 = z610Var.e();
            LoggingParams loggingParamsC2 = z610Var.c();
            if (loggingParamsC2 == null) {
                loggingParamsC2 = LoggingParams.EMPTY;
            }
            loggingParamsC2.getClass();
            return f(playOriginE2, loggingParamsC2);
        }
        String strG = z610Var.g();
        PreparePlayOptions preparePlayOptionsF2 = z610Var.f();
        PlayOrigin playOriginE3 = z610Var.e();
        LoggingParams loggingParamsC3 = z610Var.c();
        if (loggingParamsC3 == null) {
            loggingParamsC3 = LoggingParams.EMPTY;
        }
        LoggingParams loggingParams = loggingParamsC3;
        loggingParams.getClass();
        Map mapD = z610Var.d();
        t7y t7yVar = z410Var.h;
        h410 h410Var = z410Var.g;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(strG);
        blc0 blc0Var = s4b1VarX.c;
        boolean zContains = true;
        if (!sto1.m(strG) && blc0Var != blc0.SHOW_SHOW && !dm61.z0(blc0.ARTIST, blc0.COLLECTION_ARTIST, blc0.COLLECTION_PODCASTS_EPISODES).contains(blc0Var)) {
            v5b1 v5b1Var = s4b1VarX.d;
            b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
            if (!u890.j(type, nyu0.e) && !u890.j(type, wyu0.f)) {
                zContains = q410.n.contains(blc0Var);
            }
        }
        if (zContains) {
            return z410Var.a(preparePlayOptionsF2, strG).flatMap(new yjq(z410Var, strG, playOriginE3, loggingParams, mapD, (byte) 28));
        }
        blc0 blc0Var2 = blc0.SHOW_EPISODE;
        if (!uic.g(strG, blc0Var2)) {
            return t7yVar.d(strG) ? t7yVar.t(preparePlayOptionsF2, playOriginE3, loggingParams) : z410Var.b.e().take(1L).singleOrError().flatMap(new uny(z410Var, strG, preparePlayOptionsF2, (byte) 21)).flatMap(new bjx(z410Var, preparePlayOptionsF2, playOriginE3, loggingParams, strG, mapD, (byte) 4));
        }
        if (uic.g(strG, blc0Var2)) {
            return Single.zip(h410Var.a.b(new oi("external-integration-episode-playback", new kq00(strG, (byte) 5))).filter(b6j0.c1).firstOrError().map(new vdn1(strG, (byte) 7)), h410Var.b.a.firstOrError(), new wmy(h410Var, strG, preparePlayOptionsF2, playOriginE3, loggingParams, mapD)).flatMap(zhm0.b1);
        }
        return Single.error(new Exception("Cannot play `contextUri`"));
    }

    public final Single c(spq0 spq0Var) {
        return this.k.a(spq0Var.c() ? q9u0.k(SkipToNextTrackCommand.builder().loggingParams((LoggingParams) spq0Var.b()).build()) : q9u0.j()).doOnSuccess(new b710(this, (byte) 0));
    }

    public final Single d(spq0 spq0Var) {
        return this.k.a(spq0Var.c() ? q9u0.d(PauseCommand.builder().loggingParams((LoggingParams) spq0Var.b()).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("externalintegrationserviceplaybackimpl").build()).build()) : q9u0.c("externalintegrationserviceplaybackimpl", false));
    }

    public final Single e(z610 z610Var) {
        return ((hj91) ((ki91) this.h.get())).d(z610Var.g()).firstOrError().flatMap(new kp00(this, z610Var, (byte) 6)).onErrorResumeWith(a(z610Var));
    }

    public final Single f(PlayOrigin playOrigin, LoggingParams loggingParams) {
        return jgz0.a(this.g, playOrigin, loggingParams, null, 28).map(d710.b).onErrorReturn(e710.b);
    }

    public final Single g(spq0 spq0Var, boolean z) {
        SkipToPrevTrackCommand.Builder builderOptions = SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.valueOf(z)).build());
        LoggingParams loggingParams = (LoggingParams) spq0Var.h();
        if (loggingParams != null) {
            builderOptions.loggingParams(loggingParams);
        }
        return this.k.a(q9u0.l(builderOptions.build())).doOnSuccess(new b710(this, (byte) 1));
    }

    public final Single h(LoggingParams loggingParams) {
        return this.k.a(q9u0.f(ResumeCommand.builder().loggingParams(loggingParams).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("externalintegrationserviceplaybackimpl").build()).build()));
    }

    public final Single i(long j, spq0 spq0Var) {
        return new FlowableSingleSingle(new FlowableTake(this.a)).map(new o0g(this, j, (byte) 3)).flatMap(new w2z(this, spq0Var, (byte) 13));
    }

    public final Single j(long j, spq0 spq0Var) {
        return this.k.a(spq0Var.c() ? q9u0.h(SeekToCommand.builder(j).loggingParams((LoggingParams) spq0Var.b()).build()) : q9u0.g(j)).doOnSuccess(new b710(this, (byte) 2));
    }

    public final Single k(int i) {
        return this.j.setRepeatMode(i).doOnSuccess(new b710(this, (byte) 3));
    }
}
