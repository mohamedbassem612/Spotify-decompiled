package p;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class or90 implements yt90 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public or90(kly0 kly0Var, chp chpVar, kly0 kly0Var2, chp chpVar2, kly0 kly0Var3, kly0 kly0Var4) {
        this.a = (byte) 0;
        this.b = kly0Var;
        this.c = chpVar;
        this.d = kly0Var2;
        this.e = chpVar2;
        this.f = kly0Var3;
        this.g = kly0Var4;
        this.h = dm5.S(3, new nd70(this, (byte) 29));
    }

    public Object a(ty90 ty90Var, d7i0 d7i0Var) {
        op90 op90Var;
        Object next;
        cns0 cns0Var;
        ns60 ns60Var;
        pp90 pp90Var = (pp90) ((c9c0) this.f).b.current().getValue();
        if (pp90Var != null && u890.j(pp90Var.a, ty90Var.b)) {
            hp90 hp90Var = pp90Var.h.b;
            if (!hp90Var.e && hp90Var.f && (op90Var = pp90Var.f) != null && op90Var.d) {
                os60 os60Var = (os60) d5p1.h(((vu60) this.e).e).a.getValue();
                if (((os60Var == null || (ns60Var = os60Var.a) == null) ? null : ns60Var.e) != j16.b) {
                    Iterator it = pp90Var.c.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((hp90) next).e);
                    hp90 hp90Var2 = (hp90) next;
                    if (hp90Var2 != null) {
                        tzr0 tzr0Var = (tzr0) this.d;
                        String str = hp90Var2.c;
                        int iC = l1d.C(ty90Var.a);
                        if (iC == 0) {
                            cns0Var = cns0.d;
                        } else if (iC == 1) {
                            cns0Var = cns0.a;
                        } else if (iC == 2) {
                            cns0Var = cns0.b;
                        } else {
                            if (iC != 3) {
                                eg.o();
                                return null;
                            }
                            cns0Var = cns0.c;
                        }
                        Object objN = tzr0Var.n(str, cns0Var, d7i0Var);
                        if (objN == d9n.a) {
                            return objN;
                        }
                    }
                }
            }
        }
        return rih1.a;
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                Iterator it = ((List) ((znb0) obj).getValue()).iterator();
                while (it.hasNext()) {
                    ((yt90) it.next()).start();
                }
                break;
            default:
                if (((b0a0) this.g).a()) {
                    llm llmVar = (llm) obj;
                    l4p1.u(llmVar, new fu20(hu20.e((mr20) this.b, new zz90((lnm) null, (Object) this, (byte) 21)), new d7i0(this, (lnm) null, (byte) 4), (byte) 1));
                }
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                Iterator it = ((List) ((znb0) obj).getValue()).iterator();
                while (it.hasNext()) {
                    ((yt90) it.next()).stop();
                }
                break;
            default:
                op71.q(((llm) obj).a, (CancellationException) null);
                break;
        }
    }

    public or90(mr20 mr20Var, yqi0 yqi0Var, tzr0 tzr0Var, vu60 vu60Var, c9c0 c9c0Var, b0a0 b0a0Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = mr20Var;
        this.c = yqi0Var;
        this.d = tzr0Var;
        this.e = vu60Var;
        this.f = c9c0Var;
        this.g = b0a0Var;
        this.h = us71.h(q8nVar);
    }
}
