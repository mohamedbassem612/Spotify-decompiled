package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j5h1 {
    public final jly0 a;
    public final u9c0 b;
    public final Function0 c;
    public final iac0 d;
    public final idd1 e;
    public final bpb1 f;
    public r091 g;
    public xab1 h;
    public xab1 i;
    public lsm0 j;
    public String k;
    public final i5h1 l;
    public final xe01 m;

    public j5h1(jly0 jly0Var, u9c0 u9c0Var, iac0 iac0Var) {
        h5h1 h5h1Var = h5h1.a;
        this.a = jly0Var;
        this.b = u9c0Var;
        this.c = h5h1Var;
        this.d = iac0Var;
        this.e = new idd1(new j4f1(this, (byte) 27));
        bpb1 bpb1VarB = gio1.b(k5h1.a);
        this.f = bpb1VarB;
        i5h1 i5h1Var = new i5h1(this, (byte) 0);
        this.l = i5h1Var;
        iac0Var.getLifecycle().a(i5h1Var);
        this.m = d5p1.h(bpb1VarB);
    }

    public final void a(g5h1 g5h1Var) {
        String str = g5h1Var.a;
        zau0 zau0Var = (zau0) this.e.getValue();
        if (!((Boolean) zau0Var.b.getValue()).booleanValue()) {
            ((ttm0) this.a.get()).a(zau0Var);
        }
        r091 r091VarR = q3p1.r(zau0Var, this.g);
        if (r091VarR == null) {
            return;
        }
        lnm lnmVar = null;
        this.j = null;
        this.k = str;
        lsm0 lsm0Var = new lsm0(g5h1Var.b, new ksm0(fec1.c, (String) null, (String) null, "brief_preset_preview", str, (String) null, 486), false, false, (jsm0) null, 0L, (ism0) null, (String) null, true, 0, 1788);
        this.j = lsm0Var;
        r091 r091Var = this.g;
        u9c0 u9c0Var = this.b;
        if (r091Var != r091VarR) {
            xab1 xab1Var = this.h;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.g = r091VarR;
            this.h = fn31.T(u9c0Var, (o8n) null, 0, new k6g1(r091VarR, this, lnmVar, (byte) 10), 3);
        }
        r091VarR.j();
        r091VarR.b(lsm0Var);
        r091.f(r091VarR, (tv80) null, (Long) null, kky0.a, 7);
        r091VarR.k();
        l5h1 l5h1Var = new l5h1(null, str);
        bpb1 bpb1Var = this.f;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, l5h1Var);
        xab1 xab1Var2 = this.i;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.i = fn31.T(u9c0Var, (o8n) null, 0, new b0f1((Object) this, lnmVar, (byte) 16), 3);
    }

    public final void b() {
        this.j = null;
        this.k = null;
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = null;
        xab1 xab1Var2 = this.h;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.h = null;
        r091 r091Var = this.g;
        if (r091Var != null) {
            r091Var.j();
        }
        r091 r091Var2 = this.g;
        if (r091Var2 != null) {
            r091Var2.g();
        }
        this.g = null;
        bpb1 bpb1Var = this.f;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, k5h1.a);
    }

    public final void c(i091 i091Var) {
        Long lValueOf;
        r091 r091Var;
        o091 o091Var = i091Var.h;
        lsm0 lsm0Var = i091Var.a;
        f091 f091Var = f091.a;
        bpb1 bpb1Var = this.f;
        if (lsm0Var == null && (o091Var instanceof k091) && ((k091) o091Var).a.equals(f091Var) && (r091Var = this.g) != null && (((Boolean) r091Var.e.b.getValue()).booleanValue() || ((Boolean) r091Var.d.e.getValue()).booleanValue())) {
            this.j = null;
            this.k = null;
            xab1 xab1Var = this.i;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.i = null;
            xab1 xab1Var2 = this.h;
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            this.h = null;
            this.g = null;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, k5h1.a);
            return;
        }
        String str = this.k;
        if (str == null) {
            return;
        }
        String str2 = lsm0Var != null ? lsm0Var.h : null;
        lsm0 lsm0Var2 = this.j;
        if (u890.j(str2, lsm0Var2 != null ? lsm0Var2.h : null)) {
            if (!(o091Var instanceof n091) && !(o091Var instanceof j091)) {
                if (o091Var instanceof k091) {
                    if (((k091) o091Var).a.equals(f091Var)) {
                        return;
                    }
                    b();
                    return;
                } else {
                    if (u890.j(o091Var, l091.a) || u890.j(o091Var, m091.a)) {
                        return;
                    }
                    eg.o();
                    return;
                }
            }
            long j = i091Var.e;
            Long lValueOf2 = Long.valueOf(j);
            if (j <= 0) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                long jLongValue = lValueOf2.longValue() - ebp1.o(i091Var, (Long) this.c.invoke());
                lValueOf = Long.valueOf(jLongValue >= 0 ? jLongValue : 0L);
            } else {
                Object value = bpb1Var.getValue();
                l5h1 l5h1Var = value instanceof l5h1 ? (l5h1) value : null;
                lValueOf = l5h1Var != null ? l5h1Var.b : null;
            }
            l5h1 l5h1Var2 = new l5h1(lValueOf, str);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, l5h1Var2);
        }
    }
}
