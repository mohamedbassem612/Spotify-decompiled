package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gof0 {
    public final String a;
    public final List b;

    public gof0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gof0)) {
            return false;
        }
        gof0 gof0Var = (gof0) obj;
        return u890.j(this.a, gof0Var.a) && u890.j(this.b, gof0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
