package p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b77 implements Function {
    public static final b77 a = new b77();

    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId(((ou80) obj).a).build();
    }
}
