package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cox0 implements jn60, rfu {
    public final String a;
    public final String b;
    public final yz21 c;
    public final gpx0 d;

    public cox0(String str, String str2, yz21 yz21Var, gpx0 gpx0Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = gpx0Var;
    }

    @Override // p.rfu
    public final String c() {
        return this.d.c;
    }

    public final List d(op80 op80Var) {
        gpx0 gpx0Var = this.d;
        return Collections.singletonList(new tnx0(this.a, op80Var, new xnx0(this.b, gpx0Var.b, null, zgo1.u(gpx0Var.d))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cox0)) {
            return false;
        }
        cox0 cox0Var = (cox0) obj;
        return this.a.equals(cox0Var.a) && this.b.equals(cox0Var.b) && this.c.equals(cox0Var.c) && this.d.equals(cox0Var.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
