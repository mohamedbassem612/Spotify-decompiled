package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gdj0 extends idj0 {
    public final Button a;
    public final DismissType b;
    public final Bundle c;

    public gdj0(Button button) {
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
        if (!(obj instanceof gdj0)) {
            return false;
        }
        gdj0 gdj0Var = (gdj0) obj;
        return u890.j(this.a, gdj0Var.a) && this.b.equals(gdj0Var.b) && this.c.equals(gdj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
