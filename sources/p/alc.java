package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class alc extends jlc {
    public final String a;
    public final DismissReason b;

    public alc(String str, DismissReason dismissReason) {
        this.a = str;
        this.b = dismissReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alc)) {
            return false;
        }
        alc alcVar = (alc) obj;
        return u890.j(this.a, alcVar.a) && u890.j(this.b, alcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
