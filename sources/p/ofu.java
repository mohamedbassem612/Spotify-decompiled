package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ofu {
    public final String a;
    public final DismissReason b;

    public ofu(String str, DismissReason dismissReason) {
        this.a = str;
        this.b = dismissReason;
    }

    public final DismissReason a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofu)) {
            return false;
        }
        ofu ofuVar = (ofu) obj;
        return u890.j(this.a, ofuVar.a) && u890.j(this.b, ofuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
