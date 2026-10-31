package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r20 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(s7y s7yVar, q7y q7yVar, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 18;
        this.d = s7yVar;
        this.e = q7yVar;
    }

    private final Object e(Object obj) {
        tet0 tet0Var = (tet0) this.c;
        ket0 ket0Var = (ket0) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (!u890.j(ket0Var, ket0.a)) {
                eg.o();
                return null;
            }
            mcu0 mcu0Var = ((ift0) this.e).a;
            String str = tet0Var.b;
            long j = tet0Var.d;
            String str2 = tet0Var.a;
            this.c = null;
            this.d = null;
            this.b = true;
            Object objB = mcu0Var.b(str, j, str2, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                r20 r20Var = new r20(obj5, (lnm) obj4, (byte) 0);
                r20Var.c = (qrp0) obj;
                r20Var.d = (tqw) obj3;
                return r20Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                r20 r20Var2 = new r20(obj5, (lnm) obj4, (byte) 1);
                r20Var2.c = (whx0) obj;
                r20Var2.b = zBooleanValue;
                r20Var2.d = (Boolean) obj3;
                return r20Var2.invokeSuspend(rih1Var);
            case 2:
                r20 r20Var3 = new r20(obj5, (lnm) obj4, (byte) 2);
                r20Var3.c = (o6u0) obj;
                r20Var3.d = (tqw) obj3;
                return r20Var3.invokeSuspend(rih1Var);
            case 3:
                r20 r20Var4 = new r20(obj5, (lnm) obj4, (byte) 3);
                r20Var4.c = (trp0) obj;
                r20Var4.d = (tqw) obj3;
                return r20Var4.invokeSuspend(rih1Var);
            case 4:
                r20 r20Var5 = new r20(obj5, (lnm) obj4, (byte) 4);
                r20Var5.c = (zr0) obj;
                r20Var5.d = (mdo) obj2;
                return r20Var5.invokeSuspend(rih1Var);
            case 5:
                r20 r20Var6 = new r20(obj5, (lnm) obj4, (byte) 5);
                r20Var6.c = (ky1) obj;
                r20Var6.d = (tqw) obj3;
                return r20Var6.invokeSuspend(rih1Var);
            case 6:
                r20 r20Var7 = new r20(obj5, (lnm) obj4, (byte) 6);
                r20Var7.c = (qy1) obj;
                r20Var7.d = (tqw) obj3;
                return r20Var7.invokeSuspend(rih1Var);
            case 7:
                r20 r20Var8 = new r20(obj5, (lnm) obj4, (byte) 7);
                r20Var8.c = (ff2) obj2;
                r20Var8.d = (tqw) obj3;
                return r20Var8.invokeSuspend(rih1Var);
            case 8:
                r20 r20Var9 = new r20(obj5, (lnm) obj4, (byte) 8);
                r20Var9.c = (fv2) obj;
                r20Var9.d = (dv2) obj2;
                return r20Var9.invokeSuspend(rih1Var);
            case 9:
                r20 r20Var10 = new r20(obj5, (lnm) obj4, (byte) 9);
                r20Var10.c = (pn7) obj2;
                r20Var10.d = (tqw) obj3;
                return r20Var10.invokeSuspend(rih1Var);
            case 10:
                r20 r20Var11 = new r20(obj5, (lnm) obj4, (byte) 10);
                r20Var11.c = (lv8) obj;
                r20Var11.d = (kv8) obj2;
                return r20Var11.invokeSuspend(rih1Var);
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                r20 r20Var12 = new r20(obj5, (lnm) obj4, (byte) 11);
                r20Var12.c = (lp9) obj;
                r20Var12.b = zBooleanValue2;
                r20Var12.d = (List) obj3;
                return r20Var12.invokeSuspend(rih1Var);
            case 12:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                r20 r20Var13 = new r20(obj5, (lnm) obj4, (byte) 12);
                r20Var13.c = (fdk) obj;
                r20Var13.b = zBooleanValue3;
                r20Var13.d = (Boolean) obj3;
                return r20Var13.invokeSuspend(rih1Var);
            case 13:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                r20 r20Var14 = new r20(obj5, (lnm) obj4, (byte) 13);
                r20Var14.c = (l0l) obj;
                r20Var14.b = zBooleanValue4;
                r20Var14.d = (hry0) obj3;
                return r20Var14.invokeSuspend(rih1Var);
            case 14:
                r20 r20Var15 = new r20(obj5, (lnm) obj4, (byte) 14);
                r20Var15.c = (osl) obj2;
                r20Var15.d = (tqw) obj3;
                return r20Var15.invokeSuspend(rih1Var);
            case 15:
                r20 r20Var16 = new r20(obj5, (lnm) obj4, (byte) 15);
                r20Var16.c = (y920) obj;
                r20Var16.d = (x920) obj2;
                return r20Var16.invokeSuspend(rih1Var);
            case 16:
                r20 r20Var17 = new r20(obj5, (lnm) obj4, (byte) 16);
                r20Var17.c = (bx91) obj;
                r20Var17.d = (ax91) obj2;
                return r20Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                r20 r20Var18 = new r20(obj5, (lnm) obj4, (byte) 17);
                r20Var18.c = (xev) obj2;
                r20Var18.d = (tqw) obj3;
                return r20Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                r20 r20Var19 = new r20((s7y) this.d, (q7y) obj5, (lnm) obj4);
                r20Var19.c = (p7y) obj2;
                return r20Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                r20 r20Var20 = new r20(obj5, (lnm) obj4, (byte) 19);
                r20Var20.c = (pb30) obj2;
                r20Var20.d = (tqw) obj3;
                return r20Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                r20 r20Var21 = new r20(obj5, (lnm) obj4, (byte) 20);
                r20Var21.c = (ep50) obj;
                r20Var21.d = (dp50) obj2;
                return r20Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                r20 r20Var22 = new r20(obj5, (lnm) obj4, (byte) 21);
                r20Var22.c = (hp50) obj;
                r20Var22.d = (gp50) obj2;
                return r20Var22.invokeSuspend(rih1Var);
            case 22:
                r20 r20Var23 = new r20(obj5, (lnm) obj4, (byte) 22);
                r20Var23.c = (v5a0) obj2;
                r20Var23.d = (tqw) obj3;
                return r20Var23.invokeSuspend(rih1Var);
            case 23:
                r20 r20Var24 = new r20(obj5, (lnm) obj4, (byte) 23);
                r20Var24.c = (c6a0) obj2;
                r20Var24.d = (tqw) obj3;
                return r20Var24.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                r20 r20Var25 = new r20(obj5, (lnm) obj4, (byte) 24);
                r20Var25.c = (gea0) obj;
                r20Var25.d = (fea0) obj2;
                return r20Var25.invokeSuspend(rih1Var);
            case 25:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                r20 r20Var26 = new r20(obj5, (lnm) obj4, (byte) 25);
                r20Var26.c = (cxc0) obj;
                r20Var26.d = (Set) obj2;
                r20Var26.b = zBooleanValue5;
                return r20Var26.invokeSuspend(rih1Var);
            case 26:
                r20 r20Var27 = new r20(obj5, (lnm) obj4, (byte) 26);
                r20Var27.c = (o4f0) obj2;
                r20Var27.d = (tqw) obj3;
                return r20Var27.invokeSuspend(rih1Var);
            case 27:
                r20 r20Var28 = new r20(obj5, (lnm) obj4, (byte) 27);
                r20Var28.c = (ttj0) obj;
                r20Var28.d = (tqw) obj3;
                return r20Var28.invokeSuspend(rih1Var);
            case 28:
                r20 r20Var29 = new r20(obj5, (lnm) obj4, (byte) 28);
                r20Var29.c = (tet0) obj;
                r20Var29.d = (ket0) obj2;
                return r20Var29.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                r20 r20Var30 = new r20(obj5, (lnm) obj4, (byte) 29);
                r20Var30.b = zBooleanValue6;
                r20Var30.c = (Boolean) obj2;
                r20Var30.d = (List) obj3;
                return r20Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objY;
        String strC;
        Object objM;
        String str;
        tv80 tv80Var;
        ou80 ou80Var;
        ou80 ou80Var2;
        String str2;
        goe m231Var;
        String str3;
        Object objG;
        String strN;
        String str4;
        String str5;
        up70 up70VarA;
        mq70 mq70Var;
        up70 up70VarA2;
        String str6;
        Object objA;
        ou80 ou80Var3;
        ou80 ou80Var4;
        Object[] objArr;
        rh7 rh7Var;
        byte b = this.a;
        String str7 = "";
        z = false;
        z = false;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                umf0 umf0Var = (umf0) obj2;
                qrp0 qrp0Var = (qrp0) this.c;
                tqw tqwVar = (tqw) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iOrdinal = qrp0Var.c.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        return rih1Var;
                    }
                    ((mdp0) umf0Var.d).invoke();
                    return rih1Var;
                }
                String strC2 = epo1.C(qrp0Var.c);
                if (strC2 == null) {
                    return rih1Var;
                }
                wy40 wy40Var = (wy40) ((ynb0) umf0Var.e).get();
                this.c = null;
                this.d = null;
                this.b = true;
                return wy40Var.a(strC2, tqwVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                whx0 whx0Var = (whx0) this.c;
                boolean z3 = this.b;
                Boolean bool = (Boolean) this.d;
                hm5.M(obj);
                iix0 iix0Var = (iix0) whx0Var.a.get(((d40) obj2).d);
                bool.getClass();
                return new c40(iix0Var, z3, bool.booleanValue());
            case 2:
                o6u0 o6u0Var = (o6u0) this.c;
                tqw tqwVar2 = (tqw) this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (tqwVar2 == null) {
                    return rih1Var;
                }
                vy40 vy40Var = (vy40) ((d70) obj2).b.get();
                String strW = u2p1.w(o6u0Var.e);
                tv80 tv80VarY = n3o1.y(tqwVar2);
                lnm lnmVar2 = null;
                this.c = null;
                this.d = null;
                this.b = true;
                vy40Var.getClass();
                if (strW.length() == 0 || (objY = fn31.Y((o8n) vy40Var.c.get(), new piu((Object) vy40Var, strW, (Parcelable) tv80VarY, lnmVar2, (byte) 23), this)) != d9nVar) {
                    objY = rih1Var;
                }
                return objY == d9nVar ? d9nVar : rih1Var;
            case 3:
                trp0 trp0Var = (trp0) this.c;
                tqw tqwVar3 = (tqw) this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                int iOrdinal2 = trp0Var.e.ordinal();
                if ((iOrdinal2 != 0 && iOrdinal2 != 1) || (strC = epo1.C(trp0Var.e)) == null) {
                    return rih1Var;
                }
                wy40 wy40Var2 = (wy40) ((e70) obj2).a.get();
                this.c = null;
                this.d = null;
                this.b = true;
                return wy40Var2.a(strC, tqwVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                bs0 bs0Var = (bs0) obj2;
                zr0 zr0Var = (zr0) this.c;
                mdo mdoVar = (mdo) this.d;
                boolean z6 = this.b;
                try {
                    if (z6) {
                        if (z6) {
                            hm5.M(obj);
                            objM = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    FlowableMap flowableMap = (FlowableMap) bs0Var.b;
                    this.c = zr0Var;
                    this.d = mdoVar;
                    this.b = true;
                    objM = u890.m(flowableMap, 1, this);
                    if (objM == d9nVar) {
                        return d9nVar;
                    }
                    Long l = (Long) objM;
                    l.getClass();
                    long jLongValue = l.longValue();
                    pxc pxcVar = (pxc) bs0Var.e;
                    ji0 ji0Var = zr0Var.a;
                    Long l2 = new Long(jLongValue);
                    int iOrdinal3 = mdoVar.ordinal();
                    if (iOrdinal3 == 0) {
                        str = "npb_hat_card";
                    } else {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        str = "npb_hat_button";
                    }
                    pxc.a(pxcVar, ji0Var, l2, str, "npb_hat", 16);
                    return rih1Var;
                } catch (Exception e) {
                    n57.q(e);
                    return rih1Var;
                }
            case 5:
                ky1 ky1Var = (ky1) this.c;
                tqw tqwVar4 = (tqw) this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                aas aasVar = ((ly1) obj2).a;
                String str8 = ky1Var.a;
                String str9 = ky1Var.b;
                String str10 = (tqwVar4 == null || (tv80Var = (tv80) tqwVar4.a(rc11.a.b(tv80.class))) == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
                CompletableObserveOn completableObserveOnB = aasVar.b(str8, str9, 2, str10 != null ? str10 : "");
                this.c = null;
                this.d = null;
                this.b = true;
                return fc11.i(completableObserveOnB, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                qy1 qy1Var = (qy1) this.c;
                tqw tqwVar5 = (tqw) this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                aas aasVar2 = (aas) ((br0) obj2).c;
                List listSingletonList = Collections.singletonList(ContextTrack.create(qy1Var.a));
                String str11 = qy1Var.b;
                if (tqwVar5 != null && (ou80Var2 = n3o1.y(tqwVar5).a) != null && (str2 = ou80Var2.a) != null) {
                    str7 = str2;
                }
                CompletableObserveOn completableObserveOnA = aasVar2.a(2, str11, str7, listSingletonList);
                this.c = null;
                this.d = null;
                this.b = true;
                return fc11.i(completableObserveOnA, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                hf2 hf2Var = (hf2) obj2;
                ff2 ff2Var = (ff2) this.c;
                tqw tqwVar6 = (tqw) this.d;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    if (u890.j(ff2Var, df2.a)) {
                        ((njm) hf2Var.d).a("spotify:age-assurance:request-parental-consent", cvl1.d(tqwVar6), (Bundle) null);
                        return rih1Var;
                    }
                    if (u890.j(ff2Var, cf2.a)) {
                        vb2.a((vb2) hf2Var.f, cvl1.d(tqwVar6));
                        return rih1Var;
                    }
                    if (u890.j(ff2Var, ef2.a)) {
                        f4f0 f4f0Var = (f4f0) hf2Var.e;
                        lik1 lik1Var = jf2.b;
                        tv80 tv80VarD = cvl1.d(tqwVar6);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return f4f0Var.a(lik1Var, tv80VarD, this) == d9nVar ? d9nVar : rih1Var;
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
            case 8:
                gv2 gv2Var = (gv2) obj2;
                fv2 fv2Var = (fv2) this.c;
                dv2 dv2Var = (dv2) this.d;
                boolean z10 = this.b;
                try {
                    if (z10) {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objG = obj;
                        m231Var = (goe) objG;
                    } else {
                        hm5.M(obj);
                        if (dv2Var == null) {
                            eg.o();
                            return null;
                        }
                        String str12 = dv2Var.a;
                        if (fv2Var.f >= 1) {
                            se11 se11Var = xq2.a;
                            String str13 = dv2Var.c;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            str3 = "[agent-command:permission_resolve]\n" + new uga0(linkedHashMap);
                        } else {
                            se11 se11Var2 = xq2.a;
                            boolean z11 = dv2Var.b;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            str3 = "[agent-command:permission_resolve]\n" + new uga0(linkedHashMap2);
                        }
                        tom tomVar = new tom(str12, fv2Var.b, w4i1.f, gv2Var.b.b() / 1000, true, new vol(str3, (String) null), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
                        bfd bfdVar = gv2Var.a;
                        g8d g8dVar = new g8d(fv2Var.b, str12, new a8d(tomVar, true), true);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        objG = bfdVar.G(g8dVar, this);
                        if (objG == d9nVar) {
                            return d9nVar;
                        }
                        m231Var = (goe) objG;
                    }
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null || !(thA instanceof CancellationException)) {
                    return rih1Var;
                }
                throw thA;
            case 9:
                pn7 pn7Var = (pn7) this.c;
                tqw tqwVar7 = (tqw) this.d;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    if (pn7Var != null) {
                        f1n0 f1n0Var = ((ud1) obj2).b;
                        tv80 tv80VarY2 = tqwVar7 != null ? n3o1.y(tqwVar7) : null;
                        dwn0 dwn0Var = new dwn0("spotify:chat-trusted-circle", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return f1n0.d(f1n0Var, dwn0Var, this) == d9nVar ? d9nVar : rih1Var;
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
            case 10:
                lv8 lv8Var = (lv8) this.c;
                kv8 kv8Var = (kv8) this.d;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    if (nv8.a[kv8Var.ordinal()] == 1) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return ((rwj) obj2).s(lv8Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 11:
                jp9 jp9Var = (lp9) this.c;
                boolean z14 = this.b;
                List list = (List) this.d;
                hm5.M(obj);
                if (jp9Var instanceof jp9) {
                    jp9 jp9Var2 = jp9Var;
                    return new tq9(jp9Var2.a, jp9Var2.b, jp9Var2.d, jp9Var2.e, list, z14);
                }
                if (u890.j(jp9Var, kp9.a)) {
                    return new tq9(15, list, z14);
                }
                eg.o();
                return null;
            case 12:
                fdk fdkVar = (fdk) this.c;
                boolean z15 = this.b;
                Boolean bool2 = (Boolean) this.d;
                hm5.M(obj);
                xkk1 xkk1Var = fdkVar.a;
                m6k m6kVar = fdkVar.c;
                vp70 vp70Var = vp70.d;
                String str14 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA2 = mq70Var.a(vp70Var)) == null || (str6 = up70VarA2.a.a) == null) ? "" : str6;
                jek jekVar = fdkVar.f;
                d7d d7dVar = jekVar != null ? jekVar.a : null;
                Long lS = d7dVar != null ? brl.s(d7dVar) : null;
                Long lP = d7dVar != null ? brl.p(d7dVar) : null;
                if (lS == null || lP == null) {
                    strN = "";
                } else {
                    long jLongValue2 = lS.longValue();
                    long jLongValue3 = lP.longValue();
                    long jB = ((tdk) obj2).f.b() / 1000;
                    if (jB >= jLongValue2) {
                        jLongValue2 = jLongValue3;
                    }
                    long j = jLongValue2 - jB;
                    strN = j <= 0 ? "" : brl.n(j);
                }
                xkk1 xkk1Var2 = fdkVar.b;
                String str15 = m6kVar.g;
                String str16 = m6kVar.c;
                ydk ydkVar = fdkVar.d;
                eek eekVar = fdkVar.e;
                int i = m6kVar.d;
                int i2 = m6kVar.i;
                xkk1 xkk1Var3 = fdkVar.a;
                mq70 mq70Var2 = xkk1Var3 != null ? xkk1Var3.e : null;
                vp70 vp70Var2 = vp70.e;
                Iterator it = p7h.M(new mmr0[]{new mmr0(mq70Var2, vp70Var2), new mmr0(xkk1Var3 != null ? xkk1Var3.f : null, vp70Var2), new mmr0(xkk1Var3 != null ? xkk1Var3.b : null, vp70Var2), new mmr0(xkk1Var3 != null ? xkk1Var3.a : null, vp70Var)}).iterator();
                while (true) {
                    if (it.hasNext()) {
                        mmr0 mmr0Var = (mmr0) it.next();
                        mq70 mq70Var3 = (mq70) mmr0Var.a;
                        vp70 vp70Var3 = (vp70) mmr0Var.b;
                        if (mq70Var3 == null || (up70VarA = mq70Var3.a(vp70Var3)) == null || (str5 = up70VarA.a.a) == null || str5.length() <= 0) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            str4 = str5;
                        }
                    } else {
                        str4 = null;
                    }
                }
                String str17 = str4 == null ? "" : str4;
                ArrayList arrayList = m6kVar.f;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((u6d) it2.next()).a);
                }
                return new edk(xkk1Var2, str15, str16, ydkVar, eekVar, d7dVar, i, i2, str14, str17, z15, bool2, strN, arrayList2, null, false);
            case 13:
                nnr nnrVar = (l0l) this.c;
                boolean z16 = this.b;
                hry0 hry0Var = (hry0) this.d;
                hm5.M(obj);
                hry0Var.getClass();
                if (!u890.j((h3l) obj2, h3l.a)) {
                    eg.o();
                    return null;
                }
                if (nnrVar == null) {
                    return z16 ? new k5l(hry0Var) : new l5l(hry0Var);
                }
                if (nnrVar instanceof nnr) {
                    kx7 kx7Var = nnrVar.B.a;
                    return kx7Var.b() ? new k5l(hry0Var) : new f5l(new g5l(kx7Var), hry0Var);
                }
                if (nnrVar.l()) {
                    return new k5l(hry0Var);
                }
                return nnrVar.f() ? new j5l(nnrVar) : new f5l(new h5l(nnrVar), hry0Var);
            case 14:
                tm tmVar = (tm) obj2;
                osl oslVar = (osl) this.c;
                tqw tqwVar8 = (tqw) this.d;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    if (u890.j(oslVar, msl.a)) {
                        ((sb7) tmVar.e).a((String) tmVar.d, cvl1.d(tqwVar8));
                        return rih1Var;
                    }
                    if (u890.j(oslVar, nsl.a)) {
                        f1n0 f1n0Var2 = (f1n0) tmVar.c;
                        tv80 tv80VarD2 = cvl1.d(tqwVar8);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return f1n0.f(f1n0Var2, "spotify:home", tv80VarD2, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 15:
                qj0 qj0Var = (qj0) obj2;
                y920 y920Var = (y920) this.c;
                x920 x920Var = (x920) this.d;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    int iOrdinal4 = x920Var.ordinal();
                    if (iOrdinal4 == 0) {
                        tbr0 tbr0Var = (tbr0) qj0Var.d;
                        q620 q620Var = y920Var.a;
                        tbr0Var.a(new y231(new qxm1(q620Var.a, q620Var.b)));
                        return rih1Var;
                    }
                    if (iOrdinal4 == 1) {
                        q620 q620Var2 = y920Var.a;
                        String str18 = q620Var2.a;
                        String str19 = q620Var2.b;
                        Integer num = q620Var2.c;
                        vod1 vod1Var = new vod1(num != null ? num.intValue() : 0, str18, str19);
                        euz euzVar = (euz) qj0Var.e;
                        ee21 ee21Var = new ee21(vod1Var, str19, str18);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        bpb1 bpb1Var = euzVar.c;
                        List list2 = (List) bpb1Var.getValue();
                        List list3 = list2;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            ArrayList arrayListO0 = o7h.O0(ee21Var, list2);
                            bpb1Var.m((Object) null, arrayListO0);
                            objA = euzVar.a(arrayListO0, this);
                            if (objA != d9nVar) {
                                objA = rih1Var;
                            }
                        } else {
                            Iterator it3 = list3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    ArrayList arrayListO1 = o7h.O0(ee21Var, list2);
                                    bpb1Var.m((Object) null, arrayListO1);
                                    objA = euzVar.a(arrayListO1, this);
                                    if (objA != d9nVar) {
                                    }
                                } else if (u890.j(((ee21) it3.next()).a.getId(), ee21Var.a.getId())) {
                                }
                                objA = rih1Var;
                            }
                        }
                        return objA == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 16:
                bx91 bx91Var = (bx91) this.c;
                ax91 ax91Var = (ax91) this.d;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    if (jrs.a[ax91Var.ordinal()] == 1) {
                        lrs lrsVar = (lrs) obj2;
                        String str20 = bx91Var.a;
                        String str21 = !bx91Var.c ? bx91Var.b : null;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        Object objY2 = fn31.Y(lrsVar.c, new swn(lrsVar, str20, str21, (lnm) null, (byte) 16), this);
                        if (objY2 != d9nVar) {
                            objY2 = rih1Var;
                        }
                        return objY2 == d9nVar ? d9nVar : rih1Var;
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
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xev xevVar = (xev) this.c;
                tqw tqwVar9 = (tqw) this.d;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    if (u890.j(xevVar, xev.a)) {
                        tv80 tv80VarD3 = cvl1.d(tqwVar9);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return ((nl9) obj2).j(tv80VarD3, this) == d9nVar ? d9nVar : rih1Var;
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
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                s7y s7yVar = (s7y) this.d;
                p7y p7yVar = (p7y) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    if (u890.j(p7yVar, o7y.a)) {
                        this.c = null;
                        this.b = true;
                        return s7yVar.e((q7y) obj2, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(p7yVar, n7y.a)) {
                        ((Function0) s7yVar.d.c).invoke();
                        return rih1Var;
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
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pb30 pb30Var = (pb30) this.c;
                tqw tqwVar10 = (tqw) this.d;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    if (pb30Var != null) {
                        String str22 = pb30Var.b;
                        kq61 kq61Var = pb30Var.a;
                        if (kq61Var instanceof jq61) {
                            z710.d((z710) ((rb30) obj2).a.get(), str22, false, 6);
                            return rih1Var;
                        }
                        if (kq61Var instanceof iq61) {
                            xu30 xu30Var = ((iq61) kq61Var).d;
                            tv80 tv80VarY3 = tqwVar10 != null ? n3o1.y(tqwVar10) : null;
                            this.c = null;
                            this.d = null;
                            this.b = true;
                            return xu30Var.invoke(str22, tv80VarY3, this) == d9nVar ? d9nVar : rih1Var;
                        }
                        eg.o();
                    } else {
                        eg.o();
                    }
                } else {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ep50 ep50Var = (ep50) this.c;
                dp50 dp50Var = (dp50) this.d;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    if (dp50Var != null) {
                        zv31 zv31Var = ep50Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        bur burVar = (bur) ((ynb0) ((ldo) obj2).c).get();
                        cp50 cp50Var = (cp50) zv31Var.j;
                        Object objA2 = burVar.a(cp50Var.a, cp50Var.b, this);
                        if (objA2 != d9nVar) {
                            objA2 = rih1Var;
                        }
                        return objA2 == d9nVar ? d9nVar : rih1Var;
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
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hp50 hp50Var = (hp50) this.c;
                gp50 gp50Var = (gp50) this.d;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    if (u890.j(gp50Var, gp50.a)) {
                        List list4 = hp50Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        Object objH = guo1.H(new piu(list4, (tm) obj2, lnmVar, (byte) 26), this);
                        if (objH != d9nVar) {
                            objH = rih1Var;
                        }
                        return objH == d9nVar ? d9nVar : rih1Var;
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
            case 22:
                v5a0 v5a0Var = (v5a0) this.c;
                tqw tqwVar11 = (tqw) this.d;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    if (v5a0Var != null) {
                        z5a0 z5a0Var = ((y5a0) obj2).a;
                        String str23 = (tqwVar11 == null || (ou80Var3 = n3o1.y(tqwVar11).a) == null) ? null : ou80Var3.a;
                        boolean z26 = v5a0Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return z5a0Var.a(str23, z26, this) == d9nVar ? d9nVar : rih1Var;
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
            case 23:
                c6a0 c6a0Var = (c6a0) this.c;
                tqw tqwVar12 = (tqw) this.d;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    if (c6a0Var != null) {
                        z5a0 z5a0Var2 = (z5a0) ((ng20) obj2).b;
                        String str24 = (tqwVar12 == null || (ou80Var4 = n3o1.y(tqwVar12).a) == null) ? null : ou80Var4.a;
                        boolean z28 = c6a0Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return z5a0Var2.a(str24, z28, this) == d9nVar ? d9nVar : rih1Var;
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
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gea0 gea0Var = (gea0) this.c;
                fea0 fea0Var = (fea0) this.d;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    if (hea0.a[fea0Var.ordinal()] == 1) {
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return ((pt) obj2).D(gea0Var, this) == d9nVar ? d9nVar : rih1Var;
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
            case 25:
                cxc0 cxc0Var = (cxc0) this.c;
                Set set = (Set) this.d;
                boolean z30 = this.b;
                hm5.M(obj);
                Set set2 = j8d0.a;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    objArr = false;
                } else {
                    Iterator it4 = set2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            objArr = false;
                        } else if (set.contains((orc0) it4.next())) {
                            objArr = true;
                        }
                    }
                }
                if (!((q7d0) obj2).f.a()) {
                    boolean z31 = cxc0Var.i;
                    boolean zW = s1p1.w(set);
                    if (!z31 || (objArr != false && !zW)) {
                        z = true;
                    }
                } else if (objArr != false || z30) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                o4f0 o4f0Var = (o4f0) this.c;
                tqw tqwVar13 = (tqw) this.d;
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    if (o4f0Var != null) {
                        f4f0 f4f0Var2 = (f4f0) ((ng20) obj2).b;
                        lik1 lik1Var2 = nik1.W0;
                        tv80 tv80VarD4 = cvl1.d(tqwVar13);
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return f4f0Var2.a(lik1Var2, tv80VarD4, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z32) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 27:
                ttj0 ttj0Var = (ttj0) this.c;
                tqw tqwVar14 = (tqw) this.d;
                boolean z33 = this.b;
                if (z33) {
                    if (z33) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                buj0 buj0Var = ((utj0) obj2).a;
                String str25 = ttj0Var.a;
                tv80 tv80Var2 = tqwVar14 != null ? (tv80) tqwVar14.a(rc11.a.b(tv80.class)) : null;
                this.c = null;
                this.d = null;
                this.b = true;
                return buj0Var.a(str25, tv80Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                return e(obj);
            default:
                boolean z34 = this.b;
                Boolean bool3 = (Boolean) this.c;
                List list5 = (List) this.d;
                hm5.M(obj);
                List list6 = list5;
                int iS = zno1.s(q7h.U(list6, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS);
                for (Object obj3 : list6) {
                    linkedHashMap3.put(((qfd) obj3).a, obj3);
                }
                List list7 = (List) obj2;
                int iS2 = zno1.s(q7h.U(list7, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj4 : list7) {
                    qfd qfdVar = (qfd) linkedHashMap3.get((String) obj4);
                    bool3.getClass();
                    linkedHashMap4.put(obj4, new y2u0((qfdVar == null || (rh7Var = qfdVar.d) == null) ? 0 : rh7Var.a, z34, bool3.booleanValue(), (qfdVar != null ? qfdVar.c : 0) == 3));
                }
                return linkedHashMap4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r20(Object obj, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
