package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jvp0 {
    public final List a;
    public final List b;

    public jvp0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvp0)) {
            return false;
        }
        jvp0 jvp0Var = (jvp0) obj;
        return this.a.equals(jvp0Var.a) && u890.j(this.b, jvp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
