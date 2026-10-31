package p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ehh0 implements Function {
    public static final ehh0 a = new ehh0();

    public final Object apply(Object obj) {
        return LoggingParams.builder().interactionId(((ou80) obj).a).build();
    }
}
