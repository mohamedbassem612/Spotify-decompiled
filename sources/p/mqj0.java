package p;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mqj0 {
    public final oqj0 a;
    public final jfc1 b;
    public final iu30 c;
    public final llm d;
    public xab1 e;
    public final Long f;
    public final ArrayList g;
    public final AtomicBoolean h;
    public cpj0 i;
    public long j;
    public long k;
    public long l;

    public mqj0(oqj0 oqj0Var, jfc1 jfc1Var, o8n o8nVar, iu30 iu30Var, long j, long j2) {
        this.a = oqj0Var;
        this.b = jfc1Var;
        this.c = iu30Var;
        this.d = o8nVar != null ? smo1.e(flo1.l(guo1.B(), o8nVar)) : null;
        xoj0 xoj0Var = oqj0Var.b.b;
        xoj0 xoj0Var2 = xoj0Var instanceof xoj0 ? xoj0Var : null;
        this.f = xoj0Var2 != null ? xoj0Var2.c : null;
        this.g = new ArrayList();
        this.h = new AtomicBoolean(false);
        this.i = apj0.a;
        this.j = j;
        this.k = j2;
        this.l = j;
    }

    public final void a() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.e = null;
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
    }

    public final void b(long j) {
        long j2;
        mpj0 mpj0VarH = this.b.h();
        cpj0 cpj0Var = this.i;
        zoj0 zoj0Var = cpj0Var instanceof zoj0 ? (zoj0) cpj0Var : null;
        String string = zoj0Var != null ? zoj0Var.a.toString() : null;
        this.i = apj0.a;
        if (mpj0VarH != null) {
            j2 = j;
            this.g.add(new ipj0(this.l, j2, mpj0VarH, string));
        } else {
            j2 = j;
        }
        this.l = j2;
    }

    public final aqj0 c(long j) {
        String str;
        String str2;
        oqj0 oqj0Var = this.a;
        nqj0 nqj0Var = oqj0Var.b;
        mpj0 mpj0VarPeek = this.b.peek();
        if (mpj0VarPeek == null) {
            return null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        npj0 npj0Var = oqj0Var.a;
        rqj0 rqj0Var = oqj0Var.c;
        qqj0 qqj0Var = rqj0Var instanceof qqj0 ? (qqj0) rqj0Var : null;
        String strA = (qqj0Var == null || (str2 = qqj0Var.b) == null) ? nqj0Var.a() : f4i1.f(nqj0Var.a(), "_", str2);
        String strA2 = nqj0Var.a();
        long j2 = this.j;
        long j3 = this.k;
        String strO = j0p1.o(nqj0Var.b);
        Long lM = j0p1.m(nqj0Var.c);
        uqj0 uqj0Var = nqj0Var.c;
        if (uqj0Var instanceof sqj0) {
            str = "global";
        } else {
            if (!(uqj0Var instanceof tqj0)) {
                eg.o();
                return null;
            }
            str = "observation";
        }
        return new aqj0(uuidRandomUUID, npj0Var, strA, strA2, mpj0VarPeek, null, j2, j, j3, 4, strO, lM, str, j0p1.r(nqj0Var.b));
    }

    public final aqj0 d(int i, long j, long j2) {
        String str;
        String str2;
        oqj0 oqj0Var = this.a;
        nqj0 nqj0Var = oqj0Var.b;
        uqj0 uqj0Var = nqj0Var.c;
        b(j);
        ArrayList arrayList = this.g;
        List listL1 = o7h.l1(arrayList);
        if (listL1.isEmpty()) {
            return null;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        npj0 npj0Var = oqj0Var.a;
        rqj0 rqj0Var = oqj0Var.c;
        qqj0 qqj0Var = rqj0Var instanceof qqj0 ? (qqj0) rqj0Var : null;
        String strA = (qqj0Var == null || (str2 = qqj0Var.b) == null) ? nqj0Var.a() : f4i1.f(nqj0Var.a(), "_", str2);
        String strA2 = nqj0Var.a();
        uqj0 uqj0Var2 = nqj0Var.c;
        ipj0 ipj0Var = (ipj0) o7h.s0(listL1);
        mpj0 mpj0Var = ipj0Var != null ? ipj0Var.c : null;
        long j3 = this.j;
        long j4 = this.k;
        String strO = j0p1.o(nqj0Var.b);
        Long lM = j0p1.m(nqj0Var.c);
        uqj0 uqj0Var3 = nqj0Var.c;
        String str3 = strA;
        if (uqj0Var3 instanceof sqj0) {
            str = "global";
        } else {
            if (!(uqj0Var3 instanceof tqj0)) {
                eg.o();
                return null;
            }
            str = "observation";
        }
        aqj0 aqj0Var = new aqj0(uuidRandomUUID, npj0Var, str3, strA2, mpj0Var, ((ipj0) o7h.q0(listL1)).d, j3, j, j4, i, strO, lM, str, j0p1.r(nqj0Var.b));
        arrayList.clear();
        this.j = this.l;
        this.k = j2;
        if (j0p1.r(nqj0Var.b)) {
            xab1 xab1Var = this.e;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.e = null;
            this.h.set(false);
        }
        return aqj0Var;
    }

    public final nqj0 e() {
        return this.a.b;
    }

    public final oqj0 f() {
        return this.a;
    }

    public final long g() {
        return this.l;
    }

    public final void h(UUID uuid) {
        cpj0 zoj0Var = this.i;
        if (zoj0Var.equals(apj0.a)) {
            zoj0Var = new zoj0(uuid);
        } else {
            boolean z = zoj0Var instanceof zoj0;
            bpj0 bpj0Var = bpj0.a;
            if (z) {
                if (!((zoj0) zoj0Var).a.equals(uuid)) {
                }
            } else if (!zoj0Var.equals(bpj0Var)) {
                eg.o();
                return;
            }
            zoj0Var = bpj0Var;
        }
        this.i = zoj0Var;
    }

    public final void i(double d) {
        iu30 iu30Var;
        this.b.record(d);
        Long l = this.f;
        if (l != null) {
            long jLongValue = l.longValue();
            llm llmVar = this.d;
            if (llmVar == null || (iu30Var = this.c) == null || !this.h.compareAndSet(false, true)) {
                return;
            }
            iu30Var.invoke(this);
            this.e = fn31.T(llmVar, (o8n) null, 0, new xn2(jLongValue, iu30Var, this, (lnm) null), 3);
        }
    }
}
