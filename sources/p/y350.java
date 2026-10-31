package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y350 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ py9 c;

    public y350(py9 py9Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = py9Var;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("participant_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = py9Var;
                x6h1 x6h1VarC2 = py9Var.c.c();
                x6h1VarC2.i.add(new a7h1("host_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        py9 py9Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = py9Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = py9Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        py9 py9Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = py9Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = py9Var.b;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }
}
