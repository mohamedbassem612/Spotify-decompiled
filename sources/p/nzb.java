package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzb extends hab0 implements iu30 {
    public final /* synthetic */ ozb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzb(ozb ozbVar) {
        super(1);
        this.a = ozbVar;
    }

    public final Object invoke(Object obj) {
        MessageResponseToken messageResponseToken;
        Bundle bundle = (Bundle) obj;
        ozb ozbVar = this.a;
        if (bundle == null || (messageResponseToken = (MessageResponseToken) bundle.getParcelable("messaging_bottomsheet_token")) == null) {
            messageResponseToken = ozbVar.b.a;
        }
        ozbVar.j = messageResponseToken;
        return new i0c(messageResponseToken, p3d1.i(messageResponseToken), false);
    }
}
