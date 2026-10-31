package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wd80 implements o5s {
    public final /* synthetic */ ae80 a;
    public final /* synthetic */ MessageResponseToken b;
    public final /* synthetic */ iac0 c;

    public wd80(ae80 ae80Var, MessageResponseToken messageResponseToken, iac0 iac0Var) {
        this.a = ae80Var;
        this.b = messageResponseToken;
        this.c = iac0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        ae80 ae80Var = this.a;
        LinkedHashMap linkedHashMap = ae80Var.f;
        MessageResponseToken messageResponseToken = this.b;
        linkedHashMap.remove(messageResponseToken.getRequestId());
        ae80Var.d.a(messageResponseToken, DismissReason.ContextChanged.INSTANCE);
        this.c.getLifecycle().d(this);
    }
}
