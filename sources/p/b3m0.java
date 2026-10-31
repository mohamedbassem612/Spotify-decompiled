package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b3m0 implements w6h1, p8h1 {
    public final y6h1 a;
    public final List b;

    public b3m0(int i) {
        String str;
        r6h1 r6h1Var = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-version-sunsetting-dialog";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "version_expired";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "version_expiring";
        }
        x6h1VarI.e = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("versionsunsetting/dialog");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = r6h1.c;
        ArrayList arrayList = new ArrayList();
        return c13.m(arrayList, z6x.a, this.a, arrayList, (u8h1) null);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = this.b;
        return k7h1Var.a();
    }
}
