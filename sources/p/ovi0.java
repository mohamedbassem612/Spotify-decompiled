package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ovi0 implements arh0, zqh0 {
    public final arh0[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public zqh0 f;
    public qnf1 g;
    public arh0[] h;
    public o2k i;

    public ovi0(twb twbVar, long[] jArr, arh0... arh0VarArr) {
        this.a = arh0VarArr;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.i = new o2k(bg11Var, bg11Var);
        this.c = new IdentityHashMap();
        this.h = new arh0[0];
        this.b = new boolean[arh0VarArr.length];
        for (int i = 0; i < arh0VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new noe1(arh0VarArr[i], j);
            }
        }
    }

    @Override // p.v561
    public final long a() {
        return this.i.a();
    }

    @Override // p.v561
    public final boolean b() {
        return this.i.b();
    }

    public final void c(v561 v561Var) {
        zqh0 zqh0Var = this.f;
        zqh0Var.getClass();
        zqh0Var.c(this);
    }

    @Override // p.arh0
    public final long d(long j) {
        long jD = this.h[0].d(j);
        int i = 1;
        while (true) {
            arh0[] arh0VarArr = this.h;
            if (i >= arh0VarArr.length) {
                return jD;
            }
            if (arh0VarArr[i].d(jD) != jD) {
                eg.m("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        w280 w280Var = b380.b;
        return bg11.e;
    }

    @Override // p.arh0
    public final long g() {
        long j;
        arh0 arh0Var;
        arh0[] arh0VarArr = this.h;
        int length = arh0VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            arh0 arh0Var2 = arh0VarArr[i];
            long jG = arh0Var2.g();
            if (jG == j2) {
                j = j2;
                if (j3 != j && arh0Var2.d(j3) != j3) {
                    eg.m("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                arh0[] arh0VarArr2 = this.h;
                int length2 = arh0VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (arh0Var = arh0VarArr2[i2]) == arh0Var2) {
                        break;
                    }
                    if (arh0Var.d(jG) != jG) {
                        eg.m("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jG;
            } else {
                j = j2;
                if (jG != j3) {
                    eg.m("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.i(hae0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((arh0) arrayList.get(i)).i(hae0Var);
        }
        return false;
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(arh0Var);
        if (arrayList.isEmpty()) {
            arh0[] arh0VarArr = this.a;
            int i = 0;
            for (arh0 arh0Var2 : arh0VarArr) {
                i += arh0Var2.u().a;
            }
            pnf1[] pnf1VarArr = new pnf1[i];
            int i2 = 0;
            for (int i3 = 0; i3 < arh0VarArr.length; i3++) {
                qnf1 qnf1VarU = arh0VarArr[i3].u();
                int i4 = qnf1VarU.a;
                int i5 = 0;
                while (i5 < i4) {
                    pnf1 pnf1VarA = qnf1VarU.a(i5);
                    int i6 = pnf1VarA.a;
                    ie30[] ie30VarArr = new ie30[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        ie30 ie30Var = pnf1VarA.d[i7];
                        ge30 ge30VarA = ie30Var.a();
                        String str = ie30Var.n;
                        arh0[] arh0VarArr2 = arh0VarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = ie30Var.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        ge30VarA.a = sb.toString();
                        if (str != null) {
                            ge30VarA.m = i3 + ":" + str;
                        }
                        ie30VarArr[i7] = new ie30(ge30VarA);
                        i7++;
                        arh0VarArr = arh0VarArr2;
                    }
                    arh0[] arh0VarArr3 = arh0VarArr;
                    pnf1 pnf1Var = new pnf1(i3 + ":" + pnf1VarA.b, ie30VarArr);
                    this.e.put(pnf1Var, pnf1VarA);
                    pnf1VarArr[i2] = pnf1Var;
                    i5++;
                    i2++;
                    arh0VarArr = arh0VarArr3;
                }
            }
            this.g = new qnf1(pnf1VarArr);
            zqh0 zqh0Var = this.f;
            zqh0Var.getClass();
            zqh0Var.j(this);
        }
    }

    @Override // p.arh0
    public final long k(long j) {
        boolean z = true;
        for (arh0 arh0Var : this.a) {
            z &= arh0Var.k(j) == j;
        }
        if (z) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[qp00VarArr.length];
        int[] iArr2 = new int[qp00VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = qp00VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            p641 p641Var = p641VarArr[i2];
            Integer num = p641Var == null ? null : (Integer) identityHashMap.get(p641Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            qp00 qp00Var = qp00VarArr[i2];
            if (qp00Var != null) {
                String str = qp00Var.n().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = qp00VarArr.length;
        p641[] p641VarArr2 = new p641[length2];
        p641[] p641VarArr3 = new p641[qp00VarArr.length];
        qp00[] qp00VarArr2 = new qp00[qp00VarArr.length];
        arh0[] arh0VarArr = this.a;
        ArrayList arrayList = new ArrayList(arh0VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < arh0VarArr.length) {
            int i4 = i;
            while (i4 < qp00VarArr.length) {
                p641VarArr3[i4] = iArr[i4] == i3 ? p641VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    qp00 qp00Var2 = qp00VarArr[i4];
                    qp00Var2.getClass();
                    pnf1 pnf1Var = (pnf1) this.e.get(qp00Var2.n());
                    pnf1Var.getClass();
                    qp00VarArr2[i4] = new nvi0(qp00Var2, pnf1Var);
                } else {
                    qp00VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            arh0[] arh0VarArr2 = arh0VarArr;
            int i5 = i3;
            long jM = arh0VarArr2[i3].m(qp00VarArr2, zArr, p641VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jM;
            } else if (jM != j2) {
                eg.m("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < qp00VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    p641 p641Var2 = p641VarArr3[i6];
                    p641Var2.getClass();
                    p641VarArr2[i6] = p641VarArr3[i6];
                    identityHashMap.put(p641Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    dm5.y(p641VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(arh0VarArr2[i5]);
            }
            i3 = i5 + 1;
            arh0VarArr = arh0VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(p641VarArr2, i7, p641VarArr, i7, length2);
        this.h = (arh0[]) arrayList.toArray(new arh0[i7]);
        this.i = new o2k(arrayList, z1p1.D(arrayList, new cwa((byte) 20)));
        return j2;
    }

    @Override // p.arh0
    public final void p() {
        for (arh0 arh0Var : this.a) {
            arh0Var.p();
        }
    }

    @Override // p.arh0
    public final void q() {
        for (arh0 arh0Var : this.a) {
            arh0Var.q();
        }
    }

    @Override // p.arh0
    public final void r(long j) {
        for (arh0 arh0Var : this.h) {
            arh0Var.r(j);
        }
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        arh0[] arh0VarArr = this.h;
        return (arh0VarArr.length > 0 ? arh0VarArr[0] : this.a[0]).t(j, on51Var);
    }

    @Override // p.arh0
    public final qnf1 u() {
        qnf1 qnf1Var = this.g;
        qnf1Var.getClass();
        return qnf1Var;
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.f = zqh0Var;
        ArrayList arrayList = this.d;
        arh0[] arh0VarArr = this.a;
        Collections.addAll(arrayList, arh0VarArr);
        for (arh0 arh0Var : arh0VarArr) {
            arh0Var.v(this, j);
        }
    }

    @Override // p.v561
    public final long x() {
        return this.i.x();
    }

    @Override // p.v561
    public final void y(long j) {
        this.i.y(j);
    }
}
