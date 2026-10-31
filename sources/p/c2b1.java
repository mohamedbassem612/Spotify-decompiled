package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c2b1 implements arh0, u561 {
    public o2k X;
    public final d5b1 a;
    public final yeg1 b;
    public final jg10 c;
    public final o3b1 d;
    public final eyh0 e;
    public final boolean f;
    public final qnf1 g;
    public final List h;
    public zqh0 i;
    public cbg[] t;

    public c2b1(d5b1 d5b1Var, yeg1 yeg1Var, jg10 jg10Var, o3b1 o3b1Var, eyh0 eyh0Var, f9v f9vVar, dbu0 dbu0Var, boolean z) {
        this.a = d5b1Var;
        this.b = yeg1Var;
        this.c = jg10Var;
        this.d = o3b1Var;
        this.e = eyh0Var;
        this.f = z;
        Set set = d2b1.a;
        cbg[] cbgVarArr = new cbg[0];
        this.t = cbgVarArr;
        this.X = new o2k((v561[]) f46.i0(cbgVarArr).toArray(new cbg[0]));
        List list = ((rpl) d5b1Var.a.get(0)).d;
        this.h = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((xdx0) it.next()).b;
            if (!list2.isEmpty()) {
                int size = list2.size();
                ie30[] ie30VarArr = new ie30[size];
                for (int i = 0; i < size; i++) {
                    ie30 ie30VarB = ((zvw0) list2.get(i)).b;
                    if (ie30VarB.t != null) {
                        ie30VarB = ie30VarB.b(f9vVar.g(ie30VarB));
                    }
                    ie30VarArr[i] = jg10Var.c.t(ie30VarB);
                }
                ie30[] ie30VarArr2 = (ie30[]) f46.i0(ie30VarArr).toArray(new ie30[0]);
                arrayList.add(new pnf1("", (ie30[]) Arrays.copyOf(ie30VarArr2, ie30VarArr2.length)));
            }
        }
        ge30 ge30Var = new ge30();
        ge30Var.a = "track-debug-renderer";
        arrayList.add(new pnf1("", new ie30(ge30Var)));
        ge30 ge30Var2 = new ge30();
        ge30Var2.a = "track-progress-renderer";
        arrayList.add(new pnf1("", new ie30(ge30Var2)));
        ge30 ge30Var3 = new ge30();
        ge30Var3.a = "track-sync-renderer";
        arrayList.add(new pnf1("", new ie30(ge30Var3)));
        pnf1[] pnf1VarArr = (pnf1[]) o7h.o0(arrayList).toArray(new pnf1[0]);
        this.g = new qnf1((pnf1[]) Arrays.copyOf(pnf1VarArr, pnf1VarArr.length));
    }

    @Override // p.v561
    public final long a() {
        return this.X.a();
    }

    @Override // p.v561
    public final boolean b() {
        return this.X.b();
    }

    public final void c(v561 v561Var) {
        zqh0 zqh0Var = this.i;
        if (zqh0Var != null) {
            zqh0Var.c(this);
        } else {
            u890.C("callback");
            throw null;
        }
    }

    @Override // p.arh0
    public final long d(long j) {
        oba obaVar;
        boolean zC;
        oba obaVar2;
        for (cbg cbgVar : f46.i0(this.t)) {
            n541[] n541VarArr = cbgVar.Z;
            n541 n541Var = cbgVar.Y;
            eyh0 eyh0Var = cbgVar.h;
            ArrayList arrayList = cbgVar.t;
            cbgVar.R0 = j;
            int i = 0;
            cbgVar.U0 = false;
            if (cbgVar.B()) {
                cbgVar.Q0 = j;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        obaVar = (oba) arrayList.get(i2);
                        long j2 = obaVar.g;
                        if (j2 == j && obaVar.k == -9223372036854775807L) {
                            break;
                        }
                        if (j2 <= j) {
                            i2++;
                        }
                    }
                    obaVar = null;
                    break;
                }
                if (obaVar != null) {
                    zC = n541Var.B(obaVar.e(0));
                } else {
                    long jA = cbgVar.a();
                    zC = n541Var.C(j, jA == Long.MIN_VALUE || j < jA);
                }
                if (zC && (obaVar2 = cbgVar.T0) != null && obaVar2.e(0) <= n541Var.p()) {
                    zC = false;
                }
                if (zC) {
                    cbgVar.S0 = cbgVar.D(n541Var.p(), 0);
                    int length = n541VarArr.length;
                    while (i < length) {
                        n541VarArr[i].C(j, true);
                        i++;
                    }
                } else {
                    cbgVar.Q0 = j;
                    cbgVar.V0 = false;
                    arrayList.clear();
                    cbgVar.S0 = 0;
                    if (eyh0Var.q()) {
                        n541Var.j();
                        int length2 = n541VarArr.length;
                        while (i < length2) {
                            n541VarArr[i].j();
                            i++;
                        }
                        eyh0Var.a();
                    } else {
                        eyh0Var.d = null;
                        n541Var.A(false);
                        for (n541 n541Var2 : cbgVar.Z) {
                            n541Var2.A(false);
                        }
                    }
                }
            }
        }
        return j;
    }

    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qp00 qp00Var = (qp00) it.next();
            ie30 ie30Var = qp00Var.n().d[0];
            int i = asj0.i(ie30Var.f66p);
            String str = ie30Var.d;
            List list = this.h;
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                xdx0 xdx0Var = (xdx0) it2.next();
                if (xdx0Var.a == i && u890.j(xdx0Var.c, str)) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                List list2 = ((xdx0) list.get(i2)).b;
                int length = qp00Var.length();
                for (int i3 = 0; i3 < length; i3++) {
                    ie30 ie30VarE = qp00Var.e(i3);
                    int size = list2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        if (this.c.c.t(((zvw0) list2.get(i4)).b).equals(ie30VarE.b(0))) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 >= 0) {
                        arrayList2.add(new vdc1(0, i2, i4));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // p.arh0
    public final long g() {
        return -9223372036854775807L;
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        return this.X.i(hae0Var);
    }

    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        int iB;
        ie30 ie30VarS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = qp00VarArr.length;
        for (int i = 0; i < length; i++) {
            qp00 qp00Var = qp00VarArr[i];
            if (o7h.i0(d2b1.a, (qp00Var == null || (ie30VarS = qp00Var.s()) == null) ? null : ie30VarS.a)) {
                p641VarArr[i] = new pvc((byte) 8);
            } else {
                p641 p641Var = p641VarArr[i];
                boolean z = p641Var instanceof cbg;
                qnf1 qnf1Var = this.g;
                if (z) {
                    if (qp00Var == null || !zArr[i]) {
                        cbg cbgVar = (cbg) p641Var;
                        n541 n541Var = cbgVar.Y;
                        n541Var.j();
                        y8v y8vVar = n541Var.h;
                        if (y8vVar != null) {
                            y8vVar.c(n541Var.e);
                            n541Var.h = null;
                            n541Var.g = null;
                        }
                        for (n541 n541Var2 : cbgVar.Z) {
                            n541Var2.j();
                            y8v y8vVar2 = n541Var2.h;
                            if (y8vVar2 != null) {
                                y8vVar2.c(n541Var2.e);
                                n541Var2.h = null;
                                n541Var2.g = null;
                            }
                        }
                        cbgVar.h.x(cbgVar);
                        p641VarArr[i] = null;
                    } else {
                        linkedHashMap.put(Integer.valueOf(qnf1Var.b(qp00Var.n())), (cbg) p641Var);
                    }
                }
                if (p641VarArr[i] == null && qp00Var != null && (iB = qnf1Var.b(qp00Var.n())) != -1) {
                    xdx0 xdx0Var = (xdx0) this.h.get(iB);
                    jg10 jg10Var = this.c;
                    wss wssVar = new wss(jg10Var.b, jg10Var.c, this.e, this.a, iB, qp00Var, jg10Var.a.j(), this.b, jg10Var.d, jg10Var.e);
                    byte b = xdx0Var.a;
                    o3b1 o3b1Var = this.d;
                    cbg cbgVar2 = new cbg(b, wssVar, this, (hw3) o3b1Var.b, j, (f9v) o3b1Var.c, (b9v) o3b1Var.d, new ij81(o3b1Var.a, (byte) 12), (mgc) o3b1Var.e);
                    linkedHashMap.put(Integer.valueOf(iB), cbgVar2);
                    p641VarArr[i] = cbgVar2;
                    zArr2[i] = true;
                }
            }
        }
        int size = linkedHashMap.size();
        Set set = d2b1.a;
        this.t = new cbg[size];
        f46.W(0, 0, 14, linkedHashMap.values().toArray(new cbg[0]), this.t);
        this.X = new o2k((v561[]) f46.i0(this.t).toArray(new cbg[0]));
        return j;
    }

    @Override // p.arh0
    public final void q() throws IOException {
        this.e.s();
    }

    @Override // p.arh0
    public final void r(long j) throws Throwable {
        long j2;
        for (cbg cbgVar : f46.i0(this.t)) {
            if (!cbgVar.B()) {
                n541 n541Var = cbgVar.Y;
                int i = n541Var.q;
                n541Var.i(j, true);
                n541 n541Var2 = cbgVar.Y;
                int i2 = n541Var2.q;
                if (i2 > i) {
                    synchronized (n541Var2) {
                        j2 = n541Var2.f101p == 0 ? Long.MIN_VALUE : n541Var2.n[n541Var2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        n541[] n541VarArr = cbgVar.Z;
                        if (i3 >= n541VarArr.length) {
                            break;
                        }
                        n541VarArr[i3].i(j2, cbgVar.c[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(cbgVar.D(i2, 0), cbgVar.S0);
                if (iMin > 0) {
                    zoi1.d0(0, iMin, cbgVar.t);
                    cbgVar.S0 -= iMin;
                }
            }
        }
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        Object next;
        Iterator it = f46.i0(this.t).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cbg) next).a != 2);
        cbg cbgVar = (cbg) next;
        if (cbgVar != null) {
            List list = cbgVar.d.k;
            if (!list.isEmpty()) {
                zvw0 zvw0Var = (zvw0) list.get(0);
                int iD = zvw0Var.d(j);
                long j2 = zvw0Var.g;
                long j3 = ((long) iD) * j2;
                return on51Var.a(j, j3, (j3 >= j || iD >= zvw0Var.b() + (-1)) ? j3 : ((long) (iD + 1)) * j2);
            }
        }
        return j;
    }

    @Override // p.arh0
    public final qnf1 u() {
        return this.g;
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        this.i = zqh0Var;
        zqh0Var.j(this);
    }

    @Override // p.v561
    public final long x() {
        Iterator it = ((ArrayList) f46.i0(this.t)).iterator();
        long jMin = Long.MAX_VALUE;
        while (it.hasNext()) {
            long jX = ((cbg) it.next()).x();
            if (jX != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jX);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p.v561
    public final void y(long j) {
        if (this.f) {
            Iterator it = f46.i0(this.t).iterator();
            while (it.hasNext()) {
                ((cbg) it.next()).y(j);
            }
        }
    }
}
