package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pjt0 implements i570 {
    public final muz a;
    public final oi b;
    public final hl00 c;
    public final i8h1 d;
    public final b7r0 e;
    public final PlayOrigin f;
    public final vku g = new vku();

    public pjt0(muz muzVar, oi oiVar, hl00 hl00Var, i8h1 i8h1Var, iac0 iac0Var, b7r0 b7r0Var, PlayOrigin playOrigin) {
        this.a = muzVar;
        this.b = oiVar;
        this.c = hl00Var;
        this.d = i8h1Var;
        this.e = b7r0Var;
        this.f = playOrigin;
        iac0Var.getLifecycle().a(new ojt0(this, iac0Var));
    }

    public final void a(j570 j570Var, u570 u570Var) {
        y570 y570Var = u570Var.b;
        rc70 rc70Var = ((sc70) j570Var).b;
        Context contextM = gyo1.M(rc70Var.c);
        if (contextM != null) {
            HubsImmutableComponentBundle hubsImmutableComponentBundle = rc70Var.c;
            String strB = hubsImmutableComponentBundle.B("uri");
            if (strB == null) {
                strB = "";
            }
            PreparePlayOptions preparePlayOptionsN = gyo1.N(hubsImmutableComponentBundle);
            boolean zBooleanValue = (preparePlayOptionsN != null && preparePlayOptionsN.playerOptionsOverride().c() && ((PlayerOptionOverrides) preparePlayOptionsN.playerOptionsOverride().b()).shufflingContext().c()) ? ((Boolean) ((PlayerOptionOverrides) preparePlayOptionsN.playerOptionsOverride().b()).shufflingContext().b()).booleanValue() : false;
            hl00 hl00Var = this.c;
            String str = this.d.m(zBooleanValue ? hl00Var.h(u570Var).r(strB) : hl00Var.h(u570Var).o(strB), (xj61) null).a.a;
            spq0 spq0VarTrackUri = (preparePlayOptionsN == null || !preparePlayOptionsN.skipTo().c()) ? j5.a : ((SkipToTrack) preparePlayOptionsN.skipTo().b()).trackUri();
            boolean zB = y570Var.b().b("explicit", false);
            oi oiVar = this.b;
            if (oiVar.b && zB && spq0VarTrackUri.c()) {
                String str2 = (String) spq0VarTrackUri.b();
                contextM.uri();
                ((wr00) oiVar.c).a(str2);
            } else {
                y6r0 y6r0Var = this.e.get();
                PlayCommand.Builder builderLoggingParams = PlayCommand.builder(contextM, this.f).loggingParams(LoggingParams.builder().interactionId(str).pageInstanceId(y6r0Var != null ? y6r0Var.a : "").build());
                if (preparePlayOptionsN != null) {
                    builderLoggingParams.options(preparePlayOptionsN);
                }
                this.g.a(this.a.a(builderLoggingParams.build()).subscribe());
            }
        }
    }
}
