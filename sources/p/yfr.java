package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yfr {
    public final String a;
    public final sfr b;
    public final tfr c;
    public final g0l d;
    public final long e;
    public final long f;
    public final llm g;
    public final bpb1 h;
    public xab1 i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public final xe01 n;

    public yfr(String str, sfr sfrVar, tfr tfrVar, g0l g0lVar, q8n q8nVar, String str2, long j, long j2) {
        this.a = str;
        this.b = sfrVar;
        this.c = tfrVar;
        this.d = g0lVar;
        this.e = j;
        this.f = j2;
        this.g = us71.h(q8nVar);
        bpb1 bpb1VarB = gio1.b(new rz5());
        this.h = bpb1VarB;
        this.m = str2;
        this.n = d5p1.h(bpb1VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        vfr vfrVar;
        Object value;
        Object value2;
        if (onmVar instanceof vfr) {
            vfrVar = (vfr) onmVar;
            int i = vfrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfrVar.c = i - Integer.MIN_VALUE;
            } else {
                vfrVar = new vfr(this, onmVar);
            }
        } else {
            vfrVar = new vfr(this, onmVar);
        }
        Object objO = vfrVar.a;
        int i2 = vfrVar.c;
        fz5 fz5Var = fz5.i;
        bpb1 bpb1Var = this.h;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                this.j = true;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, rz5.a((rz5) value, (String) null, true, (fz5) null, (String) null, false, false, 0, 185)));
                long j = this.e;
                n1o n1oVar = new n1o(this, (lnm) null, (byte) 7);
                vfrVar.c = 1;
                objO = rc2.O(j, n1oVar, vfrVar);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            l0l l0lVar = (l0l) objO;
            if (l0lVar == null) {
                c(fz5Var);
            } else {
                do {
                    value2 = bpb1Var.getValue();
                } while (!bpb1Var.k(value2, rz5.a((rz5) value2, (String) null, false, (fz5) null, l0lVar.d(), false, false, 0, 229)));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            c(fz5Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        xfr xfrVar;
        if (onmVar instanceof xfr) {
            xfrVar = (xfr) onmVar;
            int i = xfrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xfrVar.c = i - Integer.MIN_VALUE;
            } else {
                xfrVar = new xfr(this, onmVar);
            }
        } else {
            xfrVar = new xfr(this, onmVar);
        }
        Object objK = xfrVar.a;
        int i2 = xfrVar.c;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objK);
            xe01 xe01VarH = d5p1.h(this.b.c);
            xfrVar.c = 1;
            objK = b5p1.k(xe01VarH, xfrVar);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        List list = (List) objK;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (u890.j(((jy5) obj2).a, this.a)) {
                obj = obj2;
                break;
            }
        }
        return (jy5) obj;
    }

    public final void c(fz5 fz5Var) {
        while (true) {
            bpb1 bpb1Var = this.h;
            Object value = bpb1Var.getValue();
            rz5 rz5Var = (rz5) value;
            fz5 fz5Var2 = fz5Var;
            if (bpb1Var.k(value, rz5.a(rz5Var, (fz5Var == fz5.b || fz5Var == fz5.a) ? "" : rz5Var.a, false, fz5Var2, (String) null, false, false, this.j ? 2 : 1, 24))) {
                return;
            } else {
                fz5Var = fz5Var2;
            }
        }
    }

    public final void d(String str) {
        bpb1 bpb1Var;
        Object value;
        rz5 rz5Var;
        zob1 zob1Var = this.n.a;
        llm llmVar = this.g;
        if (smo1.u(llmVar)) {
            xab1 xab1Var = this.i;
            if ((xab1Var != null && xab1Var.isActive()) || ((rz5) zob1Var.getValue()).f() || ((rz5) zob1Var.getValue()).f || ((rz5) zob1Var.getValue()).d) {
                return;
            }
            if (((rz5) zob1Var.getValue()).d() && str != null) {
                this.l = str;
            }
            boolean zB = ((rz5) zob1Var.getValue()).b();
            if (((rz5) zob1Var.getValue()).c()) {
                do {
                    bpb1Var = this.h;
                    value = bpb1Var.getValue();
                    rz5Var = (rz5) value;
                } while (!bpb1Var.k(value, rz5.a(rz5Var, zB ? "" : rz5Var.a, !zB, (fz5) null, (String) null, false, zB, 0, 184)));
            }
            this.i = fn31.T(llmVar, (o8n) null, 0, new bu(this, null, (byte) 10), 3);
        }
    }
}
