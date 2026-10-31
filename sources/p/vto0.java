package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vto0 extends omo1 {
    public final ujo0 c;
    public final String d;
    public final List e;
    public final cvy0 f;

    public vto0(ujo0 ujo0Var, String str, List list, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = str;
        this.e = list;
        this.f = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vto0)) {
            return false;
        }
        vto0 vto0Var = (vto0) obj;
        return this.c.equals(vto0Var.c) && u890.j(this.d, vto0Var.d) && this.e.equals(vto0Var.e) && this.f.equals(vto0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return this.f.hashCode() + f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final cvy0 o() {
        return this.f;
    }
}
