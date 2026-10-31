package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class us31 implements dmh1 {
    public final w1k a;
    public final List b;
    public final zhq0 c = new zhq0((byte) 14);
    public final vla1 d = new vla1(new zw11(this, (byte) 19));

    public us31(w1k w1kVar, List list) {
        this.a = w1kVar;
        this.b = list;
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        w1k w1kVar;
        int[] iArr;
        Iterator it;
        int[] iArr2;
        us31 us31Var = this;
        int iC = ses0Var.c();
        zhq0 zhq0Var = us31Var.c;
        ues0 ues0VarB = zhq0Var.b(iC);
        try {
            int[] iArrA = ues0VarB.a();
            Iterator it2 = us31Var.b.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                w1kVar = us31Var.a;
                if (!zHasNext) {
                    break;
                }
                or31 or31Var = (or31) it2.next();
                long jK = ses0Var.k();
                try {
                    int iC2 = ses0Var.c();
                    boolean z = false;
                    int i = 0;
                    for (int i2 = 0; i2 < iC2; i2++) {
                        if (ses0Var.g(i2)) {
                            jh5 jh5VarH = ses0Var.h(i2);
                            jh5VarH.getClass();
                            if (((Boolean) or31Var.a.invoke(jh5VarH)).booleanValue()) {
                                int iIntValue = ((Number) or31Var.b.invoke(jh5VarH)).intValue();
                                iArrA[i2] = iIntValue;
                                i += iIntValue;
                                z = true;
                            } else {
                                ses0Var.d(i2);
                            }
                        }
                    }
                    if (z) {
                        ses0 ses0VarA = zhq0Var.a(i);
                        try {
                            int iC3 = ses0Var.c();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < iC3) {
                                if (ses0Var.g(i3)) {
                                    jh5 jh5VarH2 = ses0Var.h(i3);
                                    jh5VarH2.getClass();
                                    iArr2 = iArrA;
                                    or31Var.c.J(jh5VarH2, ses0VarA, Integer.valueOf(i4), Integer.valueOf(iArr2[i3]));
                                    i4 += iArr2[i3];
                                } else {
                                    iArr2 = iArrA;
                                }
                                i3++;
                                iArrA = iArr2;
                                it2 = it2;
                            }
                            iArr = iArrA;
                            it = it2;
                            if (i > 0) {
                                w1kVar.b(ses0VarA);
                            }
                            int iC4 = ses0Var.c();
                            int i5 = 0;
                            for (int i6 = 0; i6 < iC4; i6++) {
                                if (ses0Var.g(i6)) {
                                    jh5 jh5VarH3 = ses0Var.h(i6);
                                    jh5VarH3.getClass();
                                    int i7 = i5 + iArr[i6];
                                    ses0Var.n(i6, (k3r) or31Var.d.J(jh5VarH3, ses0VarA, Integer.valueOf(i5), Integer.valueOf(i7)));
                                    i5 = i7;
                                }
                            }
                            zhq0Var.q(ses0VarA);
                        } catch (Throwable th) {
                            zhq0Var.q(ses0VarA);
                            throw th;
                        }
                    } else {
                        iArr = iArrA;
                        it = it2;
                    }
                    ses0Var.i(jK);
                    us31Var = this;
                    iArrA = iArr;
                    it2 = it;
                } catch (Throwable th2) {
                    ses0Var.i(jK);
                    throw th2;
                }
            }
            zhq0Var.r(ues0VarB);
            if (rpo1.s(ses0Var)) {
                w1kVar.b(ses0Var);
            }
        } catch (Throwable th3) {
            zhq0Var.r(ues0VarB);
            throw th3;
        }
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        return new ts31(this.a, this.b, iu30Var);
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.d;
    }
}
