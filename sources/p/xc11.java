package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xc11 implements jn60, rfu {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final ad11 e;

    public xc11(String str, String str2, x360 x360Var, yz21 yz21Var, ad11 ad11Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = ad11Var;
    }

    @Override // p.rfu
    public final String c() {
        return this.a;
    }

    public final List d(op80 op80Var) {
        String str = this.e.a;
        String str2 = this.a;
        return Collections.singletonList(new wc11(str2, op80Var, new cd11(str2, this.b, str), this.c));
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }
}
