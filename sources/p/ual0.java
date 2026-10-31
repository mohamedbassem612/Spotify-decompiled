package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ual0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ tal0 c;

    public ual0(tal0 tal0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = tal0Var;
                x6h1 x6h1VarC = tal0Var.b.c();
                x6h1VarC.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = tal0Var;
                x6h1 x6h1VarC2 = tal0Var.b.c();
                x6h1VarC2.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        tal0 tal0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = tal0Var.c.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = tal0Var.c.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }

    public final w7h1 e() {
        byte b = this.a;
        tal0 tal0Var = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, tal0Var.c.a, System.currentTimeMillis());
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), this.b, tal0Var.c.a, System.currentTimeMillis());
        }
    }
}
