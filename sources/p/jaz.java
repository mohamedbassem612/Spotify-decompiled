package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jaz extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaz(Optional optional, lzn0 lzn0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 21;
        this.d = optional;
        this.e = lzn0Var;
    }

    private final Object e(Object obj) {
        b2s0 b2s0Var = (b2s0) this.c;
        x1s0 x1s0Var = (z1s0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (x1s0Var instanceof y1s0) {
            t1s0 t1s0Var = b2s0Var.c;
            if (tqwVar != null) {
                n3o1.y(tqwVar);
            }
            t1s0Var.e();
        } else {
            if (x1s0Var instanceof w1s0) {
                b2s0Var.c.g(tqwVar != null ? n3o1.y(tqwVar) : null);
            } else {
                if (!(x1s0Var instanceof x1s0)) {
                    eg.o();
                    return null;
                }
                ((i9i1) ((yup0) this.e).d).b(x1s0Var.a);
            }
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        pt ptVar = (pt) this.e;
        lzn0 lzn0Var = (lzn0) ptVar.d;
        nis0 nis0Var = (nis0) this.c;
        eis0 eis0Var = (jis0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (eis0Var instanceof gis0) {
            lzn0Var.a(((gis0) eis0Var).b, cvl1.d(tqwVar), (Bundle) null);
        } else if (eis0Var instanceof eis0) {
            lzn0Var.a(eis0Var.a, cvl1.d(tqwVar), (Bundle) null);
        } else if (eis0Var instanceof fis0) {
            ais0 ais0Var = nis0Var.a.a;
            tv80 tv80VarD = cvl1.d(tqwVar);
            lik1 lik1Var = nik1.y4;
            if (ais0Var instanceof ais0) {
                String str = ais0Var.c;
                fm6 fm6Var = new fm6(str, lik1Var, (String) null, new bm6(false, false, false, false, false, (ok51) null, false, (p860) null, 2043));
                if (((em6) ptVar.h).a.a()) {
                    ((yhm) ptVar.g).a(fm6Var, tv80VarD);
                } else {
                    mfm mfmVarA = ((i4q) ptVar.f).a(lik1Var);
                    Observable observableA = ((js6) ptVar.e).a(fm6Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, observableA, yon1.V0(), new bjm(6, str, (String) null), tv80VarD, 16);
                }
            } else {
                if (!(ais0Var instanceof cis0)) {
                    eg.o();
                    return null;
                }
                ((ssf1) ptVar.i).b(new dmf1(((cis0) ais0Var).d, lik1Var, (String) null, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, false, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -1089, 63), (Map) null), tv80VarD);
            }
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        vbt0 vbt0Var = (vbt0) this.c;
        qbt0 qbt0Var = (qbt0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (!u890.j(qbt0Var, qbt0.b) && !u890.j(qbt0Var, qbt0.a)) {
            eg.o();
            return null;
        }
        String str = vbt0Var.d;
        if (str != null) {
            hqn1.q(((zbt0) this.e).b, str, tqwVar, (Bundle) null);
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        ktl ktlVar = (ktl) this.c;
        Boolean bool = (Boolean) this.d;
        v0u0 v0u0Var = (v0u0) this.b;
        String str = (String) this.e;
        hm5.M(obj);
        return new w0u0(ktlVar, bool, v0u0Var.a, v0u0Var.b, str);
    }

    private final Object j(Object obj) {
        ynu0 ynu0Var = (ynu0) this.c;
        wnu0 wnu0Var = (wnu0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (wnu0Var instanceof vnu0) {
            hqn1.q(((hou0) this.e).b, ((vnu0) wnu0Var).a, tqwVar, (Bundle) null);
            ynu0Var.c.invoke();
        } else {
            if (!(wnu0Var instanceof unu0)) {
                eg.o();
                return null;
            }
            ynu0Var.c.invoke();
        }
        return rih1.a;
    }

    private final Object m(Object obj) {
        iu30 iu30Var = (iu30) this.e;
        v2v0 v2v0Var = (v2v0) this.c;
        s2v0 s2v0Var = (t2v0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (s2v0Var instanceof s2v0) {
            String str = v2v0Var.a;
            int i = v2v0Var.f;
            String str2 = v2v0Var.e;
            boolean z = v2v0Var.m;
            Integer num = v2v0Var.n;
            boolean z2 = v2v0Var.o;
            String str3 = v2v0Var.f18p;
            int iOrdinal = v2v0Var.u.ordinal();
            int i2 = 1;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                } else {
                    i2 = 3;
                }
            }
            iu30Var.invoke(new v051(new z951(str, i, false, (p7w) null, false, z, num, false, u951.a, (String) null, str2, str3, z2, i2, false, false, false, 230704), tqwVar != null ? n3o1.y(tqwVar) : null, s2v0Var.a));
        } else {
            if (!u890.j(s2v0Var, r2v0.a)) {
                eg.o();
                return null;
            }
            iu30Var.invoke(new cz41(Collections.singletonList(v2v0Var.a), v2v0Var.a, v2v0Var.l, tqwVar != null ? n3o1.y(tqwVar) : null));
        }
        return rih1.a;
    }

    private final Object o(Object obj) {
        mzv0 mzv0Var = (mzv0) this.c;
        kzv0 kzv0Var = (kzv0) this.d;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (tqwVar != null) {
            tv80 tv80VarY = n3o1.y(tqwVar);
            et90 et90Var = (et90) this.e;
            if (!u890.j(kzv0Var, kzv0.a)) {
                eg.o();
                return null;
            }
            ((lzn0) et90Var.d).a(mzv0Var.a, tv80VarY, (Bundle) null);
        }
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                jaz jazVar = new jaz(this.e, (lnm) obj5, (byte) 0);
                jazVar.c = (iaz) obj2;
                jazVar.d = (faz) obj3;
                jazVar.b = (tqw) obj4;
                jazVar.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                jaz jazVar2 = new jaz(this.e, (lnm) obj5, (byte) 1);
                jazVar2.c = (ws00) obj2;
                jazVar2.d = (rs00) obj3;
                jazVar2.b = (tqw) obj4;
                jazVar2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                jaz jazVar3 = new jaz((y5v0) this.b, (lzn0) this.e, (lnm) obj5);
                jazVar3.c = (tnb1) obj2;
                jazVar3.d = (zwz) obj3;
                jazVar3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                jaz jazVar4 = new jaz(this.e, (lnm) obj5, (byte) 3);
                jazVar4.c = (h3j1) obj;
                jazVar4.d = (xv50) obj2;
                jazVar4.b = (g3j1) obj3;
                jazVar4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                jaz jazVar5 = new jaz(this.e, (lnm) obj5, (byte) 4);
                jazVar5.c = (sa60) obj;
                jazVar5.d = (qa60) obj3;
                jazVar5.b = (tqw) obj4;
                jazVar5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                jaz jazVar6 = new jaz((pe60) this.e, (lnm) obj5, b2);
                jazVar6.c = (me60) obj2;
                jazVar6.d = (le60) obj3;
                jazVar6.b = (tqw) obj4;
                jazVar6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                jaz jazVar7 = new jaz(this.e, (lnm) obj5, (byte) 6);
                jazVar7.c = (tt90) obj2;
                jazVar7.d = (ot90) obj3;
                jazVar7.b = (tqw) obj4;
                jazVar7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                jaz jazVar8 = new jaz(this.e, (lnm) obj5, (byte) 7);
                jazVar8.c = (uca0) obj;
                jazVar8.d = (tca0) obj3;
                jazVar8.b = (tqw) obj4;
                jazVar8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                jaz jazVar9 = new jaz(this.e, (lnm) obj5, (byte) 8);
                jazVar9.c = (tda0) obj;
                jazVar9.d = (sda0) obj3;
                jazVar9.b = (tqw) obj4;
                jazVar9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                jaz jazVar10 = new jaz(this.e, (lnm) obj5, (byte) 9);
                jazVar10.c = (sna0) obj;
                jazVar10.d = (rna0) obj3;
                jazVar10.b = (tqw) obj4;
                jazVar10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                jaz jazVar11 = new jaz(this.e, (lnm) obj5, (byte) 10);
                jazVar11.c = (h7e) obj2;
                jazVar11.d = (f7e) obj3;
                jazVar11.b = (tqw) obj4;
                jazVar11.invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                jaz jazVar12 = new jaz(this.e, (lnm) obj5, (byte) 11);
                jazVar12.c = (n2g0) obj;
                jazVar12.d = (m2g0) obj3;
                jazVar12.b = (tqw) obj4;
                jazVar12.invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                jaz jazVar13 = new jaz(this.e, (lnm) obj5, (byte) 12);
                jazVar13.c = (fmg0) obj;
                jazVar13.d = (dmg0) obj3;
                jazVar13.b = (tqw) obj4;
                jazVar13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                jaz jazVar14 = new jaz(this.e, (lnm) obj5, (byte) 13);
                jazVar14.c = (xji0) obj2;
                jazVar14.d = (vji0) obj3;
                jazVar14.b = (tqw) obj4;
                jazVar14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                jaz jazVar15 = new jaz(this.e, (lnm) obj5, (byte) 14);
                jazVar15.c = (fvi0) obj2;
                jazVar15.d = (dvi0) obj3;
                jazVar15.b = (tqw) obj4;
                jazVar15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                jaz jazVar16 = new jaz(this.e, (lnm) obj5, (byte) 15);
                jazVar16.c = (cok0) obj;
                jazVar16.d = (dok0) obj2;
                jazVar16.b = (bok0) obj3;
                jazVar16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                jaz jazVar17 = new jaz(this.e, (lnm) obj5, (byte) 16);
                jazVar17.c = (uqm0) obj2;
                jazVar17.d = (sqm0) obj3;
                jazVar17.b = (tqw) obj4;
                jazVar17.invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                jaz jazVar18 = new jaz(this.e, (lnm) obj5, (byte) 17);
                jazVar18.c = (cxm0) obj;
                jazVar18.d = (gxm0) obj2;
                jazVar18.b = (bxm0) obj3;
                jazVar18.invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                jaz jazVar19 = new jaz((int) b2, (lnm) obj5, (byte) 18);
                jazVar19.c = (Map) obj;
                jazVar19.d = (Map) obj2;
                jazVar19.b = (Map) obj3;
                jazVar19.e = (Map) obj4;
                return jazVar19.invokeSuspend(rih1Var);
            case 19:
                jaz jazVar20 = new jaz(this.e, (lnm) obj5, (byte) 19);
                jazVar20.c = (y1p0) obj2;
                jazVar20.d = (u1p0) obj3;
                jazVar20.b = (tqw) obj4;
                jazVar20.invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                jaz jazVar21 = new jaz(this.e, (lnm) obj5, (byte) 20);
                jazVar21.c = (fop0) obj2;
                jazVar21.d = (aop0) obj3;
                jazVar21.b = (tqw) obj4;
                jazVar21.invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                jaz jazVar22 = new jaz((Optional) this.d, (lzn0) this.e, (lnm) obj5);
                jazVar22.c = (zlr0) obj2;
                jazVar22.b = (tqw) obj4;
                jazVar22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                jaz jazVar23 = new jaz(this.e, (lnm) obj5, (byte) 22);
                jazVar23.c = (b2s0) obj;
                jazVar23.d = (z1s0) obj3;
                jazVar23.b = (tqw) obj4;
                jazVar23.invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                jaz jazVar24 = new jaz(this.e, (lnm) obj5, (byte) 23);
                jazVar24.c = (nis0) obj2;
                jazVar24.d = (jis0) obj3;
                jazVar24.b = (tqw) obj4;
                jazVar24.invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                jaz jazVar25 = new jaz(this.e, (lnm) obj5, (byte) 24);
                jazVar25.c = (vbt0) obj2;
                jazVar25.d = (qbt0) obj3;
                jazVar25.b = (tqw) obj4;
                jazVar25.invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                jaz jazVar26 = new jaz((int) b2, (lnm) obj5, (byte) 25);
                jazVar26.c = (ktl) obj;
                jazVar26.d = (Boolean) obj2;
                jazVar26.b = (v0u0) obj3;
                jazVar26.e = (String) obj4;
                return jazVar26.invokeSuspend(rih1Var);
            case 26:
                jaz jazVar27 = new jaz(this.e, (lnm) obj5, (byte) 26);
                jazVar27.c = (ynu0) obj;
                jazVar27.d = (wnu0) obj3;
                jazVar27.b = (tqw) obj4;
                jazVar27.invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                jaz jazVar28 = new jaz(this.e, (lnm) obj5, (byte) 27);
                jazVar28.c = (v2v0) obj2;
                jazVar28.d = (t2v0) obj3;
                jazVar28.b = (tqw) obj4;
                jazVar28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                jaz jazVar29 = new jaz(this.e, (lnm) obj5, (byte) 28);
                jazVar29.c = (mzv0) obj2;
                jazVar29.d = (kzv0) obj3;
                jazVar29.b = (tqw) obj4;
                jazVar29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                jaz jazVar30 = new jaz(this.e, (lnm) obj5, (byte) 29);
                jazVar30.c = (q0w0) obj2;
                jazVar30.d = (p0w0) obj3;
                jazVar30.b = (tqw) obj4;
                jazVar30.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x028d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x028f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0293  */
    /* JADX WARN: Code duplicated, block: B:122:0x0299  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:248:0x049e  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v58 java.lang.Object, still in use, count: 2, list:
          (r4v58 java.lang.Object) from 0x049a: PHI (r4 I:??) = (r4v55 java.lang.Object), (r4v58 java.lang.Object) binds: [B:245:0x0499, B:469:0x049a] A[DONT_GENERATE, DONT_INLINE]
          (r4v58 java.lang.Object) from 0x0489: CHECK_CAST (p.evi0) (r4v58 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jaz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jaz(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jaz(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaz(y5v0 y5v0Var, lzn0 lzn0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 2;
        this.b = y5v0Var;
        this.e = lzn0Var;
    }
}
