package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vxb0 {
    public final String a;
    public final List b;

    public vxb0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxb0)) {
            return false;
        }
        vxb0 vxb0Var = (vxb0) obj;
        return u890.j(this.a, vxb0Var.a) && this.b.equals(vxb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
