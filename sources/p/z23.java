package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z23 implements d33 {
    public final String a;
    public final List b;

    public z23(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z23)) {
            return false;
        }
        z23 z23Var = (z23) obj;
        return this.a.equals(z23Var.a) && u890.j(this.b, z23Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
