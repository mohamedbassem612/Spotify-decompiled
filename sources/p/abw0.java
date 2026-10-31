package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class abw0 implements jn60, szg, rfu, h030, i631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final lbw0 e;

    public abw0(String str, String str2, x360 x360Var, yz21 yz21Var, lbw0 lbw0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = lbw0Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.a);
    }

    public final Set b() {
        return Collections.singleton(this.e.a);
    }

    @Override // p.rfu
    public final String c() {
        return this.e.a;
    }

    public final List d(op80 op80Var) {
        lbw0 lbw0Var = this.e;
        String str = lbw0Var.b;
        String str2 = lbw0Var.a;
        x360 x360Var = this.c;
        String str3 = this.a;
        String str4 = this.b;
        return Collections.singletonList(x360Var != null ? new sei0(new mey0(str3, str4, str2, str, x360Var, (String) null, (n1x) null, (String) null, (String) null, 480), str3, op80Var, x360Var) : new rei0(str3, op80Var, new mey0(str3, str4, str2, str, (x360) null, (String) null, (n1x) null, (String) null, (String) null, 496)));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abw0)) {
            return false;
        }
        abw0 abw0Var = (abw0) obj;
        return this.a.equals(abw0Var.a) && this.b.equals(abw0Var.b) && u890.j(this.c, abw0Var.c) && this.d.equals(abw0Var.d) && this.e.equals(abw0Var.e);
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
