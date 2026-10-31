package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h5j0 implements Function {
    public static final h5j0 a = new h5j0();

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return (MessageResponse.Success) ((MessageResponse) obj);
    }
}
