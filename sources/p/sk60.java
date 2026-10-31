package p;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sk60 implements arh0, kl60 {
    public final boolean N0;
    public final dbu0 O0;
    public final fey P0 = new fey(this, (byte) 20);
    public zqh0 Q0;
    public int R0;
    public qnf1 S0;
    public rl60[] T0;
    public rl60[] U0;
    public int V0;
    public o2k W0;
    public final vr51 X;
    public long X0;
    public final twb Y;
    public final boolean Z;
    public final d1s a;
    public final h1s b;
    public final nk60 c;
    public final yeg1 d;
    public final f9v e;
    public final b9v f;
    public final ij81 g;
    public final mgc h;
    public final hw3 i;
    public final IdentityHashMap t;

    /* JADX WARN: Multi-variable type inference failed */
    public sk60(d1s d1sVar, h1s h1sVar, nk60 nk60Var, yeg1 yeg1Var, f9v f9vVar, b9v b9vVar, ij81 ij81Var, mgc mgcVar, hw3 hw3Var, twb twbVar, boolean z, int i, dbu0 dbu0Var) {
        this.a = d1sVar;
        this.b = h1sVar;
        this.c = nk60Var;
        this.d = yeg1Var;
        this.e = f9vVar;
        this.f = b9vVar;
        this.g = ij81Var;
        this.h = mgcVar;
        this.i = hw3Var;
        this.Y = twbVar;
        this.Z = z;
        this.N0 = i;
        this.O0 = dbu0Var;
        twbVar.getClass();
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.W0 = new o2k(bg11Var, bg11Var);
        this.t = new IdentityHashMap();
        this.X = new vr51();
        this.T0 = new rl60[0];
        this.U0 = new rl60[0];
        this.X0 = Long.MIN_VALUE;
    }

    public static ie30 j(ie30 ie30Var, ie30 ie30Var2, boolean z) {
        hjj0 hjj0Var;
        int i;
        String str;
        String str2;
        b380 b380Var;
        int i2;
        int i3;
        String str3;
        w280 w280Var = b380.b;
        b380 b380Var2 = bg11.e;
        if (ie30Var2 != null) {
            str2 = ie30Var2.l;
            hjj0Var = ie30Var2.m;
            i2 = ie30Var2.J;
            i = ie30Var2.e;
            i3 = ie30Var2.f;
            str = ie30Var2.d;
            str3 = ie30Var2.b;
            b380Var = ie30Var2.c;
        } else {
            String strB = zoi1.B(1, ie30Var.l);
            hjj0Var = ie30Var.m;
            if (z) {
                i2 = ie30Var.J;
                i = ie30Var.e;
                i3 = ie30Var.f;
                str = ie30Var.d;
                str3 = ie30Var.b;
                str2 = strB;
                b380Var = ie30Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strB;
                b380Var = b380Var2;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strE = asj0.e(str2);
        int i4 = z ? ie30Var.i : -1;
        int i5 = z ? ie30Var.j : -1;
        ge30 ge30Var = new ge30();
        ge30Var.a = ie30Var.a;
        ge30Var.b = str3;
        ge30Var.c = b380.p(b380Var);
        ge30Var.n = asj0.p(ie30Var.o);
        ge30Var.o = asj0.p(strE);
        ge30Var.k = str2;
        ge30Var.l = hjj0Var;
        ge30Var.i = i4;
        ge30Var.j = i5;
        ge30Var.I = i2;
        ge30Var.e = i;
        ge30Var.f = i3;
        ge30Var.d = str;
        return new ie30(ge30Var);
    }

    @Override // p.v561
    public final long a() {
        return this.W0.a();
    }

    @Override // p.v561
    public final boolean b() {
        return this.W0.b();
    }

    @Override // p.kl60
    public final void c() {
        for (rl60 rl60Var : this.T0) {
            eyh0 eyh0Var = rl60Var.t;
            lk60 lk60Var = rl60Var.d;
            ArrayList arrayList = rl60Var.N0;
            if (!arrayList.isEmpty()) {
                qk60 qk60Var = (qk60) hr80.r(arrayList);
                int iC = lk60Var.c(qk60Var);
                int i = qk60Var.o;
                if (iC == 1) {
                    if (!qk60Var.h()) {
                        dm5.y(i != -1);
                        bl60 bl60VarB = lk60Var.g.b(qk60Var.m, false);
                        bl60VarB.getClass();
                        b380 b380Var = bl60VarB.r;
                        int i2 = (int) (qk60Var.j - bl60VarB.k);
                        qk60Var.K = i2 < 0 ? 0L : ((wk60) (i2 < b380Var.size() ? ((yk60) b380Var.get(i2)).Z : bl60VarB.s).get(i)).c;
                    }
                } else if (iC == 0) {
                    rl60Var.R0.post(new ag20(rl60Var, qk60Var, (byte) 6));
                } else if (iC == 2 && !rl60Var.t1 && eyh0Var.q()) {
                    eyh0Var.a();
                }
            }
        }
        this.Q0.c(this);
    }

    @Override // p.arh0
    public final long d(long j) {
        rl60[] rl60VarArr = this.U0;
        if (rl60VarArr.length > 0) {
            boolean zM = rl60VarArr[0].M(j, false);
            int i = 1;
            while (true) {
                rl60[] rl60VarArr2 = this.U0;
                if (i >= rl60VarArr2.length) {
                    break;
                }
                rl60VarArr2[i].M(j, zM);
                i++;
            }
            if (zM) {
                ((SparseArray) this.X.b).clear();
            }
        }
        return j;
    }

    @Override // p.kl60
    public final boolean e(Uri uri, sw9 sw9Var, boolean z) {
        int i;
        boolean z2;
        boolean zA;
        b2e0 b2e0VarL;
        int iM;
        rl60[] rl60VarArr = this.T0;
        int length = rl60VarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            rl60 rl60Var = rl60VarArr[i2];
            lk60 lk60Var = rl60Var.d;
            ml60[] ml60VarArr = lk60Var.e;
            h1s h1sVar = lk60Var.g;
            int length2 = ml60VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    ml60 ml60Var = ml60VarArr[i3];
                    g1s g1sVar = (g1s) h1sVar.d.get(uri);
                    if (ml60Var.equals(g1sVar != null ? g1sVar.a : null)) {
                        if (z) {
                            b2e0VarL = null;
                        } else {
                            a2e0 a2e0VarA = lk60Var.a(uri);
                            rl60Var.i.getClass();
                            b2e0VarL = ij81.l(a2e0VarA, sw9Var);
                        }
                        lk60Var.f87p = uri;
                        if (b2e0VarL != null) {
                            byte b = b2e0VarL.b;
                            mk60 mk60Var = lk60Var.h;
                            if (mk60Var == null || !mk60Var.k) {
                                mk60Var = null;
                            }
                            i = i2;
                            boolean z4 = false;
                            long j = b2e0VarL.a;
                            if (b == 1) {
                                z2 = false;
                                if (mk60Var != null) {
                                    lk60Var.s.d();
                                    zA = mk60Var.a(j);
                                } else {
                                    g1s g1sVar2 = (g1s) h1sVar.d.get(uri);
                                    if (g1sVar2 != null) {
                                        zA = g1sVar2.a(j, uri, null);
                                    }
                                }
                            } else {
                                if (b != 2) {
                                    eg.m(f4i1.c(b, "Invalid fallback selection type: "));
                                    return false;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= ml60VarArr.length) {
                                        z2 = z4;
                                        i4 = -1;
                                        break;
                                    }
                                    ml60 ml60Var2 = ml60VarArr[i4];
                                    z2 = z4;
                                    g1s g1sVar3 = (g1s) h1sVar.d.get(uri);
                                    if (ml60Var2.equals(g1sVar3 != null ? g1sVar3.a : null)) {
                                        break;
                                    }
                                    i4++;
                                    z4 = z2;
                                }
                                if (i4 != -1 && (iM = lk60Var.s.m(i4)) != -1 && lk60Var.s.h(iM, j)) {
                                    g1s g1sVar4 = (g1s) h1sVar.d.get(uri);
                                    if (g1sVar4 != null ? g1sVar4.a(j, uri, null) : z2) {
                                        zA = true;
                                    }
                                }
                            }
                            z3 |= zA;
                            i2 = i + 1;
                        }
                        zA = z2;
                        z3 |= zA;
                        i2 = i + 1;
                    } else {
                        i3++;
                    }
                }
                i = i2;
                z2 = false;
                zA = z2;
                z3 |= zA;
                i2 = i + 1;
            }
        }
        this.Q0.c(this);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    @Override // p.arh0
    public final List f(ArrayList arrayList) {
        rl60 rl60Var;
        qnf1 qnf1Var;
        sk60 sk60Var = this;
        fl60 fl60Var = sk60Var.b.X;
        fl60Var.getClass();
        boolean zIsEmpty = fl60Var.e.isEmpty();
        boolean z = !zIsEmpty;
        int i = 0;
        if (zIsEmpty) {
            rl60Var = null;
            qnf1Var = null;
        } else {
            rl60Var = sk60Var.T0[0];
            rl60Var.z();
            qnf1Var = rl60Var.i1;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            qp00 qp00Var = (qp00) it.next();
            pnf1 pnf1VarN = qp00Var.n();
            int iB = qnf1Var != null ? qnf1Var.b(pnf1VarN) : -1;
            if (iB == -1) {
                ?? r14 = z;
                while (true) {
                    rl60[] rl60VarArr = sk60Var.T0;
                    if (r14 >= rl60VarArr.length) {
                        break;
                    }
                    rl60 rl60Var2 = rl60VarArr[r14];
                    rl60Var2.z();
                    qnf1 qnf1Var2 = rl60Var2.i1;
                    int iB2 = qnf1Var2.b(pnf1VarN);
                    if (iB2 != -1) {
                        if (iB2 == rl60Var2.l1) {
                            int i2 = qnf1Var2.a(iB2).c == 1 ? 1 : 2;
                            bg11 bg11VarQ = b380.q(rl60Var2.d.e);
                            for (int i3 = 0; i3 < qp00Var.length(); i3++) {
                                int i4 = 0;
                                w280 w280VarR = b380.p(((ml60) bg11VarQ.get(qp00Var.f(i3))).c).r(0);
                                while (w280VarR.hasNext()) {
                                    arrayList2.add(new vdc1(i4, i2, ((Integer) w280VarR.next()).intValue()));
                                    i4 = 0;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    sk60Var = this;
                    r14++;
                }
            } else if (iB == rl60Var.l1) {
                bg11 bg11VarQ2 = b380.q(rl60Var.d.e);
                for (int i5 = i; i5 < qp00Var.length(); i5++) {
                    w280 w280VarR2 = b380.p(((ml60) bg11VarQ2.get(qp00Var.f(i5))).c).r(i);
                    while (w280VarR2.hasNext()) {
                        arrayList2.add(new vdc1(i, i, ((Integer) w280VarR2.next()).intValue()));
                    }
                }
                z3 = true;
            } else {
                z2 = true;
            }
            sk60Var = this;
            i = 0;
        }
        if (!zIsEmpty && z2 && !z3) {
            bg11 bg11VarQ3 = b380.q(rl60Var.d.e);
            int i6 = ((ml60) bg11VarQ3.get(0)).a.a.k;
            int i7 = 0;
            for (int i8 = 1; i8 < bg11VarQ3.d; i8++) {
                int i9 = ((ml60) bg11VarQ3.get(i8)).a.a.k;
                if (i9 < i6) {
                    i6 = i9;
                    i7 = i8;
                }
            }
            w280 w280VarR3 = b380.p(((ml60) bg11VarQ3.get(i7)).c).r(0);
            while (w280VarR3.hasNext()) {
                arrayList2.add(new vdc1(0, 0, ((Integer) w280VarR3.next()).intValue()));
            }
        }
        return arrayList2;
    }

    @Override // p.arh0
    public final long g() {
        return -9223372036854775807L;
    }

    public final rl60 h(String str, int i, ml60[] ml60VarArr, ie30[] ie30VarArr, ie30 ie30Var, List list, Map map, long j) {
        rl60 rl60Var = new rl60(str, i, this.P0, new lk60(this.a, this.b, ml60VarArr, ie30VarArr, this.c, this.d, this.X, list, this.O0), map, this.i, j, ie30Var, this.e, this.f, this.g, this.h, this.N0 ? 1 : 0, null);
        rl60Var.N(this.X0);
        return rl60Var;
    }

    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        if (this.S0 != null) {
            return this.W0.i(hae0Var);
        }
        for (rl60 rl60Var : this.T0) {
            if (!rl60Var.d1) {
                gae0 gae0Var = new gae0();
                gae0Var.a = rl60Var.p1;
                rl60Var.i(new hae0(gae0Var));
            }
        }
        return false;
    }

    @Override // p.arh0
    public final long k(long j) {
        this.X0 = j;
        for (rl60 rl60Var : this.T0) {
            rl60Var.N(j);
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:160:0x032c  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // p.arh0
    public final long m(qp00[] qp00VarArr, boolean[] zArr, p641[] p641VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        lk60 lk60Var;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        rl60[] rl60VarArr;
        rl60 rl60Var;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        ?? r30;
        int[] iArr3 = new int[qp00VarArr.length];
        int[] iArr4 = new int[qp00VarArr.length];
        int i7 = 0;
        while (true) {
            int length = qp00VarArr.length;
            identityHashMap = this.t;
            if (i7 >= length) {
                break;
            }
            p641 p641Var = p641VarArr[i7];
            iArr3[i7] = p641Var == null ? -1 : ((Integer) identityHashMap.get(p641Var)).intValue();
            iArr4[i7] = -1;
            qp00 qp00Var = qp00VarArr[i7];
            if (qp00Var != null) {
                pnf1 pnf1VarN = qp00Var.n();
                int i8 = 0;
                while (true) {
                    rl60[] rl60VarArr2 = this.T0;
                    if (i8 >= rl60VarArr2.length) {
                        break;
                    }
                    rl60 rl60Var2 = rl60VarArr2[i8];
                    rl60Var2.z();
                    if (rl60Var2.i1.b(pnf1VarN) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = qp00VarArr.length;
        int length3 = qp00VarArr.length;
        p641[] p641VarArr2 = new p641[length3];
        int length4 = qp00VarArr.length;
        qp00[] qp00VarArr2 = new qp00[length4];
        boolean z4 = false;
        rl60[] rl60VarArr3 = new rl60[this.T0.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new p641[length2];
        Object[] objArr7 = p641VarArr2;
        while (i10 < this.T0.length) {
            int i12 = length2;
            ?? r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= qp00VarArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? p641VarArr[r7] : null;
                qp00VarArr2[r7] = iArr4[r7] == i10 ? qp00VarArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            rl60 rl60Var3 = this.T0[i10];
            eyh0 eyh0Var = rl60Var3.t;
            int i13 = i10;
            lk60 lk60Var2 = rl60Var3.d;
            ml60[] ml60VarArr = lk60Var2.e;
            h1s h1sVar = lk60Var2.g;
            ArrayList arrayList = rl60Var3.N0;
            rl60Var3.z();
            int i14 = rl60Var3.e1;
            Object[] objArr9 = objArr7;
            ?? r8 = z4;
            while (r8 < length4) {
                nl60 nl60Var = (nl60) objArr9[r8];
                if (nl60Var == null || (qp00VarArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    rl60Var3.e1--;
                    if (nl60Var.c != -1) {
                        rl60 rl60Var4 = nl60Var.b;
                        int i15 = nl60Var.a;
                        rl60Var4.z();
                        rl60Var4.k1.getClass();
                        int i16 = rl60Var4.k1[i15];
                        if (i16 >= 0) {
                            dm5.y(rl60Var4.n1[i16]);
                            rl60Var4.n1[i16] = z4;
                        }
                        nl60Var.c = -1;
                    }
                    objArr9[r30 == true ? 1 : 0] = null;
                }
                qp00VarArr2 = qp00VarArr2;
                r8 = r30 + 1;
            }
            qp00[] qp00VarArr3 = qp00VarArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (rl60Var3.s1) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != rl60Var3.p1) {
                        z = true;
                    }
                }
                z = z4;
            }
            qp00 qp00Var2 = lk60Var2.s;
            boolean z7 = z;
            qp00 qp00Var3 = qp00Var2;
            ?? r9 = z4;
            while (r9 < length4) {
                ?? r31 = r9;
                qp00 qp00Var4 = qp00VarArr3[r31 == true ? 1 : 0];
                if (qp00Var4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iB = rl60Var3.i1.b(qp00Var4.n());
                    if (iB == rl60Var3.l1) {
                        Uri uriB = ml60VarArr[lk60Var2.s.r()].b();
                        g1s g1sVar = (g1s) h1sVar.d.get(uriB);
                        if (g1sVar != null) {
                            HashMap map = g1sVar.b;
                            dm5.y(map.containsKey(uriB));
                            f1s f1sVar = (f1s) map.get(uriB);
                            f1sVar.getClass();
                            f1sVar.Y = z4;
                        }
                        lk60Var2.s = qp00Var4;
                        qp00Var3 = qp00Var4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        rl60Var3.e1++;
                        nl60 nl60Var2 = new nl60(rl60Var3, iB);
                        objArr9[r31 == true ? 1 : 0] = nl60Var2;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (rl60Var3.k1 != null) {
                            nl60Var2.a();
                            int i17 = rl60Var3.k1[iB];
                            if (z8 || i17 < 0) {
                                z7 = z8;
                            } else {
                                ql60 ql60Var = rl60Var3.V0[i17];
                                z7 = (ql60Var.p() == 0 || ql60Var.C(j, z6)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i18 = length4;
            boolean z9 = z7;
            if (rl60Var3.e1 == 0) {
                Uri uriB2 = ml60VarArr[lk60Var2.s.r()].b();
                g1s g1sVar2 = (g1s) h1sVar.d.get(uriB2);
                if (g1sVar2 != null) {
                    HashMap map2 = g1sVar2.b;
                    dm5.y(map2.containsKey(uriB2));
                    f1s f1sVar2 = (f1s) map2.get(uriB2);
                    f1sVar2.getClass();
                    f1sVar2.Y = false;
                }
                lk60Var2.o = null;
                rl60Var3.g1 = null;
                rl60Var3.r1 = true;
                arrayList.clear();
                if (eyh0Var.q()) {
                    if (rl60Var3.c1) {
                        for (ql60 ql60Var2 : rl60Var3.V0) {
                            ql60Var2.j();
                        }
                    }
                    eyh0Var.a();
                } else {
                    rl60Var3.L();
                }
                lk60Var = lk60Var2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                rl60VarArr = rl60VarArr3;
                rl60Var = rl60Var3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(qp00Var3, qp00Var2)) {
                    lk60Var = lk60Var2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    rl60VarArr = rl60VarArr3;
                    rl60Var = rl60Var3;
                } else {
                    if (rl60Var3.s1) {
                        lk60Var = lk60Var2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        rl60VarArr = rl60VarArr3;
                        rl60Var = rl60Var3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        qk60 qk60VarF = rl60Var3.F();
                        long j3 = j2;
                        vjh0[] vjh0VarArrB = lk60Var2.b(qk60VarF, j);
                        lk60Var = lk60Var2;
                        List list = rl60Var3.O0;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        rl60VarArr = rl60VarArr3;
                        rl60Var = rl60Var3;
                        qp00 qp00Var5 = qp00Var3;
                        qp00Var5.l(j, j3, -9223372036854775807L, list, vjh0VarArrB);
                        if (qp00Var5.r() != lk60Var.i.b(qk60VarF.d)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    rl60Var.r1 = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        rl60Var.M(j, z2);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    rl60Var.M(j, z2);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = rl60Var.S0;
            arrayList2.clear();
            for (int i19 = 0; i19 < i4; i19++) {
                Object obj = objArr9[i19];
                if (obj != null) {
                    arrayList2.add((nl60) obj);
                }
            }
            rl60Var.s1 = true;
            int i20 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i20 < qp00VarArr.length) {
                Object obj2 = objArr9[i20];
                int i21 = i3;
                if (iArr2[i20] == i21) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i20] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i21));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i20] == i21) {
                        dm5.y(obj2 == null);
                    }
                }
                i20++;
                objArr11 = objArr5;
                i3 = i21;
            }
            Object[] objArr12 = objArr11;
            int i22 = i3;
            int i23 = i11;
            if (z11) {
                rl60VarArr[i23] = rl60Var;
                i11 = i23 + 1;
                if (i23 == 0) {
                    lk60Var.m = true;
                    if (z3) {
                        ((SparseArray) this.X.b).clear();
                        z5 = true;
                    } else {
                        rl60[] rl60VarArr4 = this.U0;
                        if (rl60VarArr4.length == 0 || rl60Var != rl60VarArr4[0]) {
                            ((SparseArray) this.X.b).clear();
                            z5 = true;
                        }
                    }
                } else {
                    lk60Var.m = i22 < this.V0;
                }
            }
            i10 = i22 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            rl60VarArr3 = rl60VarArr;
            objArr7 = objArr9;
            qp00VarArr2 = qp00VarArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i18;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, p641VarArr, z12 ? 1 : 0, length2);
        rl60[] rl60VarArr5 = (rl60[]) zoi1.Y(i11, rl60VarArr3);
        this.U0 = rl60VarArr5;
        bg11 bg11VarQ = b380.q(rl60VarArr5);
        AbstractList abstractListD = z1p1.D(bg11VarQ, new cwa((byte) 8));
        this.Y.getClass();
        this.W0 = new o2k(bg11VarQ, abstractListD);
        return j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.arh0
    public final void q() throws ParserException, IOException {
        for (rl60 rl60Var : this.T0) {
            rl60Var.J();
            if (rl60Var.t1 && !rl60Var.d1) {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p.arh0
    public final void r(long j) throws Throwable {
        for (rl60 rl60Var : this.U0) {
            if (rl60Var.c1 && !rl60Var.H()) {
                int length = rl60Var.V0.length;
                for (int i = 0; i < length; i++) {
                    rl60Var.V0[i].i(j, rl60Var.n1[i]);
                }
            }
        }
    }

    @Override // p.arh0
    public final long t(long j, on51 on51Var) {
        for (rl60 rl60Var : this.U0) {
            if (rl60Var.a1 == 2) {
                lk60 lk60Var = rl60Var.d;
                h1s h1sVar = lk60Var.g;
                int iC = lk60Var.s.c();
                ml60[] ml60VarArr = lk60Var.e;
                bl60 bl60VarB = (iC >= ml60VarArr.length || iC == -1) ? null : h1sVar.b(ml60VarArr[lk60Var.s.r()].b(), true);
                if (bl60VarB == null) {
                    break;
                }
                b380 b380Var = bl60VarB.r;
                if (b380Var.isEmpty()) {
                    break;
                }
                long j2 = bl60VarB.h - h1sVar.V0;
                long j3 = j - j2;
                int iC2 = zoi1.c(b380Var, Long.valueOf(j3), true);
                long j4 = ((yk60) b380Var.get(iC2)).e;
                return on51Var.a(j3, j4, (!bl60VarB.c || iC2 == b380Var.size() - 1) ? j4 : ((yk60) b380Var.get(iC2 + 1)).e) + j2;
            }
        }
        return j;
    }

    @Override // p.arh0
    public final qnf1 u() {
        qnf1 qnf1Var = this.S0;
        qnf1Var.getClass();
        return qnf1Var;
    }

    @Override // p.arh0
    public final void v(zqh0 zqh0Var, long j) {
        String str;
        d1s d1sVar;
        boolean z;
        Map map;
        rl60[] rl60VarArr;
        int i;
        ArrayList arrayList;
        Map map2;
        List list;
        ArrayList arrayList2;
        int i2;
        HashSet hashSet;
        boolean z2;
        boolean z3;
        int i3;
        List list2;
        this.Q0 = zqh0Var;
        h1s h1sVar = this.b;
        h1sVar.getClass();
        h1sVar.e.add(this);
        fl60 fl60Var = h1sVar.X;
        fl60Var.getClass();
        Map map3 = Collections.EMPTY_MAP;
        b380 b380VarC = h1sVar.c(0);
        b380VarC.getClass();
        List listC = h1sVar.c(2);
        listC.getClass();
        b380 b380VarC2 = h1sVar.c(3);
        b380VarC2.getClass();
        boolean zIsEmpty = b380VarC.isEmpty();
        this.R0 = 0;
        ArrayList arrayList3 = new ArrayList();
        d1s d1sVar2 = this.a;
        boolean z4 = this.Z;
        if (zIsEmpty) {
            str = "ID3";
            d1sVar = d1sVar2;
            z = z4;
            map = map3;
        } else {
            ie30 ie30Var = fl60Var.j;
            List list3 = fl60Var.k;
            int size = b380VarC.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < b380VarC.size(); i6++) {
                ie30 ie30Var2 = ((ml60) b380VarC.get(i6)).a.a;
                int i7 = ie30Var2.x;
                String str2 = ie30Var2.l;
                if (i7 > 0 || zoi1.B(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (zoi1.B(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            ml60[] ml60VarArr = new ml60[i3];
            ie30[] ie30VarArr = new ie30[i3];
            int i11 = 0;
            boolean z5 = z2;
            int i12 = 0;
            while (i12 < b380VarC.size()) {
                if (z5) {
                    list2 = list3;
                    if (iArr[i12] == 2) {
                    }
                    i12++;
                    list3 = list2;
                } else {
                    list2 = list3;
                }
                if (!z3 || iArr[i12] != 1) {
                    ml60 ml60Var = (ml60) b380VarC.get(i12);
                    ml60VarArr[i11] = ml60Var;
                    ie30VarArr[i11] = ml60Var.a.a;
                    i11++;
                }
                i12++;
                list3 = list2;
            }
            List list4 = list3;
            String str3 = ie30VarArr[0].l;
            int iA = zoi1.A(2, str3);
            int i13 = 1;
            int iA2 = zoi1.A(1, str3);
            boolean z6 = (iA2 == 1 || (iA2 == 0 && listC.isEmpty())) && iA <= 1 && iA2 + iA > 0;
            if (z5 || iA2 <= 0) {
                i13 = 0;
            }
            d1sVar = d1sVar2;
            z = z4;
            rl60 rl60VarH = h("main", i13, ml60VarArr, ie30VarArr, ie30Var, list4, map3, j);
            arrayList3.add(rl60VarH);
            if (z && z6) {
                ArrayList arrayList4 = new ArrayList();
                if (iA > 0) {
                    ie30[] ie30VarArr2 = new ie30[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        ie30 ie30Var3 = ie30VarArr[i14];
                        ie30[] ie30VarArr3 = ie30VarArr;
                        Map map4 = map3;
                        String strB = zoi1.B(2, ie30Var3.l);
                        String strE = asj0.e(strB);
                        ge30 ge30Var = new ge30();
                        int i15 = i14;
                        ge30Var.a = ie30Var3.a;
                        ge30Var.b = ie30Var3.b;
                        ge30Var.c = b380.p(ie30Var3.c);
                        ge30Var.n = asj0.p(ie30Var3.o);
                        ge30Var.o = asj0.p(strE);
                        ge30Var.k = strB;
                        ge30Var.l = ie30Var3.m;
                        ge30Var.i = ie30Var3.i;
                        ge30Var.j = ie30Var3.j;
                        ge30Var.v = ie30Var3.w;
                        ge30Var.w = ie30Var3.x;
                        ge30Var.c(ie30Var3.B);
                        ge30Var.e = ie30Var3.e;
                        ge30Var.f = ie30Var3.f;
                        ge30Var.G = ie30Var3.H;
                        ie30VarArr2[i15] = new ie30(ge30Var);
                        i14 = i15 + 1;
                        ie30VarArr = ie30VarArr3;
                        map3 = map4;
                    }
                    ie30[] ie30VarArr4 = ie30VarArr;
                    map = map3;
                    arrayList4.add(new pnf1("main", ie30VarArr2));
                    if (iA2 > 0 && (ie30Var != null || listC.isEmpty())) {
                        ge30 ge30VarA = j(ie30VarArr4[0], ie30Var, false).a();
                        ge30VarA.m = "main";
                        arrayList4.add(new pnf1("main:audio", new ie30(ge30VarA)));
                    }
                    if (list4 != null) {
                        for (int i16 = 0; i16 < list4.size(); i16++) {
                            String strC = f4i1.c(i16, "main:cc:");
                            ge30 ge30VarA2 = d1sVar.c((ie30) list4.get(i16)).a();
                            ge30VarA2.m = "main";
                            arrayList4.add(new pnf1(strC, new ie30(ge30VarA2)));
                        }
                    }
                } else {
                    map = map3;
                    ie30[] ie30VarArr5 = new ie30[i3];
                    for (int i17 = 0; i17 < i3; i17++) {
                        ie30VarArr5[i17] = j(ie30VarArr[i17], ie30Var, true);
                    }
                    arrayList4.add(new pnf1("main", ie30VarArr5));
                }
                ge30 ge30Var2 = new ge30();
                str = "ID3";
                ge30Var2.a = str;
                ge30Var2.o = asj0.p("application/id3");
                ge30Var2.m = "main";
                pnf1 pnf1Var = new pnf1("main:id3", new ie30(ge30Var2));
                arrayList4.add(pnf1Var);
                rl60VarH.K((pnf1[]) arrayList4.toArray(new pnf1[0]), arrayList4.indexOf(pnf1Var));
            } else {
                map = map3;
                str = "ID3";
            }
        }
        ArrayList arrayList5 = new ArrayList(listC.size());
        ArrayList arrayList6 = new ArrayList(listC.size());
        HashSet hashSet2 = new HashSet();
        int i18 = 0;
        while (i18 < listC.size()) {
            String str4 = ((ml60) listC.get(i18)).a.c;
            str4.getClass();
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                boolean z7 = true;
                for (int i19 = 0; i19 < listC.size(); i19++) {
                    if (str4.equals(((ml60) listC.get(i19)).a.c)) {
                        ml60 ml60Var2 = (ml60) listC.get(i19);
                        ie30 ie30Var4 = ml60Var2.a.a;
                        arrayList5.add(ml60Var2);
                        arrayList6.add(ie30Var4);
                        z7 &= zoi1.A(1, ie30Var4.l) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = zoi1.a;
                List list5 = listC;
                arrayList = arrayList6;
                map2 = map;
                list = list5;
                arrayList2 = arrayList5;
                i2 = i18;
                hashSet = hashSet2;
                rl60 rl60VarH2 = h(strConcat, 1, (ml60[]) arrayList5.toArray(new ml60[0]), (ie30[]) arrayList6.toArray(new ie30[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList3.add(rl60VarH2);
                if (z && z7) {
                    String strConcat2 = strConcat.concat(":id3");
                    ge30 ge30Var3 = new ge30();
                    ge30Var3.a = str;
                    ge30Var3.o = asj0.p("application/id3");
                    ge30Var3.m = strConcat;
                    rl60VarH2.K(new pnf1[]{new pnf1(strConcat, (ie30[]) arrayList.toArray(new ie30[0])), new pnf1(strConcat2, new ie30(ge30Var3))}, 1);
                }
            } else {
                arrayList2 = arrayList5;
                hashSet = hashSet2;
                i2 = i18;
                map2 = map;
                list = listC;
                arrayList = arrayList6;
            }
            i18 = i2 + 1;
            arrayList6 = arrayList;
            arrayList5 = arrayList2;
            listC = list;
            hashSet2 = hashSet;
            map = map2;
        }
        Map map5 = map;
        this.V0 = arrayList3.size();
        ArrayList arrayList7 = new ArrayList(b380VarC2.size());
        ArrayList arrayList8 = new ArrayList(b380VarC2.size());
        HashSet hashSet3 = new HashSet();
        int i20 = 0;
        while (i20 < b380VarC2.size()) {
            String str6 = ((ml60) b380VarC2.get(i20)).a.c;
            str6.getClass();
            if (hashSet3.add(str6)) {
                arrayList7.clear();
                arrayList8.clear();
                for (int i21 = 0; i21 < b380VarC2.size(); i21++) {
                    if (str6.equals(((ml60) b380VarC2.get(i21)).a.c)) {
                        ml60 ml60Var3 = (ml60) b380VarC2.get(i21);
                        arrayList7.add(ml60Var3);
                        arrayList8.add(ml60Var3.a.a);
                    }
                }
                String strConcat3 = "subtitle:".concat(str6);
                ie30[] ie30VarArr6 = (ie30[]) arrayList8.toArray(new ie30[0]);
                String str7 = zoi1.a;
                ml60[] ml60VarArr2 = (ml60[]) arrayList7.toArray(new ml60[0]);
                w280 w280Var = b380.b;
                i = i20;
                rl60 rl60VarH3 = h(strConcat3, 3, ml60VarArr2, ie30VarArr6, null, bg11.e, map5, j);
                arrayList3.add(rl60VarH3);
                int length = ie30VarArr6.length;
                ie30[] ie30VarArr7 = new ie30[length];
                for (int i22 = 0; i22 < length; i22++) {
                    ie30VarArr7[i22] = d1sVar.c(ie30VarArr6[i22]);
                }
                rl60VarH3.K(new pnf1[]{new pnf1(strConcat3, ie30VarArr7)}, new int[0]);
            } else {
                i = i20;
            }
            i20 = i + 1;
        }
        rl60[] rl60VarArr2 = (rl60[]) arrayList3.toArray(new rl60[0]);
        this.T0 = rl60VarArr2;
        this.R0 = rl60VarArr2.length;
        int i23 = 0;
        while (true) {
            int i24 = this.V0;
            rl60VarArr = this.T0;
            if (i23 >= i24) {
                break;
            }
            rl60VarArr[i23].d.m = true;
            i23++;
        }
        for (rl60 rl60Var : rl60VarArr) {
            if (!rl60Var.d1) {
                gae0 gae0Var = new gae0();
                gae0Var.a = rl60Var.p1;
                rl60Var.i(new hae0(gae0Var));
            }
        }
        this.U0 = this.T0;
    }

    @Override // p.v561
    public final long x() {
        return this.W0.x();
    }

    @Override // p.v561
    public final void y(long j) {
        this.W0.y(j);
    }
}
