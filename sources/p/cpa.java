package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cpa implements byf0 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public cpa(lzn0 lzn0Var, dpa dpaVar, q8n q8nVar) {
        this.b = lzn0Var;
        this.c = dpaVar;
        this.d = smo1.e(flo1.l(q8nVar, guo1.B()).y(new z8n("BetamaxSunsetDeferredUi")));
    }

    public final void c() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                this.e = fn31.T((llm) obj, (o8n) null, 0, new vk6(this, (lnm) null, (byte) 9), 3);
                break;
            case 1:
                if (((jo20) this.e).isEnabled()) {
                    ((yzs) ((ynb0) this.c).get()).a((bbr0) obj, (gj5) this.b, a8l.b);
                    break;
                }
                break;
            default:
                this.e = fn31.T((llm) obj, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 8), 3);
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = (xab1) this.e;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 1:
                if (((jo20) this.e).isEnabled()) {
                    ((yzs) ((ynb0) this.c).get()).b(a8l.b);
                    break;
                }
                break;
            default:
                xab1 xab1Var2 = (xab1) this.e;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
        }
    }

    public final void g(ViewGroup viewGroup) {
        byte b = this.a;
    }

    private final void a(ViewGroup viewGroup) {
    }

    private final void b(ViewGroup viewGroup) {
    }

    private final void e(ViewGroup viewGroup) {
    }

    public cpa(gj5 gj5Var, ynb0 ynb0Var, bbr0 bbr0Var, jo20 jo20Var) {
        this.b = gj5Var;
        this.c = ynb0Var;
        this.d = bbr0Var;
        this.e = jo20Var;
    }

    public cpa(lzn0 lzn0Var, caq caqVar, q8n q8nVar) {
        this.b = lzn0Var;
        this.c = caqVar;
        this.d = smo1.e(flo1.l(q8nVar, guo1.B()).y(new z8n("PlayerSunsetErrorObserver")));
    }
}
