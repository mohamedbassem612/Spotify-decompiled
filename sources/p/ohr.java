package p;

import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ohr implements byf0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public ohr(q8n q8nVar, gqo0 gqo0Var) {
        this.a = (byte) 1;
        this.b = gqo0Var;
        this.c = smo1.e(flo1.l(q8nVar, guo1.B()).y(new z8n("NotificationsOptInNudgesUiPlugin")));
    }

    public final void c() {
        switch (this.a) {
            case 0:
                ((vku) this.d).a(((ghr) this.b).a().subscribe(new yrh(this, (byte) 14)));
                break;
            case 1:
                xab1 xab1Var = (xab1) this.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.d = fn31.T((llm) this.c, (o8n) null, 0, new xe2(this, (lnm) null, (byte) 5), 3);
                break;
        }
    }

    public final void d() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((vku) this.d).c();
                break;
            case 1:
                xab1 xab1Var = (xab1) this.d;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.d = null;
                break;
            case 2:
                if (((di4) obj).A()) {
                    ((rku) this.d).a();
                    break;
                }
                break;
            default:
                List list = o6l1.a;
                bn70 bn70VarA = ((war0) ((idd1) this.d).getValue()).a();
                if (o7h.i0(list, bn70VarA != null ? bn70VarA.a : null)) {
                    zrj1 zrj1Var = (zrj1) obj;
                    l1d.B((yqg) zrj1Var.c, ((dma1) zrj1Var.b).edit(), (bma1) zrj1Var.d);
                }
                break;
        }
    }

    public final void g(ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
            case 1:
                break;
            case 2:
                if (((di4) obj).A()) {
                    rku rkuVar = (rku) this.d;
                    z211 z211Var = (z211) this.b;
                    rkuVar.b(z211Var.d.a(true).flatMapCompletable(new rpv0(z211Var, (byte) 15)).subscribe());
                    break;
                }
                break;
            default:
                zrj1 zrj1Var = (zrj1) obj;
                hma1 hma1VarEdit = ((dma1) zrj1Var.b).edit();
                hma1VarEdit.f((bma1) zrj1Var.d);
                hma1VarEdit.g();
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void a(ViewGroup viewGroup) {
    }

    private final void b(ViewGroup viewGroup) {
    }

    public ohr(z211 z211Var, di4 di4Var) {
        this.a = (byte) 2;
        this.b = z211Var;
        this.c = di4Var;
        this.d = new rku();
    }

    public ohr(ghr ghrVar, ha8 ha8Var) {
        this.a = (byte) 0;
        this.b = ghrVar;
        this.c = ha8Var;
        this.d = new vku();
    }

    public ohr(bbr0 bbr0Var, zrj1 zrj1Var) {
        this.a = (byte) 3;
        this.b = bbr0Var;
        this.c = zrj1Var;
        this.d = new idd1(new bkk1(this, (byte) 6));
    }
}
