package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eqk0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public eqk0(int i) {
        String str;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-age-assurance-blocking-page";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "pending_disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "reactivated";
        }
        x6h1VarI.e = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("age-assurance/underage/blocking");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
