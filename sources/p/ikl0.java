package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ikl0 implements t9h1, v8h1 {
    public static final u8h1 d = new u8h1(new v9r0("page-match/error"));
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public ikl0(int i) {
        String str;
        r6h1 r6h1Var = r6h1.c;
        this.a = new r6h1(new ArrayList(), d);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-page-match-error-page";
        x6h1VarI.f = "3.1.0";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "barcode_not_found";
        } else if (i == 2) {
            str = "no_match";
        } else if (i == 3) {
            str = "unavailable";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "unknown";
        }
        x6h1VarI.e = str;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("page-match/error");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }
}
