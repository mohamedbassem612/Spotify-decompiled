package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cbj0 extends ebj0 {
    public final Button a;
    public final DismissType b;
    public final Bundle c;

    public cbj0(Button button) {
        DismissType.ActionDeterminedDismiss actionDeterminedDismiss = DismissType.ActionDeterminedDismiss.INSTANCE;
        Bundle bundle = new Bundle();
        this.a = button;
        this.b = actionDeterminedDismiss;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbj0)) {
            return false;
        }
        cbj0 cbj0Var = (cbj0) obj;
        return u890.j(this.a, cbj0Var.a) && this.b.equals(cbj0Var.b) && this.c.equals(cbj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
