package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n62 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o62 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n62(o62 o62Var, byte b) {
        super(1);
        this.a = b;
        this.b = o62Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        o62 o62Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = (r6h1) obj;
                String strPath = o62Var.e1.path();
                String str = o62Var.f1.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-view-ads";
                x6h1VarI.f = "9.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = strPath;
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                r6h1 r6h1Var3 = (r6h1) obj;
                String strPath2 = o62Var.e1.path();
                String str2 = o62Var.f1.a;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-now-playing-view-ads";
                x6h1VarI2.f = "9.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = strPath2;
                x6h1VarI2.d = str2;
                x6h1 x6h1VarC = x6h1VarI2.a().c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var3.a);
                arrayList2.add(y6h1VarA2);
                return new r6h1(arrayList2, r6h1Var3.b);
            default:
                r6h1 r6h1Var5 = (r6h1) obj;
                String strPath3 = o62Var.e1.path();
                String str3 = o62Var.f1.a;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-now-playing-view-ads";
                x6h1VarI3.f = "9.1.0";
                x6h1VarI3.g = "22.0.0";
                x6h1VarI3.b = strPath3;
                x6h1VarI3.d = str3;
                x6h1 x6h1VarC2 = x6h1VarI3.a().c();
                x6h1VarC2.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA3 = x6h1VarC2.a();
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var5.a);
                arrayList3.add(y6h1VarA3);
                return new r6h1(arrayList3, r6h1Var5.b);
        }
    }
}
