package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v4n0 implements jn60, szg, rfu, h030 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final w4n0 e;

    public v4n0(String str, String str2, x360 x360Var, yz21 yz21Var, w4n0 w4n0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = w4n0Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.a);
    }

    @Override // p.rfu
    public final String c() {
        return this.e.a;
    }

    public final List d(op80 op80Var) {
        w4n0 w4n0Var = this.e;
        String str = w4n0Var.a;
        h290 h290Var = w4n0Var.b;
        x360 x360Var = this.c;
        String str2 = this.a;
        String str3 = this.b;
        return Collections.singletonList(x360Var != null ? new cei0(str2, op80Var, new mey0(str2, str3, (String) o7h.q0(h290Var), str, x360Var, (String) null, (n1x) null, (String) null, (String) null, 480)) : new bei0(str2, op80Var, new mey0(str2, str3, (String) o7h.q0(h290Var), str, x360Var, (String) null, (n1x) null, (String) null, (String) null, 480)));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4n0)) {
            return false;
        }
        v4n0 v4n0Var = (v4n0) obj;
        return this.a.equals(v4n0Var.a) && this.b.equals(v4n0Var.b) && u890.j(this.c, v4n0Var.c) && this.d.equals(v4n0Var.d) && this.e.equals(v4n0Var.e);
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
