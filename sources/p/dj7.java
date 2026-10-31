package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dj7 implements jxd1 {
    public final jxd1 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e;

    public dj7(jxd1 jxd1Var, xh7 xh7Var, q8n q8nVar) {
        this.a = jxd1Var;
        l4p1.u(smo1.e(q8nVar), f5p1.q(z4p1.F(new xr0(xh7Var.b, (byte) 5), 1), new kk(this, (lnm) null, (byte) 17)));
    }

    @Override // p.jxd1
    public final void a(List list) {
        e(new bj7(this, list, (byte) 0), new bj7(this, list, (byte) 1), this.b);
    }

    @Override // p.jxd1
    public final void b(String str) {
        e(new ft0(this, str, (byte) 2), new z77(this, str, (byte) 3), this.c);
    }

    @Override // p.jxd1
    public final void c(Throwable th) {
        e(new zi7(this, th, (byte) 0), new zi7(this, th, (byte) 1), this.d);
    }

    @Override // p.jxd1
    public final void d(ugn ugnVar) {
        e(new aj7(this, ugnVar, (byte) 0), new aj7(this, ugnVar, (byte) 1), this.b);
    }

    public final void e(Function0 function0, Function0 function1, ArrayList arrayList) {
        if (this.e) {
            function1.invoke();
            return;
        }
        synchronized (arrayList) {
            try {
                if (this.e) {
                    function1.invoke();
                } else {
                    function0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
