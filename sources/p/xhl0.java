package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xhl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ yhl0 c;

    public xhl0(yhl0 yhl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = yhl0Var;
                x6h1 x6h1VarC = yhl0Var.b.c();
                x6h1VarC.i.add(new a7h1("content_area", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = yhl0Var;
                x6h1 x6h1VarC2 = yhl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 3:
                this.c = yhl0Var;
                x6h1 x6h1VarC3 = yhl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            case 4:
                this.c = yhl0Var;
                x6h1 x6h1VarC4 = yhl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
                break;
            default:
                this.c = yhl0Var;
                x6h1 x6h1VarC5 = yhl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                this.b = x6h1VarC5.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        yhl0 yhl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = yhl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = yhl0Var.a;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = yhl0Var.a;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            case 3:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = yhl0Var.a;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
            default:
                r6h1 r6h1Var9 = r6h1.c;
                r6h1 r6h1Var10 = yhl0Var.a;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var10.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var10.b);
        }
    }
}
