package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wqm0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqm0(yqm0 yqm0Var, byte b) {
        super(4);
        this.a = b;
        this.b = yqm0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        yqm0 yqm0Var = this.b;
        switch (b) {
            case 0:
                tqm0 tqm0Var = (tqm0) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str = tqm0Var.c;
                if (str == null) {
                    return new odl0(Integer.valueOf(iIntValue), yqm0Var.f(), r6h1Var);
                }
                Integer num = tqm0Var.d;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-shelf-section";
                x6h1VarI.f = "6.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.c = num;
                x6h1VarI.e = null;
                y6h1 y6h1VarA = x6h1VarI.a();
                Integer num2 = tqm0Var.e;
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new odl0(num2, yqm0Var.f(), new r6h1(arrayList, r6h1Var.b));
            default:
                odl0 odl0Var = (odl0) obj;
                if (((sqm0) obj4) == sqm0.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yqm0Var.f())), odl0Var.b, odl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
        }
    }
}
