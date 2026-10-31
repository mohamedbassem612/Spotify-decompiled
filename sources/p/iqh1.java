package p;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iqh1 implements Function {
    public final /* synthetic */ g2x0 a;

    public iqh1(g2x0 g2x0Var) {
        this.a = g2x0Var;
    }

    public final Object apply(Object obj) {
        g2x0 g2x0Var = this.a;
        ruz ruzVar = (ruz) g2x0Var.c;
        return ((y8u) obj).a ? ruzVar.a(new g9u0("updatecontextplayerstateeffecthandler", false)).subscribeOn((Scheduler) g2x0Var.b).onErrorReturnItem(new beh("Error with PlayerControls")).ignoreElement().d(Observable.just(o9u.a)) : ruzVar.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("updatecontextplayerstateeffecthandler").build()).build())).onErrorReturnItem(new beh("Error with PlayerControls")).ignoreElement().d(Observable.empty());
    }
}
