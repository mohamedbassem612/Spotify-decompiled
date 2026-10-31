package p;

import com.spotify.cosmos.util.proto.PlayabilityRestriction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mhw0 {
    public final String a;
    public final String b;
    public final int c;
    public final lhw0 d;
    public final khw0 e;
    public final PlayabilityRestriction f;

    public mhw0(String str, String str2, int i, lhw0 lhw0Var, khw0 khw0Var, PlayabilityRestriction playabilityRestriction) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = lhw0Var;
        this.e = khw0Var;
        this.f = playabilityRestriction;
    }

    public static mhw0 a(mhw0 mhw0Var, String str, String str2, lhw0 lhw0Var, khw0 khw0Var, PlayabilityRestriction playabilityRestriction, int i) {
        if ((i & 1) != 0) {
            str = mhw0Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = mhw0Var.b;
        }
        String str4 = str2;
        int i2 = (i & 4) != 0 ? mhw0Var.c : 1;
        if ((i & 8) != 0) {
            lhw0Var = mhw0Var.d;
        }
        lhw0 lhw0Var2 = lhw0Var;
        if ((i & 16) != 0) {
            khw0Var = mhw0Var.e;
        }
        khw0 khw0Var2 = khw0Var;
        if ((i & 32) != 0) {
            playabilityRestriction = mhw0Var.f;
        }
        mhw0Var.getClass();
        return new mhw0(str3, str4, i2, lhw0Var2, khw0Var2, playabilityRestriction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhw0)) {
            return false;
        }
        mhw0 mhw0Var = (mhw0) obj;
        return this.a.equals(mhw0Var.a) && this.b.equals(mhw0Var.b) && this.c == mhw0Var.c && this.d.equals(mhw0Var.d) && u890.j(this.e, mhw0Var.e) && this.f == mhw0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31);
    }
}
