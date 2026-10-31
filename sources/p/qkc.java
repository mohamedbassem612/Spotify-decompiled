package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qkc extends jlc {
    public final ApplicationState a;

    public qkc(ApplicationState applicationState) {
        this.a = applicationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkc) && this.a == ((qkc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
