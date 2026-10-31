package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jvc0 {
    public final i4d0 a;
    public final List b;

    public jvc0(i4d0 i4d0Var, List list) {
        this.a = i4d0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvc0)) {
            return false;
        }
        jvc0 jvc0Var = (jvc0) obj;
        return this.a.equals(jvc0Var.a) && this.b.equals(jvc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
