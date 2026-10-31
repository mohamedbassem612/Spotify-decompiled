package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class odl0 implements w6h1 {
    public final r6h1 a;
    public final y6h1 b;

    public odl0(Integer num, String str, r6h1 r6h1Var) {
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-liveevents-multievent-concert-card";
        x6h1VarI.f = "2.0.1";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = num;
        x6h1VarI.d = str;
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
}
