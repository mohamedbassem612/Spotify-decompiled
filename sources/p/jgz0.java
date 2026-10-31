package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface jgz0 {
    static Single a(jgz0 jgz0Var, PlayOrigin playOrigin, LoggingParams loggingParams, Boolean bool, int i) {
        if ((i & 8) != 0) {
            bool = null;
        }
        Boolean bool2 = bool;
        lgz0 lgz0Var = (lgz0) jgz0Var;
        t45 t45VarA = ((s45) lgz0Var.j).a("quickstart_pivot");
        t45VarA.h = "android-quickstart-pivot-playerimpl";
        lgz0Var.q = t45VarA;
        t45VarA.l("play_something", null, (2 & 4) != 0);
        return yoi1.i(lgz0Var.e.c(), o6x.a).first(Boolean.FALSE).flatMap(new kdy0(lgz0Var, playOrigin, loggingParams, bool2, (byte) 8)).onErrorReturn(new kgz0(lgz0Var, loggingParams, playOrigin, (byte) 10)).doOnSuccess(new lyw0(lgz0Var, (byte) 11));
    }
}
