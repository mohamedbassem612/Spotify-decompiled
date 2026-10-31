package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g5j0 implements Predicate {
    public final /* synthetic */ FormatType a;

    public g5j0(FormatType formatType) {
        this.a = formatType;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public final boolean test(Object obj) {
        MessageResponse messageResponse = (MessageResponse) obj;
        return (messageResponse instanceof MessageResponse.Success) && yhm0.b(((MessageResponse.Success) messageResponse).getToken().getMessageData()) == this.a;
    }
}
