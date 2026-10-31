package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wof0 implements xof0 {
    public final Set a;
    public final boolean b;

    public wof0(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wof0)) {
            return false;
        }
        wof0 wof0Var = (wof0) obj;
        return this.a.equals(wof0Var.a) && this.b == wof0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
