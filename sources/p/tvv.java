package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tvv {
    public final Set a;
    public final int b;

    public tvv(int i, Set set) {
        this.a = set;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvv)) {
            return false;
        }
        tvv tvvVar = (tvv) obj;
        return u890.j(this.a, tvvVar.a) && this.b == tvvVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
