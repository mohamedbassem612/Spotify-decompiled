package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s8u0 implements h6v0 {
    public final muz a;
    public final tgt0 b;
    public final ruz c;
    public final b7r0 d;
    public final Flowable e;
    public final Flowable f;
    public final Flowable g;
    public final boolean h;
    public final z281 i;

    public s8u0(muz muzVar, tgt0 tgt0Var, ruz ruzVar, b7r0 b7r0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, boolean z, z281 z281Var) {
        this.a = muzVar;
        this.b = tgt0Var;
        this.c = ruzVar;
        this.d = b7r0Var;
        this.e = flowable;
        this.f = flowable2;
        this.g = flowable3;
        this.h = z;
        this.i = z281Var;
    }

    public final LoggingParams a(String str) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str);
        y6r0 y6r0Var = this.d.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        return builderInteractionId.pageInstanceId(str2).build();
    }

    public final Single b(ou80 ou80Var) {
        PauseCommand.Builder builder = PauseCommand.builder();
        String str = ou80Var != null ? ou80Var.a : null;
        if (str == null) {
            str = "";
        }
        Single singleA = this.c.a(new e9u0(builder.loggingParams(a(str)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("playerapipodcastplayerimpl").build()).build()));
        return singleA.map(new l1p0(singleA, (byte) 17));
    }

    public final Single c(e6v0 e6v0Var) {
        String str;
        if (e6v0Var instanceof d6v0) {
            Set set = s4b1.f;
            d6v0 d6v0Var = (d6v0) e6v0Var;
            str = d6v0Var.a;
            blc0 blc0Var = uic.x(str).c;
            if (blc0Var != blc0.fh && blc0Var != blc0.Pg) {
                str = d6v0Var.b;
            }
        } else {
            if (!(e6v0Var instanceof c6v0)) {
                eg.o();
                return null;
            }
            str = ((c6v0) e6v0Var).a;
        }
        return this.i.a(str).flatMap(new zhq0((Object) e6v0Var, (Object) this, (byte) 28));
    }

    public final Single d(String str, Context context, ou80 ou80Var, gqt0 gqt0Var) {
        String strUri = context.uri();
        return Flowable.h(this.f.J(eh10.Z0), this.g, new xot(str, strUri, (byte) 4)).y(Boolean.FALSE).flatMap(new ytp0(this, str, context, ou80Var, gqt0Var, (byte) 12));
    }

    public final Single e(ou80 ou80Var) {
        ResumeCommand.Builder builder = ResumeCommand.builder();
        String str = ou80Var != null ? ou80Var.a : null;
        if (str == null) {
            str = "";
        }
        Single singleA = this.c.a(new h9u0(builder.loggingParams(a(str)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("playerapipodcastplayerimpl").build()).build()));
        return singleA.map(new l1p0(singleA, (byte) 17));
    }
}
