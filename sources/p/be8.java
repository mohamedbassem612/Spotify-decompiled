package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class be8 implements Function {
    public final /* synthetic */ t7o0 a;

    public be8(t7o0 t7o0Var) {
        this.a = t7o0Var;
    }

    public final Object apply(Object obj) {
        MessageResponse.Failure failure = (MessageResponse) obj;
        if (failure instanceof MessageResponse.Failure) {
            return Observable.error(new Throwable(failure.getDiscardReason().toString()));
        }
        if (failure instanceof MessageResponse.Success) {
            return ((ljg) this.a.b).e().b(((MessageResponse.Success) failure).getMessageRequestId());
        }
        eg.o();
        return null;
    }
}
