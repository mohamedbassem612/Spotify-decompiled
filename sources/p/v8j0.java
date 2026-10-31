package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v8j0 extends x8j0 {
    public final Button a;
    public final DismissType b;
    public final Bundle c;

    public v8j0(Button button) {
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
        if (!(obj instanceof v8j0)) {
            return false;
        }
        v8j0 v8j0Var = (v8j0) obj;
        return u890.j(this.a, v8j0Var.a) && this.b.equals(v8j0Var.b) && this.c.equals(v8j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
