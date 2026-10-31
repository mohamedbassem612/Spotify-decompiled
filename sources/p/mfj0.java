package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mfj0 extends ofj0 {
    public final Button a;

    public mfj0(Button button) {
        this.a = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfj0) && u890.j(this.a, ((mfj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
