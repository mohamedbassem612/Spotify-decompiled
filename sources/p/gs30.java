package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gs30 extends cx81 {
    public final /* synthetic */ is30 a;
    public final /* synthetic */ c9n b;

    public gs30(is30 is30Var, c9n c9nVar) {
        this.a = is30Var;
        this.b = c9nVar;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        is30 is30Var = this.a;
        fn31.T(this.b, is30Var.i, 0, new es30(is30Var, messageResponseToken, discardReason$PresentationFailed, null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        is30 is30Var = this.a;
        fn31.T(this.b, is30Var.i, 0, new cs30(is30Var, null, (byte) 1), 2);
    }

    @Override // p.cx81, p.paj0
    public final void g(MessageResponseToken messageResponseToken) {
        is30 is30Var = this.a;
        if (is30Var.k) {
            fn31.T(this.b, is30Var.i, 0, new fs30(is30Var, messageResponseToken, null), 2);
        }
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        is30 is30Var = this.a;
        fn31.T(this.b, is30Var.i, 0, new ur1((byte) 19, is30Var, messageResponseToken, button, bundle, dismissType, (lnm) null), 2);
    }

    @Override // p.cx81, p.paj0
    public final void k() {
        this.a.k = false;
    }

    @Override // p.cx81, p.paj0
    public final void l(MessageResponseToken messageResponseToken) {
        is30 is30Var = this.a;
        if (is30Var.k) {
            fn31.T(this.b, is30Var.i, 0, new ds30(is30Var, messageResponseToken, null), 2);
        }
    }
}
