package p;

import android.graphics.PorterDuff;
import android.os.Build;
import android.util.TypedValue;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.pam.v2.GetYourPremiumBadgeRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class afb1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afb1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                afb1 afb1Var = new afb1(obj4, (lnm) obj3, (byte) 0);
                afb1Var.c = (vr20) obj;
                afb1Var.d = (Throwable) obj2;
                return afb1Var.invokeSuspend(rih1Var);
            case 1:
                afb1 afb1Var2 = new afb1((lnm) obj3, obj4, (byte) 1);
                afb1Var2.c = (vr20) obj;
                afb1Var2.d = obj2;
                return afb1Var2.invokeSuspend(rih1Var);
            case 2:
                afb1 afb1Var3 = new afb1((myq0) this.d, (String) obj4, (lnm) obj3, (byte) 2);
                afb1Var3.c = (vr20) obj;
                return afb1Var3.invokeSuspend(rih1Var);
            case 3:
                afb1 afb1Var4 = new afb1((lnm) obj3, obj4, (byte) 3);
                afb1Var4.c = (vr20) obj;
                afb1Var4.d = obj2;
                return afb1Var4.invokeSuspend(rih1Var);
            case 4:
                afb1 afb1Var5 = new afb1((lnm) obj3, obj4, (byte) 4);
                afb1Var5.c = (vr20) obj;
                afb1Var5.d = obj2;
                return afb1Var5.invokeSuspend(rih1Var);
            case 5:
                afb1 afb1Var6 = new afb1((lnm) obj3, obj4, (byte) 5);
                afb1Var6.c = (vr20) obj;
                afb1Var6.d = obj2;
                return afb1Var6.invokeSuspend(rih1Var);
            case 6:
                afb1 afb1Var7 = new afb1((lnm) obj3, obj4, (byte) 6);
                afb1Var7.c = (vr20) obj;
                afb1Var7.d = obj2;
                return afb1Var7.invokeSuspend(rih1Var);
            case 7:
                afb1 afb1Var8 = new afb1((lnm) obj3, obj4, (byte) 7);
                afb1Var8.c = (vr20) obj;
                afb1Var8.d = obj2;
                return afb1Var8.invokeSuspend(rih1Var);
            case 8:
                afb1 afb1Var9 = new afb1((lnm) obj3, obj4, (byte) 8);
                afb1Var9.c = (vr20) obj;
                afb1Var9.d = obj2;
                return afb1Var9.invokeSuspend(rih1Var);
            case 9:
                afb1 afb1Var10 = new afb1((lnm) obj3, obj4, (byte) 9);
                afb1Var10.c = (vr20) obj;
                afb1Var10.d = obj2;
                return afb1Var10.invokeSuspend(rih1Var);
            case 10:
                afb1 afb1Var11 = new afb1((lnm) obj3, obj4, (byte) 10);
                afb1Var11.c = (vr20) obj;
                afb1Var11.d = obj2;
                return afb1Var11.invokeSuspend(rih1Var);
            case 11:
                afb1 afb1Var12 = new afb1((lnm) obj3, obj4, (byte) 11);
                afb1Var12.c = (vr20) obj;
                afb1Var12.d = obj2;
                return afb1Var12.invokeSuspend(rih1Var);
            case 12:
                afb1 afb1Var13 = new afb1((lnm) obj3, obj4, (byte) 12);
                afb1Var13.c = (vr20) obj;
                afb1Var13.d = obj2;
                return afb1Var13.invokeSuspend(rih1Var);
            case 13:
                afb1 afb1Var14 = new afb1((lnm) obj3, obj4, (byte) 13);
                afb1Var14.c = (vr20) obj;
                afb1Var14.d = obj2;
                return afb1Var14.invokeSuspend(rih1Var);
            case 14:
                afb1 afb1Var15 = new afb1((lnm) obj3, obj4, (byte) 14);
                afb1Var15.c = (vr20) obj;
                afb1Var15.d = obj2;
                return afb1Var15.invokeSuspend(rih1Var);
            case 15:
                afb1 afb1Var16 = new afb1((qtr) this.d, (tuk1) obj4, (lnm) obj3, (byte) 15);
                afb1Var16.c = (dvk1) obj;
                return afb1Var16.invokeSuspend(rih1Var);
            case 16:
                afb1 afb1Var17 = new afb1((lnm) obj3, obj4, (byte) 16);
                afb1Var17.c = (vr20) obj;
                afb1Var17.d = obj2;
                return afb1Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                afb1 afb1Var18 = new afb1((lnm) obj3, obj4, (byte) 17);
                afb1Var18.c = (vr20) obj;
                afb1Var18.d = obj2;
                return afb1Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                afb1 afb1Var19 = new afb1((lnm) obj3, obj4, (byte) 18);
                afb1Var19.c = (vr20) obj;
                afb1Var19.d = obj2;
                return afb1Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                afb1 afb1Var20 = new afb1((lnm) obj3, obj4, (byte) 19);
                afb1Var20.c = (vr20) obj;
                afb1Var20.d = obj2;
                return afb1Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                afb1 afb1Var21 = new afb1((lnm) obj3, obj4, (byte) 20);
                afb1Var21.c = (vr20) obj;
                afb1Var21.d = obj2;
                return afb1Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                afb1 afb1Var22 = new afb1((lnm) obj3, obj4, (byte) 21);
                afb1Var22.c = (vr20) obj;
                afb1Var22.d = obj2;
                return afb1Var22.invokeSuspend(rih1Var);
            case 22:
                afb1 afb1Var23 = new afb1((lnm) obj3, obj4, (byte) 22);
                afb1Var23.c = (vr20) obj;
                afb1Var23.d = obj2;
                return afb1Var23.invokeSuspend(rih1Var);
            default:
                afb1 afb1Var24 = new afb1(obj4, (lnm) obj3, (byte) 23);
                afb1Var24.c = (vr20) obj;
                afb1Var24.d = (Throwable) obj2;
                return afb1Var24.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:246:0x058f  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        mr20 huzVar;
        huz a1b1Var;
        String str;
        oei1 oei1Var;
        any huzVar2;
        z7a z7aVarB;
        huz x010Var;
        gwk1 m231Var;
        Object objH;
        huz cly0Var;
        m441 huzVar3;
        m441 huzVar4;
        huz m441Var;
        huz huzVar5;
        huz huzVar6;
        byte b = this.a;
        byte b2 = 21;
        jge m441Var2 = r6x.a;
        byte b3 = 23;
        byte b4 = 10;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                Throwable th = (Throwable) this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var.emit((yeb1) obj2, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                Object obj3 = this.d;
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
                String str2 = (String) obj3;
                if (str2 == null || (huzVar = (mr20) ((hbd1) obj2).b.invoke(str2)) == null) {
                    huzVar = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((myq0) this.d).m(3, 1);
                mgd1 mgd1Var = new mgd1((String) obj2);
                this.c = null;
                this.b = true;
                return vr20Var3.emit(mgd1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
                Object obj4 = this.d;
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
                if (((Boolean) obj4).booleanValue()) {
                    m441Var2 = new m441(new w621((yqg) obj2, (lnm) null, (byte) 18));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, m441Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = (vr20) this.c;
                Object obj5 = this.d;
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
                if (((Boolean) obj5).booleanValue()) {
                    m441Var2 = (kge) ((lvc1) obj2).b;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, m441Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = (vr20) this.c;
                Object obj6 = this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                tva1 tva1Var = (tva1) obj2;
                ay8 ay8VarF = d3p1.F(tva1Var.b, (o3r) tva1Var.Q0, (String) obj6);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var6, ay8VarF, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                vr20 vr20Var7 = (vr20) this.c;
                Object obj7 = this.d;
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
                w5g1 w5g1Var = (x5g1) obj7;
                w5g1 w5g1Var2 = w5g1Var instanceof w5g1 ? w5g1Var : null;
                o5g1 o5g1Var = w5g1Var2 != null ? w5g1Var2.a : null;
                if (o5g1Var == null) {
                    a1b1Var = new huz(new c5g1(w5g1Var, null), (byte) 10);
                } else {
                    i5g1 i5g1Var = (i5g1) obj2;
                    a1b1Var = new a1b1(d3p1.F(i5g1Var.b, i5g1Var.t, new g1q0(o5g1Var.a)), w5g1Var, (byte) 15);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var7, a1b1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = (vr20) this.c;
                Object obj8 = this.d;
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
                Flowable flowable = ((qns0) ((y861) obj2).b).b("transcript-link", Collections.singletonList((String) obj8), false).toFlowable();
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var8);
                Object objCollect = kgeVar.collect(new qmd1(vr20Var8, (byte) 26), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = (vr20) this.c;
                Object obj9 = this.d;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jha1 jha1Var = ((Boolean) obj9).booleanValue() ? new jha1(rqt0.u(new ph11(yoi1.g(hqq0.O(((eah1) obj2).a)), (byte) 16)), (byte) 23) : new huz((Object) null, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var9, jha1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = (vr20) this.c;
                Object obj10 = this.d;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                at71 at71VarA = ((Boolean) obj10).booleanValue() ? ((fah1) obj2).c.a() : new huz((Object) null, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var10, at71VarA, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                wei1 wei1Var = (wei1) obj2;
                vr20 vr20Var11 = (vr20) this.c;
                Object obj11 = this.d;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                PlayerState playerState = (PlayerState) obj11;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                if (contextTrack == null || (str = (String) playerState.playbackId().h()) == null) {
                    oei1Var = null;
                } else {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str == null) {
                        oei1Var = null;
                    } else {
                        oei1Var = new oei1(contextTrack.uri(), str, contextTrack.metadata().containsKey("media.external_url"));
                    }
                }
                huz huzVar7 = oei1Var == null ? new huz((Object) null, (byte) 10) : new mpy0(new m441(new xoh1(wei1Var, playerState, (lnm) null, (byte) 4)), wei1Var, oei1Var, (byte) 29);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var11, huzVar7, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                p2j1 p2j1Var = (p2j1) obj2;
                vr20 vr20Var12 = (vr20) this.c;
                Object obj12 = this.d;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                bn70 bn70VarA = ((bbr0) p2j1Var.h).b0(bn70.class).a();
                n6r0 n6r0Var = bn70VarA != null ? bn70VarA.a : null;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                if (u890.j(n6r0Var, yon1.S2()) || !zBooleanValue) {
                    huzVar2 = new huz((Object) null, (byte) 10);
                } else {
                    azi1 azi1Var = (azi1) p2j1Var.d;
                    dg30 dg30Var = (dg30) p2j1Var.e;
                    WeakReference weakReference = azi1Var.d;
                    if (weakReference == null || (z7aVarB = (z7a) weakReference.get()) == null || z7aVarB.h) {
                        boolean zA = azi1Var.c.a();
                        String string = dg30Var.getResources().getString(zA ? 2131963714 : 2131963712);
                        String string2 = dg30Var.getResources().getString(zA ? 2131963713 : 2131963711);
                        String string3 = dg30Var.getResources().getString(2131963710);
                        TypedValue typedValue = new TypedValue();
                        dg30Var.getTheme().resolveAttribute(2130968769, typedValue, true);
                        z7aVarB = azi1Var.a.b(new n5a(null, new gap1(string, (byte) 17), null, null, new clv(string2, (byte) 16), Collections.singletonList(new i5a(string3, new ymg1(azi1Var, (byte) 25), 2)), null, new j5a(dg30Var.getColor(typedValue.resourceId)), 823), true, w2j0.a);
                        azi1Var.d = new WeakReference(z7aVarB);
                    }
                    huzVar2 = z7aVarB.f;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var12, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                r4h1 r4h1Var = (r4h1) obj2;
                vr20 vr20Var13 = (vr20) this.c;
                Object obj13 = this.d;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = (mmr0) obj13;
                boolean zBooleanValue2 = ((Boolean) mmr0Var.a).booleanValue();
                boolean zBooleanValue3 = ((Boolean) mmr0Var.b).booleanValue();
                if (zBooleanValue2) {
                    x010Var = new x010(rqt0.u(new cly0(d3p1.F((d0r) ((ptf1) r4h1Var.e).b, mlj1.a, (String) r4h1Var.a), (byte) 19)), rqt0.u(new kr41(((roc0) ((koc0) r4h1Var.b)).d(), (byte) 17)), new fnf(zBooleanValue3, (lnm) null, (byte) 1), (byte) 1);
                } else {
                    x010Var = new huz(Boolean.FALSE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var13, x010Var, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                qu2 qu2Var = (qu2) obj2;
                vr20 vr20Var14 = (vr20) this.c;
                Object obj14 = this.d;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wt20 wt20VarF = z4p1.F(new vlj1(h5p1.s((kge) qu2Var.e, (evz) qu2Var.f, (ezc) qu2Var.g, fqj1.h), qu2Var, (byte) 2), 1);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var14, wt20VarF, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                vr20 vr20Var15 = (vr20) this.c;
                Object obj15 = this.d;
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
                mr20 mr20VarB = ((u961) obj2).B((PlayerState) obj15);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var15, mr20VarB, this) == d9nVar ? d9nVar : rih1Var;
            case 15:
                tuk1 tuk1Var = (tuk1) obj2;
                dvk1 dvk1Var = (dvk1) this.c;
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        ilh1 ilh1Var = tuk1Var.b;
                        String str3 = tuk1Var.a;
                        String str4 = dvk1Var.b;
                        this.c = null;
                        this.b = true;
                        objH = ilh1Var.h(str3, this);
                        if (objH == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z16) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objH = obj;
                    }
                    m231Var = (gwk1) objH;
                    break;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                if (!(m231Var instanceof m231)) {
                    bpb1 bpb1Var = tuk1Var.h;
                    gwk1 gwk1VarX = lm5.x(m231Var);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, gwk1VarX);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    return rih1Var;
                }
                Logger.e(thA, "Failed to load voting data", new Object[0]);
                return rih1Var;
            case 16:
                vr20 vr20Var16 = (vr20) this.c;
                Object obj16 = this.d;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rzl1 rzl1Var = (rzl1) obj16;
                huz huzVar8 = rzl1Var == null ? new huz(eot.a, (byte) 10) : new vlj1(((qzl1) obj2).a.b(rzl1Var.a.a), rzl1Var, b4);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var16, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vr20 vr20Var17 = (vr20) this.c;
                Object obj17 = this.d;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str5 = (String) obj17;
                yv8 huzVar9 = (str5 == null || ihc1.y0(str5)) ? new huz(Boolean.FALSE, (byte) 10) : new yv8(((y4m1) ((qpj1) obj2).b).b(str5), (byte) 9);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, huzVar9, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                vr20 vr20Var18 = (vr20) this.c;
                Object obj18 = this.d;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) obj18;
                if (list.isEmpty()) {
                    cly0Var = new huz(new h3c(null), (byte) 10);
                } else {
                    vbe1 vbe1Var = (vbe1) obj2;
                    cly0Var = new cly0(t2p1.u((d0r) vbe1Var.e, (o3r) vbe1Var.g, list), (byte) 23);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var18, cly0Var, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hw2 hw2Var = (hw2) obj2;
                vr20 vr20Var19 = (vr20) this.c;
                Object obj19 = this.d;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m8a m8aVar = ((d7m1) u890.k((k1r) obj19, (d0r) null, (n4r) null)).a;
                hi31 hi31Var = m8aVar.f;
                gj31 gj31Var = hi31Var != null ? hi31Var.b : null;
                wsk wskVar = s6m1.a;
                boolean z21 = Build.VERSION.SDK_INT >= 29 || x74.w0(21) != PorterDuff.Mode.SRC_OVER;
                if (z21) {
                    String str6 = hi31Var != null ? hi31Var.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    huzVar3 = hw2Var.j(str6);
                } else {
                    huzVar3 = new huz((Object) null, (byte) 10);
                }
                m441 m441Var3 = huzVar3;
                if (z21) {
                    String str7 = gj31Var != null ? gj31Var.b : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    huzVar4 = hw2Var.j(str7);
                } else {
                    huzVar4 = new huz((Object) null, (byte) 10);
                }
                m441 m441Var4 = huzVar4;
                m441 m441VarJ = hw2Var.j(m8aVar.d.a);
                m441 m441VarJ2 = hw2Var.j(m8aVar.e.a);
                hi31 hi31Var2 = m8aVar.g;
                String str8 = hi31Var2 != null ? hi31Var2.a : null;
                evz evzVarQ = h5p1.q(m441VarJ, m441VarJ2, hw2Var.j(str8 != null ? str8 : ""), m441Var3, m441Var4, new z6m1(m8aVar, z21, gj31Var, hw2Var, null));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var19, evzVarQ, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vr20 vr20Var20 = (vr20) this.c;
                Object obj20 = this.d;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!((Boolean) obj20).booleanValue()) {
                    m441Var2 = (jge) obj2;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var20, m441Var2, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                vr20 vr20Var21 = (vr20) this.c;
                Object obj21 = this.d;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    kom1 kom1Var = (kom1) obj21;
                    if (kom1Var instanceof gom1) {
                        m441Var = new huz(pom1.a, (byte) 10);
                    } else if (kom1Var instanceof fom1) {
                        m441Var = new m441(new l3g1((cm0) obj2, kom1Var, (lnm) null, (byte) 14));
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var21, m441Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z23) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                lym1 lym1Var = (lym1) obj2;
                vr20 vr20Var22 = (vr20) this.c;
                Object obj22 = this.d;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                iym1 iym1Var = (iym1) obj22;
                boolean z25 = iym1Var.a;
                boolean z26 = iym1Var.b;
                boolean z27 = iym1Var.c;
                boolean z28 = iym1Var.d;
                if (z26) {
                    huzVar5 = new huz((Object) null, (byte) 10);
                } else {
                    if (z25) {
                        huzVar6 = new huz(lym1.b(lym1Var, null, null, false, false, 55), (byte) 10);
                    } else if (z27) {
                        huzVar6 = new huz(lym1.b(lym1Var, null, null, false, false, 47), (byte) 10);
                    } else {
                        huzVar5 = z28 ? new huz((Object) null, (byte) 10) : new ht20(new lt20(new evz(new vlj1(yoi1.g(enr0.a((enr0) lym1Var.b.get(), (GetYourPremiumBadgeRequest) null, 1, (Object) null).toObservable()), lym1Var, b2), new o8n0(4, (lnm) null, (byte) 3), (byte) 11), new afb1(lym1Var, lnmVar, b3), (byte) 0), new h8m1(lym1Var, (lnm) null, (byte) 6));
                    }
                    huzVar5 = huzVar6;
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var22, huzVar5, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var23 = (vr20) this.c;
                Throwable th3 = (Throwable) this.d;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Logger.e(th3, "YourPlanSideDrawerListItemProvider failed to load after 3 attempts", new Object[0]);
                kh81 kh81VarB = lym1.b((lym1) obj2, null, null, false, false, 27);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var23.emit(kh81VarB, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afb1(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afb1(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
