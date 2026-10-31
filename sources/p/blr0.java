package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class blr0 {
    public final List a;
    public final String b;

    public blr0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blr0)) {
            return false;
        }
        blr0 blr0Var = (blr0) obj;
        return u890.j(this.a, blr0Var.a) && this.b.equals(blr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
