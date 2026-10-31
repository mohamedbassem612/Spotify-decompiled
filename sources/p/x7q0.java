package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x7q0 implements w7q0 {
    public final mmc a;

    public x7q0(mmc mmcVar) {
        this.a = mmcVar;
    }

    public final void a(MessageResponseToken messageResponseToken) {
        ((nmc) this.a).a.accept(new qak1(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData()));
    }
}
