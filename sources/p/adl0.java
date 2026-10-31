package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class adl0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a = 1;
    public final y6h1 b;
    public final /* synthetic */ bdl0 c;

    public adl0(bdl0 bdl0Var, Integer num, String str) {
        this.c = bdl0Var;
        x6h1 x6h1VarC = bdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("nominee_row", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public final r6h1 b() {
        byte b = this.a;
        bdl0 bdl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = bdl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = bdl0Var.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        bdl0 bdl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = bdl0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = bdl0Var.a;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }

    public adl0(bdl0 bdl0Var) {
        this.c = bdl0Var;
        x6h1 x6h1VarC = bdl0Var.b.c();
        x6h1VarC.i.add(new a7h1("upsell_button", (String) null, (Integer) null, "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
