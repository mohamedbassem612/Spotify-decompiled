package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ymx0 implements jn60, szg, rfu, miv0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final epx0 e;

    public ymx0(String str, String str2, x360 x360Var, yz21 yz21Var, epx0 epx0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = epx0Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.c);
    }

    public final Set b() {
        String str = this.e.b;
        if (!bbp1.k(str)) {
            str = null;
        }
        return str != null ? Collections.singleton(str) : w7x.a;
    }

    @Override // p.rfu
    public final String c() {
        return this.e.c;
    }

    public final List d(op80 op80Var) {
        epx0 epx0Var = this.e;
        return Collections.singletonList(new omx0(this.a, op80Var, new tmx0(this.c, this.b, epx0Var.b, zgo1.u(epx0Var.d), epx0Var.e, false)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymx0)) {
            return false;
        }
        ymx0 ymx0Var = (ymx0) obj;
        return this.a.equals(ymx0Var.a) && this.b.equals(ymx0Var.b) && u890.j(this.c, ymx0Var.c) && this.d.equals(ymx0Var.d) && this.e.equals(ymx0Var.e);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
