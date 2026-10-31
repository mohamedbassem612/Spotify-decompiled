package p;

import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bja1 {
    public final YourLibraryConfig.YourLibrarySortOrder a;
    public final ywm1 b;

    public bja1(YourLibraryConfig.YourLibrarySortOrder yourLibrarySortOrder, ywm1 ywm1Var) {
        this.a = yourLibrarySortOrder;
        this.b = ywm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bja1)) {
            return false;
        }
        bja1 bja1Var = (bja1) obj;
        return this.a.equals(bja1Var.a) && this.b == bja1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
