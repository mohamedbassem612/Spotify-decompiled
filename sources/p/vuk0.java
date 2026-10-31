package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vuk0 implements n8h1 {
    public final y6h1 a;

    public vuk0(wuk0 wuk0Var) {
        x6h1 x6h1VarC = wuk0Var.a.c();
        x6h1VarC.i.add(new a7h1("search_text", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = r6h1.c;
        ArrayList arrayList = new ArrayList();
        return c13.m(arrayList, z6x.a, this.a, arrayList, (u8h1) null);
    }
}
