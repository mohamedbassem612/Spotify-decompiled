package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h6m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ l6m0 b;

    public h6m0(l6m0 l6m0Var, int i) {
        String str;
        this.b = l6m0Var;
        x6h1 x6h1VarC = l6m0Var.b.c();
        if (i == 1) {
            str = "artist_mixes";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "tracks";
        }
        x6h1VarC.i.add(new a7h1("recommendations_carousel", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        l6m0 l6m0Var = this.b;
        ((xjn) k7h1Var).b = l6m0Var.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = l6m0Var.c;
        return k7h1Var.a();
    }
}
