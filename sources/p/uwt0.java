package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uwt0 {
    public final ojv a;

    public uwt0(ojv ojvVar) {
        this.a = ojvVar;
    }

    public static i9u0 d(PlayerState playerState, int i) {
        return new i9u0((int) Math.max(0L, Math.min(playerState.timestamp() + ((long) i), ((Long) playerState.duration().e(0L)).longValue())));
    }

    public final Single a(spq0 spq0Var, q9u0 q9u0Var, int i) {
        tau0 tau0Var = (tau0) this.a.b;
        if (!spq0Var.c()) {
            return tau0Var.a().a(q9u0Var);
        }
        spq0 spq0VarTrack = ((PlayerState) spq0Var.b()).track();
        return (spq0VarTrack.c() && l4o1.P((ContextTrack) spq0VarTrack.b())) ? tau0Var.a().a(d((PlayerState) spq0Var.b(), i)) : tau0Var.a().a(q9u0Var);
    }

    public final Single b(LoggingParams loggingParams) {
        return ((tau0) this.a.b).a().a(new e9u0(PauseCommand.builder().loggingParams(loggingParams).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("mediabutton-playbackcontrolcommandshandler").build()).build()));
    }

    public final Single c(LoggingParams loggingParams) {
        return ((tau0) this.a.b).a().a(new h9u0(ResumeCommand.builder().loggingParams(loggingParams).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("mediabutton-playbackcontrolcommandshandler").build()).build()));
    }
}
