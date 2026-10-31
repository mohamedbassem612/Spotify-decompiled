package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ec7 {
    public final String a;
    public final String b;
    public final String c;
    public final zau0 d;
    public final bpb1 e = gio1.b((Object) null);
    public final u9c0 f;
    public xab1 g;

    public ec7(iac0 iac0Var, ttm0 ttm0Var, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ttm0Var.c(false);
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        this.f = u9c0VarQ;
        fn31.T(u9c0VarQ, (o8n) null, 0, new wc5(iac0Var, ttm0Var, this, (lnm) null, (byte) 9), 3);
    }

    public final void a(hqt0 hqt0Var) {
        r091 r091Var = (r091) this.e.getValue();
        if (r091Var != null) {
            xab1 xab1Var = this.g;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            i091 i091Var = (i091) r091Var.g.getValue();
            String str = hqt0Var.b;
            String str2 = hqt0Var.d;
            lsm0 lsm0Var = new lsm0(str, new ksm0(new gec1(this.b), hqt0Var.a, this.a, this.c, str2, (String) null, 480), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044);
            r091Var.b(lsm0Var);
            r091Var.k();
            r091.f(r091Var, hqt0Var.c, (Long) null, zjy0.a, 6);
            this.g = fn31.T(this.f, (o8n) null, 4, new wc5(r091Var, lsm0Var, i091Var, (lnm) null, (byte) 10), 1);
        }
    }

    public final void b(String str) {
        ksm0 ksm0Var;
        r091 r091Var = (r091) this.e.getValue();
        if (r091Var != null) {
            lsm0 lsm0Var = ((i091) r091Var.g.getValue()).a;
            if (u890.j((lsm0Var == null || (ksm0Var = lsm0Var.b) == null) ? null : ksm0Var.e, str)) {
                xab1 xab1Var = this.g;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                r091Var.j();
                r091Var.c();
            }
        }
    }
}
