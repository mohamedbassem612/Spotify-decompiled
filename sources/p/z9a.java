package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z9a implements Consumer {
    public final /* synthetic */ baa a;
    public final /* synthetic */ MessageResponse.Success b;

    public z9a(baa baaVar, MessageResponse.Success success) {
        this.a = baaVar;
        this.b = success;
    }

    public final void accept(Object obj) {
        PresentationOperation presentationOperation = (PresentationOperation) obj;
        if (presentationOperation instanceof PresentationOperation.Dismiss) {
            return;
        }
        if (!(presentationOperation instanceof PresentationOperation.Present)) {
            eg.o();
            return;
        }
        baa baaVar = this.a;
        vlc vlcVar = baaVar.f;
        MessageResponse.Success success = this.b;
        DiscardReason discardReasonA = vlcVar.a(success.getToken().getRequestId());
        if (discardReasonA != null) {
            baaVar.g.a(yhm0.p(success.getToken().getMessageRequest(), success.getToken().getRequestId()), success.getToken().getMessageData(), discardReasonA);
        } else {
            ((PresentationOperation.Present) presentationOperation).getPresenter().b(z7i0.N0);
        }
    }
}
