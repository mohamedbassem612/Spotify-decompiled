package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class df80 extends cx81 {
    public final /* synthetic */ ef80 a;

    public df80(ef80 ef80Var) {
        this.a = ef80Var;
    }

    @Override // p.cx81, p.paj0
    public final void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed) {
        ef80 ef80Var = this.a;
        ef80Var.c.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), discardReason$PresentationFailed);
        ef80Var.c();
    }

    @Override // p.cx81, p.paj0
    public final void c(MessageResponseToken messageResponseToken) {
        ef80 ef80Var = this.a;
        ef80Var.b.a(messageResponseToken);
        Function0 function0 = ef80Var.g;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // p.cx81, p.paj0
    public final void f(MessageResponseToken messageResponseToken, Button button) {
        ef80 ef80Var = this.a;
        v1q0 v1q0Var = ef80Var.d;
        ((x1q0) v1q0Var).a(messageResponseToken, button, null, DismissType.ActionDeterminedDismiss.INSTANCE, new cf80(ef80Var, (byte) 1));
    }

    @Override // p.cx81, p.paj0
    public final void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        ef80 ef80Var = this.a;
        v1q0 v1q0Var = ef80Var.d;
        ((x1q0) v1q0Var).a(messageResponseToken, button, bundle, dismissType, new cf80(ef80Var, (byte) 0));
    }
}
