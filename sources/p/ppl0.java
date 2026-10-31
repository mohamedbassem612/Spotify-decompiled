package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ppl0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public ppl0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-pre-save-button";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
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

    public final w7h1 e(String str, String str2, String str3) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("prerelease_id", str);
        if (str2 == null) {
            str2 = "";
        }
        mmr0 mmr0Var2 = new mmr0("item_to_be_presaved", str2);
        if (str3 == null) {
            str3 = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("presave", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("context_uri", str3)})), this.b, this.a, System.currentTimeMillis());
    }

    public final w7h1 h(String str, String str2, String str3) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("prerelease_id", str);
        if (str2 == null) {
            str2 = "";
        }
        mmr0 mmr0Var2 = new mmr0("item_to_be_removed_from_presaved", str2);
        if (str3 == null) {
            str3 = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_presave", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("context_uri", str3)})), this.b, this.a, System.currentTimeMillis());
    }
}
