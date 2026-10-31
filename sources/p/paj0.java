package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface paj0 {
    static /* synthetic */ void b(paj0 paj0Var, MessageResponseToken messageResponseToken, Button button, Bundle bundle, int i) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        paj0Var.h(bundle, DismissType.ActionDeterminedDismiss.INSTANCE, messageResponseToken, button);
    }

    void a(MessageResponseToken messageResponseToken, DiscardReason$PresentationFailed discardReason$PresentationFailed);

    void c(MessageResponseToken messageResponseToken);

    void d(Set set);

    void e();

    void f(MessageResponseToken messageResponseToken, Button button);

    void g(MessageResponseToken messageResponseToken);

    void h(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button);

    void i(int i);

    void j(MessageResponseToken messageResponseToken);

    void k();

    void l(MessageResponseToken messageResponseToken);
}
