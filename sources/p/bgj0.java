package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bgj0 extends hgj0 {
    public final Button a;
    public final MessageResponseToken b;
    public final Bundle c;
    public final DismissType d;

    public bgj0(Bundle bundle, DismissType dismissType, MessageResponseToken messageResponseToken, Button button) {
        this.a = button;
        this.b = messageResponseToken;
        this.c = bundle;
        this.d = dismissType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgj0)) {
            return false;
        }
        bgj0 bgj0Var = (bgj0) obj;
        return this.a.equals(bgj0Var.a) && u890.j(this.b, bgj0Var.b) && this.c.equals(bgj0Var.c) && u890.j(this.d, bgj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
