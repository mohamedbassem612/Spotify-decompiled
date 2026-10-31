package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8j0 extends n8j0 {
    public final Button a;

    public h8j0(Button button) {
        this.a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8j0) && u890.j(this.a, ((h8j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
