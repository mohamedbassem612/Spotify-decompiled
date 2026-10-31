package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class htl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ ntl0 c;

    public htl0(ntl0 ntl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = ntl0Var;
                x6h1 x6h1VarC = ntl0Var.a.c();
                x6h1VarC.i.add(new a7h1("header_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = ntl0Var;
                x6h1 x6h1VarC2 = ntl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("footer_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        ntl0 ntl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ntl0Var.b.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = ntl0Var.b.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }
}
