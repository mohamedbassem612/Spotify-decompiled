package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c7a extends cx81 {
    public final /* synthetic */ g7a a;

    public c7a(g7a g7aVar) {
        this.a = g7aVar;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        g7a g7aVar = this.a;
        g7aVar.e.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), discardReason$PresentationFailed);
        z7a z7aVar = g7aVar.i;
        if (z7aVar != null) {
            z7aVar.a();
        }
        g7aVar.i = null;
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        bpb1 bpb1Var = this.a.l;
        Boolean bool = Boolean.TRUE;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }

    @Override // p.cx81, p.paj0
    public final void f(MessageResponseToken messageResponseToken, Button button) {
        g7a g7aVar = this.a;
        ((x1q0) g7aVar.f).a(messageResponseToken, button, null, DismissType.ActionDeterminedDismiss.INSTANCE, new b7a(g7aVar, (byte) 1));
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        g7a g7aVar = this.a;
        ((x1q0) g7aVar.f).a(messageResponseToken, button, bundle, dismissType, new b7a(g7aVar, (byte) 0));
    }
}
