package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hkc extends ikc {
    public final pih1 b;
    public final DiscardReason c;

    public hkc(pih1 pih1Var, DiscardReason discardReason) {
        this.b = pih1Var;
        this.c = discardReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkc)) {
            return false;
        }
        hkc hkcVar = (hkc) obj;
        return u890.j(this.b, hkcVar.b) && u890.j(this.c, hkcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
