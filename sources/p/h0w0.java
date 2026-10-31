package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h0w0 extends cxm {
    public final String d;
    public final PlayabilityRestriction e;

    public h0w0(String str, PlayabilityRestriction playabilityRestriction) {
        this.d = str;
        this.e = playabilityRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0w0)) {
            return false;
        }
        h0w0 h0w0Var = (h0w0) obj;
        return u890.j(this.d, h0w0Var.d) && this.e == h0w0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
