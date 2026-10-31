package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class shl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ thl0 c;

    public shl0(thl0 thl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = thl0Var;
                x6h1 x6h1VarC = thl0Var.b.c();
                x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = thl0Var;
                x6h1 x6h1VarC2 = thl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 3:
                this.c = thl0Var;
                x6h1 x6h1VarC3 = thl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            default:
                this.c = thl0Var;
                x6h1 x6h1VarC4 = thl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("footer_unit", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        thl0 thl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = thl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = thl0Var.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = thl0Var.a;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            default:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = thl0Var.a;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
        }
    }
}
