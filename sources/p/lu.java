package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lu extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                lu luVar = new lu((res) obj6, (lnm) obj5, (byte) 0);
                luVar.c = (ju) obj2;
                luVar.d = (hu) obj3;
                luVar.b = (tqw) obj4;
                luVar.invokeSuspend(rih1Var);
                break;
            case 1:
                lu luVar2 = new lu((i40) obj6, (lnm) obj5, (byte) 1);
                luVar2.c = (d40) obj;
                luVar2.d = (b40) obj3;
                luVar2.b = (tqw) obj4;
                luVar2.invokeSuspend(rih1Var);
                break;
            case 2:
                lu luVar3 = new lu((res) obj6, (lnm) obj5, (byte) 2);
                luVar3.c = (zc0) obj;
                luVar3.d = (xc0) obj3;
                luVar3.b = (tqw) obj4;
                luVar3.invokeSuspend(rih1Var);
                break;
            case 3:
                lu luVar4 = new lu((res) obj6, (lnm) obj5, (byte) 3);
                luVar4.c = (t93) obj2;
                luVar4.d = (s93) obj3;
                luVar4.b = (tqw) obj4;
                luVar4.invokeSuspend(rih1Var);
                break;
            case 4:
                lu luVar5 = new lu((ep6) obj6, (lnm) obj5, (byte) 4);
                luVar5.c = (bp6) obj;
                luVar5.d = (cp6) obj2;
                luVar5.b = (ap6) obj3;
                luVar5.invokeSuspend(rih1Var);
                break;
            case 5:
                lu luVar6 = new lu((tp6) obj6, (lnm) obj5, (byte) 5);
                luVar6.c = (zp6) obj2;
                luVar6.d = (up6) obj3;
                luVar6.b = (tqw) obj4;
                luVar6.invokeSuspend(rih1Var);
                break;
            case 6:
                lu luVar7 = new lu((bq6) obj6, (lnm) obj5, (byte) 6);
                luVar7.c = (zp6) obj2;
                luVar7.d = (up6) obj3;
                luVar7.b = (tqw) obj4;
                luVar7.invokeSuspend(rih1Var);
                break;
            case 7:
                lu luVar8 = new lu((ldo) obj6, (lnm) obj5, (byte) 7);
                luVar8.c = (rq6) obj2;
                luVar8.d = (qq6) obj3;
                luVar8.b = (tqw) obj4;
                luVar8.invokeSuspend(rih1Var);
                break;
            case 8:
                lu luVar9 = new lu((al9) obj6, (lnm) obj5, (byte) 8);
                luVar9.c = (vk9) obj;
                luVar9.d = (uk9) obj3;
                luVar9.b = (tqw) obj4;
                luVar9.invokeSuspend(rih1Var);
                break;
            case 9:
                lu luVar10 = new lu((hn9) obj6, (lnm) obj5, (byte) 9);
                luVar10.c = (fn9) obj2;
                luVar10.d = (dn9) obj3;
                luVar10.b = (tqw) obj4;
                luVar10.invokeSuspend(rih1Var);
                break;
            case 10:
                lu luVar11 = new lu((tza) obj6, (lnm) obj5, (byte) 10);
                luVar11.c = (nza) obj;
                luVar11.d = (lza) obj3;
                luVar11.b = (tqw) obj4;
                luVar11.invokeSuspend(rih1Var);
                break;
            case 11:
                lu luVar12 = new lu((jd6) obj6, (lnm) obj5, (byte) 11);
                luVar12.c = (xza) obj;
                luVar12.d = (vza) obj3;
                luVar12.b = (tqw) obj4;
                luVar12.invokeSuspend(rih1Var);
                break;
            case 12:
                lu luVar13 = new lu((qj0) obj6, (lnm) obj5, (byte) 12);
                luVar13.c = (l4d) obj;
                luVar13.d = (o4d) obj2;
                luVar13.b = (k4d) obj3;
                luVar13.invokeSuspend(rih1Var);
                break;
            case 13:
                lu luVar14 = new lu((ldo) obj6, (lnm) obj5, (byte) 13);
                luVar14.c = (qhe) obj2;
                luVar14.d = (lhe) obj3;
                luVar14.b = (tqw) obj4;
                luVar14.invokeSuspend(rih1Var);
                break;
            case 14:
                lu luVar15 = new lu((qlb) obj6, (lnm) obj5, (byte) 14);
                luVar15.c = (zth) obj;
                luVar15.d = (cuh) obj3;
                luVar15.b = (tqw) obj4;
                luVar15.invokeSuspend(rih1Var);
                break;
            case 15:
                lu luVar16 = new lu((iu30) obj6, (lnm) obj5, (byte) 15);
                luVar16.c = (efk) obj;
                luVar16.d = (dfk) obj3;
                luVar16.b = (tqw) obj4;
                luVar16.invokeSuspend(rih1Var);
                break;
            case 16:
                lu luVar17 = new lu((efm) obj6, (lnm) obj5, (byte) 16);
                luVar17.c = (mem) obj;
                luVar17.d = (sem) obj2;
                luVar17.b = (cem) obj3;
                luVar17.invokeSuspend(rih1Var);
                break;
            case 17:
                lu luVar18 = new lu((qlb) obj6, (lnm) obj5, (byte) 17);
                luVar18.c = (rem) obj2;
                luVar18.d = (eem) obj3;
                luVar18.b = (tqw) obj4;
                luVar18.invokeSuspend(rih1Var);
                break;
            case 18:
                lu luVar19 = new lu((qhm) obj6, (lnm) obj5, (byte) 18);
                luVar19.c = (nhm) obj;
                luVar19.d = (mhm) obj3;
                luVar19.b = (tqw) obj4;
                luVar19.invokeSuspend(rih1Var);
                break;
            case 19:
                lu luVar20 = new lu((s1o) obj6, (lnm) obj5, (byte) 19);
                luVar20.c = (c2o) obj2;
                luVar20.d = (t1o) obj3;
                luVar20.b = (tqw) obj4;
                luVar20.invokeSuspend(rih1Var);
                break;
            case 20:
                lu luVar21 = new lu((dfm) obj6, (lnm) obj5, (byte) 20);
                luVar21.c = (c2o) obj2;
                luVar21.d = (t1o) obj3;
                luVar21.b = (tqw) obj4;
                luVar21.invokeSuspend(rih1Var);
                break;
            case 21:
                lu luVar22 = new lu((x4o) obj6, (lnm) obj5, (byte) 21);
                luVar22.c = (f5o) obj;
                luVar22.d = (b5o) obj3;
                luVar22.b = (tqw) obj4;
                luVar22.invokeSuspend(rih1Var);
                break;
            case 22:
                lu luVar23 = new lu((umf0) obj6, (lnm) obj5, (byte) 22);
                luVar23.c = (g9o) obj2;
                luVar23.d = (e9o) obj3;
                luVar23.b = (tqw) obj4;
                luVar23.invokeSuspend(rih1Var);
                break;
            case 23:
                lu luVar24 = new lu((lfo) obj6, (lnm) obj5, (byte) 23);
                luVar24.c = (ifo) obj2;
                luVar24.d = (hfo) obj3;
                luVar24.b = (tqw) obj4;
                luVar24.invokeSuspend(rih1Var);
                break;
            case 24:
                lu luVar25 = new lu((ft30) obj6, (lnm) obj5, (byte) 24);
                luVar25.c = (mpy) obj2;
                luVar25.d = (kpy) obj3;
                luVar25.b = (tqw) obj4;
                luVar25.invokeSuspend(rih1Var);
                break;
            case 25:
                lu luVar26 = new lu((iu30) obj6, (lnm) obj5, (byte) 25);
                luVar26.c = (v130) obj2;
                luVar26.d = (r130) obj3;
                luVar26.b = (tqw) obj4;
                luVar26.invokeSuspend(rih1Var);
                break;
            case 26:
                lu luVar27 = new lu((qzs) obj6, (lnm) obj5, (byte) 26);
                luVar27.c = (stk1) obj;
                luVar27.d = (rtk1) obj3;
                luVar27.b = (tqw) obj4;
                luVar27.invokeSuspend(rih1Var);
                break;
            case 27:
                lu luVar28 = new lu((hlt) obj6, (lnm) obj5, (byte) 27);
                luVar28.c = (flt) obj2;
                luVar28.d = (dlt) obj3;
                luVar28.b = (tqw) obj4;
                luVar28.invokeSuspend(rih1Var);
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                lu luVar29 = new lu((hw2) obj6, (lnm) obj5, (byte) 28);
                luVar29.c = (f7w) obj2;
                luVar29.d = (a7w) obj3;
                luVar29.b = (tqw) obj4;
                luVar29.invokeSuspend(rih1Var);
                break;
            default:
                lu luVar30 = new lu((jb3) obj6, (lnm) obj5, (byte) 29);
                luVar30.c = (s7z) obj2;
                luVar30.d = (q7z) obj3;
                luVar30.b = (tqw) obj4;
                luVar30.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:415:0x0984  */
    /* JADX WARN: Code duplicated, block: B:419:0x0999 A[ORIG_RETURN, RETURN] */
    public final Object invokeSuspend(Object obj) {
        l0l l0lVar;
        mmr0 mmr0Var;
        ou80 ou80Var;
        Object dr3Var;
        Object dp3Var;
        Object pp3Var;
        cob1 cob1Var;
        ou80 ou80Var2;
        Integer num;
        byte b = this.a;
        up6 up6Var = up6.a;
        u1o u1oVar = u1o.a;
        t1o t1oVar = t1o.a;
        Object obj2 = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = null;
        switch (b) {
            case 0:
                ju juVar = (ju) this.c;
                hu huVar = (hu) this.d;
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                res resVar = (res) obj2;
                tv80 tv80VarD = cvl1.d(tqwVar);
                String str = tv80VarD.a.a;
                if (huVar == null) {
                    eg.o();
                    return null;
                }
                ev evVar = juVar.a;
                if (evVar.e) {
                    ca40.d((ca40) resVar.g, "accountswitching/sidedrawer", tv80VarD, (u0t0) null, new t6(resVar, juVar, str, (byte) 1), 12);
                    return rih1Var;
                }
                Context context = (Context) resVar.d;
                context.startActivity(dv.a((dv) resVar.e, context, evVar.a, evVar.b, str));
                return rih1Var;
            case 1:
                i40 i40Var = (i40) obj2;
                d40 d40Var = (d40) this.c;
                b40 b40Var = (b40) this.d;
                tqw tqwVar2 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(b40Var, z30.a)) {
                    i40Var.i.a(d40Var.e, cvl1.d(tqwVar2), (Bundle) null);
                    return rih1Var;
                }
                if (u890.j(b40Var, a40.a)) {
                    vgm.b(i40Var.h, d40Var.d, (String) null, cvl1.d(tqwVar2), new tgm((String) null, i40Var.Z, true, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, true, (String) null, (iu30) null, (p860) null, d40Var.i, false, false, -553648135, 1), 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                zc0 zc0Var = (zc0) this.c;
                xc0 xc0Var = (xc0) this.d;
                tqw tqwVar3 = (tqw) this.b;
                hm5.M(obj);
                tqwVar3.getClass();
                String str2 = n3o1.y(tqwVar3).a.a;
                if (u890.j(xc0Var, xc0.a)) {
                    ker kerVar = (ker) ((ynb0) ((res) obj2).e).get();
                    yv31 yv31Var = zc0Var.a;
                    int i = zc0Var.b;
                    kerVar.getClass();
                    if (jer.a[l1d.C(1)] == 1) {
                        for (Object obj4 : kerVar.a.i()) {
                            if (u890.j(((l0l) obj4).d(), yv31Var.a)) {
                                obj3 = obj4;
                                l0lVar = (l0l) obj3;
                                if (l0lVar != null) {
                                    return rih1Var;
                                }
                                kerVar.b.b.x(i, l0lVar.j(), str2);
                                return rih1Var;
                            }
                        }
                        l0lVar = (l0l) obj3;
                        if (l0lVar != null) {
                            return rih1Var;
                        }
                        kerVar.b.b.x(i, l0lVar.j(), str2);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    eg.o();
                }
                return null;
            case 3:
                res resVar2 = (res) obj2;
                t93 t93Var = (t93) this.c;
                s93 s93Var = (s93) this.d;
                tqw tqwVar4 = (tqw) this.b;
                hm5.M(obj);
                if (!(s93Var instanceof s93)) {
                    eg.o();
                    return null;
                }
                List list = t93Var.a;
                if (list.size() == 1) {
                    if (tqwVar4 == null) {
                        return rih1Var;
                    }
                    ((lzn0) resVar2.d).a(((r93) o7h.q0(list)).a, n3o1.y(tqwVar4), (Bundle) null);
                    return rih1Var;
                }
                gr6 gr6Var = (gr6) resVar2.f;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r93) it.next()).a);
                }
                gr6Var.a((String) null, arrayList);
                return rih1Var;
            case 4:
                bp6 bp6Var = (bp6) this.c;
                cp6 cp6Var = (cp6) this.d;
                ap6 ap6Var = (ap6) this.b;
                hm5.M(obj);
                if (!u890.j(ap6Var, ap6.a)) {
                    eg.o();
                    return null;
                }
                if (!cp6Var.d) {
                    return rih1Var;
                }
                ((ep6) obj2).b.invoke(bp6Var.a);
                return rih1Var;
            case 5:
                yp6 yp6Var = (zp6) this.c;
                up6 up6Var2 = (up6) this.d;
                tqw tqwVar5 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(up6Var2, up6Var)) {
                    eg.o();
                    return null;
                }
                if (!(yp6Var instanceof yp6) || tqwVar5 == null) {
                    return rih1Var;
                }
                ((tp6) obj2).a.a(yp6Var.c, n3o1.y(tqwVar5), (Bundle) null);
                return rih1Var;
            case 6:
                yp6 yp6Var2 = (zp6) this.c;
                up6 up6Var3 = (up6) this.d;
                tqw tqwVar6 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(up6Var3, up6Var)) {
                    eg.o();
                    return null;
                }
                if (!(yp6Var2 instanceof yp6) || tqwVar6 == null) {
                    return rih1Var;
                }
                ((bq6) obj2).a.a(yp6Var2.c, n3o1.y(tqwVar6), (Bundle) null);
                return rih1Var;
            case 7:
                rq6 rq6Var = (rq6) this.c;
                qq6 qq6Var = (qq6) this.d;
                tqw tqwVar7 = (tqw) this.b;
                hm5.M(obj);
                if (qq6Var != null) {
                    ((lzn0) ((ldo) obj2).c).a(rq6Var.c, cvl1.d(tqwVar7), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                al9 al9Var = (al9) obj2;
                vk9 vk9Var = (vk9) this.c;
                uk9 uk9Var = (uk9) this.d;
                tqw tqwVar8 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(uk9Var, sk9.a)) {
                    if (u890.j(uk9Var, tk9.a)) {
                        vgm.b(al9Var.c, vk9Var.a, (String) null, tqwVar8 != null ? n3o1.y(tqwVar8) : al9.i, al9.t, 2);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                rm9 rm9Var = al9Var.b;
                long j = vk9Var.b;
                fdc fdcVar = rm9Var.a.d;
                if (fdcVar == null || fdcVar.b) {
                    return rih1Var;
                }
                ((w590) fdcVar.d).s(j);
                return rih1Var;
            case 9:
                fn9 fn9Var = (fn9) this.c;
                dn9 dn9Var = (dn9) this.d;
                tqw tqwVar9 = (tqw) this.b;
                hm5.M(obj);
                hn9 hn9Var = (hn9) obj2;
                int iC = l1d.C(hn9Var.i);
                if (iC != 0) {
                    if (iC == 1) {
                        mmr0Var = new mmr0("byom-episode-entry", fuk0.EPISODE_PAGE);
                    } else {
                        eg.o();
                    }
                    return null;
                }
                mmr0Var = new mmr0("byom-scroll-card", fuk0.NPV_SCROLL_CARD);
                String str3 = (String) mmr0Var.a;
                fuk0 fuk0Var = (fuk0) mmr0Var.b;
                String str4 = (tqwVar9 == null || (ou80Var = n3o1.y(tqwVar9).a) == null) ? null : ou80Var.a;
                String str5 = fn9Var.b;
                String str6 = fn9Var.a;
                if (str5 == null) {
                    hn9Var.a.f(str6, str3, str4);
                    aym.v(hn9Var.d, new hh(hn9Var, fn9Var, fuk0Var, (byte) 27));
                    return rih1Var;
                }
                if (!u890.j(dn9Var, bn9.a) && !u890.j(dn9Var, cn9.a)) {
                    eg.o();
                    return null;
                }
                ao9 ao9Var = (ao9) o7h.s0(fn9Var.c);
                String str7 = ao9Var != null ? ao9Var.a : null;
                if (str7 == null) {
                    return rih1Var;
                }
                hn9Var.a.k(str6, str7, str5, str3, (String) null, str4);
                String str8 = in9.a;
                if (str8 == null) {
                    return rih1Var;
                }
                tv80 tv80VarY = tqwVar9 != null ? n3o1.y(tqwVar9) : null;
                hn9Var.c.f(new dwn0(str8, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 10:
                nza nzaVar = (nza) this.c;
                lza lzaVar = (lza) this.d;
                tqw tqwVar10 = (tqw) this.b;
                hm5.M(obj);
                if (lzaVar != null) {
                    i1o1.w(((tza) obj2).a, nzaVar.a, tqwVar10 != null ? n3o1.y(tqwVar10) : null, new Long(w361.v(lzaVar.a)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                xza xzaVar = (xza) this.c;
                vza vzaVar = (vza) this.d;
                tqw tqwVar11 = (tqw) this.b;
                hm5.M(obj);
                if (vzaVar != null) {
                    i1o1.x((mjm) ((jd6) obj2).f, xzaVar.a, xzaVar.b, tqwVar11 != null ? n3o1.y(tqwVar11) : null, w361.v(vzaVar.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                qj0 qj0Var = (qj0) obj2;
                l4d l4dVar = (l4d) this.c;
                o4d o4dVar = (o4d) this.d;
                k4d k4dVar = (k4d) this.b;
                hm5.M(obj);
                if (!u890.j(k4dVar, k4d.a)) {
                    if (u890.j(k4dVar, k4d.b)) {
                        l4dVar.a.invoke();
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                if (o4dVar.a instanceof h981) {
                    ((q4d) qj0Var.d).a.s("android.permission.CAMERA");
                    return rih1Var;
                }
                l4dVar.a.invoke();
                ems0 ems0Var = (ems0) qj0Var.e;
                ems0Var.b.l(new fgs0(ems0Var, (byte) 2));
                return rih1Var;
            case 13:
                qhe qheVar = (qhe) this.c;
                lhe lheVar = (lhe) this.d;
                tqw tqwVar12 = (tqw) this.b;
                hm5.M(obj);
                if ((lheVar instanceof lhe) && (qheVar instanceof phe)) {
                    String str9 = ((phe) qheVar).a;
                    if (str9.length() > 0 && tqwVar12 != null) {
                        a1r0.m(((xlr) ((ldo) obj2).d).a, "spotify:audiobook:chapters:bottomsheet:".concat(ihc1.V0(str9, ':', str9)), n3o1.y(tqwVar12), (Bundle) null, 12);
                    }
                }
                return rih1Var;
            case 14:
                zth zthVar = (zth) this.c;
                cuh cuhVar = (cuh) this.d;
                tqw tqwVar13 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(cuhVar, cuh.a)) {
                    hqn1.q((lzn0) ((qlb) obj2).e, zthVar.a, tqwVar13, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                efk efkVar = (efk) this.c;
                dfk dfkVar = (dfk) this.d;
                tqw tqwVar14 = (tqw) this.b;
                hm5.M(obj);
                if (dfkVar != null) {
                    ((iu30) obj2).invoke(new v051(new z951(efkVar.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, efkVar.d, (String) null, false, 0, false, false, false, 259568), tqwVar14 != null ? n3o1.y(tqwVar14) : null, dfkVar.a));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                mem memVar = (mem) this.c;
                sem semVar = (sem) this.d;
                cem cemVar = (cem) this.b;
                hm5.M(obj);
                if (cemVar != null) {
                    kl1 kl1Var = (kl1) ((efm) obj2).e;
                    String str10 = memVar.a;
                    boolean z = semVar.b;
                    tv80 tv80VarB = ((e4v0) kl1Var.d).b();
                    l781 l781Var = new l781((String) null, (String) null, z, true, (c821) null, (ugo0) null, (ok51) null, 2, false, kl1Var.a, (r6h1) kl1Var.f, false, (String) null, (p860) null, 3782911);
                    i4q i4qVar = (i4q) kl1Var.e;
                    lik1 lik1Var = (lik1) kl1Var.b;
                    mfm mfmVarA = i4qVar.a(lik1Var);
                    Observable observableA = ((k781) kl1Var.c).a(str10, lik1Var, l781Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, observableA, yon1.c1(), new bjm(6, str10, (String) null), tv80VarB, 16);
                }
                return rih1Var;
            case 17:
                rem remVar = (rem) this.c;
                eem eemVar = (eem) this.d;
                tqw tqwVar15 = (tqw) this.b;
                hm5.M(obj);
                if (ifm.a[eemVar.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (!remVar.a) {
                    return rih1Var;
                }
                remVar.c.invoke(cvl1.d(tqwVar15));
                return rih1Var;
            case 18:
                nhm nhmVar = (nhm) this.c;
                mhm mhmVar = (mhm) this.d;
                tqw tqwVar16 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(mhmVar, mhm.a)) {
                    eg.o();
                    return null;
                }
                nhmVar.b.d.invoke(cvl1.d(tqwVar16));
                nhmVar.d.invoke();
                return rih1Var;
            case 19:
                s1o s1oVar = (s1o) obj2;
                v1o v1oVar = (c2o) this.c;
                t1o t1oVar2 = (t1o) this.d;
                tqw tqwVar17 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(t1oVar2, t1oVar)) {
                    eg.o();
                } else {
                    if (u890.j(v1oVar, u1oVar)) {
                        return rih1Var;
                    }
                    if (v1oVar instanceof v1o) {
                        v1o v1oVar2 = v1oVar;
                        z1o z1oVar = v1oVar2.d;
                        if (z1oVar instanceof z1o) {
                            String str11 = z1oVar.a;
                            if (str11 == null) {
                                return rih1Var;
                            }
                            z710.d(s1oVar.e, str11, false, 6);
                            return rih1Var;
                        }
                        if ((z1oVar instanceof w1o) || (z1oVar instanceof a2o) || (z1oVar instanceof x1o) || (z1oVar instanceof y1o)) {
                            if (tqwVar17 == null) {
                                return rih1Var;
                            }
                            s1oVar.d.a(v1oVar2.a, n3o1.y(tqwVar17), (Bundle) null);
                            return rih1Var;
                        }
                        eg.o();
                    } else {
                        eg.o();
                    }
                }
                return null;
            case 20:
                dfm dfmVar = (dfm) obj2;
                v1o v1oVar3 = (c2o) this.c;
                t1o t1oVar3 = (t1o) this.d;
                tqw tqwVar18 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(t1oVar3, t1oVar)) {
                    eg.o();
                } else {
                    if (u890.j(v1oVar3, u1oVar)) {
                        return rih1Var;
                    }
                    if (v1oVar3 instanceof v1o) {
                        v1o v1oVar4 = v1oVar3;
                        z1o z1oVar2 = v1oVar4.d;
                        if (z1oVar2 instanceof z1o) {
                            String str12 = z1oVar2.a;
                            if (str12 == null) {
                                return rih1Var;
                            }
                            z710.d((z710) dfmVar.h, str12, false, 6);
                            return rih1Var;
                        }
                        if ((z1oVar2 instanceof w1o) || (z1oVar2 instanceof a2o) || (z1oVar2 instanceof x1o) || (z1oVar2 instanceof y1o)) {
                            if (tqwVar18 == null) {
                                return rih1Var;
                            }
                            ((lzn0) dfmVar.g).a(v1oVar4.a, n3o1.y(tqwVar18), (Bundle) null);
                            return rih1Var;
                        }
                        eg.o();
                    } else {
                        eg.o();
                    }
                }
                return null;
            case 21:
                f5o f5oVar = (f5o) this.c;
                b5o b5oVar = (b5o) this.d;
                tqw tqwVar19 = (tqw) this.b;
                hm5.M(obj);
                if (!(b5oVar instanceof z4o)) {
                    if (b5oVar instanceof a5o) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                e5o e5oVar = (e5o) o7h.X0(f5oVar.b);
                String str13 = e5oVar != null ? e5oVar.b : null;
                if (str13 == null) {
                    return rih1Var;
                }
                String str14 = (str13.length() <= 0 || str13.equals("spotify:artist:0LyfQWJT6nXafLPZqxe9Of")) ? null : str13;
                if (str14 == null) {
                    return rih1Var;
                }
                x4o x4oVar = (x4o) obj2;
                tv80 tv80VarY2 = tqwVar19 != null ? n3o1.y(tqwVar19) : null;
                x4oVar.b.f(new dwn0(str14, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null));
                return rih1Var;
            case 22:
                g9o g9oVar = (g9o) this.c;
                e9o e9oVar = (e9o) this.d;
                tqw tqwVar20 = (tqw) this.b;
                hm5.M(obj);
                if (e9oVar != null) {
                    ((xv61) ((umf0) obj2).e).a(rc11.a.b(dao.class), rih1Var).a(new Integer(g9oVar.b), new Integer(e9oVar.a), tqwVar20 != null ? n3o1.y(tqwVar20) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 23:
                ifo ifoVar = (ifo) this.c;
                hfo hfoVar = (hfo) this.d;
                tqw tqwVar21 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(hfoVar, hfo.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar21 == null) {
                    return rih1Var;
                }
                ((lfo) obj2).b.a(ifoVar.d, n3o1.y(tqwVar21), (Bundle) null);
                return rih1Var;
            case 24:
                mpy mpyVar = (mpy) this.c;
                kpy kpyVar = (kpy) this.d;
                tqw tqwVar22 = (tqw) this.b;
                hm5.M(obj);
                tv80 tv80VarY3 = tqwVar22 != null ? n3o1.y(tqwVar22) : null;
                ft30 ft30Var = (ft30) obj2;
                lpy lpyVar = mpyVar.a;
                aey aeyVar = lpyVar.e;
                String str15 = lpyVar.b;
                boolean z2 = lpyVar.d;
                String str16 = lpyVar.a;
                switch (kpyVar.ordinal()) {
                    case 0:
                        dr3Var = z2 ? new dr3(str16) : new cr3(str16);
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 1:
                        if (tv80VarY3 == null) {
                            return rih1Var;
                        }
                        dr3Var = new fp3(str16, tv80VarY3, str15, aeyVar);
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 2:
                        dr3Var = new ep3(str16);
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 3:
                        String str17 = lpyVar.a;
                        String str18 = lpyVar.b;
                        aey aeyVar2 = lpyVar.e;
                        if (tv80VarY3 == null) {
                            return rih1Var;
                        }
                        dp3Var = new dp3(str17, str18, aeyVar2, tv80VarY3, lpyVar.n);
                        dr3Var = dp3Var;
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 4:
                        dr3Var = new bp3(str16);
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 5:
                        String str19 = lpyVar.a;
                        String str20 = lpyVar.b;
                        aey aeyVar3 = lpyVar.e;
                        if (tv80VarY3 == null) {
                            return rih1Var;
                        }
                        dp3Var = new ap3(str19, str20, aeyVar3, tv80VarY3, lpyVar.n);
                        dr3Var = dp3Var;
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 6:
                        if (tv80VarY3 == null) {
                            return rih1Var;
                        }
                        dr3Var = new cp3(str16, str15, tv80VarY3);
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    case 7:
                        dr3Var = new wq3(new jv51(str16, aeyVar, z2));
                        ft30Var.invoke(dr3Var);
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            case 25:
                v130 v130Var = (v130) this.c;
                r130 r130Var = (r130) this.d;
                tqw tqwVar23 = (tqw) this.b;
                hm5.M(obj);
                iu30 iu30Var = (iu30) obj2;
                int iOrdinal = r130Var.ordinal();
                if (iOrdinal == 0) {
                    pp3Var = zo3.a;
                } else if (iOrdinal == 1) {
                    pp3Var = rp3.a;
                } else if (iOrdinal == 2) {
                    bpb1 bpb1Var = w130.a;
                    u130 u130Var = v130Var.c;
                    t130 t130Var = u130Var instanceof t130 ? (t130) u130Var : null;
                    if (t130Var == null || (cob1Var = t130Var.a) == null) {
                        cob1Var = cob1.a;
                    }
                    pp3Var = new pp3(cob1Var, tqwVar23 != null ? n3o1.y(tqwVar23).a : null);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    String str21 = v130Var.a;
                    String str22 = v130Var.b;
                    if (str22 == null) {
                        str22 = "";
                    }
                    if (tqwVar23 == null) {
                        return rih1Var;
                    }
                    pp3Var = new op3(str22, str21, n3o1.y(tqwVar23));
                } else {
                    if (tqwVar23 == null) {
                        return rih1Var;
                    }
                    pp3Var = new gp3(n3o1.y(tqwVar23));
                }
                iu30Var.invoke(pp3Var);
                return rih1Var;
            case 26:
                stk1 stk1Var = (stk1) this.c;
                rtk1 rtk1Var = (rtk1) this.d;
                tqw tqwVar24 = (tqw) this.b;
                hm5.M(obj);
                String str23 = (tqwVar24 == null || (ou80Var2 = n3o1.y(tqwVar24).a) == null) ? null : ou80Var2.a;
                qzs qzsVar = (qzs) obj2;
                String str24 = stk1Var.g;
                Function0 function0 = stk1Var.e;
                String str25 = stk1Var.c;
                if (str24 != null) {
                    q900 q900Var = ((vk50) qzsVar.b.get()).b;
                    if (rtk1Var instanceof ntk1) {
                        q900Var.accept(new jsk1(str24, new xl61(((ntk1) rtk1Var).a / 100.0f, str25, str23, (v7l) null)));
                        function0.invoke();
                        return rih1Var;
                    }
                    String str26 = str23;
                    if (rtk1Var instanceof ptk1) {
                        q900Var.accept(new zrk1(str24, new b32(1, str25, str26, (iu30) null)));
                        function0.invoke();
                        return rih1Var;
                    }
                    if (rtk1Var instanceof qtk1) {
                        q900Var.accept(new zrk1(str24, new b32(2, str25, str26, (iu30) null)));
                        function0.invoke();
                        return rih1Var;
                    }
                    if (rtk1Var instanceof otk1) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    String str27 = str23;
                    kzs kzsVar = ((szs) qzsVar.a.get()).a;
                    ark1 ark1Var = kzsVar.c;
                    ark1 ark1Var2 = kzsVar.b;
                    if (rtk1Var instanceof ntk1) {
                        double d = ((ntk1) rtk1Var).a / 100.0f;
                        if (kzsVar.a()) {
                            ark1.g(kzsVar.c, d, str25, str27, 8);
                        } else {
                            ark1.g(ark1Var2, d, str25, str27, 8);
                        }
                        function0.invoke();
                        return rih1Var;
                    }
                    if (rtk1Var instanceof ptk1) {
                        if (kzsVar.a()) {
                            ark1.d(ark1Var, str25, str27, 4);
                        } else {
                            ark1.d(ark1Var2, str25, str27, 4);
                        }
                        function0.invoke();
                        return rih1Var;
                    }
                    if (rtk1Var instanceof qtk1) {
                        if (kzsVar.a()) {
                            ark1.f(ark1Var, str25, str27, 4);
                        } else {
                            ark1.f(ark1Var2, str25, str27, 4);
                        }
                        function0.invoke();
                        return rih1Var;
                    }
                    if (rtk1Var instanceof otk1) {
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case 27:
                flt fltVar = (flt) this.c;
                dlt dltVar = (dlt) this.d;
                tqw tqwVar25 = (tqw) this.b;
                hm5.M(obj);
                if (dltVar == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar25 == null) {
                    return rih1Var;
                }
                ((hlt) obj2).a.a(fltVar.b, n3o1.y(tqwVar25), (Bundle) null);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                d7w d7wVar = (f7w) this.c;
                a7w a7wVar = (a7w) this.d;
                tqw tqwVar26 = (tqw) this.b;
                hm5.M(obj);
                if (a7wVar == null) {
                    eg.o();
                    return null;
                }
                if (!(d7wVar instanceof d7w)) {
                    return rih1Var;
                }
                tv80 tv80VarY4 = tqwVar26 != null ? n3o1.y(tqwVar26) : null;
                lzn0 lzn0Var = (lzn0) ((hw2) obj2).f;
                if (tv80VarY4 != null) {
                    lzn0Var.a(d7wVar.a, tv80VarY4, (Bundle) null);
                    return rih1Var;
                }
                lzn0Var.f(new dwn0(d7wVar.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            default:
                jb3 jb3Var = (jb3) obj2;
                w2c1 w2c1Var = (y1c1) jb3Var.c;
                s7z s7zVar = (s7z) this.c;
                q7z q7zVar = (q7z) this.d;
                tqw tqwVar27 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(q7zVar, o7z.a)) {
                    w2c1Var.T(new bjt0(cvl1.d(tqwVar27)));
                    return rih1Var;
                }
                if (!u890.j(q7zVar, p7z.a)) {
                    eg.o();
                    return null;
                }
                zqt0 zqt0Var = s7zVar.b;
                if (zqt0Var instanceof zqt0) {
                    ((r0s0) jb3Var.d).t(s7zVar.a, zqt0Var.c);
                    return rih1Var;
                }
                tb2 tb2Var = s7zVar.c;
                if (!tb2Var.a || (num = tb2Var.b) == null) {
                    w2c1Var.T(new djt0(cvl1.d(tqwVar27)));
                    return rih1Var;
                }
                vb2.b((vb2) jb3Var.g, new db2(num.intValue()), true, cvl1.d(tqwVar27));
                return rih1Var;
        }
    }
}
