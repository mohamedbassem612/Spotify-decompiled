package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tik0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wik0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tik0(wik0 wik0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wik0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public final Object invoke(Object obj) {
        Object u3k0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wik0 wik0Var = this.b;
        switch (b) {
            case 0:
                llk0 llk0Var = (llk0) obj;
                r7j0 r7j0Var = wik0Var.h;
                if (llk0Var.equals(jlk0.a)) {
                    u3k0Var = g3k0.a;
                } else {
                    if (!llk0Var.equals(klk0.a)) {
                        eg.o();
                        return null;
                    }
                    cbk0 cbk0Var = wik0Var.c;
                    String str = cbk0Var.a;
                    String str2 = cbk0Var.b.b;
                    bt31 bt31Var = cbk0Var.c;
                    u3k0Var = new u3k0(str, str2, bt31Var.a, bt31Var.b);
                }
                r7j0Var.invoke(u3k0Var);
                return rih1Var;
            default:
                qib0 qib0Var = (qib0) obj;
                String str3 = qib0Var.b;
                bt31 bt31Var2 = wik0Var.c.c;
                String str4 = bt31Var2.a;
                String str5 = bt31Var2.b;
                String str6 = qib0Var.a;
                if (u890.j(str6, str4)) {
                    String str7 = str3 == null ? "" : str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!str7.equals(str5)) {
                        wik0Var.h.invoke(new x3k0(str6, str3, qib0Var.c, qib0Var.d));
                    }
                } else {
                    wik0Var.h.invoke(new x3k0(str6, str3, qib0Var.c, qib0Var.d));
                }
                return rih1Var;
        }
    }
}
