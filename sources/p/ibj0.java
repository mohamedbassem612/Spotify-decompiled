package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ibj0 extends kbj0 {
    public final Button a;

    public ibj0(Button button) {
        this.a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibj0) && u890.j(this.a, ((ibj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
