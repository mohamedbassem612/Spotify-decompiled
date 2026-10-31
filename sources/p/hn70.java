package p;

import com.spotify.offline.offlineplugin_proto.g;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hn70 implements Function {
    public static final hn70 a = new hn70();

    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? g.COMPLETE : g.MISSING;
    }
}
