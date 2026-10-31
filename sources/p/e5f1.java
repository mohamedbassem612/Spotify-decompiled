package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5f1 extends cx81 {
    public final /* synthetic */ h5f1 a;

    public e5f1(h5f1 h5f1Var) {
        this.a = h5f1Var;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        h5f1 h5f1Var = this.a;
        h5f1Var.f.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), discardReason$PresentationFailed);
        h5f1Var.d();
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        bpb1 bpb1Var = this.a.n;
        Boolean bool = Boolean.TRUE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }

    @Override // p.cx81, p.paj0
    public final void f(MessageResponseToken messageResponseToken, Button button) {
        h5f1 h5f1Var = this.a;
        ((x1q0) h5f1Var.e).a(messageResponseToken, button, null, DismissType.ActionDeterminedDismiss.INSTANCE, new d5f1(h5f1Var, (byte) 1));
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        h5f1 h5f1Var = this.a;
        ((x1q0) h5f1Var.e).a(messageResponseToken, button, bundle, dismissType, new d5f1(h5f1Var, (byte) 0));
    }
}
