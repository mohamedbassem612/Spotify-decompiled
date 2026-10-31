package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azi0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bzi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azi0(bzi0 bzi0Var, byte b) {
        super(4);
        this.a = b;
        this.b = bzi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        bzi0 bzi0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new uvk0(bzi0Var.O0);
            default:
                zyi0 zyi0Var = (zyi0) obj2;
                nyi0 nyi0Var = (nyi0) obj4;
                qvk0 qvk0Var = new qvk0((uvk0) obj, zyi0Var.a);
                Object obj5 = null;
                if (nyi0Var.equals(eyi0.a)) {
                    for (Object obj6 : zyi0Var.i) {
                        if (u890.j(((gxz0) obj6).c.a, bzi0Var.Z)) {
                            obj5 = obj6;
                            gxz0 gxz0Var = (gxz0) obj5;
                            return gxz0Var == null ? qvk0Var.e() : qvk0Var.h(gxz0Var.b);
                        }
                    }
                    gxz0 gxz0Var2 = (gxz0) obj5;
                    if (gxz0Var2 == null) {
                    }
                }
                if (nyi0Var.equals(fyi0.a)) {
                    return qvk0Var.g();
                }
                if (nyi0Var.equals(iyi0.a)) {
                    return qvk0Var.i();
                }
                if (nyi0Var instanceof kyi0) {
                    String str = ((kyi0) nyi0Var).a;
                    x6h1 x6h1VarC = qvk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("hyperlink", (String) null, (Integer) null, str, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if ((nyi0Var instanceof jyi0) || (nyi0Var instanceof myi0) || (nyi0Var instanceof hyi0) || (nyi0Var instanceof gyi0) || (nyi0Var instanceof dyi0)) {
                    return null;
                }
                eg.o();
                return null;
        }
    }
}
