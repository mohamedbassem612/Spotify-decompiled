package p;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jpu {
    public final ruz a;

    public jpu(ruz ruzVar) {
        this.a = ruzVar;
    }

    public final Object a(onm onmVar) {
        Object objI = fc11.i(this.a.a(new e9u0(PauseCommand.builder().options(CommandOptions.builder().systemInitiated(true).overrideRestrictions(true).build()).build())).ignoreElement(), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
