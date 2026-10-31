package p;

import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsSetOptions;
import com.spotify.player.esperanto.proto.EsSetShufflingContext;
import com.spotify.player.model.command.SetOptionsCommand;
import com.spotify.player.model.command.SetShufflingContextCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class suz implements xbu0 {
    public final ujm a;
    public final cve0 b;

    public suz(ujm ujmVar, cve0 cve0Var) {
        this.a = ujmVar;
        this.b = cve0Var;
    }

    @Override // p.xbu0
    public final Single a(boolean z) {
        return d(SetShufflingContextCommand.create(z));
    }

    public final Single b(SetOptionsCommand setOptionsCommand) {
        orz orzVarO = EsSetOptions.SetOptionsRequest.o();
        if (setOptionsCommand.repeatingContext().c()) {
            ppz ppzVarN = EsOptional.OptionalBoolean.n();
            ppzVarN.n(((Boolean) setOptionsCommand.repeatingContext().b()).booleanValue());
            orzVarO.t(ppzVarN.build());
        }
        if (setOptionsCommand.repeatingTrack().c()) {
            ppz ppzVarN2 = EsOptional.OptionalBoolean.n();
            ppzVarN2.n(((Boolean) setOptionsCommand.repeatingTrack().b()).booleanValue());
            orzVarO.u(ppzVarN2.build());
        }
        if (setOptionsCommand.shufflingContext().c()) {
            ppz ppzVarN3 = EsOptional.OptionalBoolean.n();
            ppzVarN3.n(((Boolean) setOptionsCommand.shufflingContext().b()).booleanValue());
            orzVarO.v(ppzVarN3.build());
        }
        if (setOptionsCommand.playbackSpeed().c()) {
            orzVarO.s(((Number) setOptionsCommand.playbackSpeed().b()).floatValue());
        }
        if (!setOptionsCommand.modes().isEmpty()) {
            orzVarO.n(setOptionsCommand.modes());
        }
        if (setOptionsCommand.options().c()) {
            orzVarO.r(l6p1.h((CommandOptions) setOptionsCommand.options().b()));
        }
        orzVarO.q(tgp1.s(this.b.a(setOptionsCommand.loggingParams())));
        return this.a.a(orzVarO.build()).map(drm0.b1);
    }

    public final Single c(boolean z, boolean z2) {
        SetOptionsCommand setOptionsCommandBuild = SetOptionsCommand.builder().repeatingContext(z).repeatingTrack(z2).build();
        setOptionsCommandBuild.getClass();
        return b(setOptionsCommandBuild);
    }

    public final Single d(SetShufflingContextCommand setShufflingContextCommand) {
        rrz rrzVarN = EsSetShufflingContext.SetShufflingContextRequest.n();
        rrzVarN.r(setShufflingContextCommand.value());
        if (setShufflingContextCommand.options().c()) {
            rrzVarN.q(l6p1.h((CommandOptions) setShufflingContextCommand.options().b()));
        }
        rrzVarN.n(tgp1.s(this.b.a(setShufflingContextCommand.loggingParams())));
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SetShufflingContext", rrzVarN.build()).map(o9p1.T0).map(cq41.c1);
    }

    @Override // p.xbu0
    public final Single setRepeatMode(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return c(false, false);
        }
        if (iC == 1) {
            return c(true, false);
        }
        if (iC == 2) {
            return c(true, true);
        }
        eg.o();
        return null;
    }
}
