package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b3h implements Function {
    public final List a;

    public Object apply(Object obj) {
        return sqg0.T(o7h.v1(this.a, ((CollectionPlatformEsperantoContainsResponse) obj).o().p()));
    }
}
