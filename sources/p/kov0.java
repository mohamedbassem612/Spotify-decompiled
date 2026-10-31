package p;

import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kov0 implements ssb0 {
    public final int a;
    public final aru0 b;
    public final iu30 c;
    public hjl d;
    public rlc1 e;
    public qlc1 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public zf50 l;
    public boolean m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f83p = sjm0.a();
    public boolean q;
    public final /* synthetic */ rl1 r;

    public kov0(rl1 rl1Var, int i, aru0 aru0Var, iu30 iu30Var) {
        this.r = rl1Var;
        this.a = i;
        this.b = aru0Var;
        this.c = iu30Var;
    }

    @Override // p.ssb0
    public final void a() {
        this.m = true;
    }

    public final void b() {
        qlc1 qlc1Var = this.f;
        if (qlc1Var != null) {
            qlc1Var.cancel();
        }
        this.f = null;
        rlc1 rlc1Var = this.e;
        if (rlc1Var != null) {
            rlc1Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(kqc1 kqc1Var) {
        boolean zD;
        if (!this.r.b) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(kqc1Var);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zD = d(kqc1Var);
        }
        d55.k(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // p.ssb0
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public final boolean d(kqc1 kqc1Var) {
        ?? r10;
        z6x z6xVar;
        int i = this.a;
        long j = i;
        d55.k(j, "compose:lazy:prefetch:execute:item");
        esb0 esb0Var = (esb0) ((dsb0) this.r.c).b.invoke();
        if (!this.h) {
            int iA = esb0Var.a();
            if (i >= 0 && i < iA) {
                Object objD = esb0Var.d(i);
                Object obj = this.j;
                if (obj != null && !objD.equals(obj)) {
                    b();
                    return false;
                }
                Object objB = esb0Var.b(i);
                aru0 aru0Var = this.b;
                zb9 zb9Var = (zb9) aru0Var.d;
                if (aru0Var.c != objB || zb9Var == null) {
                    nen0 nen0Var = (nen0) aru0Var.b;
                    Object objG = nen0Var.g(objB);
                    Object obj2 = objG;
                    if (objG == null) {
                        zb9 zb9Var2 = new zb9();
                        zb9Var2.e = -1;
                        nen0Var.m(objB, zb9Var2);
                        obj2 = zb9Var2;
                    }
                    zb9Var = (zb9) obj2;
                    aru0Var.c = objB;
                    aru0Var.d = zb9Var;
                }
                e();
                long jA = kqc1Var.a();
                this.n = jA;
                this.f83p = sjm0.a();
                this.o = 0L;
                d55.k(jA, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    if (g(this.n, zb9Var.a + zb9Var.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objD, objB, zb9Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f != null) {
                    if (!g(this.n, zb9Var.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        qlc1 qlc1Var = this.f;
                        if (qlc1Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.e = qlc1Var.apply();
                        this.f = null;
                        this.i = true;
                        Trace.endSection();
                        h();
                        zb9Var.c = zb9.a(this.o, zb9Var.c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                char c = 4;
                if (!this.k) {
                    if (this.n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        rlc1 rlc1Var = this.e;
                        if (rlc1Var == null) {
                            throw kaa0.g("Should precompose before resolving nested prefetch states");
                        }
                        p811 p811Var = new p811();
                        rlc1Var.d(new q94(p811Var, (byte) 4));
                        List list = (List) p811Var.a;
                        this.l = list != null ? new zf50(this, list) : null;
                        this.k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                zf50 zf50Var = this.l;
                if (zf50Var != null) {
                    int i2 = zb9Var.e;
                    boolean z = this.m;
                    List[] listArr = (List[]) zf50Var.f;
                    int i3 = zf50Var.c;
                    List list2 = (List) zf50Var.e;
                    if (i3 < list2.size()) {
                        if (((kov0) zf50Var.g).h) {
                            tf80.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((tsb0) list2.get(i4)).d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (zf50Var.c < list2.size()) {
                                try {
                                    if (listArr[zf50Var.c] != 0) {
                                        c = c;
                                    } else {
                                        if (kqc1Var.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = zf50Var.c;
                                        tsb0 tsb0Var = (tsb0) list2.get(i5);
                                        iu30 iu30Var = tsb0Var.a;
                                        if (iu30Var == null) {
                                            z6xVar = z6x.a;
                                        } else {
                                            rsb0 rsb0Var = new rsb0(tsb0Var, tsb0Var.d);
                                            iu30Var.invoke(rsb0Var);
                                            z6x z6xVar2 = rsb0Var.b;
                                            tsb0Var.f = z6xVar2.size();
                                            z6xVar = z6xVar2;
                                        }
                                        listArr[i5] = z6xVar;
                                    }
                                    apb apbVar = listArr[zf50Var.c];
                                    apbVar.getClass();
                                    while (zf50Var.d < apbVar.size()) {
                                        kov0 kov0Var = (kov0) apbVar.get(zf50Var.d);
                                        if (z) {
                                            kov0 kov0Var2 = kov0Var != null ? kov0Var : null;
                                            if (kov0Var2 != null) {
                                                r10 = 1;
                                                kov0Var2.m = true;
                                            } else {
                                                r10 = 1;
                                            }
                                        } else {
                                            r10 = 1;
                                        }
                                        zf50Var.b = r10;
                                        if (kov0Var.c(kqc1Var)) {
                                            Trace.endSection();
                                            return r10;
                                        }
                                        zf50Var.d += r10;
                                    }
                                    zf50Var.d = 0;
                                    zf50Var.c++;
                                    c = c;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                zf50 zf50Var2 = this.l;
                if (zf50Var2 != null && zf50Var2.b) {
                    h();
                    d55.k(j, "compose:lazy:prefetch:execute:item");
                    zf50 zf50Var3 = this.l;
                    if (zf50Var3 != null) {
                        zf50Var3.b = false;
                    }
                }
                hjl hjlVar = this.d;
                if (!this.g && hjlVar != null) {
                    if (!g(this.n, zb9Var.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = hjlVar.a;
                        if (this.h) {
                            tf80.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.g) {
                            tf80.a("Request was already measured!");
                        }
                        this.g = true;
                        rlc1 rlc1Var2 = this.e;
                        if (rlc1Var2 == null) {
                            throw kaa0.g("performComposition() must be called before performMeasure()");
                        }
                        int iB = rlc1Var2.b();
                        for (int i6 = 0; i6 < iB; i6++) {
                            rlc1Var2.c(i6, j2);
                        }
                        Trace.endSection();
                        h();
                        zb9Var.d = zb9.a(this.o, zb9Var.d);
                        iu30 iu30Var2 = this.c;
                        if (iu30Var2 != null) {
                            iu30Var2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                zf50 zf50Var4 = this.l;
                if (this.g && this.k && zf50Var4 != null) {
                    List list3 = (List) zf50Var4.e;
                    List list4 = list3;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((tsb0) list3.get(i7)).e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = zb9Var.e;
                    zb9Var.e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((tsb0) list3.get(i9)).f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        zb9Var.d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        qlc1 qlc1Var;
        return this.i || ((qlc1Var = this.f) != null && qlc1Var.e());
    }

    public final void f(Object obj, Object obj2, zb9 zb9Var) {
        v6a0 ye90Var;
        v6a0 v6a0Var = this.f;
        if (v6a0Var == null) {
            rl1 rl1Var = this.r;
            vu30 vu30VarA = ((dsb0) rl1Var.c).a(this.a, obj, obj2);
            vmb0 vmb0VarA = ((slc1) rl1Var.d).a();
            if (vmb0VarA.a.I()) {
                vmb0VarA.l(obj, vu30VarA, true);
                ye90Var = new ye90(vmb0VarA, obj, (byte) 14);
            } else {
                ye90Var = new v6a0(vmb0VarA, obj, (byte) 9);
            }
            v6a0Var = ye90Var;
            this.f = v6a0Var;
            this.j = obj;
        }
        this.q = false;
        while (!v6a0Var.e() && !this.q) {
            v6a0Var.d(new x8a0((Object) this, (Object) zb9Var, (byte) 25));
        }
        h();
        boolean z = this.q;
        long j = this.o;
        if (z) {
            zb9Var.b = zb9.a(j, zb9Var.b);
        } else {
            zb9Var.a = zb9.a(j, zb9Var.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void h() {
        long jA = sjm0.a();
        long jI = jfv.i(kkn.A(jA, this.f83p));
        this.o = jI;
        long j = this.n - jI;
        this.n = j;
        this.f83p = jA;
        d55.k(j, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        hjl hjlVar = this.d;
        boolean zE = e();
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(hjlVar);
        sb.append(", isComposed = ");
        sb.append(zE);
        sb.append(", isMeasured = ");
        sb.append(z);
        sb.append(", isCanceled = ");
        return l1d.r(sb, z2, " }");
    }
}
