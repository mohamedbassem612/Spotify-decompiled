package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kul0 implements t9h1, v8h1, p8h1 {
    public static final u8h1 d = new u8h1(new v9r0("upsell/reinventfree/time-cap-track-radio"));
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public kul0(String str) {
        r6h1 r6h1Var = r6h1.c;
        this.a = new r6h1(new ArrayList(), d);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-reinventfree-time-cap-track-radio-upsell";
        x6h1VarI.f = "3.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        this.b = x6h1VarI.a();
        this.c = Collections.singletonList("reinventfree-time-cap-pivot-track-radio-upsell");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.b;
        ((xjn) k7h1Var).b = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = this.c;
        return k7h1Var.a();
    }

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, this.a, System.currentTimeMillis());
    }
}
