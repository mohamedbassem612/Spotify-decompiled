package p;

import android.animation.ObjectAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a0c extends w3x {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0c(Object obj, Object obj2, byte b) {
        super(true);
        this.d = b;
        this.e = obj;
        this.f = obj2;
    }

    public final void c() {
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                d0c d0cVar = (d0c) obj2;
                d0cVar.e.a(vzb.a);
                fn31.T(cto1.q(((cir0) obj).e()), d0cVar.c, 0, new hzb(d0cVar, null, (byte) 1), 2);
                break;
            case 1:
                j9s j9sVar = (j9s) obj2;
                if (!j9sVar.b().b.canGoBack()) {
                    ((iu30) obj).invoke(ahj0.a);
                } else {
                    j9sVar.b().b.goBack();
                }
                break;
            case 2:
                byg0 byg0Var = (byg0) obj2;
                cyg0 cyg0Var = byg0Var.d;
                iug0 iug0Var = byg0Var.b;
                cyg0Var.b(iug0Var.a, false);
                ao0.c(byg0Var.c, co0.g, iug0Var.a, (Long) null, (String) null, (String) null, (String) null, (String) null, 124);
                dg30 dg30Var = (dg30) obj;
                tr0 tr0Var = new tr0(byg0Var, dg30Var, (byte) 1);
                h72 h72Var = byg0Var.n;
                if (h72Var == null) {
                    tr0Var.invoke();
                } else {
                    h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.c, (ObjectAnimator) h72Var.e, (ObjectAnimator) h72Var.i, (ObjectAnimator) h72Var.g, (ObjectAnimator) h72Var.X}), new lwg0(tr0Var, dg30Var, (byte) 1), hlv.a, 300L);
                }
                break;
            case 3:
                t01 t01Var = (t01) ((fsl) obj2).d;
                n830 n830Var = (n830) obj;
                ((t8r0) t01Var.d).l(n830Var.b);
                ((lzn0) ((fsl) n830Var.i).g).e();
                break;
            default:
                ib51 ib51Var = ((c751) obj2).i.a;
                ib51Var.a = null;
                ib51Var.b = null;
                d(false);
                ((i751) obj).a(uc51.b);
                break;
        }
    }
}
