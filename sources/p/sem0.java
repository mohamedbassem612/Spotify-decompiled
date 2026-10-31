package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sem0 extends cx81 {
    public final /* synthetic */ uem0 a;
    public final /* synthetic */ c9n b;

    public sem0(uem0 uem0Var, c9n c9nVar) {
        this.a = uem0Var;
        this.b = c9nVar;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        uem0 uem0Var = this.a;
        fn31.T(this.b, uem0Var.l, 0, new pem0(uem0Var, messageResponseToken, discardReason$PresentationFailed, null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        uem0 uem0Var = this.a;
        fn31.T(this.b, uem0Var.l, 0, new nem0(uem0Var, null, (byte) 1), 2);
    }

    @Override // p.cx81, p.paj0
    public final void g(MessageResponseToken messageResponseToken) {
        uem0 uem0Var = this.a;
        if (uem0Var.m) {
            fn31.T(this.b, uem0Var.l, 0, new rem0(uem0Var, messageResponseToken, null), 2);
        }
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        uem0 uem0Var = this.a;
        fn31.T(this.b, uem0Var.l, 0, new ur1((byte) 23, uem0Var, messageResponseToken, button, bundle, dismissType, (lnm) null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void j(MessageResponseToken messageResponseToken) {
        uem0 uem0Var = this.a;
        fn31.T(this.b, uem0Var.l, 0, new qem0(uem0Var, messageResponseToken, null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void k() {
        this.a.m = false;
    }

    @Override // p.cx81, p.paj0
    public final void l(MessageResponseToken messageResponseToken) {
        uem0 uem0Var = this.a;
        if (uem0Var.m) {
            fn31.T(this.b, uem0Var.l, 0, new oem0(uem0Var, messageResponseToken, null), 2);
        }
    }
}
