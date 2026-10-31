package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxk0 implements t9h1, v8h1, p8h1 {
    public static final u8h1 e = new u8h1(new v9r0("connect/context-menu"));
    public static final u8h1 f = new u8h1(new v9r0("premium/destination"));
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;
    public final List d;

    public yxk0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                r6h1 r6h1Var = r6h1.c;
                this.b = new r6h1(new ArrayList(), f);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-premium-destination";
                x6h1VarI.f = "2.2.0";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                this.d = Collections.singletonList("premium-destination");
                break;
            default:
                r6h1 r6h1Var2 = r6h1.c;
                this.b = new r6h1(new ArrayList(), e);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-connect-context-menu";
                x6h1VarI2.f = "2.2.0";
                x6h1VarI2.g = "22.0.0";
                this.c = x6h1VarI2.a();
                this.d = Collections.singletonList("connect/contextmenu");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        List list = this.d;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = list;
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = r6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = list;
                return k7h1Var2.a();
        }
    }
}
