package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dox0 implements s7c, sfu {
    public final String a;
    public final String b;
    public final x360 c;
    public final hpx0 d;

    public dox0(String str, String str2, x360 x360Var, hpx0 hpx0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = hpx0Var;
    }

    @Override // p.sfu
    public final String c() {
        return this.d.b;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        hpx0 hpx0Var = this.d;
        return Collections.singletonList(new unx0(this.a, k3h1Var, new xnx0(this.b, hpx0Var.a, this.c, fho1.v(hpx0Var.c))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dox0)) {
            return false;
        }
        dox0 dox0Var = (dox0) obj;
        return this.a.equals(dox0Var.a) && this.b.equals(dox0Var.b) && u890.j(this.c, dox0Var.c) && this.d.equals(dox0Var.d);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.d.hashCode() + ((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
