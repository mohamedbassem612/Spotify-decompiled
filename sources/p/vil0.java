package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vil0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public vil0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-nowplaying-seek-forward-button";
        x6h1VarI.f = "2.0.0";
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

    public final w7h1 e(Integer num) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var = new mmr0("ms_seeked_offset", strValueOf);
        String strValueOf2 = String.valueOf(num.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, this.a, System.currentTimeMillis());
    }
}
