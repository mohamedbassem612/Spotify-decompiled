package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v2s extends hab0 implements iu30 {
    public final /* synthetic */ w2s a;
    public final /* synthetic */ fhy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2s(w2s w2sVar, fhy fhyVar) {
        super(1);
        this.a = w2sVar;
        this.b = fhyVar;
    }

    public final Object invoke(Object obj) {
        MessageResponseToken messageResponseToken = this.b.b;
        w2s w2sVar = this.a;
        z67 z67Var = (z67) w2sVar.e;
        String actionUrl = ((Button) obj).getClickAction().getActionUrl();
        if (actionUrl == null) {
            actionUrl = "";
        }
        z67Var.a(messageResponseToken.getMessageData().getLoggingData().getMessageUuid(), actionUrl);
        ((ft30) w2sVar.i).invoke(new fq3(messageResponseToken));
        return rih1.a;
    }
}
