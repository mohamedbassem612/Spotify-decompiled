package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CarConnectionState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tkc extends jlc {
    public final CarConnectionState a;

    public tkc(CarConnectionState carConnectionState) {
        this.a = carConnectionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkc) && this.a == ((tkc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
