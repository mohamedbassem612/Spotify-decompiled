package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ah7 implements jn60, szg, h030, rfu {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final bh7 e;

    public ah7(String str, String str2, x360 x360Var, yz21 yz21Var, bh7 bh7Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = bh7Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.a);
    }

    @Override // p.rfu
    public final String c() {
        return this.e.a;
    }

    public final List d(op80 op80Var) {
        bh7 bh7Var = this.e;
        String str = bh7Var.b;
        String str2 = bh7Var.a;
        x360 x360Var = this.c;
        String str3 = this.a;
        String str4 = this.b;
        return Collections.singletonList(x360Var != null ? new hai0(str3, op80Var, new mey0(str3, str4, str, str2, x360Var, (String) null, (n1x) null, (String) null, (String) null, 480)) : new gai0(str3, op80Var, new mey0(str3, str4, str, str2, (x360) null, (String) null, (n1x) null, (String) null, (String) null, 480)));
    }

    public final String e() {
        return this.a;
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }
}
