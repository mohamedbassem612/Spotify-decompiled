package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wty0 extends xty0 {
    public final List a;
    public final boolean b;

    public wty0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wty0)) {
            return false;
        }
        wty0 wty0Var = (wty0) obj;
        return u890.j(this.a, wty0Var.a) && this.b == wty0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
