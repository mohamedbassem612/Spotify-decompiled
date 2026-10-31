package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qt91 extends cx81 {
    public final /* synthetic */ tt91 a;

    public qt91(tt91 tt91Var) {
        this.a = tt91Var;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        tt91 tt91Var = this.a;
        tt91Var.f.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), discardReason$PresentationFailed);
        tt91Var.d();
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        bpb1 bpb1Var = this.a.o;
        Boolean bool = Boolean.TRUE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }

    @Override // p.cx81, p.paj0
    public final void f(MessageResponseToken messageResponseToken, Button button) {
        tt91 tt91Var = this.a;
        ((x1q0) tt91Var.e).a(messageResponseToken, button, null, DismissType.ActionDeterminedDismiss.INSTANCE, new pt91(tt91Var, (byte) 1));
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        tt91 tt91Var = this.a;
        ((x1q0) tt91Var.e).a(messageResponseToken, button, bundle, dismissType, new pt91(tt91Var, (byte) 0));
    }
}
