package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vql0 implements w6h1, o8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public vql0(int i, Integer num, String str, r6h1 r6h1Var) {
        String str2;
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-promotion-card";
        x6h1VarI.f = "3.1.0";
        x6h1VarI.g = "22.0.0";
        switch (i) {
            case 1:
                str2 = "playable_cache";
                break;
            case 2:
                str2 = "promo_v1";
                break;
            case 3:
                str2 = "promo_v3";
                break;
            case 4:
                str2 = "showcase";
                break;
            case 5:
                str2 = "showcase_visuals";
                break;
            case 6:
                str2 = "spotlight";
                break;
            default:
                throw null;
        }
        x6h1VarI.b = str2;
        x6h1VarI.c = num;
        x6h1VarI.d = str;
        this.b = x6h1VarI.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, this.a, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final k6h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.b;
        ((xjn) k7h1Var).b = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return new k6h1(k7h1Var.a());
    }

    public final w7h1 g() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, this.a, System.currentTimeMillis());
    }
}
