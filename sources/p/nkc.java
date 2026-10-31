package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nkc extends t3k1 {
    public final String b;
    public final CappingState c;

    public nkc(String str, CappingState cappingState) {
        this.b = str;
        this.c = cappingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkc)) {
            return false;
        }
        nkc nkcVar = (nkc) obj;
        return CappingKey.equals-impl0(this.b, nkcVar.b) && u890.j(this.c, nkcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (CappingKey.hashCode-impl(this.b) * 31);
    }
}
