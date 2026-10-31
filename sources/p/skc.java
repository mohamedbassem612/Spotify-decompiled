package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class skc extends jlc {
    public final CacheState a;

    public skc(CacheState cacheState) {
        this.a = cacheState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skc) && this.a == ((skc) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
