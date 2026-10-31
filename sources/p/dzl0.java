package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dzl0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public dzl0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-shuffle-button";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
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

    public final w7h1 e(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "linear";
        if (i == 1) {
            obj = "linear";
        } else if (i == 2) {
            obj = "shuffle";
        } else {
            if (i != 3) {
                throw null;
            }
            obj = "smart_shuffle";
        }
        mmr0 mmr0Var = new mmr0("previous_mode", obj);
        if (i2 != 1) {
            if (i2 == 2) {
                str = "shuffle";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str = "smart_shuffle";
            }
        }
        return new w7h1("", "", z7h1Var, new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("selected_mode", str)})), this.b, this.a, System.currentTimeMillis());
    }
}
