package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vz81 {
    public final List a;
    public final List b;
    public final List c;
    public final Map d;

    public vz81(List list, List list2, List list3, Map map) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz81)) {
            return false;
        }
        vz81 vz81Var = (vz81) obj;
        return this.a.equals(vz81Var.a) && u890.j(this.b, vz81Var.b) && u890.j(this.c, vz81Var.c) && this.d.equals(vz81Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
