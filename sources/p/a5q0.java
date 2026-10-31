package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a5q0 implements z4q0 {
    public final mmc a;

    public a5q0(mmc mmcVar) {
        this.a = mmcVar;
    }

    public final void a(MessageResponseToken messageResponseToken, DismissReason dismissReason) {
        ((nmc) this.a).a.accept(new pak1(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), dismissReason));
    }
}
