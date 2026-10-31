package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gao0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hao0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gao0(hao0 hao0Var, byte b) {
        super(4);
        this.a = b;
        this.b = hao0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        hao0 hao0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                i3o1 i3o1Var = hao0Var.c;
                if (i3o1Var instanceof fao0) {
                    return (fwk0) hao0Var.e.getValue();
                }
                if (!(i3o1Var instanceof eao0)) {
                    eg.o();
                    return null;
                }
                int iC = l1d.C(((eao0) i3o1Var).c);
                if (iC == 0) {
                    return (xvk0) hao0Var.g.getValue();
                }
                if (iC == 1) {
                    return (ewk0) hao0Var.f.getValue();
                }
                eg.o();
                return null;
            default:
                Set set = s4b1.f;
                String strF = pcf.f(uic.C(hao0Var.a, (String) null));
                i3o1 i3o1Var2 = hao0Var.c;
                boolean z = i3o1Var2 instanceof fao0;
                b7x b7xVar = b7x.a;
                if (z) {
                    fwk0 fwk0Var = (fwk0) hao0Var.e.getValue();
                    fwk0Var.getClass();
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), fwk0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(i3o1Var2 instanceof eao0)) {
                        eg.o();
                        return null;
                    }
                    int iC2 = l1d.C(((eao0) i3o1Var2).c);
                    if (iC2 == 0) {
                        xvk0 xvk0Var = (xvk0) hao0Var.g.getValue();
                        xvk0Var.getClass();
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), xvk0Var.a, r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        ewk0 ewk0Var = (ewk0) hao0Var.f.getValue();
                        ewk0Var.getClass();
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), ewk0Var.a, r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
        }
    }
}
