package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pem0 extends a8d1 implements vu30 {
    public final /* synthetic */ uem0 a;
    public final /* synthetic */ MessageResponseToken b;
    public final /* synthetic */ DiscardReason$PresentationFailed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pem0(uem0 uem0Var, MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed, lnm lnmVar) {
        super(2, lnmVar);
        this.a = uem0Var;
        this.b = messageResponseToken;
        this.c = discardReason$PresentationFailed;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new pem0(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        pem0 pem0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        pem0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        uem0 uem0Var = this.a;
        y4q0 y4q0Var = uem0Var.f;
        MessageResponseToken messageResponseToken = this.b;
        y4q0Var.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), this.c);
        uem0Var.h.a();
        return rih1.a;
    }
}
