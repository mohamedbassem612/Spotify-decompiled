package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pil0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public pil0(r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-nowplaying-progress-bar";
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

    public final w7h1 e(Integer num, Integer num2) {
        z7h1 z7h1Var = new z7h1("drag", 1, b7x.a);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var = new mmr0("ms_to_seek_to", strValueOf);
        String strValueOf2 = String.valueOf(num2.intValue());
        return new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), this.b, this.a, System.currentTimeMillis());
    }
}
