package p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class akv implements Function {
    public static final akv a = new akv();

    public final Object apply(Object obj) {
        return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
    }
}
