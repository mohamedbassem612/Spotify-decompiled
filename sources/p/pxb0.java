package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pxb0 implements qxb0 {
    public final List a;
    public final String b;

    public pxb0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxb0)) {
            return false;
        }
        pxb0 pxb0Var = (pxb0) obj;
        return this.a.equals(pxb0Var.a) && u890.j(this.b, pxb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
