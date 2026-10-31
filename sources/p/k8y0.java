package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k8y0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8y0(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.tv80 */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws tv80 {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                k8y0 k8y0Var = new k8y0((z72) this.e, (lnm) obj5, (byte) 0);
                k8y0Var.b = (e8y0) obj2;
                k8y0Var.c = (c8y0) obj3;
                k8y0Var.d = (tqw) obj4;
                k8y0Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                k8y0 k8y0Var2 = new k8y0((v1z0) this.e, (lnm) obj5, (byte) 1);
                k8y0Var2.b = (p1z0) obj;
                k8y0Var2.c = (u1z0) obj2;
                k8y0Var2.d = (o1z0) obj3;
                k8y0Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                k8y0 k8y0Var3 = new k8y0((h001) this.e, (lnm) obj5, (byte) 2);
                k8y0Var3.b = (wzz0) obj;
                k8y0Var3.c = (jzz0) obj3;
                k8y0Var3.d = (tqw) obj4;
                k8y0Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                k8y0 k8y0Var4 = new k8y0((kt01) this.e, (lnm) obj5, (byte) 3);
                k8y0Var4.b = (zv01) obj2;
                k8y0Var4.c = (uv01) obj3;
                k8y0Var4.d = (tqw) obj4;
                k8y0Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                k8y0 k8y0Var5 = new k8y0((et90) this.e, (lnm) obj5, (byte) 4);
                k8y0Var5.b = (hk11) obj2;
                k8y0Var5.c = (ek11) obj3;
                k8y0Var5.d = (tqw) obj4;
                k8y0Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                k8y0 k8y0Var6 = new k8y0((qlb) this.e, (lnm) obj5, b2);
                k8y0Var6.b = (ley0) obj;
                k8y0Var6.c = (jwz) obj3;
                k8y0Var6.d = (tqw) obj4;
                k8y0Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                k8y0 k8y0Var7 = new k8y0((en11) this.e, (lnm) obj5, (byte) 6);
                k8y0Var7.b = (zm11) obj;
                k8y0Var7.c = (xm11) obj3;
                k8y0Var7.d = (tqw) obj4;
                k8y0Var7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                k8y0 k8y0Var8 = new k8y0((jt11) this.e, (lnm) obj5, (byte) 7);
                k8y0Var8.b = (gt11) obj;
                k8y0Var8.c = (et11) obj3;
                k8y0Var8.d = (tqw) obj4;
                k8y0Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                k8y0 k8y0Var9 = new k8y0((jf31) this.e, (lnm) obj5, (byte) 8);
                k8y0Var9.b = (ef31) obj;
                k8y0Var9.c = (df31) obj3;
                k8y0Var9.d = (tqw) obj4;
                k8y0Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                k8y0 k8y0Var10 = new k8y0((bl31) this.e, (lnm) obj5, (byte) 9);
                k8y0Var10.b = (tk31) obj;
                k8y0Var10.c = (pk31) obj3;
                k8y0Var10.d = (tqw) obj4;
                k8y0Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                k8y0 k8y0Var11 = new k8y0((ol31) this.e, (lnm) obj5, (byte) 10);
                k8y0Var11.b = (gl31) obj;
                k8y0Var11.c = (dl31) obj3;
                k8y0Var11.d = (tqw) obj4;
                k8y0Var11.invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                k8y0 k8y0Var12 = new k8y0((n0o) this.e, (lnm) obj5, (byte) 11);
                k8y0Var12.b = (t541) obj2;
                k8y0Var12.c = (o541) obj3;
                k8y0Var12.d = (tqw) obj4;
                k8y0Var12.invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                k8y0 k8y0Var13 = new k8y0((z72) this.e, (lnm) obj5, (byte) 12);
                k8y0Var13.b = (m251) obj2;
                k8y0Var13.c = (j251) obj3;
                k8y0Var13.d = (tqw) obj4;
                k8y0Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                k8y0 k8y0Var14 = new k8y0((cm0) this.e, (lnm) obj5, (byte) 13);
                k8y0Var14.b = (vc61) obj2;
                k8y0Var14.c = (yqb) obj3;
                k8y0Var14.d = (tqw) obj4;
                k8y0Var14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                k8y0 k8y0Var15 = new k8y0((jd6) this.e, (lnm) obj5, (byte) 14);
                k8y0Var15.b = (ty61) obj2;
                k8y0Var15.c = (ly61) obj3;
                k8y0Var15.d = (tqw) obj4;
                k8y0Var15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                k8y0 k8y0Var16 = new k8y0((p081) this.e, (lnm) obj5, (byte) 15);
                k8y0Var16.b = (m081) obj;
                k8y0Var16.c = (g081) obj3;
                k8y0Var16.d = (tqw) obj4;
                k8y0Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                k8y0 k8y0Var17 = new k8y0((ngs0) this.e, (lnm) obj5, (byte) 16);
                k8y0Var17.b = (bi81) obj;
                k8y0Var17.c = (ai81) obj3;
                k8y0Var17.d = (tqw) obj4;
                k8y0Var17.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                k8y0 k8y0Var18 = new k8y0((j8a1) this.e, (lnm) obj5, (byte) 17);
                k8y0Var18.b = (f8a1) obj;
                k8y0Var18.c = (e8a1) obj3;
                k8y0Var18.d = (tqw) obj4;
                k8y0Var18.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                k8y0 k8y0Var19 = new k8y0((cba1) this.e, (lnm) obj5, (byte) 18);
                k8y0Var19.b = (xaa1) obj;
                k8y0Var19.c = (vaa1) obj3;
                k8y0Var19.d = (tqw) obj4;
                k8y0Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                k8y0 k8y0Var20 = new k8y0((iea1) this.e, (lnm) obj5, (byte) 19);
                k8y0Var20.b = (dea1) obj;
                k8y0Var20.c = (bea1) obj3;
                k8y0Var20.d = (tqw) obj4;
                k8y0Var20.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                k8y0 k8y0Var21 = new k8y0((qsb1) this.e, (lnm) obj5, (byte) 20);
                k8y0Var21.b = (lsb1) obj2;
                k8y0Var21.c = (isb1) obj3;
                k8y0Var21.d = (tqw) obj4;
                k8y0Var21.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k8y0 k8y0Var22 = new k8y0((ug3) this.e, (lnm) obj5, (byte) 21);
                k8y0Var22.b = (kif1) obj2;
                k8y0Var22.c = (iif1) obj3;
                k8y0Var22.d = (tqw) obj4;
                k8y0Var22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                k8y0 k8y0Var23 = new k8y0((qmf1) this.e, (lnm) obj5, (byte) 22);
                k8y0Var23.b = (nmf1) obj;
                k8y0Var23.c = (mmf1) obj3;
                k8y0Var23.d = (tqw) obj4;
                k8y0Var23.invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                k8y0 k8y0Var24 = new k8y0((yup0) this.e, (lnm) obj5, (byte) 23);
                k8y0Var24.b = (guf1) obj2;
                k8y0Var24.c = (euf1) obj3;
                k8y0Var24.d = (tqw) obj4;
                k8y0Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                k8y0 k8y0Var25 = new k8y0((tva1) this.e, (lnm) obj5, (byte) 24);
                k8y0Var25.b = (myf1) obj2;
                k8y0Var25.c = (uxf1) obj3;
                k8y0Var25.d = (tqw) obj4;
                k8y0Var25.invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                k8y0 k8y0Var26 = new k8y0(b2, (lnm) obj5);
                k8y0Var26.b = (p0d0) obj;
                k8y0Var26.c = (d811) obj2;
                k8y0Var26.d = (m7e0) obj3;
                k8y0Var26.e = (mbr) obj4;
                return k8y0Var26.invokeSuspend(rih1Var);
            case 26:
                k8y0 k8y0Var27 = new k8y0((el9) this.e, (lnm) obj5, (byte) 26);
                k8y0Var27.b = (lnh1) obj;
                k8y0Var27.c = (knh1) obj3;
                k8y0Var27.d = (tqw) obj4;
                k8y0Var27.invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                k8y0 k8y0Var28 = new k8y0((onh1) this.e, (lnm) obj5, (byte) 27);
                k8y0Var28.b = (lnh1) obj;
                k8y0Var28.c = (knh1) obj3;
                k8y0Var28.d = (tqw) obj4;
                k8y0Var28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                k8y0 k8y0Var29 = new k8y0((ovi1) this.e, (lnm) obj5, (byte) 28);
                k8y0Var29.b = (kvi1) obj;
                k8y0Var29.c = (ivi1) obj3;
                k8y0Var29.d = (tqw) obj4;
                k8y0Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                k8y0 k8y0Var30 = new k8y0((iu30) this.e, (lnm) obj5, (byte) 29);
                k8y0Var30.b = (svi1) obj;
                k8y0Var30.c = (rvi1) obj3;
                k8y0Var30.d = (tqw) obj4;
                k8y0Var30.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.tv80 */
    /* JADX WARN: Code duplicated, block: B:37:0x0148  */
    /* JADX WARN: Code duplicated, block: B:439:0x0ba0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [p.j7e0] */
    /* JADX WARN: Type inference failed for: r6v34 */
    public final Object invokeSuspend(Object obj) throws tv80 {
        String str;
        int i;
        String[] strArr;
        rxe1 rxe1Var;
        String str2;
        ?? r3;
        tv80 dwqVar;
        ?? r11;
        Map map;
        zuc0 zuc0Var;
        zuc0 zuc0Var2;
        String str3;
        zuc0 zuc0Var3;
        byte b = this.a;
        knh1 knh1Var = knh1.a;
        char c = 3;
        boolean z = true;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        tv80 tv80Var = null;
        switch (b) {
            case 0:
                z72 z72Var = (z72) this.e;
                e8y0 e8y0Var = (e8y0) this.b;
                c8y0 c8y0Var = (c8y0) this.c;
                tqw tqwVar = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(c8y0Var, a8y0.a)) {
                    if (c8y0Var instanceof b8y0) {
                        ((kt91) z72Var.g).k(new er91((fs91) null, ((b8y0) c8y0Var).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                iz31 iz31Var = (iz31) z72Var.Y;
                Map map2 = e8y0Var.g;
                boolean z3 = e8y0Var.h;
                boolean z4 = e8y0Var.i;
                z740 z740Var = new z740(1, ((lm10) ((i5y0) z72Var.X).d).a, "generate");
                z2 = ytw0.e(map2) != null;
                z740 z740VarA = iz31Var.a();
                if (z2) {
                    if (!z3) {
                        z740VarA = null;
                    }
                } else if (z4) {
                    z740VarA = z740Var;
                } else {
                    z740VarA = null;
                }
                if (z740VarA != null) {
                    x1i1.a((x1i1) z72Var.Z, z740VarA, 6);
                    return rih1Var;
                }
                if (tqwVar == null) {
                    return rih1Var;
                }
                ((lzn0) z72Var.f).a(ezn1.s((String) z72Var.e, e8y0Var.b, e8y0Var.c, e8y0Var.d == 3), n3o1.y(tqwVar), (Bundle) null);
                return rih1Var;
            case 1:
                p1z0 p1z0Var = (p1z0) this.b;
                u1z0 u1z0Var = (u1z0) this.c;
                o1z0 o1z0Var = (o1z0) this.d;
                hm5.M(obj);
                if (!(o1z0Var instanceof m1z0)) {
                    if (u890.j(o1z0Var, n1z0.a)) {
                        p1z0Var.g.invoke();
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                if (!(u1z0Var.b instanceof r1z0)) {
                    return rih1Var;
                }
                iu30 iu30Var = p1z0Var.f;
                boolean z5 = ((m1z0) o1z0Var).a;
                iu30Var.invoke(Boolean.valueOf(z5));
                bpb1 bpb1Var = ((v1z0) this.e).g;
                q1z0 q1z0Var = new q1z0(z5);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, q1z0Var);
                return rih1Var;
            case 2:
                h001 h001Var = (h001) this.e;
                wzz0 wzz0Var = (wzz0) this.b;
                zyz0 zyz0Var = (jzz0) this.c;
                tqw tqwVar2 = (tqw) this.d;
                hm5.M(obj);
                if (zyz0Var instanceof izz0) {
                    wzz0Var.k.invoke(zyz0Var);
                    return rih1Var;
                }
                if (zyz0Var instanceof azz0) {
                    wzz0Var.j.invoke();
                    return rih1Var;
                }
                if (zyz0Var instanceof zyz0) {
                    String str4 = zyz0Var.a;
                    try {
                        pcf.a(h001Var.b, str4, tqwVar2 != null ? n3o1.y(tqwVar2) : null, (Bundle) null);
                        return rih1Var;
                    } catch (Exception e) {
                        h001Var.d.k(new er91((fs91) null, h001Var.a.getString(2131951781), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        Logger.d(gvg.h("Buzz: Error when opening share. uri: ", str4, ", error message: ", e.getMessage()), new Object[0]);
                        return rih1Var;
                    }
                }
                if (!(zyz0Var instanceof bzz0)) {
                    eg.o();
                    return null;
                }
                fbz0 fbz0Var = new fbz0(wzz0Var, (byte) 15);
                hyy0 hyy0Var = h001Var.c;
                List<gxz0> list = ((bzz0) zyz0Var).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (gxz0 gxz0Var : list) {
                    w4i1 w4i1Var = gxz0Var.c;
                    String str5 = w4i1Var.a;
                    arrayList.add(new c401(new b401(str5, w4i1Var.b, w4i1Var.d, w4i1Var.c), gxz0Var.b, str5.equals(h001Var.Y), true));
                }
                hyy0Var.l(arrayList, new j3y0((Object) fbz0Var, (Object) h001Var, (byte) 17));
                return rih1Var;
            case 3:
                kt01 kt01Var = (kt01) this.e;
                vv01 vv01Var = (zv01) this.b;
                uv01 uv01Var = (uv01) this.c;
                tqw tqwVar3 = (tqw) this.d;
                hm5.M(obj);
                vv01 vv01Var2 = vv01Var instanceof vv01 ? vv01Var : null;
                if (vv01Var2 == null) {
                    return rih1Var;
                }
                if (u890.j(uv01Var, sv01.a)) {
                    kt01Var.d.a(vv01Var2.d(), cvl1.d(tqwVar3), (Bundle) null);
                    return rih1Var;
                }
                if (u890.j(uv01Var, tv01.a)) {
                    vgm.b(kt01Var.e, vv01Var2.d(), (String) null, cvl1.d(tqwVar3), new tgm((String) null, false, true, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -7, 1), 2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 4:
                hk11 hk11Var = (hk11) this.b;
                ek11 ek11Var = (ek11) this.c;
                tqw tqwVar4 = (tqw) this.d;
                hm5.M(obj);
                if (hk11Var instanceof gk11) {
                    return rih1Var;
                }
                if (!(hk11Var instanceof fk11) || ek11Var == null) {
                    eg.o();
                    return null;
                }
                if (tqwVar4 == null) {
                    return rih1Var;
                }
                ((lzn0) ((et90) this.e).d).a(ek11Var.a, n3o1.y(tqwVar4), (Bundle) null);
                return rih1Var;
            case 5:
                ley0 ley0Var = (ley0) this.b;
                jwz jwzVar = (jwz) this.c;
                tqw tqwVar5 = (tqw) this.d;
                hm5.M(obj);
                if (jwzVar == null) {
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var = (lzn0) ((ynb0) ((qlb) this.e).e).get();
                String str6 = ley0Var.a;
                tv80 tv80VarY = tqwVar5 != null ? n3o1.y(tqwVar5) : null;
                lzn0Var.f(new dwn0(str6, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 6:
                zm11 zm11Var = (zm11) this.b;
                xm11 xm11Var = (xm11) this.c;
                tqw tqwVar6 = (tqw) this.d;
                hm5.M(obj);
                if (xm11Var instanceof xm11) {
                    lzn0 lzn0Var2 = ((en11) this.e).a;
                    String str7 = zm11Var.a;
                    if (str7.length() > 0) {
                        lzn0Var2.f(new dwn0(str7, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tqwVar6 != null ? new bwn0(n3o1.y(tqwVar6)) : null));
                    } else {
                        n57.e("Cannot navigate to an empty URI");
                    }
                }
                return rih1Var;
            case 7:
                gt11 gt11Var = (gt11) this.b;
                et11 et11Var = (et11) this.c;
                tqw tqwVar7 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(et11Var, et11.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar7 == null) {
                    return rih1Var;
                }
                ((jt11) this.e).a.a(gt11Var.a, n3o1.y(tqwVar7), (Bundle) null);
                return rih1Var;
            case 8:
                ef31 ef31Var = (ef31) this.b;
                df31 df31Var = (df31) this.c;
                tqw tqwVar8 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(df31Var, df31.a)) {
                    eg.o();
                    return null;
                }
                jf31 jf31Var = (jf31) this.e;
                ef31Var.getClass();
                String str8 = ef31Var.a;
                lzn0 lzn0Var3 = jf31Var.b;
                if (tqwVar8 != null) {
                    lzn0Var3.a(str8, n3o1.y(tqwVar8), (Bundle) null);
                    return rih1Var;
                }
                lzn0Var3.h(str8);
                return rih1Var;
            case 9:
                tk31 tk31Var = (tk31) this.b;
                pk31 pk31Var = (pk31) this.c;
                tqw tqwVar9 = (tqw) this.d;
                hm5.M(obj);
                if (pk31Var != null) {
                    ((bl31) this.e).d.invoke(tk31Var.a, tk31Var.f.b, tqwVar9 != null ? n3o1.y(tqwVar9) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 10:
                gl31 gl31Var = (gl31) this.b;
                dl31 dl31Var = (dl31) this.c;
                tqw tqwVar10 = (tqw) this.d;
                hm5.M(obj);
                if (dl31Var != null) {
                    ((ol31) this.e).d.invoke(gl31Var.a, gl31Var.h.b, tqwVar10 != null ? n3o1.y(tqwVar10) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                r541 r541Var = (t541) this.b;
                o541 o541Var = (o541) this.c;
                tqw tqwVar11 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(o541Var, o541.a)) {
                    eg.o();
                    return null;
                }
                if (!(r541Var instanceof r541)) {
                    return rih1Var;
                }
                ((njm) ((n0o) this.e).g).a(r541Var.j, tqwVar11 != null ? n3o1.y(tqwVar11) : null, (Bundle) null);
                return rih1Var;
            case 12:
                z72 z72Var2 = (z72) this.e;
                bpb1 bpb1Var2 = (bpb1) z72Var2.Y;
                iu30 iu30Var2 = (iu30) z72Var2.t;
                bpb1 bpb1Var3 = (bpb1) z72Var2.X;
                m251 m251Var = (m251) this.b;
                y151 y151Var = (j251) this.c;
                tqw tqwVar12 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(y151Var, c251.b)) {
                    Boolean bool = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool);
                    m251 m251VarA = m251.a((m251) bpb1Var3.getValue(), null, true, 1);
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, m251VarA);
                    iu30Var2.invoke(new g151(tqwVar12 != null ? n3o1.y(tqwVar12) : null, true));
                    return rih1Var;
                }
                if (u890.j(y151Var, c251.a)) {
                    Boolean bool2 = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool2);
                    String str9 = ((m251) bpb1Var3.getValue()).a;
                    m251 m251Var2 = new m251("", true);
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, m251Var2);
                    if (str9.length() <= 0) {
                        return rih1Var;
                    }
                    iu30Var2.invoke(new k051("", ejb.f()));
                    return rih1Var;
                }
                if (y151Var instanceof y151) {
                    String str10 = ((m251) bpb1Var3.getValue()).a;
                    m251 m251Var3 = (m251) bpb1Var3.getValue();
                    y151 y151Var2 = y151Var;
                    String str11 = y151Var2.a;
                    m251 m251VarA2 = m251.a(m251Var3, str11, false, 2);
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, m251VarA2);
                    if (u890.j(str10, str11)) {
                        return rih1Var;
                    }
                    String str12 = ihc1.y0(str11) ? "" : str11;
                    if (!ihc1.y0(str11) && ihc1.y0(str10)) {
                        ((hc51) z72Var2.g).d(2);
                    }
                    iu30Var2.invoke(new k051(str12, y151Var2.b));
                    return rih1Var;
                }
                if (!(y151Var instanceof z151)) {
                    if (y151Var instanceof a251) {
                        iu30Var2.invoke(gz41.a);
                        return rih1Var;
                    }
                    if (!(y151Var instanceof d251)) {
                        eg.o();
                        return null;
                    }
                    d251 d251Var = (d251) y151Var;
                    boolean z6 = d251Var.a;
                    boolean z7 = d251Var.b;
                    if (z7) {
                        Boolean bool3 = Boolean.TRUE;
                        bpb1Var2.getClass();
                        str = null;
                        bpb1Var2.m((Object) null, bool3);
                    } else {
                        str = null;
                    }
                    m251 m251VarA3 = m251.a((m251) bpb1Var3.getValue(), str, z6, 1);
                    bpb1Var3.getClass();
                    bpb1Var3.m(str, m251VarA3);
                    iu30Var2.invoke(new g151((!z7 || tqwVar12 == null) ? null : n3o1.y(tqwVar12), z6));
                    return rih1Var;
                }
                z151 z151Var = (z151) y151Var;
                String str13 = z151Var.a;
                m251Var.getClass();
                m251 m251Var4 = new m251(str13, false);
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, m251Var4);
                String string = ihc1.e1(str13).toString();
                Set set = s4b1.f;
                if (uic.u(string)) {
                    String encodedPath = Uri.parse(String.valueOf(uic.x(string).a)).getEncodedPath();
                    if (encodedPath == null) {
                        n57.s("UriQueryEncoder: encodedPath was null for query=".concat(string));
                        i = 0;
                        strArr = new String[0];
                    } else {
                        i = 0;
                        strArr = (String[]) ihc1.Q0(encodedPath, new String[]{"/"}, 0, 6).toArray(new String[0]);
                    }
                    int length = strArr.length;
                    while (i < length) {
                        String str14 = strArr[i];
                        String strEncode = Uri.encode(str14);
                        if (!u890.j(str14, strEncode)) {
                            strEncode.getClass();
                            string = nhc1.W(string, str14, strEncode);
                        }
                        i++;
                    }
                }
                Set set2 = s4b1.f;
                if (u890.j(uic.x(string).a, Uri.EMPTY)) {
                    iu30Var2.invoke(new j051(str13, z151Var.b, tqwVar12 != null ? n3o1.y(tqwVar12) : null));
                    return rih1Var;
                }
                iu30Var2.invoke(new e051(string));
                return rih1Var;
            case 13:
                cm0 cm0Var = (cm0) this.e;
                vc61 vc61Var = (vc61) this.b;
                yqb yqbVar = (yqb) this.c;
                tqw tqwVar13 = (tqw) this.d;
                hm5.M(obj);
                Integer num = null;
                if (!u890.j(yqbVar, xqb.a)) {
                    if (u890.j(yqbVar, wqb.a)) {
                        fn31.T((u9c0) cm0Var.d, (o8n) null, 0, new n641(cm0Var, vc61Var, cvl1.d(tqwVar13).a, (lnm) null, (byte) 21), 3);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var4 = (lzn0) cm0Var.c;
                String str15 = (String) cm0Var.e;
                ymc0 ymc0Var = (ymc0) ((zob1) cm0Var.f).getValue();
                if (ymc0Var != null && (rxe1Var = ymc0Var.b) != null) {
                    num = new Integer(rxe1Var.b);
                }
                loo1.y(lzn0Var4, str15, num);
                return rih1Var;
            case 14:
                ty61 ty61Var = (ty61) this.b;
                ly61 ly61Var = (ly61) this.c;
                tqw tqwVar14 = (tqw) this.d;
                hm5.M(obj);
                if (!(ty61Var instanceof ry61)) {
                    return rih1Var;
                }
                if (ly61Var != null) {
                    xh71.b((xh71) ((jd6) this.e).f, new wa71(((ry61) ty61Var).a, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("entity-segments"), tqwVar14 != null ? n3o1.y(tqwVar14) : null, (List) null, 18);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                p081 p081Var = (p081) this.e;
                m081 m081Var = (m081) this.b;
                g081 g081Var = (g081) this.c;
                tqw tqwVar15 = (tqw) this.d;
                hm5.M(obj);
                if (g081Var instanceof e081) {
                    p081Var.c.a(m081Var.a, cvl1.d(tqwVar15), (Bundle) null);
                    return rih1Var;
                }
                if (!(g081Var instanceof f081)) {
                    eg.o();
                    return null;
                }
                vgm vgmVar = p081Var.e;
                String str16 = m081Var.d;
                String str17 = nik1.z0.a;
                tv80 tv80VarD = cvl1.d(tqwVar15);
                int i2 = m081Var.f;
                vgmVar.d(str16, str17, tv80VarD, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, i2 != 0 ? new p860(m081Var.d, i2) : null, (mgo0) null, false, false, -268435463, 1));
                return rih1Var;
            case 16:
                bi81 bi81Var = (bi81) this.b;
                ai81 ai81Var = (ai81) this.c;
                tqw tqwVar16 = (tqw) this.d;
                hm5.M(obj);
                if (ai81Var instanceof yh81) {
                    vrv0 vrv0Var = bi81Var.b;
                    if (vrv0Var != null) {
                        vrv0Var.m();
                    }
                    hqn1.q((lzn0) ((ngs0) this.e).d, bi81Var.a.c, tqwVar16, (Bundle) null);
                    return rih1Var;
                }
                if (!(ai81Var instanceof zh81)) {
                    eg.o();
                    return null;
                }
                vrv0 vrv0Var2 = bi81Var.b;
                if (vrv0Var2 == null) {
                    return rih1Var;
                }
                vrv0Var2.l();
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                f8a1 f8a1Var = (f8a1) this.b;
                e8a1 e8a1Var = (e8a1) this.c;
                tqw tqwVar17 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(e8a1Var, e8a1.a)) {
                    i1o1.z(((j8a1) this.e).b, f8a1Var.a, tqwVar17 != null ? n3o1.y(tqwVar17) : null, (Long) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                xaa1 xaa1Var = (xaa1) this.b;
                vaa1 vaa1Var = (vaa1) this.c;
                tqw tqwVar18 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(vaa1Var, vaa1.a)) {
                    i1o1.w(((cba1) this.e).b, xaa1Var.a, tqwVar18 != null ? n3o1.y(tqwVar18) : null, (Long) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                dea1 dea1Var = (dea1) this.b;
                bea1 bea1Var = (bea1) this.c;
                tqw tqwVar19 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(bea1Var, bea1.a)) {
                    i1o1.A(((iea1) this.e).c, dea1Var.a, tqwVar19 != null ? n3o1.y(tqwVar19) : null, (Long) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qsb1 qsb1Var = (qsb1) this.e;
                lsb1 lsb1Var = (lsb1) this.b;
                isb1 isb1Var = (isb1) this.c;
                tqw tqwVar20 = (tqw) this.d;
                hm5.M(obj);
                if (isb1Var == null) {
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var5 = qsb1Var.a;
                ksb1 ksb1Var = lsb1Var.a;
                lzn0Var5.a(qsb1.e(ksb1Var.b.a, ksb1Var.c), cvl1.d(tqwVar20), mno1.h(new mmr0[]{new mmr0("date", lsb1Var.a.e)}));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                kif1 kif1Var = (kif1) this.b;
                iif1 iif1Var = (iif1) this.c;
                tqw tqwVar21 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(iif1Var, iif1.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar21 == null) {
                    return rih1Var;
                }
                ((lzn0) ((ug3) this.e).c).a(kif1Var.a, n3o1.y(tqwVar21), (Bundle) null);
                return rih1Var;
            case 22:
                qmf1 qmf1Var = (qmf1) this.e;
                lzn0 lzn0Var6 = qmf1Var.a;
                nmf1 nmf1Var = (nmf1) this.b;
                mmf1 mmf1Var = (mmf1) this.c;
                tqw tqwVar22 = (tqw) this.d;
                hm5.M(obj);
                if (mmf1Var instanceof hmf1) {
                    return rih1Var;
                }
                if (mmf1Var instanceof lmf1) {
                    lzn0Var6.a(f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(nmf1Var.a, new String[]{":"}, 0, 6)), ":dna:feedback:credits"), cvl1.d(tqwVar22), (Bundle) null);
                    return rih1Var;
                }
                if (mmf1Var instanceof jmf1) {
                    lzn0Var6.a(f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(nmf1Var.a, new String[]{":"}, 0, 6)), ":dna:feedback:samples"), cvl1.d(tqwVar22), (Bundle) null);
                    return rih1Var;
                }
                if (mmf1Var instanceof kmf1) {
                    lzn0Var6.a(f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(nmf1Var.a, new String[]{":"}, 0, 6)), ":dna:feedback:other"), cvl1.d(tqwVar22), (Bundle) null);
                    return rih1Var;
                }
                if (mmf1Var instanceof imf1) {
                    z710.d(qmf1Var.b, "https://artists.spotify.com/c/song-dna-reporting", false, 6);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 23:
                r091 r091Var = (r091) ((yup0) this.e).d;
                guf1 guf1Var = (guf1) this.b;
                euf1 euf1Var = (euf1) this.c;
                tqw tqwVar23 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(euf1Var, buf1.a)) {
                    return rih1Var;
                }
                if (euf1Var instanceof duf1) {
                    r091Var.d();
                    return rih1Var;
                }
                if (!u890.j(euf1Var, cuf1.a)) {
                    eg.o();
                    return null;
                }
                tv80 tv80VarY2 = tqwVar23 != null ? n3o1.y(tqwVar23) : null;
                if (guf1Var.d) {
                    r091.f(r091Var, tv80VarY2, (Long) null, gky0.a, 6);
                    r091Var.k();
                    return rih1Var;
                }
                r091Var.b(new lsm0(guf1Var.b, new ksm0(fec1.c, guf1Var.a, (String) null, "reinvent-free-track-preview-upsell", (String) null, (String) null, 500), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                r091.f(r091Var, tv80VarY2, (Long) null, gky0.a, 6);
                r091Var.k();
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                jyf1 jyf1Var = (myf1) this.b;
                uxf1 uxf1Var = (uxf1) this.c;
                tqw tqwVar24 = (tqw) this.d;
                hm5.M(obj);
                if (!(uxf1Var instanceof uxf1)) {
                    eg.o();
                    return null;
                }
                if (tqwVar24 == null || !(jyf1Var instanceof jyf1) || (str2 = jyf1Var.e) == null) {
                    return rih1Var;
                }
                i1o1.A((mjm) ((tva1) this.e).g, str2, n3o1.y(tqwVar24), new Long(w361.v(uxf1Var.a)));
                return rih1Var;
            case 25:
                p0d0 p0d0Var = (p0d0) this.b;
                d811 d811Var = (d811) this.c;
                m7e0 m7e0Var = (m7e0) this.d;
                mbr mbrVar = (mbr) this.e;
                hm5.M(obj);
                List listK0 = z561.k0(z561.T(zdg1.i, new rlu(new i46(m7e0Var.b, (byte) 1), zdg1.h, (byte) 0)));
                ArrayList arrayList2 = new ArrayList(q7h.U(listK0, 10));
                int i3 = 0;
                for (Object obj2 : listK0) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        tv80 tv80Var2 = tv80Var;
                        p7h.T();
                        throw tv80Var2;
                    }
                    l7e0 l7e0Var = (l7e0) obj2;
                    o0d0 o0d0Var = p0d0Var.c;
                    cob1 cob1Var = p0d0Var.a;
                    if (l7e0Var instanceof j7e0) {
                        j7e0 j7e0Var = (j7e0) l7e0Var;
                        if (vno1.q(o0d0Var, j7e0Var) && cob1Var.b()) {
                            r3 = c;
                        } else if (vno1.q(o0d0Var, j7e0Var) && cob1Var == cob1.b) {
                            r3 = 2;
                        } else {
                            r3 = z;
                        }
                    } else {
                        r3 = z;
                    }
                    l7e0 l7e0Var2 = (l7e0) o7h.t0(i4, m7e0Var.b);
                    boolean z8 = r3 != z ? z : z2;
                    boolean z9 = r3 == c ? z : z2;
                    boolean zJ = ((mbrVar instanceof ibr) && (l7e0Var instanceof j7e0)) ? u890.j(((j7e0) l7e0Var).c, ((ibr) mbrVar).a) : z2;
                    if (l7e0Var2 != null) {
                        boolean z10 = l7e0Var2 instanceof j7e0;
                        tv80 tv80Var3 = z10 ? (j7e0) l7e0Var2 : tv80Var;
                        boolean z11 = (tv80Var3 == null || (zuc0Var3 = tv80Var3.a) == null || zuc0Var3.f() != z) ? false : z;
                        String strA = l7e0Var2.a();
                        if (z10) {
                            tv80Var = (j7e0) l7e0Var2;
                        }
                        if (tv80Var == null || (zuc0Var2 = tv80Var.a) == null) {
                            r11 = tv80Var;
                        } else {
                            str3 = zuc0Var2.c;
                        }
                        if (r11 == 0) {
                            r11 = str3;
                            r11 = "";
                        }
                        ?? r6 = z10 ? (j7e0) l7e0Var2 : tv80Var;
                        if (r6 == 0 || (zuc0Var = r6.a) == null || (map = zuc0Var.g) == null) {
                            map = b7x.a;
                        }
                        dwqVar = new dwq(r11, strA, z11, map);
                    } else {
                        tv80Var = tv80Var;
                        dwqVar = tv80Var;
                    }
                    arrayList2.add(new hwq(i3, z8, z9, zJ, dwqVar, d811Var, l7e0Var));
                    i3 = i4;
                    tv80Var = tv80Var;
                    c = 3;
                    z = true;
                    z2 = false;
                }
                return new igg1(m7e0Var.d, arrayList2);
            case 26:
                lnh1 lnh1Var = (lnh1) this.b;
                knh1 knh1Var2 = (knh1) this.c;
                tqw tqwVar25 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(knh1Var2, knh1Var)) {
                    eg.o();
                    return null;
                }
                if (tqwVar25 == null) {
                    return rih1Var;
                }
                ((lzn0) ((el9) this.e).g).a(lnh1Var.a, n3o1.y(tqwVar25), (Bundle) null);
                return rih1Var;
            case 27:
                lnh1 lnh1Var2 = (lnh1) this.b;
                knh1 knh1Var3 = (knh1) this.c;
                tqw tqwVar26 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(knh1Var3, knh1Var)) {
                    eg.o();
                    return null;
                }
                if (tqwVar26 == null) {
                    return rih1Var;
                }
                ((onh1) this.e).a.a(lnh1Var2.a, n3o1.y(tqwVar26), (Bundle) null);
                return rih1Var;
            case 28:
                kvi1 kvi1Var = (kvi1) this.b;
                ivi1 ivi1Var = (ivi1) this.c;
                tqw tqwVar27 = (tqw) this.d;
                hm5.M(obj);
                if (!u890.j(ivi1Var, ivi1.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar27 == null) {
                    return rih1Var;
                }
                ((ovi1) this.e).a.a(kvi1Var.a, n3o1.y(tqwVar27), (Bundle) null);
                return rih1Var;
            default:
                svi1 svi1Var = (svi1) this.b;
                rvi1 rvi1Var = (rvi1) this.c;
                tqw tqwVar28 = (tqw) this.d;
                hm5.M(obj);
                if (rvi1Var != null) {
                    ((iu30) this.e).invoke(new v051(new z951(svi1Var.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, svi1Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar28 != null ? n3o1.y(tqwVar28) : null, rvi1Var.a));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8y0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 25;
    }
}
