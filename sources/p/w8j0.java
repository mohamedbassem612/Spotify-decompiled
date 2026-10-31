package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w8j0 extends x8j0 {
    public final Button a;
    public final Bundle b;

    public w8j0(Button button) {
        Bundle bundle = new Bundle();
        this.a = button;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8j0)) {
            return false;
        }
        w8j0 w8j0Var = (w8j0) obj;
        return this.a.equals(w8j0Var.a) && this.b.equals(w8j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
