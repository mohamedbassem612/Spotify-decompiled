package p;

import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqr implements tjm {
    public final muz a;
    public final tgt0 b;
    public final ruz c;

    public fqr(muz muzVar, tgt0 tgt0Var, ruz ruzVar) {
        this.a = muzVar;
        this.b = tgt0Var;
        this.c = ruzVar;
    }

    @Override // p.tjm
    public final Completable a() {
        return this.c.a(new d9u0("hubs-playbuttonclickcommandhandler", false)).ignoreElement();
    }

    @Override // p.tjm
    public final Single d() {
        return this.c.a(new g9u0("hubs-playbuttonclickcommandhandler", false)).map(vrg.V0);
    }

    @Override // p.tjm
    public final Single e(sjm sjmVar) {
        tv80 tv80Var = sjmVar.d;
        PlayCommand.Builder builder = PlayCommand.builder(sjmVar.b, this.b.a);
        PreparePlayOptions preparePlayOptions = sjmVar.c;
        if (preparePlayOptions != null) {
            builder.options(preparePlayOptions);
        }
        builder.loggingParams(LoggingParams.builder().interactionId(tv80Var.a.a).build());
        return this.a.a(builder.build()).map(vrg.V0);
    }
}
