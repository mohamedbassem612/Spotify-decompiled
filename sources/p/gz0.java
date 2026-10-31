package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz0 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(iz0 iz0Var, xu30 xu30Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 0;
        this.e = iz0Var;
        this.f = xu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0210 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0211 A[RETURN] */
    private final Object e(Object obj) {
        r171 r171Var;
        tv80 tv80VarY;
        Object objE;
        k171 k171Var = (k171) this.c;
        k071 k071Var = (x071) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        r171 r171Var2 = (r171) this.f;
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = true;
        j171 j171Var = k171Var.a;
        boolean z2 = k171Var.b;
        tom tomVar = j171Var.j;
        String str = tomVar.a;
        lpl lplVar = tomVar.f;
        ny51 ny51Var = j171Var.i;
        bc71 bc71Var = lplVar.b;
        boolean z3 = k071Var instanceof w071;
        d9n d9nVar = d9n.a;
        if (z3) {
            ny51Var.invoke(k071Var);
        } else {
            boolean z4 = k071Var instanceof k071;
            jb71 jb71Var = jb71.a;
            if (z4) {
                f071 f071Var = k071Var.a;
                if (f071Var instanceof h071) {
                    xh71.b(r171Var2.h, new wa71(((h071) f071Var).a, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("android-libs-inappmessaging"), tqwVar != null ? n3o1.y(tqwVar) : null, (List) null, 18);
                } else if (f071Var instanceof c071) {
                    r171Var2.X.a(((c071) f071Var).a, r171Var2.l1, tqwVar != null ? n3o1.y(tqwVar) : null);
                } else {
                    if (!(f071Var instanceof g071)) {
                        if (!(f071Var instanceof e071) && !(f071Var instanceof i071)) {
                            if (f071Var instanceof f071) {
                                f071 f071Var2 = f071Var;
                                zb71 zb71VarL = wro1.L(bc71Var);
                                ib71 ib71VarB = zb71VarL != null ? zb71VarL.b() : null;
                                boolean z5 = k171Var.b;
                                if (tqwVar != null) {
                                    r171Var = r171Var2;
                                    tv80VarY = n3o1.y(tqwVar);
                                } else {
                                    r171Var = r171Var2;
                                    tv80VarY = null;
                                }
                                objE = r171Var.e(f071Var2, ib71VarB, z5, tv80VarY, this);
                                if (objE != d9nVar) {
                                }
                            } else {
                                if (!(f071Var instanceof d071)) {
                                    eg.o();
                                    return null;
                                }
                                String str2 = ((d071) f071Var).a;
                                if (!nzy.b(str2) || !u890.j(bc71Var, jb71Var)) {
                                    zb71 zb71VarL2 = wro1.L(bc71Var);
                                    r171Var2.f(str2, tqwVar, zb71VarL2 != null ? zb71VarL2.b() : null, z2);
                                }
                            }
                        }
                        if (objE == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    ny51Var.invoke(new t071(str, sl01.b));
                }
            } else if (k071Var instanceof l071) {
                String str3 = ((l071) k071Var).a;
                if (!nzy.b(str3) || !u890.j(bc71Var, jb71Var)) {
                    ny51Var.invoke(new t071(str, sl01.a));
                    zb71 zb71VarL3 = wro1.L(bc71Var);
                    r171Var2.f(str3, tqwVar, zb71VarL3 != null ? zb71VarL3.b() : null, z2);
                }
            } else if (!(k071Var instanceof n071)) {
                if (!u890.j(k071Var, m071.a)) {
                    eg.o();
                    return null;
                }
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(lplVar.a);
                String strZ = s4b1VarX.z();
                String strN = s4b1VarX.n("lyrics_provider_id");
                if (m0p1.y(lplVar.b) && strZ != null && strN != null) {
                    r171Var2.d.a(1, strZ, "absent", new bef0(strN, "", ""), dhf0.h, true, false);
                }
            } else if (r171Var2.t.j()) {
                ny51Var.invoke(new s071(tqwVar != null ? n3o1.y(tqwVar).a : null));
            } else {
                q961 q961Var = new q961(j171Var, (byte) 17);
                hyy0 hyy0Var = r171Var2.e;
                List<gxz0> list = ((n071) k071Var).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (gxz0 gxz0Var : list) {
                    w4i1 w4i1Var = gxz0Var.c;
                    String str4 = w4i1Var.a;
                    arrayList.add(new c401(new b401(str4, w4i1Var.b, w4i1Var.d, w4i1Var.c), gxz0Var.b, str4.equals(r171Var2.d1), true));
                }
                hyy0Var.l(arrayList, new c861(q961Var, r171Var2, (byte) 7));
            }
        }
        objE = rih1Var;
        if (objE == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    private final Object g(Object obj) {
        et90 et90Var = (et90) this.f;
        m581 m581Var = (m581) this.c;
        r581 r581Var = (r581) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (u890.j(r581Var, q581.a)) {
                ((lzn0) et90Var.e).a("spotify:internal:bluejay:show-generation-list", cvl1.d(tqwVar), (Bundle) null);
            } else {
                if (!u890.j(r581Var, p581.a)) {
                    eg.o();
                    return null;
                }
                x581 x581Var = m581Var.a;
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                Object objR = et90Var.r(x581Var, this);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        ve81 ve81Var = (ve81) this.c;
        xe81 xe81Var = (xe81) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!xe81Var.c) {
            t7n0 t7n0Var = ((ze81) this.f).a;
            String str = ve81Var.a;
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.b = true;
            Object objI = fc11.i(t7n0Var.a.g(str, tv80VarY), this);
            d9n d9nVar = d9n.a;
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    private final Object i(Object obj) {
        b891 b891Var = (d891) this.c;
        rih1 rih1Var = (rih1) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (tqwVar == null) {
                n57.e("interactionId is null for state: " + b891Var + ", event: " + rih1Var);
            }
            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
            b891 b891Var2 = b891Var instanceof b891 ? b891Var : null;
            long j = b891Var2 != null ? b891Var2.b : 0L;
            vu30 vu30Var = (vu30) this.f;
            x791 x791Var = new x791(j, tv80VarY);
            this.c = null;
            this.d = null;
            this.e = null;
            this.b = true;
            Object objInvoke = vu30Var.invoke(x791Var, this);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object j(Object obj) {
        tm91 tm91Var = (tm91) this.f;
        fm91 fm91Var = (fm91) this.c;
        zl91 zl91Var = (zl91) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!u890.j(zl91Var, yl91.a)) {
            if (u890.j(zl91Var, xl91.a)) {
                tm91Var.c.invoke();
                return rih1Var;
            }
            eg.o();
            return null;
        }
        String str = fm91Var.a;
        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = true;
        Object objI = fc11.i(tm91Var.b.g(str, tv80VarY), this);
        d9n d9nVar = d9n.a;
        if (objI != d9nVar) {
            objI = rih1Var;
        }
        return objI == d9nVar ? d9nVar : rih1Var;
    }

    private final Object m(Object obj) {
        res resVar = (res) this.f;
        sbb1 sbb1Var = (sbb1) this.c;
        jbb1 jbb1Var = (jbb1) this.d;
        tqw tqwVar = (tqw) this.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (xbb1.a[jbb1Var.ordinal()] != 1) {
                eg.o();
                return null;
            }
            if (sbb1Var.b) {
                f1n0 f1n0Var = (f1n0) resVar.d;
                tv80 tv80VarD = cvl1.d(tqwVar);
                String strA = aqv.a(sbb1Var.a);
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                Object objF = f1n0.f(f1n0Var, strA, tv80VarD, this);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                gz0 gz0Var = new gz0((iz0) this.e, (xu30) obj6, (lnm) obj5);
                gz0Var.c = (ez0) obj2;
                gz0Var.d = (vy0) obj3;
                return gz0Var.invokeSuspend(rih1Var);
            case 1:
                gz0 gz0Var2 = new gz0(obj6, (lnm) obj5, (byte) 1);
                gz0Var2.c = (cm1) obj2;
                gz0Var2.d = (vl1) obj3;
                gz0Var2.e = (tqw) obj4;
                return gz0Var2.invokeSuspend(rih1Var);
            case 2:
                gz0 gz0Var3 = new gz0(obj6, (lnm) obj5, (byte) 2);
                gz0Var3.c = (tm1) obj2;
                gz0Var3.d = (rm1) obj3;
                gz0Var3.e = (tqw) obj4;
                return gz0Var3.invokeSuspend(rih1Var);
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                gz0 gz0Var4 = new gz0(obj6, (lnm) obj5, (byte) 3);
                gz0Var4.c = (Boolean) obj;
                gz0Var4.b = zBooleanValue;
                gz0Var4.d = (Boolean) obj3;
                gz0Var4.e = (String) obj4;
                return gz0Var4.invokeSuspend(rih1Var);
            case 4:
                gz0 gz0Var5 = new gz0(obj6, (lnm) obj5, (byte) 4);
                gz0Var5.c = (enf) obj2;
                gz0Var5.d = (dnf) obj3;
                gz0Var5.e = (tqw) obj4;
                return gz0Var5.invokeSuspend(rih1Var);
            case 5:
                gz0 gz0Var6 = new gz0(obj6, (lnm) obj5, (byte) 5);
                gz0Var6.c = (jdk) obj2;
                gz0Var6.d = (ddk) obj3;
                gz0Var6.e = (tqw) obj4;
                return gz0Var6.invokeSuspend(rih1Var);
            case 6:
                gz0 gz0Var7 = new gz0(obj6, (lnm) obj5, (byte) 6);
                gz0Var7.c = (uho) obj;
                gz0Var7.d = (iho) obj3;
                gz0Var7.e = (tqw) obj4;
                return gz0Var7.invokeSuspend(rih1Var);
            case 7:
                gz0 gz0Var8 = new gz0(obj6, (lnm) obj5, (byte) 7);
                gz0Var8.c = (spq0) obj2;
                gz0Var8.d = (oc0) obj3;
                gz0Var8.e = (tqw) obj4;
                return gz0Var8.invokeSuspend(rih1Var);
            case 8:
                gz0 gz0Var9 = new gz0(obj6, (lnm) obj5, (byte) 8);
                gz0Var9.c = (psf) obj;
                gz0Var9.d = (gsf) obj3;
                gz0Var9.e = (tqw) obj4;
                return gz0Var9.invokeSuspend(rih1Var);
            case 9:
                gz0 gz0Var10 = new gz0(obj6, (lnm) obj5, (byte) 9);
                gz0Var10.c = (wlt) obj2;
                gz0Var10.d = (rlt) obj3;
                gz0Var10.e = (tqw) obj4;
                return gz0Var10.invokeSuspend(rih1Var);
            case 10:
                gz0 gz0Var11 = new gz0(obj6, (lnm) obj5, (byte) 10);
                gz0Var11.c = (bov) obj2;
                gz0Var11.d = (znv) obj3;
                gz0Var11.e = (tqw) obj4;
                return gz0Var11.invokeSuspend(rih1Var);
            case 11:
                gz0 gz0Var12 = new gz0(obj6, (lnm) obj5, (byte) 11);
                gz0Var12.c = (o231) obj;
                gz0Var12.d = (ec30) obj3;
                gz0Var12.e = (tqw) obj4;
                return gz0Var12.invokeSuspend(rih1Var);
            case 12:
                gz0 gz0Var13 = new gz0(obj6, (lnm) obj5, (byte) 12);
                gz0Var13.c = (sv70) obj;
                gz0Var13.d = (tv70) obj2;
                gz0Var13.e = (qv70) obj3;
                return gz0Var13.invokeSuspend(rih1Var);
            case 13:
                gz0 gz0Var14 = new gz0(obj6, (lnm) obj5, (byte) 13);
                gz0Var14.c = (nw90) obj2;
                gz0Var14.d = (bw90) obj3;
                gz0Var14.e = (tqw) obj4;
                return gz0Var14.invokeSuspend(rih1Var);
            case 14:
                gz0 gz0Var15 = new gz0(obj6, (lnm) obj5, (byte) 14);
                gz0Var15.c = (z3f0) obj;
                gz0Var15.d = (y3f0) obj3;
                gz0Var15.e = (tqw) obj4;
                return gz0Var15.invokeSuspend(rih1Var);
            case 15:
                gz0 gz0Var16 = new gz0(obj6, (lnm) obj5, (byte) 15);
                gz0Var16.c = (r231) obj;
                gz0Var16.d = (fgo0) obj3;
                gz0Var16.e = (tqw) obj4;
                return gz0Var16.invokeSuspend(rih1Var);
            case 16:
                gz0 gz0Var17 = new gz0(obj6, (lnm) obj5, (byte) 16);
                gz0Var17.c = (wxr0) obj;
                gz0Var17.d = (sxr0) obj3;
                gz0Var17.e = (tqw) obj4;
                return gz0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                gz0 gz0Var18 = new gz0(obj6, (lnm) obj5, (byte) 17);
                gz0Var18.c = (bft0) obj2;
                gz0Var18.d = (xet0) obj3;
                gz0Var18.e = (tqw) obj4;
                return gz0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                gz0 gz0Var19 = new gz0(obj6, (lnm) obj5, (byte) 18);
                gz0Var19.c = (d1x0) obj2;
                gz0Var19.d = (b1x0) obj3;
                gz0Var19.e = (tqw) obj4;
                return gz0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                gz0 gz0Var20 = new gz0(obj6, (lnm) obj5, (byte) 19);
                gz0Var20.c = (ka11) obj;
                gz0Var20.d = (ra11) obj2;
                gz0Var20.e = (bxz) obj3;
                return gz0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                gz0 gz0Var21 = new gz0(obj6, (lnm) obj5, (byte) 20);
                gz0Var21.c = (zl11) obj2;
                gz0Var21.d = (xl11) obj3;
                gz0Var21.e = (tqw) obj4;
                return gz0Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                gz0 gz0Var22 = new gz0(obj6, (lnm) obj5, (byte) 21);
                gz0Var22.c = (jp61) obj;
                gz0Var22.d = obj3;
                gz0Var22.e = (tqw) obj4;
                return gz0Var22.invokeSuspend(rih1Var);
            case 22:
                gz0 gz0Var23 = new gz0(obj6, (lnm) obj5, (byte) 22);
                gz0Var23.c = (k171) obj2;
                gz0Var23.d = (x071) obj3;
                gz0Var23.e = (tqw) obj4;
                return gz0Var23.invokeSuspend(rih1Var);
            case 23:
                gz0 gz0Var24 = new gz0(obj6, (lnm) obj5, (byte) 23);
                gz0Var24.c = (s371) obj;
                gz0Var24.d = (r371) obj3;
                gz0Var24.e = (tqw) obj4;
                return gz0Var24.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gz0 gz0Var25 = new gz0(obj6, (lnm) obj5, (byte) 24);
                gz0Var25.c = (m581) obj2;
                gz0Var25.d = (r581) obj3;
                gz0Var25.e = (tqw) obj4;
                return gz0Var25.invokeSuspend(rih1Var);
            case 25:
                gz0 gz0Var26 = new gz0(obj6, (lnm) obj5, (byte) 25);
                gz0Var26.c = (ve81) obj;
                gz0Var26.d = (xe81) obj2;
                gz0Var26.e = (tqw) obj4;
                return gz0Var26.invokeSuspend(rih1Var);
            case 26:
                gz0 gz0Var27 = new gz0(obj6, (lnm) obj5, (byte) 26);
                gz0Var27.c = (d891) obj2;
                gz0Var27.d = (rih1) obj3;
                gz0Var27.e = (tqw) obj4;
                return gz0Var27.invokeSuspend(rih1Var);
            case 27:
                gz0 gz0Var28 = new gz0(obj6, (lnm) obj5, (byte) 27);
                gz0Var28.c = (fm91) obj;
                gz0Var28.d = (zl91) obj3;
                gz0Var28.e = (tqw) obj4;
                return gz0Var28.invokeSuspend(rih1Var);
            case 28:
                gz0 gz0Var29 = new gz0(obj6, (lnm) obj5, (byte) 28);
                gz0Var29.c = (sbb1) obj;
                gz0Var29.d = (jbb1) obj3;
                gz0Var29.e = (tqw) obj4;
                return gz0Var29.invokeSuspend(rih1Var);
            default:
                gz0 gz0Var30 = new gz0(obj6, (lnm) obj5, (byte) 29);
                gz0Var30.c = (mcb1) obj;
                gz0Var30.d = (kcb1) obj3;
                gz0Var30.e = (tqw) obj4;
                return gz0Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:389:0x0734  */
    /* JADX WARN: Code duplicated, block: B:645:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        hdk hdkVar;
        String str;
        ou80 ou80Var;
        Object objA;
        ou80 ou80Var2;
        ou80 ou80Var3;
        ou80 ou80Var4;
        List listSingletonList;
        ou80 ou80Var5;
        Object objR;
        ou80 ou80Var6;
        ou80 ou80Var7;
        ou80 ou80Var8;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                iz0 iz0Var = (iz0) this.e;
                ez0 ez0Var = (ez0) this.c;
                vy0 vy0Var = (vy0) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    iz0Var.b = false;
                    return rih1Var;
                }
                hm5.M(obj);
                if (!ez0Var.e) {
                    return rih1Var;
                }
                if (vy0Var instanceof uy0) {
                    iz0Var.b = true;
                    return rih1Var;
                }
                if (!(vy0Var instanceof ty0)) {
                    if (vy0Var instanceof sy0) {
                        iz0Var.b = false;
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                xu30 xu30Var = (xu30) obj2;
                String str2 = ez0Var.a;
                Long l = new Long(((ty0) vy0Var).a);
                this.c = null;
                this.d = null;
                this.b = true;
                if (xu30Var.invoke(str2, l, this) == d9nVar) {
                    return d9nVar;
                }
                iz0Var.b = false;
                return rih1Var;
            case 1:
                cm1 cm1Var = (cm1) this.c;
                vl1 vl1Var = (vl1) this.d;
                tqw tqwVar = (tqw) this.e;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                    return rih1Var;
                }
                hm5.M(obj);
                if (!cm1Var.c) {
                    return rih1Var;
                }
                if (!(vl1Var instanceof tl1) && !(vl1Var instanceof ul1)) {
                    eg.o();
                    return null;
                }
                oj3 oj3Var = (oj3) ((nm1) obj2).f;
                boolean z4 = cm1Var.e;
                String str3 = cm1Var.a;
                String str4 = cm1Var.b;
                if (str4 == null) {
                    str4 = "";
                }
                Single singleC = oj3Var.c(Collections.singletonList(str4), str3, str3, z4, new gj3(27, tqwVar != null ? n3o1.y(tqwVar) : null));
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                objJ = fc11.j(singleC, this);
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 2:
                wm1 wm1Var = (wm1) obj2;
                tm1 tm1Var = (tm1) this.c;
                rm1 rm1Var = (rm1) this.d;
                tqw tqwVar2 = (tqw) this.e;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (u890.j(rm1Var, om1.a)) {
                        q8n q8nVar = wm1Var.f;
                        hb1 hb1Var = new hb1(wm1Var, tm1Var, tqwVar2, (lnm) null, (byte) 3);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return fn31.Y(q8nVar, hb1Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(rm1Var, pm1.a)) {
                        return rih1Var;
                    }
                    if (u890.j(rm1Var, qm1.a)) {
                        bpb1 bpb1Var = wm1Var.i;
                        ugz ugzVar = new ugz(null, false);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, ugzVar);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                Boolean bool = (Boolean) this.c;
                boolean z6 = this.b;
                Boolean bool2 = (Boolean) this.d;
                String str5 = (String) this.e;
                hm5.M(obj);
                if (bool.booleanValue() && z6 && bool2.booleanValue()) {
                    z = true;
                }
                str5.getClass();
                return new pv7(z, str5);
            case 4:
                inf infVar = (inf) obj2;
                enf enfVar = (enf) this.c;
                dnf dnfVar = (dnf) this.d;
                tqw tqwVar3 = (tqw) this.e;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    if (u890.j(dnfVar, cnf.a)) {
                        if (!enfVar.a || !enfVar.b) {
                            return rih1Var;
                        }
                        elf elfVar = infVar.c;
                        boolean z8 = !enfVar.c;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return elfVar.a(z8, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(dnfVar, ymf.a)) {
                        infVar.d.d.invoke(tqwVar3 != null ? n3o1.y(tqwVar3) : null);
                        return rih1Var;
                    }
                    if (u890.j(dnfVar, zmf.a) || u890.j(dnfVar, xmf.a) || u890.j(dnfVar, bnf.a) || u890.j(dnfVar, anf.a)) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                tdk tdkVar = (tdk) obj2;
                hdk hdkVar2 = (jdk) this.c;
                ddk ddkVar = (ddk) this.d;
                tqw tqwVar4 = (tqw) this.e;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    if (u890.j(ddkVar, yck.a)) {
                        hqn1.q(tdkVar.b, sok.u(hdkVar2), tqwVar4, (Bundle) null);
                        return rih1Var;
                    }
                    if (ddkVar instanceof zck) {
                        if (!(hdkVar2 instanceof hdk)) {
                            return rih1Var;
                        }
                        xck xckVar = ((zck) ddkVar).a;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return tdkVar.f(hdkVar2, xckVar, tqwVar4, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(ddkVar, bdk.a)) {
                        if (!(hdkVar2 instanceof hdk)) {
                            return rih1Var;
                        }
                        tck tckVar = tdkVar.Z;
                        hdk hdkVar3 = hdkVar2;
                        String str6 = hdkVar3.a;
                        String str7 = hdkVar3.b;
                        String str8 = hdkVar3.c;
                        String str9 = hdkVar3.d;
                        d7d d7dVar = hdkVar3.m;
                        List list = hdkVar3.t;
                        String str10 = hdkVar3.w;
                        String str11 = hdkVar3.x;
                        igm igmVar = new igm(str7, new wfm(Uri.parse(str8), yfm.c), str9);
                        smc0 smc0VarN = k4p1.n();
                        boolean z10 = d7dVar instanceof z6d;
                        if (z10 && str10 != null && str11 != null) {
                            smc0VarN.add(new jhm("cant_attend", (hux) gux.c, (fhm) null, (Integer) 2131956607, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(c6k.Y, c6k.Z), new ggh(tckVar, str6, str10, str11, (byte) 8)), 244));
                        } else if (!z10) {
                            smc0VarN.add(new jhm("not_interested", (hux) itx.c, (fhm) null, (Integer) 2131956608, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(c6k.N0, new kak(str6, (byte) 1)), new o0d(tckVar, str6, list)), 244));
                        }
                        smc0VarN.add(f971.b((f971) tckVar.h, str6, (String) null));
                        if (tckVar.b) {
                            smc0VarN.add(jl21.b((jl21) tckVar.i, str6, new lik1(str6)));
                        } else {
                            smc0VarN.add(((l6d) tckVar.j).a(str6));
                        }
                        mfm.c(((i4q) tckVar.c).a(new lik1(str6)), new kjm(igmVar, (List) k4p1.k(smc0VarN), 4), (p6r0) null, (bjm) null, (tv80) null, 22);
                        return rih1Var;
                    }
                    if (u890.j(ddkVar, cdk.a)) {
                        if (!(hdkVar2 instanceof hdk)) {
                            return rih1Var;
                        }
                        tdkVar.O0.l(sok.u(hdkVar2), "CampaignPromoCard", tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                        return rih1Var;
                    }
                    if (u890.j(ddkVar, adk.a)) {
                        if (!(hdkVar2 instanceof hdk) || (str = (hdkVar = hdkVar2).u) == null) {
                            return rih1Var;
                        }
                        ic9 ic9Var = tdkVar.R0;
                        dma1 dma1Var = (dma1) ic9Var.b;
                        String str12 = hdkVar.a;
                        boolean z11 = !hdkVar.v;
                        k5d k5dVar = new k5d(str12, str);
                        if (dma1Var.h(ic9.o(k5dVar), false) == z11) {
                            return rih1Var;
                        }
                        hma1 hma1VarEdit = dma1Var.edit();
                        hma1VarEdit.a(ic9.o(k5dVar), z11);
                        hma1VarEdit.g();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ic9Var.c;
                        Object obj3 = concurrentHashMap.get(k5dVar);
                        if (obj3 == null) {
                            bpb1 bpb1VarB = gio1.b(Boolean.valueOf(dma1Var.h(ic9.o(k5dVar), false)));
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(k5dVar, bpb1VarB);
                            obj3 = objPutIfAbsent == null ? bpb1VarB : objPutIfAbsent;
                        }
                        ((wen0) obj3).m((Object) null, Boolean.valueOf(z11));
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                uho uhoVar = (uho) this.c;
                iho ihoVar = (iho) this.d;
                tqw tqwVar5 = (tqw) this.e;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    if (gho.a[ihoVar.ordinal()] == 1) {
                        Function0 function0 = uhoVar.g;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        yy yyVar = new yy(tqwVar5 != null ? n3o1.y(tqwVar5) : null);
                        d0r d0rVar = ((hho) obj2).a;
                        hvm hvmVar = hvm.b;
                        String str13 = uhoVar.a;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        d0rVar.getClass();
                        return d0r.d(d0rVar, hvmVar, str13, yyVar, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 7:
                spq0 spq0Var = (spq0) this.c;
                oc0 oc0Var = (oc0) this.d;
                tqw tqwVar6 = (tqw) this.e;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    qc0 qc0Var = (qc0) spq0Var.h();
                    if (qc0Var == null) {
                        return rih1Var;
                    }
                    kp5 kp5Var = (kp5) obj2;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.b = true;
                    tq90 tq90Var = (tq90) kp5Var.e;
                    if (oc0Var instanceof hc0) {
                        ((ior) kp5Var.a).a((tqwVar6 == null || (ou80Var3 = n3o1.y(tqwVar6).a) == null) ? null : ou80Var3.a, false);
                    } else {
                        if (!(oc0Var instanceof lc0)) {
                            if (u890.j(oc0Var, mc0.a)) {
                                pp90 pp90Var = (pp90) ((c9c0) kp5Var.f).b.current().getValue();
                                if (pp90Var != null) {
                                    boolean z14 = qc0Var.g.b;
                                    if (z14) {
                                        tq90Var.a(pp90Var, hr90.a);
                                    } else if (z14) {
                                        eg.o();
                                    } else {
                                        tq90Var.a(pp90Var, hr90.b);
                                    }
                                }
                            } else if (u890.j(oc0Var, kc0.a)) {
                                j5a1 j5a1Var = (j5a1) kp5Var.c;
                                if (j5a1Var.a.a() == null || (objA = j5a1Var.b.a(this)) != d9nVar) {
                                    objA = rih1Var;
                                }
                                if (objA != d9nVar) {
                                }
                            } else if (u890.j(oc0Var, ic0.a)) {
                                if (tqwVar6 != null) {
                                    ((sb7) kp5Var.d).b("spotify:now-playing:queue", n3o1.y(tqwVar6));
                                }
                            } else if (u890.j(oc0Var, jc0.a)) {
                                lzn0 lzn0Var = (lzn0) kp5Var.h;
                                tv80 tv80VarY = tqwVar6 != null ? n3o1.y(tqwVar6) : null;
                                lzn0Var.f(new dwn0("spotify:premium-destination?displayReason=jam_premium_upsell", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                            } else if (u890.j(oc0Var, nc0.a)) {
                                ((gz90) kp5Var.g).a.a((tqwVar6 == null || (ou80Var = n3o1.y(tqwVar6).a) == null) ? null : ou80Var.a, nik1.u5.a, null);
                            } else {
                                eg.o();
                            }
                            if (objA == d9nVar) {
                                return d9nVar;
                            }
                            return rih1Var;
                        }
                        ox90.b((ox90) kp5Var.b, (tqwVar6 == null || (ou80Var2 = n3o1.y(tqwVar6).a) == null) ? null : ou80Var2.a);
                    }
                    objA = rih1Var;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                }
                if (z13) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                bmr bmrVar = (bmr) obj2;
                tq90 tq90Var2 = bmrVar.d;
                psf psfVar = (psf) this.c;
                gsf gsfVar = (gsf) this.d;
                tqw tqwVar7 = (tqw) this.e;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str14 = null;
                if (u890.j(gsfVar, fsf.a)) {
                    osf osfVar = psfVar.a;
                    if (osfVar instanceof lsf) {
                        listSingletonList = ((lsf) osfVar).a;
                    } else if (osfVar instanceof msf) {
                        listSingletonList = Collections.singletonList(((msf) osfVar).a);
                    } else if (osfVar instanceof nsf) {
                        listSingletonList = ((nsf) osfVar).a;
                    } else {
                        eg.o();
                    }
                    l6s l6sVar = bmrVar.b;
                    String str15 = (tqwVar7 == null || (ou80Var5 = n3o1.y(tqwVar7).a) == null) ? null : ou80Var5.a;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.b = true;
                    return l6sVar.y(str15, listSingletonList, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (gsfVar instanceof dsf) {
                    xab1 xab1Var = bmrVar.h;
                    if (xab1Var != null && xab1Var.isActive()) {
                        return rih1Var;
                    }
                    bmrVar.h = fn31.T(bmrVar.g, (o8n) null, 0, new zlo(bmrVar, tqwVar7, gsfVar, (lnm) null, (byte) 6), 3);
                    return rih1Var;
                }
                if (gsfVar instanceof esf) {
                    tq90Var2.a(((esf) gsfVar).a, hr90.X);
                    return rih1Var;
                }
                if (gsfVar instanceof csf) {
                    tq90Var2.a(((csf) gsfVar).a, hr90.t);
                    return rih1Var;
                }
                if (gsfVar instanceof bsf) {
                    i3b i3bVar = bmrVar.e;
                    if (tqwVar7 != null && (ou80Var4 = n3o1.y(tqwVar7).a) != null) {
                        str14 = ou80Var4.a;
                    }
                    i3bVar.i(str14, ((bsf) gsfVar).a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                wlt wltVar = (wlt) this.c;
                rlt rltVar = (rlt) this.d;
                tqw tqwVar8 = (tqw) this.e;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bmt bmtVar = (bmt) obj2;
                q8n q8nVar2 = bmtVar.c;
                sr1 sr1Var = new sr1(rltVar, tqwVar8, bmtVar, wltVar, (lnm) null, (byte) 13);
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                return fn31.Y(q8nVar2, sr1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                cm0 cm0Var = (cm0) obj2;
                bov bovVar = (bov) this.c;
                znv znvVar = (znv) this.d;
                tqw tqwVar9 = (tqw) this.e;
                boolean z17 = this.b;
                if (z17) {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objR = obj;
                    ((ktv) cm0Var.g).a((String) cm0Var.c, cvl1.d(tqwVar9), bovVar.a, (lbr) objR, bovVar.b);
                    return rih1Var;
                }
                hm5.M(obj);
                if (dov.a[znvVar.ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                g3d0 g3d0Var = bovVar.b;
                this.c = bovVar;
                this.d = null;
                this.e = tqwVar9;
                this.b = true;
                objR = cm0Var.r(g3d0Var, this);
                if (objR == d9nVar) {
                    return d9nVar;
                }
                ((ktv) cm0Var.g).a((String) cm0Var.c, cvl1.d(tqwVar9), bovVar.a, (lbr) objR, bovVar.b);
                return rih1Var;
            case 11:
                hc30 hc30Var = (hc30) obj2;
                lzn0 lzn0Var2 = hc30Var.b;
                o231 o231Var = (o231) this.c;
                ec30 ec30Var = (ec30) this.d;
                tqw tqwVar10 = (tqw) this.e;
                boolean z18 = this.b;
                if (z18) {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    lzn0Var2.e();
                    return rih1Var;
                }
                hm5.M(obj);
                int iOrdinal = ec30Var.ordinal();
                if (iOrdinal == 0) {
                    lzn0Var2.a("spotify:home", cvl1.d(tqwVar10), (Bundle) null);
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                pp31 pp31Var = hc30Var.c;
                String str16 = o231Var.b;
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                if (pp31Var.g(str16, this) == d9nVar) {
                    return d9nVar;
                }
                lzn0Var2.e();
                return rih1Var;
            case 12:
                sv70 sv70Var = (sv70) this.c;
                tv70 tv70Var = (tv70) this.d;
                qv70 qv70Var = (qv70) this.e;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    if (qv70Var instanceof qv70) {
                        String str17 = tv70Var.e;
                        if (str17 == null) {
                            return rih1Var;
                        }
                        f7c f7cVar = (f7c) ((nm1) obj2).g;
                        String str18 = sv70Var.b;
                        byte[] bArr = tv70Var.f;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        Object objA2 = iyc0.a(f7cVar.b, str18, new ayc0(str17, bArr != null ? phc.e(0, bArr, bArr.length) : null, null, false, null, 28), this);
                        if (objA2 != d9nVar) {
                            objA2 = rih1Var;
                        }
                        return objA2 == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 13:
                nw90 nw90Var = (nw90) this.c;
                bw90 bw90Var = (bw90) this.d;
                tqw tqwVar11 = (tqw) this.e;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    if (!(nw90Var instanceof lw90)) {
                        return rih1Var;
                    }
                    xv90 xv90Var = ((rw90) obj2).a;
                    if (bw90Var instanceof zv90) {
                        if (xv90Var.e.a() == null) {
                            return rih1Var;
                        }
                        j5a1 j5a1Var2 = xv90Var.c;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        Object objA3 = j5a1Var2.b.a(this);
                        if (objA3 != d9nVar) {
                            objA3 = rih1Var;
                        }
                        return objA3 == d9nVar ? d9nVar : rih1Var;
                    }
                    if (bw90Var instanceof aw90) {
                        xv90Var.d.a.a((tqwVar11 == null || (ou80Var6 = n3o1.y(tqwVar11).a) == null) ? null : ou80Var6.a, nik1.u5.a, null);
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 14:
                a4f0 a4f0Var = (a4f0) obj2;
                z3f0 z3f0Var = (z3f0) this.c;
                y3f0 y3f0Var = (y3f0) this.d;
                tqw tqwVar12 = (tqw) this.e;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    if (y3f0Var != null) {
                        o3s o3sVar = (o3s) ((ynb0) a4f0Var.c).get();
                        String str19 = z3f0Var.a;
                        tv80 tv80VarD = cvl1.d(tqwVar12);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return o3sVar.a(str19, tv80VarD, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 15:
                hc30 hc30Var2 = (hc30) obj2;
                lzn0 lzn0Var3 = hc30Var2.b;
                r231 r231Var = (r231) this.c;
                fgo0 fgo0Var = (fgo0) this.d;
                tqw tqwVar13 = (tqw) this.e;
                boolean z22 = this.b;
                if (z22) {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    lzn0Var3.e();
                    return rih1Var;
                }
                hm5.M(obj);
                int iOrdinal2 = fgo0Var.ordinal();
                if (iOrdinal2 == 0) {
                    lzn0Var3.a("spotify:home", cvl1.d(tqwVar13), (Bundle) null);
                    return rih1Var;
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                pp31 pp31Var2 = hc30Var2.c;
                String str20 = r231Var.b;
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                if (pp31Var2.g(str20, this) == d9nVar) {
                    return d9nVar;
                }
                lzn0Var3.e();
                return rih1Var;
            case 16:
                wxr0 wxr0Var = (wxr0) this.c;
                sxr0 sxr0Var = (sxr0) this.d;
                tqw tqwVar14 = (tqw) this.e;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    if (u890.j(sxr0Var, sxr0.a)) {
                        if (!wxr0Var.a()) {
                            return rih1Var;
                        }
                        rxr0 rxr0Var = (qxr0) ((eyr0) obj2).b.get();
                        String uri = wxr0Var.getUri();
                        String str21 = (tqwVar14 == null || (ou80Var7 = n3o1.y(tqwVar14).a) == null) ? null : ou80Var7.a;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return rxr0Var.a(uri, str21, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bft0 bft0Var = (bft0) this.c;
                xet0 xet0Var = (xet0) this.d;
                tqw tqwVar15 = (tqw) this.e;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    if (u890.j(xet0Var, xet0.a)) {
                        iwt0 iwt0Var = (iwt0) ((ngs0) obj2).b;
                        gwt0 gwt0Var = bft0Var.a;
                        String str22 = (tqwVar15 == null || (ou80Var8 = n3o1.y(tqwVar15).a) == null) ? null : ou80Var8.a;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return iwt0Var.m(gwt0Var, str22, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                d1x0 d1x0Var = (d1x0) this.c;
                b1x0 b1x0Var = (b1x0) this.d;
                tqw tqwVar16 = (tqw) this.e;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    if (!d1x0Var.f) {
                        return rih1Var;
                    }
                    if (b1x0Var != null) {
                        f1n0 f1n0Var = (f1n0) ((nm1) obj2).f;
                        String str23 = b1x0Var.a;
                        tv80 tv80VarD2 = cvl1.d(tqwVar16);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return f1n0.f(f1n0Var, str23, tv80VarD2, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ka11 ka11Var = (ka11) this.c;
                qa11 qa11Var = (ra11) this.d;
                bxz bxzVar = (bxz) this.e;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    if (u890.j(bxzVar, bxz.a)) {
                        if (!(qa11Var instanceof qa11)) {
                            return rih1Var;
                        }
                        String str24 = qa11Var.a;
                        if (!u890.j(str24, ka11Var.a)) {
                            return rih1Var;
                        }
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return ((oa11) obj2).g(str24, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bm11 bm11Var = (bm11) obj2;
                sfn0 sfn0Var = bm11Var.b;
                zl11 zl11Var = (zl11) this.c;
                xl11 xl11Var = (xl11) this.d;
                tqw tqwVar17 = (tqw) this.e;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    if (u890.j(xl11Var, ul11.a)) {
                        String str25 = zl11Var.g;
                        if (str25 == null) {
                            return rih1Var;
                        }
                        String str26 = zl11Var.a;
                        m6n0 m6n0Var = new m6n0(0L, 10000L);
                        tv80 tv80VarY2 = tqwVar17 != null ? n3o1.y(tqwVar17) : null;
                        sfn0Var.b.a.m((Object) null, new ogn0(true));
                        sfn0Var.b(str26, str25, m6n0Var, n6n0.EntityPreview, tv80VarY2);
                        return rih1Var;
                    }
                    if (xl11Var instanceof vl11) {
                        sfn0Var.c();
                        return rih1Var;
                    }
                    if (u890.j(xl11Var, wl11.a)) {
                        d0r d0rVar2 = bm11Var.a;
                        hvm hvmVar2 = hvm.b;
                        String str27 = zl11Var.a;
                        yy yyVar2 = new yy(tqwVar17 != null ? n3o1.y(tqwVar17) : null);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        d0rVar2.getClass();
                        return d0r.d(d0rVar2, hvmVar2, str27, yyVar2, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jp61 jp61Var = (jp61) this.c;
                Object obj4 = this.d;
                tqw tqwVar18 = (tqw) this.e;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                km61 km61Var = new km61(jp61Var);
                igb1 igb1Var = jp61Var.c;
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                return ((lcm) obj2).c1(km61Var, igb1Var, obj4, tqwVar18, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                return e(obj);
            case 23:
                s371 s371Var = (s371) this.c;
                r371 r371Var = (r371) this.d;
                tqw tqwVar19 = (tqw) this.e;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    if (u890.j(r371Var, r371.a)) {
                        fns fnsVar = igu.a;
                        bs50 bs50Var = pyf0.a.f;
                        i3y0 i3y0Var = new i3y0(obj2, (Object) s371Var, (Object) tqwVar19, (lnm) null, (byte) 23);
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = true;
                        return fn31.Y(bs50Var, i3y0Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return g(obj);
            case 25:
                return h(obj);
            case 26:
                return i(obj);
            case 27:
                return j(obj);
            case 28:
                return m(obj);
            default:
                mcb1 mcb1Var = (mcb1) this.c;
                kcb1 kcb1Var = (kcb1) this.d;
                tqw tqwVar20 = (tqw) this.e;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.d = null;
                this.e = null;
                this.b = true;
                return ((z72) obj2).g(mcb1Var, kcb1Var, tqwVar20, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz0(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }
}
