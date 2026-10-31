package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izb extends cx81 {
    public final /* synthetic */ c9n a;
    public final /* synthetic */ ozb b;

    public izb(c9n c9nVar, ozb ozbVar) {
        this.a = c9nVar;
        this.b = ozbVar;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        ozb ozbVar = this.b;
        fn31.T(this.a, ozbVar.i, 0, new gzb(ozbVar, messageResponseToken, discardReason$PresentationFailed, null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        ozb ozbVar = this.b;
        fn31.T(this.a, ozbVar.i, 0, new hzb(ozbVar, null, (byte) 0), 2);
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        ozb ozbVar = this.b;
        fn31.T(this.a, ozbVar.i, 0, new ur1((byte) 5, ozbVar, messageResponseToken, button, bundle, dismissType, (lnm) null), 2);
    }
}
