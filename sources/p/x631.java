package p;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x631 implements iu30 {
    public final ruz a;

    public x631(ruz ruzVar) {
        this.a = ruzVar;
    }

    public final Object invoke(Object obj) {
        return this.a.a(new h9u0(ResumeCommand.builder().resumeOrigin(PauseResumeOrigin.create((String) obj)).options(CommandOptions.builder().onlyForLocalDevice(true).systemInitiated(true).build()).build())).toObservable().flatMapCompletable(e4x0.h);
    }
}
