package p;

import com.spotify.player.esperanto.proto.EsCommandOptions;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPause;
import com.spotify.player.esperanto.proto.EsResume;
import com.spotify.player.esperanto.proto.EsSeekTo;
import com.spotify.player.esperanto.proto.EsSkipNext;
import com.spotify.player.esperanto.proto.EsSkipPrev;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ruz implements w9u0 {
    public final ujm a;
    public final cve0 b;

    public ruz(ujm ujmVar, cve0 cve0Var) {
        this.a = ujmVar;
        this.b = cve0Var;
    }

    @Override // p.w9u0
    public final Single a(q9u0 q9u0Var) {
        return (Single) q9u0Var.a(new ogr(this, (byte) 28), new ouz(this, (byte) 0), new dqu(this, (byte) 11), new laz(this, (byte) 2), new fey(this, (byte) 3), new lmw(this, (byte) 7), new puz(this), new quz(this), new mjv(this, (byte) 8), new qmr(this, (byte) 28), new rmr(this, (byte) 28), new efr(this, (byte) 29), new tzo(this, (byte) 29));
    }

    public final EsCommandOptions.CommandOptions b(CommandOptions commandOptions) {
        if (commandOptions != null) {
            return l6p1.h(commandOptions);
        }
        return null;
    }

    public final Single c(PauseCommand pauseCommand) {
        rpz rpzVarN = EsPause.PauseRequest.n();
        EsCommandOptions.CommandOptions commandOptionsB = b((CommandOptions) pauseCommand.options().h());
        if (commandOptionsB != null) {
            rpzVarN.q(commandOptionsB);
        }
        rpzVarN.n(tgp1.s(this.b.a(pauseCommand.loggingParams())));
        PauseResumeOrigin pauseResumeOrigin = (PauseResumeOrigin) pauseCommand.pauseOrigin().h();
        if (pauseResumeOrigin != null) {
            rpzVarN.r(jas0.a(pauseResumeOrigin));
        }
        EsPause.PauseRequest pauseRequestBuild = rpzVarN.build();
        pauseRequestBuild.getClass();
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Pause", pauseRequestBuild).map(b6j0.R0).map(vrg.c1);
    }

    public final Single d(ResumeCommand resumeCommand) {
        drz drzVarN = EsResume.ResumeRequest.n();
        EsCommandOptions.CommandOptions commandOptionsB = b((CommandOptions) resumeCommand.options().h());
        if (commandOptionsB != null) {
            drzVarN.q(commandOptionsB);
        }
        drzVarN.n(tgp1.s(this.b.a(resumeCommand.loggingParams())));
        PauseResumeOrigin pauseResumeOrigin = (PauseResumeOrigin) resumeCommand.resumeOrigin().h();
        if (pauseResumeOrigin != null) {
            drzVarN.r(jas0.a(pauseResumeOrigin));
        }
        EsResume.ResumeRequest resumeRequestBuild = drzVarN.build();
        resumeRequestBuild.getClass();
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Resume", resumeRequestBuild).map(uml1.S0).map(ios.c1);
    }

    public final Single e(SeekToCommand seekToCommand) {
        frz frzVar;
        erz erzVarN = EsSeekTo.SeekToRequest.n();
        EsCommandOptions.CommandOptions commandOptionsB = b((CommandOptions) seekToCommand.options().h());
        if (commandOptionsB != null) {
            erzVarN.r(commandOptionsB);
        }
        erzVarN.q(tgp1.s(this.b.a(seekToCommand.loggingParams())));
        erzVarN.s(seekToCommand.value());
        SeekToCommand.Relative relative = (SeekToCommand.Relative) seekToCommand.relative().h();
        if (relative != null) {
            int i = nuz.a[relative.ordinal()];
            if (i == 1) {
                frzVar = frz.b;
            } else if (i == 2) {
                frzVar = frz.d;
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                frzVar = frz.c;
            }
            erzVarN.t(frzVar);
        }
        Long l = (Long) seekToCommand.creatorTimestampPositionMs().h();
        if (l != null) {
            long jLongValue = l.longValue();
            qpz qpzVarP = EsOptional$OptionalInt64.p();
            qpzVarP.n(jLongValue);
            erzVarN.n((EsOptional$OptionalInt64) qpzVarP.build());
        }
        EsSeekTo.SeekToRequest seekToRequestBuild = erzVarN.build();
        seekToRequestBuild.getClass();
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SeekTo", seekToRequestBuild).map(pbo1.R0).map(fmv.c1);
    }

    public final Single f(SkipToNextTrackCommand skipToNextTrackCommand) {
        urz urzVarO = EsSkipNext.SkipNextRequest.o();
        EsCommandOptions.CommandOptions commandOptionsB = b((CommandOptions) skipToNextTrackCommand.options().h());
        if (commandOptionsB != null) {
            urzVarO.q(commandOptionsB);
        }
        urzVarO.n(tgp1.s(this.b.a(skipToNextTrackCommand.loggingParams())));
        ContextTrack contextTrack = (ContextTrack) skipToNextTrackCommand.track().h();
        if (contextTrack != null) {
            urzVarO.r(xlm.b(contextTrack));
        }
        EsSkipNext.SkipNextRequest skipNextRequestBuild = urzVarO.build();
        skipNextRequestBuild.getClass();
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SkipNext", skipNextRequestBuild).map(wcp1.R0).map(qz70.b1);
    }

    public final Single g(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        spq0 spq0VarAllowSeeking;
        Boolean bool;
        vrz vrzVarN = EsSkipPrev.SkipPrevRequest.n();
        SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) skipToPrevTrackCommand.options().h();
        EsCommandOptions.CommandOptions commandOptionsB = b(skipToPrevTrackOptions != null ? skipToPrevTrackOptions.commandOptions() : null);
        if (commandOptionsB != null) {
            vrzVarN.r(commandOptionsB);
        }
        if (skipToPrevTrackOptions != null && (spq0VarAllowSeeking = skipToPrevTrackOptions.allowSeeking()) != null && (bool = (Boolean) spq0VarAllowSeeking.h()) != null) {
            vrzVarN.n(bool.booleanValue());
        }
        vrzVarN.q(tgp1.s(this.b.a(skipToPrevTrackCommand.loggingParams())));
        ContextTrack contextTrack = (ContextTrack) skipToPrevTrackCommand.track().h();
        if (contextTrack != null) {
            vrzVarN.s(xlm.b(contextTrack));
        }
        EsSkipPrev.SkipPrevRequest skipPrevRequestBuild = vrzVarN.build();
        skipPrevRequestBuild.getClass();
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SkipPrev", skipPrevRequestBuild).map(vgp1.S0).map(b6j0.b1);
    }
}
