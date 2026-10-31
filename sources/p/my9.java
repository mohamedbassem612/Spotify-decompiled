package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class my9 implements byf0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ my9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                yfg yfgVar = (yfg) obj;
                fn31.T(yfgVar.b, (o8n) null, 0, new awe(yfgVar, null, (byte) 8), 3);
                break;
            case 2:
                ((l9i1) obj).a();
                break;
            default:
                p2j1 p2j1Var = (p2j1) obj;
                xab1 xab1Var = (xab1) p2j1Var.j;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                p2j1Var.j = l4p1.u((llm) p2j1Var.i, new lt20(o4p1.r(new fu20(o4p1.r(hu20.e(rqt0.u(((ov20) p2j1Var.b).a("family-qrcode-verification-requested-by-subaccount", false)), new afb1((lnm) null, p2j1Var, (byte) 11)), (q8n) p2j1Var.g), new k6g1(p2j1Var, (lnm) null, (byte) 22), (byte) 1), (q8n) p2j1Var.f), new bi61(3, null, (byte) 4), (byte) 0));
                break;
        }
    }

    public final void d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
                break;
            case 2:
                l9i1 l9i1Var = (l9i1) obj;
                wh41 wh41Var = l9i1Var.a;
                faa0 faa0Var = l9i1Var.j;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                l9i1Var.j = null;
                l9i1Var.l = null;
                wh41Var.l();
                wh41Var.n();
                break;
            default:
                p2j1 p2j1Var = (p2j1) obj;
                xab1 xab1Var = (xab1) p2j1Var.j;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                p2j1Var.j = null;
                break;
        }
    }

    public final void g(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                ((ly9) this.b).b();
                break;
        }
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void a(ViewGroup viewGroup) {
    }

    private final void b(ViewGroup viewGroup) {
    }

    private final void e(ViewGroup viewGroup) {
    }
}
