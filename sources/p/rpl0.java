package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpl0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a = 0;
    public final y6h1 b;
    public final /* synthetic */ yxk0 c;

    public rpl0(yxk0 yxk0Var) {
        this.c = yxk0Var;
        x6h1 x6h1VarC = yxk0Var.c.c();
        x6h1VarC.i.add(new a7h1("bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public final r6h1 b() {
        byte b = this.a;
        yxk0 yxk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = yxk0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = yxk0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        yxk0 yxk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = yxk0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = yxk0Var.d;
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = yxk0Var.b;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = yxk0Var.d;
                return k7h1Var2.a();
        }
    }

    public rpl0(yxk0 yxk0Var, Integer num) {
        this.c = yxk0Var;
        x6h1 x6h1VarC = yxk0Var.c.c();
        x6h1VarC.i.add(new a7h1("scrolling_view", (String) null, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
