package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sjc extends t3k1 {
    public final String b;

    public sjc(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjc) && CappingKey.equals-impl0(this.b, ((sjc) obj).b);
    }

    public final int hashCode() {
        return CappingKey.hashCode-impl(this.b);
    }
}
