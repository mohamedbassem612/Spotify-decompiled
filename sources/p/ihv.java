package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ihv {
    public final gvh0 a;
    public final List b;

    public ihv(gvh0 gvh0Var, List list) {
        this.a = gvh0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihv)) {
            return false;
        }
        ihv ihvVar = (ihv) obj;
        return u890.j(this.a, ihvVar.a) && u890.j(this.b, ihvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
