package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rtg0 implements c0u0 {
    public List a;
    public long b;
    public jfv c;
    public final np00 d;
    public final yqg e;
    public final dt90 f;
    public final ArrayList g = new ArrayList();
    public final PublishSubject h = new PublishSubject();
    public Long i;

    public rtg0(List list, long j, jfv jfvVar, np00 np00Var, yqg yqgVar, dt90 dt90Var) {
        this.a = list;
        this.b = j;
        this.c = jfvVar;
        this.d = np00Var;
        this.e = yqgVar;
        this.f = dt90Var;
    }

    public final void I(long j) {
        long jL0;
        long jJ0;
        long jQ;
        long j2;
        Iterator it;
        mmr0 mmr0Var;
        long j3 = this.b;
        jfv jfvVar = this.c;
        ngv ngvVar = ngv.d;
        if (jfvVar != null) {
            jL0 = jfvVar.a;
        } else {
            ytw0 ytw0Var = jfv.b;
            jL0 = fdg1.l0(j, ngvVar);
        }
        long j4 = pap1.y(new jfv(jL0), new jfv(j3)).a;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            mtg0 mtg0Var = (mtg0) it2.next();
            jfv jfvVar2 = mtg0Var.d;
            int i = mtg0Var.b;
            long j5 = mtg0Var.c;
            if (jfv.c(j3, j4) > 0) {
                hhg1.n("Failed requirement.");
                return;
            }
            if (i == 0) {
                jQ = jfv.q(j3, j5);
            } else if (i == 100) {
                jQ = jfv.q(j4, j5);
            } else {
                long jP = jfv.p(j4, j3);
                double d = ((double) i) / 100.0d;
                int iS = jch0.S(d);
                if (iS == d) {
                    jJ0 = jfv.r(iS, jP);
                } else {
                    ngv ngvVarM = jfv.m(jP);
                    jJ0 = fdg1.j0(jfv.s(jP, ngvVarM) * d, ngvVarM);
                }
                jQ = jfv.q(jfv.q(j3, jJ0), j5);
            }
            if (jfvVar2 != null) {
                while (jfv.c(jQ, j3) < 0) {
                    jQ = jfv.q(jQ, jfvVar2.a);
                }
            }
            if (jfv.c(jQ, j3) < 0 || jfv.c(jQ, j4) > 0) {
                j2 = j3;
                it = it2;
            } else {
                if (jfvVar2 != null) {
                    long jQ2 = jQ;
                    int i2 = 0;
                    while (jfv.c(jQ2, j4) <= 0) {
                        i2++;
                        jQ2 = jfv.q(jQ2, jfvVar2.a);
                        j3 = j3;
                    }
                    j2 = j3;
                    mmr0Var = new mmr0(Integer.valueOf(i2), jfvVar2);
                } else {
                    j2 = j3;
                    mmr0Var = new mmr0(1, new jfv(0L));
                }
                int iIntValue = ((Number) mmr0Var.a).intValue();
                long j6 = ((jfv) mmr0Var.b).a;
                long[] jArr = new long[iIntValue];
                int i3 = 0;
                while (i3 < iIntValue) {
                    jArr[i3] = jfv.u(jfv.q(jQ, jfv.r(i3, j6)), ngvVar);
                    i3++;
                    it2 = it2;
                    iIntValue = iIntValue;
                }
                it = it2;
                koe1 koe1VarB = this.d.b(jArr, false, new yge0(this, mtg0Var, (byte) 14));
                if (koe1VarB != null) {
                    this.g.add(koe1VarB);
                }
            }
            it2 = it;
            j3 = j2;
        }
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.c((koe1) it.next());
        }
        arrayList.clear();
        this.f.invoke();
    }

    public final PublishSubject a() {
        return this.h;
    }

    public final void k(long j, long j2) {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.c((koe1) it.next());
        }
        arrayList.clear();
        this.i = Long.valueOf(j);
        I(j);
    }

    public final void q(List list, long j, jfv jfvVar) {
        this.a = list;
        this.b = j;
        this.c = jfvVar;
        Long l = this.i;
        if (l != null) {
            long jLongValue = l.longValue();
            ArrayList arrayList = this.g;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.d.c((koe1) it.next());
            }
            arrayList.clear();
            I(jLongValue);
        }
    }
}
