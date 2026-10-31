package p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjv implements Function {
    public static final wjv a = new wjv();

    public final Object apply(Object obj) {
        return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
    }
}
