package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a4l0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public a4l0(int i, Integer num, r6h1 r6h1Var) {
        String str;
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-creator-badge";
        x6h1VarI.f = "0.0.1";
        x6h1VarI.g = "22.0.0";
        if (i == 1) {
            str = "ai_persona";
        } else if (i == 2) {
            str = "ai_persona_likely";
        } else if (i == 3) {
            str = "fresh_finds_forward";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "verified";
        }
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        this.b = x6h1VarI.a();
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
        return k7h1Var.a();
    }
}
