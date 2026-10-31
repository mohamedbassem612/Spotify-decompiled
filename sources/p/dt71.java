package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class dt71 extends ba implements sen0, phd, fx30 {
    public int X;
    public int Y;
    public final int e;
    public final int f;
    public final int g;
    public Object[] h;
    public long i;
    public long t;

    public dt71(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void m(dt71 dt71Var, vr20 vr20Var, lnm lnmVar) throws Throwable {
        ct71 ct71Var;
        dt71 dt71Var2;
        Throwable th;
        et71 et71Var;
        vr20 vr20Var2;
        faa0 faa0Var;
        if (lnmVar instanceof ct71) {
            ct71Var = (ct71) lnmVar;
            int i = ct71Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct71Var.g = i - Integer.MIN_VALUE;
            } else {
                ct71Var = new ct71(dt71Var, lnmVar);
            }
        } else {
            ct71Var = new ct71(dt71Var, lnmVar);
        }
        Object obj = ct71Var.e;
        int i2 = ct71Var.g;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                et71Var = ct71Var.c;
                vr20 vr20Var3 = ct71Var.b;
                dt71 dt71Var3 = ct71Var.a;
                try {
                    hm5.M(obj);
                    vr20Var2 = vr20Var3;
                    dt71Var = dt71Var3;
                    try {
                        faa0Var = (faa0) ct71Var.getContext().A(fkj0.W0);
                    } catch (Throwable th2) {
                        dt71Var2 = dt71Var;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dt71Var2 = dt71Var3;
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                faa0 faa0Var2 = ct71Var.d;
                et71Var = ct71Var.c;
                vr20 vr20Var4 = ct71Var.b;
                dt71Var2 = ct71Var.a;
                try {
                    hm5.M(obj);
                    vr20Var2 = vr20Var4;
                    faa0Var = faa0Var2;
                    dt71Var = dt71Var2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            dt71Var2.i(et71Var);
            throw th;
        }
        hm5.M(obj);
        et71 et71Var2 = (et71) dt71Var.f();
        try {
            if (vr20Var instanceof cnc1) {
                ct71Var.a = dt71Var;
                ct71Var.b = vr20Var;
                ct71Var.c = et71Var2;
                ct71Var.g = 1;
                if (((cnc1) vr20Var).b(ct71Var) == d9nVar) {
                    return;
                }
            }
            vr20Var2 = vr20Var;
            et71Var = et71Var2;
            faa0Var = (faa0) ct71Var.getContext().A(fkj0.W0);
        } catch (Throwable th5) {
            dt71Var2 = dt71Var;
            th = th5;
            et71Var = et71Var2;
        }
        while (true) {
            Object objU = dt71Var.u(et71Var);
            if (objU == mgo1.a) {
                ct71Var.a = dt71Var;
                ct71Var.b = vr20Var2;
                ct71Var.c = et71Var;
                ct71Var.d = faa0Var;
                ct71Var.g = 2;
                if (dt71Var.k(et71Var, ct71Var) == d9nVar) {
                    return;
                }
            } else {
                if (faa0Var != null) {
                    op71.y(faa0Var);
                }
                ct71Var.a = dt71Var;
                ct71Var.b = vr20Var2;
                ct71Var.c = et71Var;
                ct71Var.d = faa0Var;
                ct71Var.g = 3;
                if (vr20Var2.emit(objU, ct71Var) == d9nVar) {
                    return;
                }
            }
        }
    }

    @Override // p.sen0
    public final boolean a(Object obj) {
        int i;
        boolean z;
        lnm[] lnmVarArrP = si1.a;
        synchronized (this) {
            if (s(obj)) {
                lnmVarArrP = p(lnmVarArrP);
                z = true;
            } else {
                z = false;
            }
        }
        for (lnm lnmVar : lnmVarArrP) {
            if (lnmVar != null) {
                lnmVar.resumeWith(rih1.a);
            }
        }
        return z;
    }

    @Override // p.fx30
    public final mr20 b(o8n o8nVar, int i, int i2) {
        return mgo1.r(this, o8nVar, i, i2);
    }

    @Override // p.at71
    public final List c() {
        synchronized (this) {
            int iQ = (int) ((q() + ((long) this.X)) - this.i);
            if (iQ == 0) {
                return z6x.a;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.h;
            objArr.getClass();
            for (int i = 0; i < iQ; i++) {
                arrayList.add(mgo1.h(objArr, this.i + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        m(this, vr20Var, lnmVar);
        return d9n.a;
    }

    @Override // p.sen0
    public final void d() throws Throwable {
        dt71 dt71Var;
        synchronized (this) {
            try {
                dt71Var = this;
                try {
                    dt71Var.v(q() + ((long) this.X), this.t, q() + ((long) this.X), q() + ((long) this.X) + ((long) this.Y));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                dt71Var = this;
            }
        }
    }

    @Override // p.sen0, p.vr20
    public final Object emit(Object obj, lnm lnmVar) throws Throwable {
        dt71 dt71Var;
        Throwable th;
        lnm[] lnmVarArrP;
        bt71 bt71Var;
        if (a(obj)) {
            return rih1.a;
        }
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        lnm[] lnmVarArrP2 = si1.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        ohdVar.resumeWith(rih1.a);
                        lnmVarArrP = p(lnmVarArrP2);
                        bt71Var = null;
                        dt71Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        dt71Var = this;
                        throw th;
                    }
                } else {
                    try {
                        dt71Var = this;
                        try {
                            bt71 bt71Var2 = new bt71(dt71Var, q() + ((long) (this.X + this.Y)), obj, ohdVar);
                            dt71Var.o(bt71Var2);
                            dt71Var.Y++;
                            if (dt71Var.f == 0) {
                                lnmVarArrP2 = dt71Var.p(lnmVarArrP2);
                            }
                            lnmVarArrP = lnmVarArrP2;
                            bt71Var = bt71Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        dt71Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (bt71Var != null) {
                    jzn1.r(ohdVar, bt71Var);
                }
                for (lnm lnmVar2 : lnmVarArrP) {
                    if (lnmVar2 != null) {
                        lnmVar2.resumeWith(rih1.a);
                    }
                }
                Object objR = ohdVar.r();
                d9n d9nVar = d9n.a;
                if (objR != d9nVar) {
                    objR = rih1.a;
                }
                return objR == d9nVar ? objR : rih1.a;
            } catch (Throwable th5) {
                th = th5;
                dt71Var = this;
            }
        }
    }

    @Override // p.ba
    public final ca g() {
        et71 et71Var = new et71();
        et71Var.a = -1L;
        return et71Var;
    }

    @Override // p.ba
    public final ca[] h() {
        return new et71[2];
    }

    public final Object k(et71 et71Var, ct71 ct71Var) {
        ohd ohdVar = new ohd(1, aym.t(ct71Var));
        ohdVar.t();
        synchronized (this) {
            try {
                if (t(et71Var) < 0) {
                    et71Var.b = ohdVar;
                } else {
                    ohdVar.resumeWith(rih1.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1.a;
    }

    public final void l() {
        if (this.f != 0 || this.Y > 1) {
            Object[] objArr = this.h;
            objArr.getClass();
            while (this.Y > 0 && mgo1.h(objArr, (q() + ((long) (this.X + this.Y))) - 1) == mgo1.a) {
                this.Y--;
                mgo1.i(objArr, q() + ((long) (this.X + this.Y)), (Object) null);
            }
        }
    }

    public final void n() {
        ca[] caVarArr;
        Object[] objArr = this.h;
        objArr.getClass();
        mgo1.i(objArr, q(), (Object) null);
        this.X--;
        long jQ = q() + 1;
        if (this.i < jQ) {
            this.i = jQ;
        }
        if (this.t < jQ) {
            if (this.b != 0 && (caVarArr = this.a) != null) {
                for (ca caVar : caVarArr) {
                    if (caVar != null) {
                        et71 et71Var = (et71) caVar;
                        long j = et71Var.a;
                        if (0 <= j && j < jQ) {
                            et71Var.a = jQ;
                        }
                    }
                }
            }
            this.t = jQ;
        }
    }

    public final void o(Object obj) {
        int i = this.X + this.Y;
        Object[] objArrR = this.h;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i >= objArrR.length) {
            objArrR = r(i, objArrR.length * 2, objArrR);
        }
        mgo1.i(objArrR, q() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.lnm[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final lnm[] p(lnm[] lnmVarArr) {
        ca[] caVarArr;
        et71 et71Var;
        ohd ohdVar;
        int length = lnmVarArr.length;
        if (this.b != 0 && (caVarArr = this.a) != null) {
            int length2 = caVarArr.length;
            int i = 0;
            while (i < length2) {
                ca caVar = caVarArr[i];
                if (caVar == null || (ohdVar = (et71Var = (et71) caVar).b) == null || t(et71Var) < 0) {
                    lnmVarArr = lnmVarArr;
                } else {
                    if (length >= lnmVarArr.length) {
                        lnmVarArr = lnmVarArr;
                        lnmVarArr = lnmVarArr;
                        lnmVarArr = Arrays.copyOf((Object[]) lnmVarArr, Math.max(2, lnmVarArr.length * 2));
                    }
                    lnmVarArr = lnmVarArr;
                    lnmVarArr = lnmVarArr;
                    ((lnm[]) lnmVarArr)[length] = ohdVar;
                    et71Var.b = null;
                    length++;
                }
                i++;
                lnmVarArr = lnmVarArr;
            }
            lnmVarArr = lnmVarArr;
        }
        return (lnm[]) lnmVarArr;
    }

    public final long q() {
        return Math.min(this.t, this.i);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            eg.m("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long jQ = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jQ;
                mgo1.i(objArr2, j, mgo1.h(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    public final boolean s(Object obj) {
        int i;
        long jQ;
        long j;
        int i2 = this.b;
        int i3 = this.e;
        if (i2 != 0) {
            int i4 = this.X;
            int i5 = this.f;
            if (i4 < i5 || this.t > this.i) {
                o(obj);
                i = this.X + 1;
                this.X = i;
                if (i > i5) {
                    n();
                }
                jQ = q() + ((long) this.X);
                j = this.i;
                if (((int) (jQ - j)) > i3) {
                    v(1 + j, this.t, q() + ((long) this.X), q() + ((long) this.X) + ((long) this.Y));
                }
            } else {
                int iC = l1d.C(this.g);
                if (iC == 0) {
                    return false;
                }
                if (iC == 1) {
                    o(obj);
                    i = this.X + 1;
                    this.X = i;
                    if (i > i5) {
                        n();
                    }
                    jQ = q() + ((long) this.X);
                    j = this.i;
                    if (((int) (jQ - j)) > i3) {
                        v(1 + j, this.t, q() + ((long) this.X), q() + ((long) this.X) + ((long) this.Y));
                    }
                } else if (iC != 2) {
                    eg.o();
                    return false;
                }
            }
        } else if (i3 != 0) {
            o(obj);
            int i6 = this.X + 1;
            this.X = i6;
            if (i6 > i3) {
                n();
            }
            this.t = q() + ((long) this.X);
            return true;
        }
        return true;
    }

    public final long t(et71 et71Var) {
        long j = et71Var.a;
        if (j >= q() + ((long) this.X) && (this.f > 0 || j > q() || this.Y == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(et71 et71Var) {
        Object obj;
        lnm[] lnmVarArrW = si1.a;
        synchronized (this) {
            try {
                long jT = t(et71Var);
                if (jT < 0) {
                    obj = mgo1.a;
                } else {
                    long j = et71Var.a;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    Object objH = mgo1.h(objArr, jT);
                    if (objH instanceof bt71) {
                        objH = ((bt71) objH).c;
                    }
                    et71Var.a = jT + 1;
                    Object obj2 = objH;
                    lnmVarArrW = w(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lnm lnmVar : lnmVarArrW) {
            if (lnmVar != null) {
                lnmVar.resumeWith(rih1.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.h;
            objArr.getClass();
            mgo1.i(objArr, jQ, (Object) null);
        }
        this.i = j;
        this.t = j2;
        this.X = (int) (j3 - jMin);
        this.Y = (int) (j4 - j3);
    }

    public final lnm[] w(long j) {
        int i;
        long j2;
        long j3;
        lnm[] lnmVarArr;
        ca[] caVarArr;
        long j4 = this.t;
        lnm[] lnmVarArr2 = si1.a;
        if (j <= j4) {
            long jQ = q();
            long j5 = ((long) this.X) + jQ;
            int i2 = this.f;
            if (i2 == 0 && this.Y > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.b != 0 && (caVarArr = this.a) != null) {
                for (ca caVar : caVarArr) {
                    if (caVar != null) {
                        long j6 = ((et71) caVar).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.t) {
                long jQ2 = q() + ((long) this.X);
                int i4 = this.b;
                int iMin = this.Y;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jQ2 - j5)));
                }
                long j7 = ((long) this.Y) + jQ2;
                jm jmVar = mgo1.a;
                if (iMin > 0) {
                    lnm[] lnmVarArr3 = new lnm[iMin];
                    j3 = 1;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    int i5 = i2;
                    long j8 = jQ2;
                    while (true) {
                        if (jQ2 >= j7) {
                            j2 = j5;
                            i = i5;
                            break;
                        }
                        j2 = j5;
                        Object objH = mgo1.h(objArr, jQ2);
                        if (objH != jmVar) {
                            bt71 bt71Var = (bt71) objH;
                            int i6 = i3 + 1;
                            i = i5;
                            lnmVarArr3[i3] = bt71Var.d;
                            mgo1.i(objArr, jQ2, jmVar);
                            mgo1.i(objArr, j8, bt71Var.c);
                            j8++;
                            if (i6 >= iMin) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i5;
                        }
                        jQ2++;
                        j5 = j2;
                        i5 = i;
                    }
                    jQ2 = j8;
                    lnmVarArr = lnmVarArr3;
                } else {
                    i = i2;
                    j2 = j5;
                    j3 = 1;
                    lnmVarArr = lnmVarArr2;
                }
                long jMax = Math.max(this.i, Math.max(jQ, jQ2 - ((long) this.e)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (u890.j(mgo1.h(objArr2, jMax), jmVar)) {
                        jQ2 += j3;
                        jMax += j3;
                    }
                }
                long j9 = jQ2;
                v(jMax, this.b == 0 ? j9 : j2, j9, j7);
                l();
                return lnmVarArr.length == 0 ? lnmVarArr : p(lnmVarArr);
            }
        }
        return lnmVarArr2;
    }
}
