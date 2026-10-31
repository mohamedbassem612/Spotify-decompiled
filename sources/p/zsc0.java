package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zsc0 extends htc0 {
    public final List a;
    public final List b;

    public zsc0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsc0)) {
            return false;
        }
        zsc0 zsc0Var = (zsc0) obj;
        return u890.j(this.a, zsc0Var.a) && u890.j(this.b, zsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
