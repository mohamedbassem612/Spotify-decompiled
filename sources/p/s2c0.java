package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2c0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2c0(l5d0 l5d0Var, t45 t45Var) {
        super(2);
        this.a = (byte) 10;
        this.b = t45Var;
    }

    /* JADX WARN: Code duplicated, block: B:288:0x0756  */
    /* JADX WARN: Code duplicated, block: B:290:0x075e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.lnm] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i;
        String string;
        int i2;
        xnx xnxVar;
        Object obj4;
        Object obj5;
        qze0 qze0Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        int i3 = 2;
        ?? r7 = 0;
        boolean z = false;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oqo1.c((p2c0) obj6, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                lro1.b((z4a) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                tcc0 tcc0Var = (tcc0) obj;
                scc0 scc0Var = (scc0) obj2;
                zcc0 zcc0Var = (zcc0) obj6;
                nq6 nq6Var = scc0Var.b;
                String str = nq6Var.a;
                xwp0 xwp0VarO = dm5.O(0, nq6Var.d);
                boolean z2 = scc0Var.a;
                int i4 = (z2 || !tcc0Var.c) ? 2131957334 : 2131955116;
                Iterator it = nq6Var.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((pfv0) next).b == 2) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                pfv0 pfv0Var = (pfv0) obj3;
                String str2 = pfv0Var != null ? pfv0Var.a : "";
                Context context = zcc0Var.f;
                if (z2) {
                    int i5 = nq6Var.c;
                    int i6 = nq6Var.b;
                    if (i6 <= 0 || i5 <= 0) {
                        i = 1;
                        string = i6 > 0 ? context.getResources().getString(2131952462, context.getResources().getQuantityString(2131820576, i6, Integer.valueOf(i6)), str) : context.getResources().getString(2131952462, context.getResources().getQuantityString(2131820577, i5, Integer.valueOf(i5)), str);
                    } else {
                        i = 1;
                        string = context.getResources().getString(2131952461, context.getResources().getQuantityString(2131820577, i5, Integer.valueOf(i5)), context.getResources().getQuantityString(2131820576, i6, Integer.valueOf(i6)), str);
                    }
                    string.getClass();
                } else {
                    i = 1;
                    int i7 = scc0Var.c;
                    string = context.getResources().getString(2131952462, context.getResources().getQuantityString(2131820577, i7, Integer.valueOf(i7)), str);
                }
                String str3 = string;
                if (!(xwp0VarO instanceof lwp0)) {
                    if (!(xwp0VarO instanceof jwp0)) {
                        i2 = xwp0VarO instanceof hwp0 ? 3 : ((xwp0VarO instanceof vwp0) || xwp0VarO.equals(twp0.a) || xwp0VarO.equals(nwp0.a)) ? i : 0;
                    }
                    String str4 = nq6Var.e;
                    if (z2) {
                        xnxVar = xnx.c;
                    } else {
                        xnxVar = umx.c;
                    }
                    return new ucc0(i4, str2, str3, i2, str4, xnxVar);
                }
                i3 = 4;
                i2 = i3;
                String str5 = nq6Var.e;
                if (z2) {
                    xnxVar = xnx.c;
                } else {
                    xnxVar = umx.c;
                }
                return new ucc0(i4, str2, str3, i2, str5, xnxVar);
            case 3:
                crb crbVar = (crb) obj;
                et90 et90Var = (et90) obj6;
                for (Object obj7 : (List) obj2) {
                    if (u890.j(((zec0) obj7).b, (String) et90Var.e)) {
                        r7 = obj7;
                        return new qec0((zec0) r7, crbVar);
                    }
                }
                return new qec0((zec0) r7, crbVar);
            case 4:
                x6e x6eVar = (x6e) obj6;
                return new jpg0(f6o1.A((zcc0) x6eVar.b, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new pdb0(x6eVar, (byte) 17));
            case 5:
                kr61 kr61Var = ((egc0) obj6).c;
                t4m0 t4m0Var = kr61Var.b;
                t4m0Var.getClass();
                x6h1 x6h1VarC = t4m0Var.a.c();
                x6h1VarC.i.add(new a7h1("limit_settings_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str6 = nik1.v2.a;
                return new up61(((i8h1) kr61Var.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null));
            case 6:
                Object obj8 = ((cdk1) ((vu30) ((Map.Entry) obj6).getValue()).invoke((zob1) obj, (iac0) obj2)).a;
                maa maaVar = obj8 instanceof maa ? (maa) obj8 : null;
                if (maaVar != null) {
                    return maaVar;
                }
                syq syqVar = obj8 instanceof syq ? (syq) obj8 : null;
                ku70 ku70VarH = syqVar != null ? cgj1.H(syqVar, u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2) : null;
                return ku70VarH != null ? ku70VarH : q1o1.u((laa) obj8, u291.f(nim0Var, 1.0f), new FrameLayout.LayoutParams(-1, -2), 2);
            case 7:
                op80 op80Var = (op80) obj2;
                vu30 vu30Var = (vu30) ((p1d0) obj6).b.get(obj.getClass());
                if (vu30Var != null) {
                    return (op80) vu30Var.invoke(obj, op80Var);
                }
                return null;
            case 8:
                ((Number) obj2).intValue();
                ((q1d0) obj6).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                return new jpg0(f6o1.A((na9) ((ur6) obj6).b, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), l1d0.g);
            case 10:
                j0v0 j0v0Var = (j0v0) obj;
                Function0 function0 = (Function0) obj2;
                return j0v0Var != null ? t45.i((t45) obj6, cy30.o("[^a-zA-Z0-9]+", j0v0Var.b, "_"), function0) : function0.invoke();
            case 11:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                s5d0 s5d0Var = (s5d0) obj6;
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    if (s5d0Var.b.a) {
                        x340Var4.i0(-888405712);
                        boolean zI = x340Var4.i(s5d0Var);
                        Object objT = x340Var4.T();
                        if (zI || objT == fkj0.X) {
                            obj4 = objT;
                            no70 no70Var = new no70(s5d0Var, (lnm) null, (byte) 28);
                            x340Var4.s0(no70Var);
                            obj4 = no70Var;
                        }
                        obj4 = objT;
                        qxd0.t(rih1Var2, x340Var4, (vu30) obj4);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-888328832);
                        x340Var4.r(false);
                    }
                    otw.c(s5d0Var.c, rih1Var2, (qim0) null, (ipb1) null, x340Var4, 48, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 12:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                q6d0 q6d0Var = (q6d0) obj6;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI2 = x340Var6.i(q6d0Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == fkj0.X) {
                        obj5 = objT2;
                        p6d0 p6d0Var = new p6d0(q6d0Var, (lnm) r7, z ? (byte) 1 : (byte) 0);
                        x340Var6.s0(p6d0Var);
                        obj5 = p6d0Var;
                    }
                    obj5 = objT2;
                    qxd0.t(rih1Var, x340Var6, (vu30) obj5);
                    otw.c(q6d0Var.c, q6d0Var.b.a, (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 13:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                if ((i1rVar instanceof j1r) || (i1rVar2 instanceof j1r)) {
                    return null;
                }
                i1r i1rVar3 = i1rVar instanceof i1r ? i1rVar : null;
                Set set = i1rVar3 != null ? (Set) i1rVar3.a : null;
                if (set == null) {
                    set = w7x.a;
                }
                i1r i1rVar4 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                g3d0 g3d0Var = i1rVar4 != null ? (g3d0) i1rVar4.a : null;
                nm1 nm1Var = (nm1) obj6;
                boolean z3 = (g3d0Var == null || g3d0Var.equals((g3d0) ((vvu0) nm1Var.h).invoke((String) nm1Var.f))) ? false : true;
                Set set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z = z3;
                } else {
                    Iterator it2 = set2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (j8d0.a.contains((orc0) it2.next())) {
                            }
                        } else if (z3) {
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                uqo uqoVar = (uqo) obj;
                v9d0 v9d0Var = (v9d0) obj2;
                aj20 z9d0Var = cj20.t;
                if (((hgd0) ((res) obj6).f).a()) {
                    boolean z4 = v9d0Var.b;
                    Integer num = v9d0Var.a;
                    if (z4) {
                        z9d0Var = aj20.t;
                    } else if (num != null) {
                        z9d0Var = num.intValue() >= 1 ? new z9d0(num.intValue()) : bj20.t;
                    }
                }
                return new y9d0(uqoVar, z9d0Var, v9d0Var.c);
            case 15:
                bcd0 bcd0Var = (bcd0) obj;
                mgc mgcVar = ((gcd0) obj6).a;
                mgcVar.b = bcd0Var.a;
                mgcVar.X();
                Set set3 = bcd0Var.b;
                return First.c(ccd0.a((ccd0) obj2, null, null, 0L, false, set3, 111), Collections.singleton(new fbw(set3)));
            case 16:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY2 = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c(((afd0) obj6).b, rih1Var3, (qim0) null, (ipb1) null, x340Var8, 48, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var3;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                e7o e7oVar = (e7o) obj6;
                dg90 dg90Var = (dg90) e7oVar.b;
                epb1 epb1Var = new epb1((zob1) obj);
                w9u0 w9u0Var = (w9u0) e7oVar.c;
                haa0 haa0Var = (haa0) dg90Var.b;
                Flowable flowable = (Flowable) haa0Var.b;
                c1f1 c1f1Var = (c1f1) haa0Var.c;
                Scheduler scheduler = (Scheduler) haa0Var.d;
                c8o.l(flowable);
                c8o.l(c1f1Var);
                c8o.l(scheduler);
                return new jpg0(new yud0(flowable, c1f1Var, scheduler, epb1Var, w9u0Var), god0.O0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x4p1.e((cr31) obj6, u291.z(u291.f(nim0Var, 0.7f), (fra) null, 3), x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                z4p1.j((cx0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j2i j2iVar = uwi.a;
                    dz61 dz61Var = dz61.d;
                    ywo1.f((dz61) obj6, (qim0) null, j2iVar, x340Var12, 384);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                ((pm70) obj6).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 22:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str7 = ((ome0) obj6).a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str7, (qim0) null, cbx.d(x340Var14).h, cbx.a(x340Var14).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2034);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 23:
                int i8 = ((ane0) obj6).a.b;
                return vme0.a(vme0.g, null, 0, i8, i8, null, (cov0) obj, 19);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwo1.e(((rvb) obj6).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2046);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwo1.e(((woe0) obj6).a, (qim0) null, (lee1) null, 0L, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var18, 0, 0, 1710);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((ire0) obj6).b.d(blc0.na);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qse0 qse0Var = ((rse0) obj6).b;
                    boolean zI3 = x340Var22.i(qse0Var);
                    Object objT3 = x340Var22.T();
                    if (zI3 || objT3 == fkj0.X) {
                        p350 p350Var = new p350(0, qse0Var, qse0.class, "logOut", "logOut()V", 0, (byte) 28);
                        x340Var22.s0(p350Var);
                        objT3 = p350Var;
                    }
                    cbp1.b((Function0) objT3, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 28:
                u1f0 u1f0Var = (u1f0) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle != null && (qze0Var = (qze0) jhc1.t(bundle, "login_current_device_model", qze0.class)) != null) {
                    return qze0Var;
                }
                sze0 sze0Var = (sze0) obj6;
                c0f0 c0f0Var = sze0Var.a;
                return new qze0(c0f0Var.a, u1f0Var.c, c0f0Var.b, u1f0Var.d, (Intent) null, 1, 1, false, u1f0Var.e && sze0Var.h);
            default:
                u1f0 u1f0Var2 = (u1f0) obj;
                Bundle bundle2 = (Bundle) obj2;
                r0f0 r0f0Var = bundle2 != null ? (r0f0) jhc1.t(bundle2, "login_different_device_model", r0f0.class) : null;
                if (r0f0Var != null) {
                    return new r0f0(r0f0Var.a, r0f0Var.b, u1f0Var2.b, r0f0Var.d, r0f0Var.e, r0f0Var.f);
                }
                y0f0 y0f0Var = ((t0f0) obj6).a;
                return new r0f0(y0f0Var.a, u1f0Var2.c, u1f0Var2.b, y0f0Var.b, u1f0Var2.d, pe11.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2c0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2c0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
