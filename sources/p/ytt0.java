package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ytt0 {
    public final PlayabilityRestriction a;
    public final String b;
    public final String c;

    public ytt0(PlayabilityRestriction playabilityRestriction, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.a = playabilityRestriction;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytt0)) {
            return false;
        }
        ytt0 ytt0Var = (ytt0) obj;
        return this.a == ytt0Var.a && u890.j(this.b, ytt0Var.b) && u890.j(this.c, ytt0Var.c);
    }

    public final int hashCode() {
        PlayabilityRestriction playabilityRestriction = this.a;
        int iHashCode = (playabilityRestriction == null ? 0 : playabilityRestriction.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
