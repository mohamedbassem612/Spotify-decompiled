package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lfj0 extends ofj0 {
    public final Button a;
    public final DismissType b;
    public final Bundle c;

    public lfj0(Button button) {
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
        if (!(obj instanceof lfj0)) {
            return false;
        }
        lfj0 lfj0Var = (lfj0) obj;
        return u890.j(this.a, lfj0Var.a) && this.b.equals(lfj0Var.b) && this.c.equals(lfj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
