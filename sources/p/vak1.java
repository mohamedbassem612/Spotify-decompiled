package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vak1 extends hab0 implements iu30 {
    public final /* synthetic */ blc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vak1(blc blcVar) {
        super(1);
        this.a = blcVar;
    }

    public final Object invoke(Object obj) {
        MessageResponseToken messageResponseToken = this.a.b;
        return new z4j0(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData());
    }
}
