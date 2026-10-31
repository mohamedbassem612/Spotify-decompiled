package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c6l1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ d6l1 b;
    public final /* synthetic */ y570 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6l1(y570 y570Var, d6l1 d6l1Var) {
        super(1);
        this.c = y570Var;
        this.b = d6l1Var;
    }

    public final Object invoke(Object obj) {
        String strB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y570 y570Var = this.c;
        d6l1 d6l1Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (y570Var.s().size() > iIntValue) {
                    d6l1Var.b.v((y570) y570Var.s().get(iIntValue));
                }
                break;
            default:
                g23 g23Var = d6l1Var.c;
                y570 y570Var2 = (y570) y570Var.s().get(((r7l1) obj).a);
                g23Var.getClass();
                sc70 sc70Var = (j570) y570Var2.j().get("click");
                if (sc70Var != null && (strB = sc70Var.b.c.B("uri")) != null) {
                    ((lzn0) g23Var.b).a(strB, ((i8h1) g23Var.d).m(((hl00) g23Var.c).h(new u570("click", y570Var2, gg11.g)).s((String) o7h.q0(ihc1.Q0(strB, new String[]{"?"}, 0, 6))), (xj61) null), (Bundle) null);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6l1(d6l1 d6l1Var, y570 y570Var) {
        super(1);
        this.b = d6l1Var;
        this.c = y570Var;
    }
}
