package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sul0 implements n8h1 {
    public final y6h1 a;

    public sul0(qgl0 qgl0Var, Integer num) {
        x6h1 x6h1VarC = qgl0Var.b.c();
        x6h1VarC.i.add(new a7h1("device_row", (String) null, num, (String) null, (String) null));
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
