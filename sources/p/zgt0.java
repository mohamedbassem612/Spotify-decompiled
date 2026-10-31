package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zgt0 implements ygt0 {
    public final cyp a;

    public zgt0(cyp cypVar) {
        this.a = cypVar;
    }

    public final void a(String str) {
        this.a.d().a(PlayCommand.builder(Context.fromUri(str), PlayOrigin.builder("ereader-music-sheet").build()).build()).subscribe(xfs0.e, xfs0.f);
    }
}
