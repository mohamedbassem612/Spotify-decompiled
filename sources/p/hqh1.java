package p;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hqh1 implements Function {
    public final /* synthetic */ cp81 a;

    public hqh1(cp81 cp81Var) {
        this.a = cp81Var;
    }

    public final Object apply(Object obj) {
        ruz ruzVar = (ruz) this.a.b;
        if (((l0w0) obj).d) {
            return ruzVar.a(new g9u0("prerelease", false)).ignoreElement().d(Observable.just(l1w0.a));
        }
        Completable completableIgnoreElement = ruzVar.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("prerelease").build()).build())).ignoreElement();
        completableIgnoreElement.getClass();
        return completableIgnoreElement.o(Functions.h).w();
    }
}
