package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zjb1 implements g50 {
    public final dg30 a;
    public final t8u0 b;
    public final idd1 c = new idd1(new gga1(this, (byte) 25));
    public final vku d = new vku();

    public zjb1(dg30 dg30Var, t8u0 t8u0Var) {
        this.a = dg30Var;
        this.b = t8u0Var;
        ((f0i) dg30Var).a.a(new i83(this, (byte) 23));
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        w1q0Var.invoke(Boolean.TRUE);
        tv80 serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
        tv80 tv80Var = serializable instanceof tv80 ? serializable : null;
        ou80 ou80Var = tv80Var != null ? tv80Var.a : null;
        if (ou80Var == null) {
            Logger.d("StartPlaybackActionHandler", new Object[]{"InteractionId is null, cannot start playback for uri: ".concat(str2)});
            return;
        }
        this.d.a(((muz) this.c.getValue()).a(PlayCommand.builder(Context.fromUri(str2), PlayOrigin.create("quicksilver")).loggingParams(LoggingParams.builder().interactionId(ou80Var.a).build()).build()).subscribe(iqa1.e, iqa1.f));
    }
}
