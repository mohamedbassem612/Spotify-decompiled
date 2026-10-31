package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v5d implements Function {
    public final /* synthetic */ ps7 a;

    public v5d(ps7 ps7Var) {
        this.a = ps7Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        MessageResponse messageResponse = (MessageResponse) obj;
        messageResponse.toString();
        if (messageResponse instanceof MessageResponse.Failure) {
            return Observable.error(new Throwable(((MessageResponse.Failure) messageResponse).getDiscardReason().toString()));
        }
        if (messageResponse instanceof MessageResponse.Success) {
            return ((ljg) this.a.b).e().b(((MessageResponse.Success) messageResponse).getMessageRequestId());
        }
        eg.o();
        return null;
    }
}
