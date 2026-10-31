package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$NoContainerFound;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g5f1 extends hab0 implements iu30 {
    public final /* synthetic */ h5f1 a;
    public final /* synthetic */ mmr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5f1(mmr0 mmr0Var, h5f1 h5f1Var) {
        super(1);
        this.a = h5f1Var;
        this.b = mmr0Var;
    }

    public final Object invoke(Object obj) {
        h5f1 h5f1Var = this.a;
        y4q0 y4q0Var = h5f1Var.f;
        mmr0 mmr0Var = this.b;
        MessageRequest messageRequest = ((MessageResponseToken) mmr0Var.a).getMessageRequest();
        MessageResponseToken messageResponseToken = (MessageResponseToken) mmr0Var.a;
        y4q0Var.a(yhm0.p(messageRequest, messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), new DiscardReason$NoContainerFound(h5f1Var.a.getClass().getSimpleName(), "TOOLTIP"));
        h5f1Var.d();
        return rih1.a;
    }
}
