package p;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cbg implements p641, v561, d9e0, g9e0 {
    public final it8 N0;
    public yag O0;
    public ie30 P0;
    public long Q0;
    public long R0;
    public int S0;
    public oba T0;
    public boolean U0;
    public boolean V0;
    public final List X;
    public final n541 Y;
    public final n541[] Z;
    public final byte a;
    public final int[] b;
    public final boolean[] c;
    public final wss d;
    public final c2b1 e;
    public final mgc f;
    public final ij81 g;
    public final eyh0 h = new eyh0("ChunkSampleStream");
    public final lls0 i = new lls0((byte) 12);
    public final ArrayList t;

    public cbg(int i, wss wssVar, c2b1 c2b1Var, hw3 hw3Var, long j, f9v f9vVar, b9v b9vVar, ij81 ij81Var, mgc mgcVar) {
        this.a = i;
        int i2 = 0;
        int[] iArr = new int[0];
        this.b = iArr;
        this.d = wssVar;
        this.e = c2b1Var;
        this.f = mgcVar;
        this.g = ij81Var;
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        this.X = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.Z = new n541[length];
        this.c = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        n541[] n541VarArr = new n541[i3];
        f9vVar.getClass();
        n541 n541Var = new n541(hw3Var, f9vVar, b9vVar);
        this.Y = n541Var;
        iArr2[0] = i;
        n541VarArr[0] = n541Var;
        while (i2 < length) {
            n541 n541Var2 = new n541(hw3Var, null, null);
            this.Z[i2] = n541Var2;
            int i4 = i2 + 1;
            n541VarArr[i4] = n541Var2;
            iArr2[i4] = this.b[i2];
            i2 = i4;
        }
        this.N0 = new it8(iArr2, n541VarArr, (byte) 9);
        this.Q0 = j;
        this.R0 = j;
    }

    public final boolean A(int i) {
        int iP;
        oba obaVar = (oba) this.t.get(i);
        if (this.Y.p() > obaVar.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            n541[] n541VarArr = this.Z;
            if (i2 >= n541VarArr.length) {
                return false;
            }
            iP = n541VarArr[i2].p();
            i2++;
        } while (iP <= obaVar.e(i2));
        return true;
    }

    public final boolean B() {
        return this.Q0 != -9223372036854775807L;
    }

    public final void C() {
        int iD = D(this.Y.p(), this.S0 - 1);
        while (true) {
            int i = this.S0;
            if (i > iD) {
                return;
            }
            this.S0 = i + 1;
            oba obaVar = (oba) this.t.get(i);
            ie30 ie30Var = obaVar.d;
            if (!ie30Var.equals(this.P0)) {
                this.f.k(this.a, ie30Var, obaVar.e, obaVar.f, obaVar.g);
            }
            this.P0 = ie30Var;
        }
    }

    public final int D(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.t;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((oba) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    @Override // p.v561
    public final long a() {
        if (B()) {
            return this.Q0;
        }
        if (this.V0) {
            return Long.MIN_VALUE;
        }
        return z().h;
    }

    @Override // p.v561
    public final boolean b() {
        return this.h.q();
    }

    public final int c(w2z w2zVar, gar garVar, int i) {
        boolean z = (!this.U0 || this.V0 || this.h.l()) ? false : true;
        if (B() || z) {
            return -3;
        }
        oba obaVar = this.T0;
        n541 n541Var = this.Y;
        if (obaVar != null && obaVar.e(0) <= n541Var.p()) {
            return -3;
        }
        C();
        return n541Var.z(w2zVar, garVar, i, this.V0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final void e() throws DrmSession.DrmSessionException, IOException {
        eyh0 eyh0Var = this.h;
        eyh0Var.s();
        this.Y.w();
        if (eyh0Var.q()) {
            return;
        }
        wss wssVar = this.d;
        BehindLiveWindowException behindLiveWindowException = wssVar.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        wssVar.c.s();
    }

    public final int getFlags() {
        return this.U0 ? 4 : 0;
    }

    public final void h(f9e0 f9e0Var, long j, long j2, int i) {
        yag yagVar = (yag) f9e0Var;
        c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
        if (i != 0) {
            rsb1 rsb1Var = yagVar.i;
            c2e0Var.d = rsb1Var.c;
            c2e0Var.e = rsb1Var.d;
            c2e0Var.f = j2;
            c2e0Var.g = rsb1Var.b;
        }
        this.f.L(new d2e0(c2e0Var), yagVar.c, this.a, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h, i);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0253 A[EDGE_INSN: B:116:0x0253->B:77:0x0253 BREAK  A[LOOP:4: B:64:0x0219->B:76:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0173  */
    /* JADX WARN: Code duplicated, block: B:49:0x018b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0199  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0200  */
    /* JADX WARN: Code duplicated, block: B:63:0x020e  */
    /* JADX WARN: Code duplicated, block: B:65:0x021b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0234  */
    /* JADX WARN: Code duplicated, block: B:69:0x0238  */
    /* JADX WARN: Code duplicated, block: B:76:0x024c A[LOOP:4: B:64:0x0219->B:76:0x024c, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.v561
    public final boolean i(hae0 hae0Var) {
        long j;
        List list;
        boolean z;
        lls0 lls0Var;
        long jB;
        tjh0 tjh0Var;
        long jC;
        long j2;
        int iMin;
        int iT;
        Object objJ;
        long j3;
        long jC2;
        vqz0 vqz0VarE;
        n3r n3rVarP;
        long j4;
        long j5;
        vqz0 vqz0Var;
        int i;
        int i2;
        Object enlVar;
        vqz0 vqz0VarE2;
        String strP;
        long j6;
        long j7;
        i5w0 i5w0VarD;
        ua91 ua91Var;
        if (!this.V0) {
            eyh0 eyh0Var = this.h;
            if (!eyh0Var.q() && !eyh0Var.l()) {
                boolean zB = B();
                if (zB) {
                    list = Collections.EMPTY_LIST;
                    j = this.Q0;
                } else {
                    j = z().h;
                    list = this.X;
                }
                List list2 = list;
                wss wssVar = this.d;
                o2r o2rVar = wssVar.g;
                ua91 ua91Var2 = wssVar.a;
                qp00 qp00Var = wssVar.f;
                BehindLiveWindowException behindLiveWindowException = wssVar.n;
                lls0 lls0Var2 = this.i;
                if (behindLiveWindowException != null) {
                    z = zB;
                    lls0Var = lls0Var2;
                } else {
                    long j8 = hae0Var.a;
                    long j9 = j - j8;
                    int length = qp00Var.length();
                    vjh0[] vjh0VarArr = new vjh0[length];
                    boolean z2 = true;
                    List list3 = wssVar.a().b;
                    z = zB;
                    long j10 = ((rpl) wssVar.d.a.get(0)).c;
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = i3;
                        ie30 ie30VarB = qp00Var.e(i3).b(0);
                        Iterator it = list3.iterator();
                        it.getClass();
                        while (true) {
                            if (!it.hasNext()) {
                                i5w0VarD = j5.a;
                                break;
                            }
                            Object next = it.next();
                            Iterator it2 = it;
                            if (((zvw0) next).b.equals(ie30VarB)) {
                                i5w0VarD = spq0.d(next);
                                break;
                            }
                            it = it2;
                        }
                        zvw0 zvw0Var = (zvw0) i5w0VarD.h();
                        if (zvw0Var != null) {
                            ua91Var = ua91Var2;
                            vjh0VarArr[i4] = new n3b1(zvw0Var, ua91Var, zvw0Var.d(j8), zvw0Var.b() - 1, j10, wssVar.h, wssVar.i);
                        } else {
                            ua91Var = ua91Var2;
                        }
                        z2 = z2;
                        list3 = list3;
                        i3 = i4 + 1;
                        ua91Var2 = ua91Var;
                        j10 = j10;
                    }
                    ua91 ua91Var3 = ua91Var2;
                    boolean z3 = z2;
                    long j11 = j10;
                    long j12 = j;
                    lls0Var = lls0Var2;
                    qp00Var.l(j8, j9, -9223372036854775807L, list2, vjh0VarArr);
                    zvw0 zvw0VarB = wssVar.b();
                    if (zvw0VarB == null) {
                        eg.m("Required value was null.");
                        return false;
                    }
                    if (wssVar.l && zvw0VarB.i == null) {
                        lls0Var.b = z3;
                    } else {
                        ie30 ie30VarS = qp00Var.s();
                        List list4 = zvw0VarB.c;
                        ua91Var3.e = list4;
                        String str = (String) ua91Var3.C(list4).a;
                        adc adcVar = zvw0VarB.i;
                        if (adcVar == null) {
                            jB = ((long) zvw0VarB.b()) - 1;
                            tjh0Var = (tjh0) o7h.C0(list2);
                            if (tjh0Var == null) {
                                jC = zoi1.k(zvw0VarB.d(j8), 0L, jB);
                            } else {
                                jC = tjh0Var.c();
                                if (jC < 0) {
                                    wssVar.n = new BehindLiveWindowException();
                                }
                            }
                            if (jC > jB) {
                                lls0Var.b = true;
                            } else {
                                if (list2.isEmpty()) {
                                    j2 = j12;
                                } else {
                                    j2 = -9223372036854775807L;
                                }
                                iMin = (int) Math.min(wssVar.j, (jB - jC) + 1);
                                iT = qp00Var.t();
                                objJ = qp00Var.j();
                                boolean z4 = wssVar.h;
                                boolean z5 = wssVar.i;
                                j3 = jC * zvw0VarB.g;
                                jC2 = zvw0VarB.c(jC) + j3;
                                vqz0VarE = zvw0VarB.e(jC);
                                n3rVarP = g9p1.p(zvw0VarB, str, vqz0VarE, j11, z4, z5, j3, jC2, 64);
                                if (adcVar == null) {
                                    enlVar = new k191(o2rVar, n3rVarP, ie30VarS, iT, objJ, j3, jC2, jC, ie30VarS);
                                } else {
                                    j4 = jC;
                                    j5 = 0;
                                    vqz0Var = vqz0VarE;
                                    i = 1;
                                    i2 = 1;
                                    while (i < iMin) {
                                        vqz0VarE2 = zvw0VarB.e(j4 + ((long) i));
                                        strP = pno1.p(str, vqz0Var.b);
                                        if (strP.equals(pno1.p(str, vqz0VarE2.b))) {
                                            j6 = j5;
                                            j7 = vqz0Var.a;
                                            if (j7 == -1 && j7 == j6) {
                                                vqz0Var = new vqz0(strP, -1L);
                                            }
                                            if (vqz0Var == null) {
                                                break;
                                            }
                                            i2++;
                                            i++;
                                            j5 = j6;
                                        } else {
                                            j6 = j5;
                                        }
                                        vqz0Var = null;
                                        if (vqz0Var == null) {
                                            break;
                                            break;
                                        }
                                        i2++;
                                        i++;
                                        j5 = j6;
                                    }
                                    enlVar = new enl(o2rVar, n3rVarP, ie30VarS, iT, objJ, j3, jC2, j2, j4, i2, adcVar);
                                }
                                lls0Var.c = enlVar;
                            }
                        } else {
                            vqz0 vqz0Var2 = adcVar.h == null ? new vqz0(nhc1.W(zvw0VarB.d, "{{profile_id}}", String.valueOf(zvw0VarB.a)), -1L) : null;
                            if (vqz0Var2 != null) {
                                lls0Var.c = new xc80(o2rVar, g9p1.p(zvw0VarB, str, vqz0Var2, j11, wssVar.h, wssVar.i, 0L, 0L, 384), ie30VarS, qp00Var.t(), qp00Var.j(), adcVar);
                            } else {
                                jB = ((long) zvw0VarB.b()) - 1;
                                tjh0Var = (tjh0) o7h.C0(list2);
                                if (tjh0Var == null) {
                                    jC = zoi1.k(zvw0VarB.d(j8), 0L, jB);
                                } else {
                                    jC = tjh0Var.c();
                                    if (jC < 0) {
                                        wssVar.n = new BehindLiveWindowException();
                                    }
                                }
                                if (jC > jB) {
                                    lls0Var.b = true;
                                } else {
                                    if (list2.isEmpty()) {
                                        j2 = j12;
                                    } else {
                                        j2 = -9223372036854775807L;
                                    }
                                    iMin = (int) Math.min(wssVar.j, (jB - jC) + 1);
                                    iT = qp00Var.t();
                                    objJ = qp00Var.j();
                                    boolean z6 = wssVar.h;
                                    boolean z7 = wssVar.i;
                                    j3 = jC * zvw0VarB.g;
                                    jC2 = zvw0VarB.c(jC) + j3;
                                    vqz0VarE = zvw0VarB.e(jC);
                                    n3rVarP = g9p1.p(zvw0VarB, str, vqz0VarE, j11, z6, z7, j3, jC2, 64);
                                    if (adcVar == null) {
                                        enlVar = new k191(o2rVar, n3rVarP, ie30VarS, iT, objJ, j3, jC2, jC, ie30VarS);
                                    } else {
                                        j4 = jC;
                                        j5 = 0;
                                        vqz0Var = vqz0VarE;
                                        i = 1;
                                        i2 = 1;
                                        while (i < iMin) {
                                            vqz0VarE2 = zvw0VarB.e(j4 + ((long) i));
                                            strP = pno1.p(str, vqz0Var.b);
                                            if (strP.equals(pno1.p(str, vqz0VarE2.b))) {
                                                j6 = j5;
                                            } else {
                                                j6 = j5;
                                                j7 = vqz0Var.a;
                                                if (j7 == -1) {
                                                }
                                                if (vqz0Var == null) {
                                                    break;
                                                    break;
                                                }
                                                i2++;
                                                i++;
                                                j5 = j6;
                                            }
                                            vqz0Var = null;
                                            if (vqz0Var == null) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                            i++;
                                            j5 = j6;
                                        }
                                        enlVar = new enl(o2rVar, n3rVarP, ie30VarS, iT, objJ, j3, jC2, j2, j4, i2, adcVar);
                                    }
                                    lls0Var.c = enlVar;
                                }
                            }
                        }
                    }
                }
                boolean z8 = lls0Var.b;
                yag yagVar = (yag) lls0Var.c;
                lls0Var.c = null;
                lls0Var.b = false;
                if (z8) {
                    this.Q0 = -9223372036854775807L;
                    this.V0 = true;
                    return true;
                }
                if (yagVar == null) {
                    return false;
                }
                this.O0 = yagVar;
                boolean z9 = yagVar instanceof oba;
                it8 it8Var = this.N0;
                if (z9) {
                    oba obaVar = (oba) yagVar;
                    if (z) {
                        long j13 = obaVar.g;
                        long j14 = this.Q0;
                        if (j13 < j14) {
                            this.Y.t = j14;
                            for (n541 n541Var : this.Z) {
                                n541Var.t = this.Q0;
                            }
                            this.U0 = false;
                        }
                        this.Q0 = -9223372036854775807L;
                    }
                    obaVar.l = it8Var;
                    n541[] n541VarArr = (n541[]) it8Var.c;
                    int[] iArr = new int[n541VarArr.length];
                    for (int i5 = 0; i5 < n541VarArr.length; i5++) {
                        iArr[i5] = n541VarArr[i5].t();
                    }
                    obaVar.m = iArr;
                    this.t.add(obaVar);
                } else if (yagVar instanceof xc80) {
                    ((xc80) yagVar).k = it8Var;
                }
                eyh0Var.H(yagVar, this, this.g.m(yagVar.c));
                return true;
            }
        }
        return false;
    }

    public final boolean isReady() {
        return !B() && this.Y.u(this.V0);
    }

    public final void j(f9e0 f9e0Var, long j, long j2) {
        yag yagVar = (yag) f9e0Var;
        this.O0 = null;
        wss wssVar = this.d;
        ua91 ua91Var = wssVar.a;
        Uri uri = yagVar.b.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ua91Var.d;
        String strA = v2b1.a(uri);
        if (strA != null) {
            Integer num = (Integer) linkedHashMap.get(strA);
            linkedHashMap.put(strA, Integer.valueOf(Math.max(0, num != null ? num.intValue() : 0) - 1));
            ((LinkedHashMap) ua91Var.c).remove(strA);
        }
        wssVar.m = 0;
        wssVar.n = null;
        c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
        rsb1 rsb1Var = yagVar.i;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        this.f.I(new d2e0(c2e0Var), yagVar.c, this.a, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h);
        this.e.c(this);
    }

    @Override // p.g9e0
    public final void l() {
        n541 n541Var = this.Y;
        n541Var.A(true);
        y8v y8vVar = n541Var.h;
        if (y8vVar != null) {
            y8vVar.c(n541Var.e);
            n541Var.h = null;
            n541Var.g = null;
        }
        for (n541 n541Var2 : this.Z) {
            n541Var2.A(true);
            y8v y8vVar2 = n541Var2.h;
            if (y8vVar2 != null) {
                y8vVar2.c(n541Var2.e);
                n541Var2.h = null;
                n541Var2.g = null;
            }
        }
        Iterator it = this.d.k.iterator();
        while (it.hasNext()) {
            adc adcVar = ((zvw0) it.next()).i;
            if (adcVar != null) {
                adcVar.a.release();
            }
        }
    }

    public final void n(f9e0 f9e0Var, long j, long j2, boolean z) {
        yag yagVar = (yag) f9e0Var;
        this.O0 = null;
        this.T0 = null;
        c2e0 c2e0Var = new c2e0(yagVar.a, yagVar.b, j);
        rsb1 rsb1Var = yagVar.i;
        c2e0Var.d = rsb1Var.c;
        c2e0Var.e = rsb1Var.d;
        c2e0Var.f = j2;
        c2e0Var.g = rsb1Var.b;
        this.f.H(new d2e0(c2e0Var), yagVar.c, this.a, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h);
        if (z) {
            return;
        }
        if (B()) {
            this.Y.A(false);
            for (n541 n541Var : this.Z) {
                n541Var.A(false);
            }
        } else if (yagVar instanceof oba) {
            ArrayList arrayList = this.t;
            w(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.Q0 = this.R0;
            }
        }
        this.e.c(this);
    }

    public final o4t o(f9e0 f9e0Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        o4t o4tVar;
        long jMin;
        yag yagVar = (yag) f9e0Var;
        rsb1 rsb1Var = yagVar.i;
        n3r n3rVar = yagVar.b;
        ie30 ie30Var = yagVar.d;
        long j3 = rsb1Var.b;
        boolean z2 = yagVar instanceof oba;
        ArrayList arrayList = this.t;
        int size = arrayList.size() - 1;
        boolean z3 = (j3 != 0 && z2 && A(size)) ? false : true;
        c2e0 c2e0Var = new c2e0(yagVar.a, n3rVar, j);
        rsb1 rsb1Var2 = yagVar.i;
        c2e0Var.d = rsb1Var2.c;
        c2e0Var.e = rsb1Var2.d;
        c2e0Var.f = j2;
        c2e0Var.g = j3;
        d2e0 d2e0Var = new d2e0(c2e0Var);
        String str = zoi1.a;
        wss wssVar = this.d;
        ua91 ua91Var = wssVar.a;
        Uri uri = n3rVar.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ua91Var.d;
        String strA = v2b1.a(uri);
        if (strA != null) {
            Integer num = (Integer) linkedHashMap.get(strA);
            linkedHashMap.put(strA, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            ((LinkedHashMap) ua91Var.c).put(strA, Long.valueOf(((yqg) ua91Var.b).e()));
        }
        zvw0 zvw0VarB = wssVar.b();
        if (zvw0VarB != null && ((Boolean) ua91Var.C(zvw0VarB.c).b).booleanValue()) {
            wssVar.m++;
        }
        if (zvw0VarB != null && wssVar.m < 3) {
            z = z3;
        } else if (u890.j(ie30Var.f66p, "text/vtt") || u890.j(ie30Var.f66p, "application/x-subrip")) {
            wssVar.l = true;
            z = z3;
        } else {
            z = false;
        }
        if (!z) {
            o4tVar = null;
        } else if (z3) {
            o4tVar = eyh0.Y;
            if (z2) {
                dm5.y(w(size) == yagVar);
                if (arrayList.isEmpty()) {
                    this.Q0 = this.R0;
                }
            }
        } else {
            oon1.H("Ignoring attempt to cancel non-cancelable load.");
            o4tVar = null;
        }
        if (o4tVar == null) {
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008)) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
            o4tVar = jMin != -9223372036854775807L ? new o4t(0, jMin) : eyh0.Z;
        }
        boolean zE = o4tVar.e();
        this.f.J(d2e0Var, yagVar.c, this.a, yagVar.d, yagVar.e, yagVar.f, yagVar.g, yagVar.h, iOException, !zE);
        if (!zE) {
            this.O0 = null;
            this.e.c(this);
        }
        return o4tVar;
    }

    public final int s(long j) throws Throwable {
        boolean z = (!this.U0 || this.V0 || this.h.l()) ? false : true;
        if (B() || z) {
            return 0;
        }
        boolean z2 = this.V0;
        n541 n541Var = this.Y;
        int iR = n541Var.r(j, z2);
        oba obaVar = this.T0;
        if (obaVar != null) {
            iR = Math.min(iR, obaVar.e(0) - n541Var.p());
        }
        n541Var.E(iR);
        C();
        return iR;
    }

    public final oba w(int i) {
        ArrayList arrayList = this.t;
        oba obaVar = (oba) arrayList.get(i);
        zoi1.d0(i, arrayList.size(), arrayList);
        this.S0 = Math.max(this.S0, arrayList.size());
        int i2 = 0;
        this.Y.l(obaVar.e(0));
        while (true) {
            n541[] n541VarArr = this.Z;
            if (i2 >= n541VarArr.length) {
                return obaVar;
            }
            n541 n541Var = n541VarArr[i2];
            i2++;
            n541Var.l(obaVar.e(i2));
        }
    }

    @Override // p.v561
    public final long x() {
        long j;
        ArrayList arrayList = this.t;
        if (this.V0) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.Q0;
        }
        long jMax = this.R0;
        oba obaVarZ = z();
        if (!obaVarZ.d()) {
            obaVarZ = arrayList.size() > 1 ? (oba) l1d.i(2, arrayList) : null;
        }
        if (obaVarZ != null) {
            jMax = Math.max(jMax, obaVarZ.h);
        }
        n541 n541Var = this.Y;
        synchronized (n541Var) {
            j = n541Var.w;
        }
        return Math.max(jMax, j);
    }

    @Override // p.v561
    public final void y(long j) {
        wss wssVar = this.d;
        qp00 qp00Var = wssVar.f;
        eyh0 eyh0Var = this.h;
        if (eyh0Var.l() || B()) {
            return;
        }
        boolean zQ = eyh0Var.q();
        List list = this.X;
        ArrayList arrayList = this.t;
        if (zQ) {
            yag yagVar = this.O0;
            yagVar.getClass();
            boolean z = yagVar instanceof oba;
            if (z && A(arrayList.size() - 1)) {
                return;
            }
            if (wssVar.n == null ? qp00Var.b(j, yagVar, list) : false) {
                eyh0Var.a();
                if (z) {
                    this.T0 = (oba) yagVar;
                    return;
                }
                return;
            }
            return;
        }
        int iMin = Math.min(arrayList.size(), (wssVar.n != null || qp00Var.length() < 2) ? list.size() : qp00Var.q(j, list));
        if (iMin < arrayList.size()) {
            dm5.y(!eyh0Var.q());
            int size = arrayList.size();
            while (true) {
                if (iMin >= size) {
                    iMin = -1;
                    break;
                } else if (!A(iMin)) {
                    break;
                } else {
                    iMin++;
                }
            }
            if (iMin == -1) {
                return;
            }
            long j2 = z().h;
            oba obaVarW = w(iMin);
            if (arrayList.isEmpty()) {
                this.Q0 = this.R0;
            }
            this.V0 = false;
            qqh0 qqh0Var = new qqh0(1, this.a, null, 3, null, zoi1.n0(obaVarW.g), zoi1.n0(j2));
            mgc mgcVar = this.f;
            p2i0 p2i0Var = (p2i0) mgcVar.c;
            p2i0Var.getClass();
            mgcVar.j(new k65(mgcVar, p2i0Var, qqh0Var, (byte) 15));
        }
    }

    public final oba z() {
        return (oba) l1d.i(1, this.t);
    }
}
