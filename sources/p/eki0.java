package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eki0 {
    public final byp a;
    public final ow3 b;

    public eki0(byp bypVar) {
        this.a = bypVar;
        ks6 ks6Var = (ks6) bypVar.b;
        this.b = new ow3((zim0) ks6Var.b, (poj0) ks6Var.X, (byte) 6);
    }

    public final o5 a(n9r n9rVar) {
        if (n9rVar instanceof dzq0) {
            kf30 kf30Var = ((ezq0) ((dzq0) n9rVar)).f;
            byp bypVar = this.a;
            return new jhy0(kf30Var, (zjn0) bypVar.c, (l141) bypVar.d, (xht) bypVar.g);
        }
        if (n9rVar instanceof wht) {
            return ((wht) n9rVar).U0;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, t8 t8Var, int i) {
        eki0 eki0Var = this;
        byp bypVar = eki0Var.a;
        hyc hycVar = (hyc) ((n9r) bypVar.a);
        o5 o5VarA = eki0Var.a(hycVar.k());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            rgy0 rgy0Var = (rgy0) obj;
            zgy0 zgy0Var = (zgy0) o7h.t0(i2, list2);
            rob0 rob0VarH = sj1.h(hycVar, ((mxa1) bypVar.h).m(rgy0Var), null, (o5VarA == null || !no20.c.d((zgy0Var == null || (zgy0Var.c & 1) != 1) ? 0 : zgy0Var.d).booleanValue()) ? rzs0.g : new leo0((s1c1) ((ks6) bypVar.b).a, new dki0(eki0Var, o5VarA, t8Var, i, i2, zgy0Var, (byte) 1)), i2);
            if (rob0VarH != null) {
                arrayList.add(rob0VarH);
            }
            eki0Var = this;
            i2 = i3;
        }
        return arrayList;
    }

    public final fg5 c(t8 t8Var, int i, int i2) {
        return !no20.c.d(i).booleanValue() ? rzs0.g : new leo0((s1c1) ((ks6) this.a.b).a, new bki0(this, t8Var, i2, (byte) 0));
    }

    public final fg5 d(ggy0 ggy0Var, boolean z) {
        return !no20.c.d(ggy0Var.d).booleanValue() ? rzs0.g : new leo0((s1c1) ((ks6) this.a.b).a, new cki0(this, z, ggy0Var));
    }

    public final pht e(kfy0 kfy0Var, boolean z) {
        lht lhtVar;
        byp bypVar = this.a;
        beg begVar = (beg) ((n9r) bypVar.a);
        pht phtVar = new pht(begVar, null, c(kfy0Var, kfy0Var.d, 1), z, 1, kfy0Var, (zjn0) bypVar.c, (l141) bypVar.d, (y3j1) bypVar.e, (xht) bypVar.g, null);
        List listH = ((eki0) byp.h(bypVar, phtVar, z6x.a).i).h(kfy0Var.e, kfy0Var, 1);
        fhy0 fhy0Var = (fhy0) no20.d.d(kfy0Var.d);
        switch (fhy0Var == null ? -1 : qhy0.b[fhy0Var.ordinal()]) {
            case 1:
                lhtVar = mht.d;
                break;
            case 2:
                lhtVar = mht.a;
                break;
            case 3:
                lhtVar = mht.b;
                break;
            case 4:
                lhtVar = mht.c;
                break;
            case 5:
                lhtVar = mht.e;
                break;
            case 6:
                lhtVar = mht.f;
                break;
            default:
                lhtVar = mht.a;
                break;
        }
        phtVar.K1(listH, lhtVar);
        phtVar.F1(begVar.m());
        phtVar.S0 = begVar.Z();
        phtVar.W0 = !no20.o.d(kfy0Var.d).booleanValue();
        return phtVar;
    }

    public final iit f(yfy0 yfy0Var) {
        int i;
        a8b0 a8b0VarM;
        byp bypVar = this.a;
        zjn0 zjn0Var = (zjn0) bypVar.c;
        l141 l141Var = (l141) bypVar.d;
        byte b = 1;
        if ((yfy0Var.c & 1) == 1) {
            i = yfy0Var.d;
        } else {
            int i2 = yfy0Var.e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        fg5 fg5VarC = c(yfy0Var, i3, 1);
        int i4 = yfy0Var.c;
        fg5 nhtVar = ((i4 & 32) == 32 || (i4 & 64) == 64) ? new nht((s1c1) ((ks6) bypVar.b).a, new bki0(this, yfy0Var, b, b)) : rzs0.g;
        iit iitVar = new iit((n9r) bypVar.a, null, fg5VarC, dem1.y(zjn0Var, yfy0Var.f), d1o1.m((zfy0) no20.q.d(i3)), yfy0Var, (zjn0) bypVar.c, (l141) bypVar.d, kht.g((n9r) bypVar.a).a(dem1.y(zjn0Var, yfy0Var.f)).equals(y7d1.a) ? y3j1.b : (y3j1) bypVar.e, (xht) bypVar.g, null);
        byp bypVarH = byp.h(bypVar, iitVar, yfy0Var.i);
        eki0 eki0Var = (eki0) bypVarH.i;
        mxa1 mxa1Var = (mxa1) bypVarH.h;
        rgy0 rgy0VarB = p2o1.B(yfy0Var, l141Var);
        rob0 rob0VarN = (rgy0VarB == null || (a8b0VarM = mxa1Var.m(rgy0VarB)) == null) ? null : sj1.n(iitVar, a8b0VarM, nhtVar);
        n9r n9rVar = (n9r) bypVar.a;
        beg begVar = n9rVar instanceof beg ? (beg) n9rVar : null;
        iitVar.K1(rob0VarN, begVar != null ? begVar.q0() : null, eki0Var.b(p2o1.n(yfy0Var, l141Var), yfy0Var.O0, yfy0Var, 1), mxa1Var.c(), eki0Var.h(yfy0Var.P0, yfy0Var, 1), mxa1Var.m(p2o1.E(yfy0Var, l141Var)), b4x0.c((agy0) no20.e.d(i3)), d1o1.g((fhy0) no20.d.d(i3)), b7x.a);
        iitVar.N0 = no20.r.d(i3).booleanValue();
        iitVar.O0 = no20.s.d(i3).booleanValue();
        iitVar.P0 = no20.v.d(i3).booleanValue();
        iitVar.Q0 = no20.t.d(i3).booleanValue();
        iitVar.R0 = no20.u.d(i3).booleanValue();
        iitVar.V0 = no20.w.d(i3).booleanValue();
        iitVar.S0 = no20.x.d(i3).booleanValue();
        iitVar.W0 = !no20.y.d(i3).booleanValue();
        ((lfb) ((ks6) bypVar.b).Y).getClass();
        return iitVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.beg] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [p.eki0] */
    public final hit g(ggy0 ggy0Var, boolean z) {
        int i;
        fg5 fg5VarC;
        byte b;
        eki0 eki0Var;
        fg5 nhtVar;
        mo20 mo20Var;
        ?? r4;
        zdy0 zdy0VarI;
        zdy0 zdy0Var;
        soe0 soe0Var;
        fey0 fey0VarJ;
        boolean z2;
        ?? r0;
        ?? E0;
        beg begVar;
        a8b0 a8b0VarM;
        eg5 eg5Var = rzs0.g;
        byp bypVar = this.a;
        zjn0 zjn0Var = (zjn0) bypVar.c;
        l141 l141Var = (l141) bypVar.d;
        if ((ggy0Var.c & 1) == 1) {
            i = ggy0Var.d;
        } else {
            int i2 = ggy0Var.e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        byte b2 = 0;
        if (z) {
            List<efy0> list = ggy0Var.U0;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (efy0 efy0Var : list) {
                efy0Var.getClass();
                arrayList.add(this.b.f(efy0Var, zjn0Var));
            }
            fg5VarC = arrayList.isEmpty() ? eg5Var : new hg5(arrayList, b2);
        } else {
            fg5VarC = null;
        }
        n9r n9rVar = (n9r) bypVar.a;
        if (fg5VarC == null) {
            fg5VarC = c(ggy0Var, i, 2);
        }
        mo20 mo20Var2 = no20.e;
        int iC = b4x0.c((agy0) mo20Var2.d(i));
        mo20 mo20Var3 = no20.d;
        int i3 = i;
        hit hitVar = new hit(n9rVar, null, fg5VarC, iC, d1o1.g((fhy0) mo20Var3.d(i)), no20.A.d(i).booleanValue(), dem1.y(zjn0Var, ggy0Var.f), d1o1.m((zfy0) no20.q.d(i)), no20.E.d(i).booleanValue(), no20.D.d(i).booleanValue(), no20.G.d(i).booleanValue(), no20.H.d(i).booleanValue(), no20.I.d(i).booleanValue(), ggy0Var, (zjn0) bypVar.c, (l141) bypVar.d, (y3j1) bypVar.e, (xht) bypVar.g);
        byp bypVarH = byp.h(bypVar, hitVar, ggy0Var.i);
        mxa1 mxa1Var = (mxa1) bypVarH.h;
        boolean zBooleanValue = no20.B.d(i3).booleanValue();
        int i4 = 3;
        if (zBooleanValue) {
            int i5 = ggy0Var.c;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                b = 1;
                eki0 eki0Var2 = this;
                nhtVar = new nht((s1c1) ((ks6) bypVar.b).a, new bki0(eki0Var2, ggy0Var, i4, b));
                eki0Var = eki0Var2;
            } else {
                b = 1;
                eki0Var = this;
                nhtVar = eg5Var;
            }
        } else {
            b = 1;
            eki0Var = this;
            nhtVar = eg5Var;
        }
        a8b0 a8b0VarM2 = mxa1Var.m(p2o1.F(ggy0Var, l141Var));
        ?? r16 = b;
        List listC = mxa1Var.c();
        n9r n9rVar2 = (n9r) bypVar.a;
        beg begVar2 = n9rVar2 instanceof beg ? (beg) n9rVar2 : null;
        rob0 rob0VarQ0 = begVar2 != null ? begVar2.q0() : null;
        rgy0 rgy0VarC = p2o1.C(ggy0Var, l141Var);
        hitVar.E1(a8b0VarM2, listC, rob0VarQ0, (rgy0VarC == null || (a8b0VarM = mxa1Var.m(rgy0VarC)) == null) ? null : sj1.n(hitVar, a8b0VarM, nhtVar), ((eki0) bypVarH.i).b(p2o1.o(ggy0Var, l141Var), ggy0Var.O0, ggy0Var, 3));
        int iB = no20.b(no20.c.d(i3).booleanValue(), (fhy0) mo20Var3.d(i3), (agy0) mo20Var2.d(i3));
        c9c c9cVar = mka1.m0;
        if (zBooleanValue) {
            int i6 = (ggy0Var.c & 256) == 256 ? ggy0Var.Q0 : iB;
            boolean zBooleanValue2 = no20.N.d(i6).booleanValue();
            boolean zBooleanValue3 = no20.O.d(i6).booleanValue();
            boolean zBooleanValue4 = no20.P.d(i6).booleanValue();
            fg5 fg5VarC2 = eki0Var.c(ggy0Var, i6, 3);
            if (zBooleanValue2) {
                mo20Var = mo20Var2;
                zdy0VarI = new zdy0(hitVar, fg5VarC2, b4x0.c((agy0) mo20Var2.d(i6)), d1o1.g((fhy0) mo20Var3.d(i6)), (zBooleanValue2 ? 1 : 0) ^ (r16 == true ? 1 : 0), zBooleanValue3, zBooleanValue4, hitVar.getKind(), null, c9cVar);
            } else {
                mo20Var = mo20Var2;
                zdy0VarI = sj1.i(hitVar, fg5VarC2);
            }
            zdy0VarI.A1(hitVar.getReturnType());
            r4 = eki0Var;
        } else {
            mo20Var = mo20Var2;
            r4 = eki0Var;
            zdy0VarI = null;
        }
        if (no20.C.d(i3).booleanValue()) {
            if ((ggy0Var.c & 512) == 512) {
                iB = ggy0Var.R0;
            }
            boolean zBooleanValue5 = no20.N.d(iB).booleanValue();
            boolean zBooleanValue6 = no20.O.d(iB).booleanValue();
            boolean zBooleanValue7 = no20.P.d(iB).booleanValue();
            fg5 fg5VarC3 = r4.c(ggy0Var, iB, 4);
            if (zBooleanValue5) {
                zdy0Var = zdy0VarI;
                fey0 fey0Var = new fey0(hitVar, fg5VarC3, b4x0.c((agy0) mo20Var.d(iB)), d1o1.g((fhy0) mo20Var3.d(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, hitVar.getKind(), null, c9cVar);
                tsi1 tsi1Var = (tsi1) o7h.V0(((eki0) byp.h(bypVarH, fey0Var, z6x.a).i).h(Collections.singletonList(ggy0Var.P0), ggy0Var, 4));
                if (tsi1Var == null) {
                    fey0.r0(6);
                    throw null;
                }
                fey0Var.N0 = tsi1Var;
                fey0VarJ = fey0Var;
                soe0Var = null;
            } else {
                zdy0Var = zdy0VarI;
                soe0Var = null;
                fey0VarJ = sj1.j(hitVar, fg5VarC3);
            }
        } else {
            zdy0Var = zdy0VarI;
            soe0Var = null;
            fey0VarJ = null;
        }
        if (no20.F.d(i3).booleanValue()) {
            z2 = false;
            hitVar.C1(soe0Var, new aki0(r4, ggy0Var, hitVar, false ? 1 : 0));
        } else {
            z2 = false;
        }
        n9r n9rVar3 = (n9r) bypVar.a;
        if (n9rVar3 instanceof beg) {
            begVar = (beg) n9rVar3;
        } else {
            r0 = soe0Var;
        }
        if (r0 != 0) {
            r0 = begVar;
            E0 = r0.e0();
        } else {
            r0 = begVar;
            E0 = z2;
        }
        if (E0 == 5) {
            hitVar.C1(soe0Var, new aki0(r4, ggy0Var, hitVar, r16 == true ? (byte) 1 : (byte) 0));
        }
        hitVar.B1(zdy0Var, fey0VarJ, new v120(r4.d(ggy0Var, z2)), new v120(r4.d(ggy0Var, r16)));
        return hitVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [p.a8b0] */
    /* JADX WARN: Type inference failed for: r21v2 */
    public final List h(List list, t8 t8Var, int i) {
        int i2;
        rgy0 rgy0Var;
        fg5 leo0Var;
        eki0 eki0Var = this;
        byp bypVar = eki0Var.a;
        l141 l141Var = (l141) bypVar.d;
        mxa1 mxa1Var = (mxa1) bypVar.h;
        hyc hycVar = (hyc) ((n9r) bypVar.a);
        o5 o5VarA = eki0Var.a(hycVar.k());
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            zgy0 zgy0Var = (zgy0) obj;
            int i5 = (zgy0Var.c & 1) == 1 ? zgy0Var.d : 0;
            if (o5VarA == null || !no20.c.d(i5).booleanValue()) {
                i2 = i3;
                rgy0Var = null;
                leo0Var = rzs0.g;
            } else {
                i2 = i3;
                rgy0Var = null;
                leo0Var = new leo0((s1c1) ((ks6) bypVar.b).a, new dki0(eki0Var, o5VarA, t8Var, i, i2, zgy0Var, (byte) 0));
            }
            ajn0 ajn0VarY = dem1.y((zjn0) bypVar.c, zgy0Var.e);
            a8b0 a8b0VarM = mxa1Var.m(p2o1.J(zgy0Var, l141Var));
            boolean zBooleanValue = no20.K.d(i5).booleanValue();
            boolean zBooleanValue2 = no20.L.d(i5).booleanValue();
            boolean zBooleanValue3 = no20.M.d(i5).booleanValue();
            int i6 = zgy0Var.c;
            rgy0 rgy0VarA = (i6 & 16) == 16 ? zgy0Var.h : (i6 & 32) == 32 ? l141Var.a(zgy0Var.i) : rgy0Var;
            ?? M = rgy0VarA != null ? mxa1Var.m(rgy0VarA) : rgy0Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new tsi1(hycVar, null, i2, leo0Var, ajn0VarY, a8b0VarM, zBooleanValue, zBooleanValue2, zBooleanValue3, M, mka1.m0));
            arrayList = arrayList2;
            i3 = i4;
            eki0Var = this;
        }
        return o7h.l1(arrayList);
    }
}
