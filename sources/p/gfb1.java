package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gfb1 implements tyq {
    public final wen0 a;
    public final d0r b;
    public final boolean c;
    public final idd1 d;
    public final d0r e;
    public final iik0 f;
    public final o3r g;
    public final js20 h;
    public final lm1 i;
    public final psw t;

    public gfb1(d0r d0rVar, vbs vbsVar, jq4 jq4Var, jxp jxpVar, bpb1 bpb1Var) {
        this.a = bpb1Var;
        d0r d0rVar2 = d0rVar;
        this.b = d0rVar2;
        this.c = vbsVar.g;
        this.d = new idd1(new gga1(jxpVar, (byte) 22));
        this.e = jq4Var.v() ? d0rVar2 : null;
        this.f = new iik0(this, (byte) 21);
        jd11 jd11Var = rc11.a;
        this.g = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, seb1.O0, new j4r(seb1.t), seb1.P0), new l4r(new wlu(jd11Var.b(mtl.class)), 2, seb1.X, new j4r(new zeb1(this, (byte) 2)), seb1.Y), new l4r(jd0.h, 2, seb1.Z, new j4r(new zeb1(this, (byte) 3)), seb1.N0), xi81.i);
        this.h = jq4Var.a() ? z0o1.j(new zeb1(this, (byte) 0), new t491(this, (byte) 15), (iu30) null, 12) : z0o1.j(new zeb1(this, (byte) 1), new t491(this, (byte) 16), (iu30) null, 12);
        this.i = new lm1(n3o1.q(this).a(vva1.N0, vva1.O0), (byte) 1);
        j2i j2iVar = new j2i(1610812557, new u491(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final d0r e() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d A[LOOP:0: B:42:0x0107->B:44:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    public final void f(xeb1 xeb1Var, b0k b0kVar, int i) {
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        ArrayList arrayList;
        Iterator it;
        boolean z;
        String str = xeb1Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1602378679);
        int i2 = (i & 6) == 0 ? (x340Var.g(xeb1Var) ? 4 : 2) | i : i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            List list = xeb1Var.b;
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                x340Var.i0(2098946644);
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, nim0.a);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                List list3 = list;
                arrayList = new ArrayList(q7h.U(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qpc1) it.next()).a);
                }
                if (x340Var.k(t4k.n) == flb0.b) {
                    z = true;
                } else {
                    z = false;
                }
                String strY = cev0.y(str, arrayList, z);
                uwr uwrVar = cbx.a;
                uwo1.e(strY, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572864, 0, 1722);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        x340Var.i0(2098946644);
                        jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, nim0.a);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        List list4 = list;
                        arrayList = new ArrayList(q7h.U(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((qpc1) it.next()).a);
                        }
                        if (x340Var.k(t4k.n) == flb0.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String strY2 = cev0.y(str, arrayList, z);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(strY2, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572864, 0, 1722);
                        x340Var = x340Var;
                        x340Var.r(true);
                        x340Var.r(false);
                    } else if (((qpc1) it2.next()).c != null) {
                        x340Var.i0(2098604683);
                        List<qpc1> list5 = list;
                        ArrayList arrayList2 = new ArrayList(q7h.U(list5, 10));
                        for (qpc1 qpc1Var : list5) {
                            arrayList2.add(new n13(qpc1Var.a, qpc1Var.c != null));
                        }
                        b2u.a(arrayList2, cwl1.o0(x340Var, 2131952157), str, (qim0) null, x340Var, 0);
                        x340Var.r(false);
                    }
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, xeb1Var, i, (byte) 2);
        }
    }

    public final mqw getBehavior() {
        return this.h;
    }

    public final f4r getData() {
        return this.f;
    }
}
