package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.home.evopage.mobius.Event;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDataSourceErrorEvent;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t4o0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4o0(rit0 rit0Var, git0 git0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 14;
        this.d = rit0Var;
        this.e = git0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                t4o0 t4o0Var = new t4o0((lnm) obj3, obj4, (byte) 0);
                t4o0Var.c = (vr20) obj;
                t4o0Var.d = obj2;
                return t4o0Var.invokeSuspend(rih1Var);
            case 1:
                t4o0 t4o0Var2 = new t4o0((lnm) obj3, obj4, (byte) 1);
                t4o0Var2.c = (vr20) obj;
                t4o0Var2.d = obj2;
                return t4o0Var2.invokeSuspend(rih1Var);
            case 2:
                t4o0 t4o0Var3 = new t4o0((lnm) obj3, obj4, (byte) 2);
                t4o0Var3.c = (vr20) obj;
                t4o0Var3.d = obj2;
                return t4o0Var3.invokeSuspend(rih1Var);
            case 3:
                t4o0 t4o0Var4 = new t4o0((lnm) obj3, obj4, (byte) 3);
                t4o0Var4.c = (vr20) obj;
                t4o0Var4.d = obj2;
                return t4o0Var4.invokeSuspend(rih1Var);
            case 4:
                t4o0 t4o0Var5 = new t4o0((lnm) obj3, obj4, (byte) 4);
                t4o0Var5.c = (vr20) obj;
                t4o0Var5.d = obj2;
                return t4o0Var5.invokeSuspend(rih1Var);
            case 5:
                t4o0 t4o0Var6 = new t4o0((lnm) obj3, obj4, (byte) 5);
                t4o0Var6.c = (vr20) obj;
                t4o0Var6.d = obj2;
                return t4o0Var6.invokeSuspend(rih1Var);
            case 6:
                t4o0 t4o0Var7 = new t4o0((lnm) obj3, obj4, (byte) 6);
                t4o0Var7.c = (vr20) obj;
                t4o0Var7.d = obj2;
                return t4o0Var7.invokeSuspend(rih1Var);
            case 7:
                t4o0 t4o0Var8 = new t4o0((lnm) obj3, obj4, (byte) 7);
                t4o0Var8.c = (vr20) obj;
                t4o0Var8.d = (Object[]) obj2;
                return t4o0Var8.invokeSuspend(rih1Var);
            case 8:
                t4o0 t4o0Var9 = new t4o0((lnm) obj3, obj4, (byte) 8);
                t4o0Var9.c = (vr20) obj;
                t4o0Var9.d = obj2;
                return t4o0Var9.invokeSuspend(rih1Var);
            case 9:
                t4o0 t4o0Var10 = new t4o0((lnm) obj3, obj4, (byte) 9);
                t4o0Var10.c = (vr20) obj;
                t4o0Var10.d = obj2;
                return t4o0Var10.invokeSuspend(rih1Var);
            case 10:
                t4o0 t4o0Var11 = new t4o0(obj4, (lnm) obj3, (byte) 10);
                t4o0Var11.c = (vr20) obj;
                t4o0Var11.d = (Throwable) obj2;
                return t4o0Var11.invokeSuspend(rih1Var);
            case 11:
                t4o0 t4o0Var12 = new t4o0((lnm) obj3, obj4, (byte) 11);
                t4o0Var12.c = (vr20) obj;
                t4o0Var12.d = obj2;
                return t4o0Var12.invokeSuspend(rih1Var);
            case 12:
                t4o0 t4o0Var13 = new t4o0((lnm) obj3, obj4, (byte) 12);
                t4o0Var13.c = (vr20) obj;
                t4o0Var13.d = obj2;
                return t4o0Var13.invokeSuspend(rih1Var);
            case 13:
                t4o0 t4o0Var14 = new t4o0((lnm) obj3, obj4, (byte) 13);
                t4o0Var14.c = (vr20) obj;
                t4o0Var14.d = obj2;
                return t4o0Var14.invokeSuspend(rih1Var);
            case 14:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                t4o0 t4o0Var15 = new t4o0((rit0) this.d, (git0) obj4, (lnm) obj3);
                t4o0Var15.c = (p0d0) obj;
                t4o0Var15.b = zBooleanValue;
                return t4o0Var15.invokeSuspend(rih1Var);
            case 15:
                t4o0 t4o0Var16 = new t4o0((lnm) obj3, obj4, (byte) 15);
                t4o0Var16.c = (vr20) obj;
                t4o0Var16.d = obj2;
                return t4o0Var16.invokeSuspend(rih1Var);
            case 16:
                t4o0 t4o0Var17 = new t4o0((lnm) obj3, obj4, (byte) 16);
                t4o0Var17.c = (vr20) obj;
                t4o0Var17.d = obj2;
                return t4o0Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                t4o0 t4o0Var18 = new t4o0((lnm) obj3, obj4, (byte) 17);
                t4o0Var18.c = (vr20) obj;
                t4o0Var18.d = obj2;
                return t4o0Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                t4o0 t4o0Var19 = new t4o0((lnm) obj3, obj4, (byte) 18);
                t4o0Var19.c = (vr20) obj;
                t4o0Var19.d = obj2;
                return t4o0Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                t4o0 t4o0Var20 = new t4o0((lnm) obj3, obj4, (byte) 19);
                t4o0Var20.c = (vr20) obj;
                t4o0Var20.d = obj2;
                return t4o0Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                t4o0 t4o0Var21 = new t4o0((lnm) obj3, obj4, (byte) 20);
                t4o0Var21.c = (vr20) obj;
                t4o0Var21.d = obj2;
                return t4o0Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                t4o0 t4o0Var22 = new t4o0((lnm) obj3, obj4, (byte) 21);
                t4o0Var22.c = (vr20) obj;
                t4o0Var22.d = obj2;
                return t4o0Var22.invokeSuspend(rih1Var);
            case 22:
                t4o0 t4o0Var23 = new t4o0((lnm) obj3, obj4, (byte) 22);
                t4o0Var23.c = (vr20) obj;
                t4o0Var23.d = obj2;
                return t4o0Var23.invokeSuspend(rih1Var);
            case 23:
                t4o0 t4o0Var24 = new t4o0((lnm) obj3, obj4, (byte) 23);
                t4o0Var24.c = (vr20) obj;
                t4o0Var24.d = obj2;
                return t4o0Var24.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                t4o0 t4o0Var25 = new t4o0((lnm) obj3, obj4, (byte) 24);
                t4o0Var25.c = (vr20) obj;
                t4o0Var25.d = obj2;
                return t4o0Var25.invokeSuspend(rih1Var);
            case 25:
                t4o0 t4o0Var26 = new t4o0(obj4, (lnm) obj3, (byte) 25);
                t4o0Var26.c = (Intent) obj;
                t4o0Var26.d = (th61) obj2;
                return t4o0Var26.invokeSuspend(rih1Var);
            case 26:
                t4o0 t4o0Var27 = new t4o0((lnm) obj3, obj4, (byte) 26);
                t4o0Var27.c = (vr20) obj;
                t4o0Var27.d = obj2;
                return t4o0Var27.invokeSuspend(rih1Var);
            case 27:
                t4o0 t4o0Var28 = new t4o0((lnm) obj3, obj4, (byte) 27);
                t4o0Var28.c = (vr20) obj;
                t4o0Var28.d = obj2;
                return t4o0Var28.invokeSuspend(rih1Var);
            case 28:
                t4o0 t4o0Var29 = new t4o0((lnm) obj3, obj4, (byte) 28);
                t4o0Var29.c = (vr20) obj;
                t4o0Var29.d = obj2;
                return t4o0Var29.invokeSuspend(rih1Var);
            default:
                t4o0 t4o0Var30 = new t4o0((lnm) obj3, obj4, (byte) 29);
                t4o0Var30.c = (vr20) obj;
                t4o0Var30.d = obj2;
                return t4o0Var30.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz rgbVar;
        boolean z;
        huz huzVarE;
        huz qsc0Var;
        boolean z2;
        huz huzVar;
        boolean z3;
        m9r0 huzVar2;
        mr20 huzVar3;
        sr0 huzVar4;
        ben benVar;
        boolean z4;
        mr20 huzVar5;
        List listQ0;
        byte b = this.a;
        iax iaxVar = iax.a;
        z6x z6xVar = z6x.a;
        byte b2 = 22;
        mr20 sii0Var = r6x.a;
        byte b3 = 2;
        byte b4 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                Object obj3 = this.d;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    Boolean bool = (Boolean) obj3;
                    if (u890.j(bool, Boolean.TRUE)) {
                        rgbVar = new huz(h4o0.a, (byte) 10);
                    } else if (u890.j(bool, Boolean.FALSE)) {
                        v4o0 v4o0Var = (v4o0) obj2;
                        rgbVar = new rgb(new ht20(yoi1.g(v4o0Var.a.b()), new l4f0(v4o0Var, (lnm) null, (byte) 15)), (byte) 7);
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var, rgbVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                Object obj4 = this.d;
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
                ((Number) obj4).longValue();
                bpb1 bpb1Var = ((afo0) obj2).z1;
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, bpb1Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                rfo0 rfo0Var = (rfo0) obj2;
                vr20 vr20Var3 = (vr20) this.c;
                Object obj5 = this.d;
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
                if (((Boolean) obj5).booleanValue()) {
                    huzVarE = new huz(iaxVar, (byte) 10);
                    z = true;
                } else {
                    z = true;
                    huzVarE = jmo1.e(new mr20[]{rfo0Var.d.h(), new x3s(rfo0Var.a.a(n6n.a), (byte) 24)});
                }
                this.c = null;
                this.d = null;
                this.b = z;
                return l4p1.s(vr20Var3, huzVarE, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
                Object obj6 = this.d;
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
                huz huzVar6 = ((Boolean) obj6).booleanValue() ? new huz(new Integer(rfo0.h.a), (byte) 10) : ((tfo0) obj2).a.a(m6n.a);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, huzVar6, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = (vr20) this.c;
                Object obj7 = this.d;
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
                huz huzVar7 = ((Boolean) obj7).booleanValue() ? new huz(iaxVar, (byte) 10) : ((lag) ((wmy) obj2).c).h();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, huzVar7, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = (vr20) this.c;
                Object obj8 = this.d;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    i1r i1rVar = (k1r) obj8;
                    if ((i1rVar instanceof j1r) || (i1rVar instanceof h1r)) {
                        qsc0Var = new huz(z6xVar, (byte) 10);
                    } else if (i1rVar instanceof i1r) {
                        el9 el9Var = (el9) obj2;
                        List list = (List) i1rVar.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj9 : list) {
                            String str = ((som) obj9).d;
                            if (str != null && nhc1.Y(str, "spotify:user:", false)) {
                                arrayList.add(obj9);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            qsc0Var = new huz(z6xVar, (byte) 10);
                        } else {
                            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                String str2 = ((som) it.next()).d;
                                str2.getClass();
                                arrayList2.add(str2);
                            }
                            List<String> listJ0 = o7h.j0(arrayList2);
                            ArrayList arrayList3 = new ArrayList(q7h.U(listJ0, 10));
                            for (String str3 : listJ0) {
                                arrayList3.add(hu20.e(d3p1.F(el9Var.b, (o3r) el9Var.t, str3), new gio0((lnm) null, str3, (byte) 0)));
                            }
                            qsc0Var = new qsc0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), arrayList, el9Var, (byte) 13);
                        }
                    } else {
                        eg.o();
                    }
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    return l4p1.s(vr20Var6, qsc0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                nsp0 nsp0Var = (nsp0) obj2;
                vr20 vr20Var7 = (vr20) this.c;
                Object obj10 = this.d;
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
                if (((Boolean) obj10).booleanValue()) {
                    z2 = true;
                    sii0Var = new sii0(new mr20[]{new sii0(new ht20(yoi1.g(((xo60) nsp0Var.b.get()).a()), new s55(2, (lnm) null, (byte) 17)), nsp0Var, (byte) 20), new sii0(yoi1.g(ivp0.b((ivp0) nsp0Var.a.get())), nsp0Var, (byte) 21)}, nsp0Var, b2);
                } else {
                    z2 = true;
                }
                this.c = null;
                this.d = null;
                this.b = z2;
                return l4p1.s(vr20Var7, sii0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                vr20 vr20Var8 = (vr20) this.c;
                Object[] objArr = (Object[]) this.d;
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
                ArrayList arrayListV = q7h.V(f46.Q0((List[]) objArr));
                Event.GotOfflineItems gotOfflineItems = !arrayListV.isEmpty() ? new Event.GotOfflineItems(arrayListV) : new Event.GotOfflineItems(Collections.singletonList(new osp0(new jrp0(), b7x.a)));
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var8.emit(gotOfflineItems, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                vr20 vr20Var9 = (vr20) this.c;
                Object obj11 = this.d;
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
                rnd0 rnd0Var = (rnd0) obj11;
                n0o n0oVar = (n0o) obj2;
                EventCardInfoResponse eventCardInfoResponse = rnd0Var.a.a;
                if (eventCardInfoResponse.p() != 1) {
                    huzVar = new huz((Object) null, (byte) 10);
                } else {
                    String strP = eventCardInfoResponse.t().p();
                    strP.getClass();
                    huzVar = strP.length() == 0 ? new huz((Object) null, (byte) 10) : yoi1.g(((sd41) n0oVar.f).c(strP));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var9);
                Object objCollect = huzVar.collect(new s4q0(vr20Var9, rnd0Var, (byte) 1), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 9:
                vr20 vr20Var10 = (vr20) this.c;
                Object obj12 = this.d;
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
                String str4 = (String) obj12;
                huz huzVar8 = str4 == null ? new huz(z6xVar, (byte) 10) : ((oos) ((ynb0) ((ahi0) obj2).U0).get()).a(new fd0(str4));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var10, huzVar8, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                vr20 vr20Var11 = (vr20) this.c;
                Throwable th = (Throwable) this.d;
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
                String strJ = i3a.j("Recents page request failed: ", th);
                Logger.d(strJ, new Object[0]);
                t2j0 t2j0Var = (t2j0) ((zhq0) obj2).b;
                jr01 jr01VarN = RecentsDataSourceErrorEvent.n();
                jr01VarN.n(strJ);
                jr01VarN.q("spotify:list:recents:page");
                t2j0Var.a(jr01VarN.build());
                ts01 ts01Var = new ts01(th);
                this.c = null;
                this.d = null;
                this.b = true;
                return vr20Var11.emit(ts01Var, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                vr20 vr20Var12 = (vr20) this.c;
                Object obj13 = this.d;
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
                lt20 lt20Var = new lt20(new m441(new ian0((czr0) obj2, (lnm) null, (byte) 9)), new i440(3, (lnm) null, (byte) 29), (byte) 0);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var12, lt20Var, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                vr20 vr20Var13 = (vr20) this.c;
                Object obj14 = this.d;
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
                bma1 bma1Var = g3t0.d;
                ima1 ima1Var = (dma1) obj14;
                g3t0 g3t0Var = (g3t0) obj2;
                m441 m441VarU = i6p1.u(new qsc0(ima1Var.r(bma1Var), g3t0Var, ima1Var, (byte) 21), g3t0Var.b(ima1Var.e(bma1Var, (String) null)));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var13, m441VarU, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                sjq0 sjq0Var = (sjq0) obj2;
                vr20 vr20Var14 = (vr20) this.c;
                Object obj15 = this.d;
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
                List<v4t0> list2 = (List) obj15;
                ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                for (v4t0 v4t0Var : list2) {
                    Object obj16 = ((LinkedHashMap) sjq0Var.b).get(v4t0Var.getClass());
                    obj16.getClass();
                    f4r data = ((syq) obj16).getData();
                    d0r d0rVar = (d0r) sjq0Var.c;
                    if (d0rVar == null) {
                        u890.C("dataPool");
                        throw null;
                    }
                    arrayList4.add(d3p1.G(d0rVar, data, v4t0Var));
                }
                z4t0 z4t0Var = !arrayList4.isEmpty() ? new z4t0((mr20[]) o7h.l1(arrayList4).toArray(new mr20[0]), (byte) 0) : new huz(new x8b0(0, 0, 0), (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var14, z4t0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                p0d0 p0d0Var = (p0d0) this.c;
                boolean z19 = this.b;
                hm5.M(obj);
                git0 git0Var = (git0) obj2;
                if (rit0.g(p0d0Var, git0Var) && z19) {
                    return kit0.a;
                }
                return (!rit0.g(p0d0Var, git0Var) || z19) ? kit0.c : kit0.b;
            case 15:
                vr20 vr20Var15 = (vr20) this.c;
                Object obj17 = this.d;
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
                Flowable flowable = ((gst0) obj2).a.a;
                vbm[] vbmVarArr = q601.a;
                jge jgeVarC = hu20.c(new kge(flowable), new zs40((Set) obj17, (lnm) null, (byte) 1));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var15, jgeVarC, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                vr20 vr20Var16 = (vr20) this.c;
                Object obj18 = this.d;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r5h r5hVar = ((ktt0) obj2).a;
                e3h e3hVarP = CollectionDecorateRequest.p();
                k3h k3hVarO = CollectionEpisodeDecorationPolicy.o();
                k3hVarO.s(EpisodePlayedStateDecorationPolicy.newBuilder().setPlayabilityRestriction(true));
                e3hVarP.t(k3hVarO);
                e3hVarP.q((String) obj18);
                ezc ezcVarG = yoi1.g(r5hVar.e(e3hVarP.build()));
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var16);
                Object objCollect2 = ezcVarG.collect(new r4t0(vr20Var16, (byte) 6), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vr20 vr20Var17 = (vr20) this.c;
                Object obj19 = this.d;
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
                jge jgeVarB = ((stt0) obj2).b.b((Set) obj19);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var17, jgeVarB, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                vr20 vr20Var18 = (vr20) this.c;
                Object obj20 = this.d;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG2 = ((Boolean) obj20).booleanValue() ? yoi1.g(((buc) ((lut0) obj2).a.get()).a(new auc((Integer) null))) : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var18, ezcVarG2, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                vr20 vr20Var19 = (vr20) this.c;
                Object obj21 = this.d;
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
                String str5 = (String) obj21;
                if (str5.length() != 0) {
                    y1u0 y1u0Var = (y1u0) obj2;
                    sii0Var = new qsc0(y1u0Var.c, y1u0Var, str5, (byte) 23);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var19, sii0Var, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vr20 vr20Var20 = (vr20) this.c;
                Object obj22 = this.d;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (((Boolean) obj22).booleanValue()) {
                    adu0 adu0Var = (adu0) obj2;
                    z3 = true;
                    sii0Var = z4p1.v(rqt0.t(adu0Var.g, new xgr0(adu0Var, (byte) 9)), 1);
                } else {
                    z3 = true;
                }
                this.c = null;
                this.d = null;
                this.b = z3;
                return l4p1.s(vr20Var20, sii0Var, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                vr20 vr20Var21 = (vr20) this.c;
                Object obj23 = this.d;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                PlayerState playerState = (PlayerState) obj23;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                iko ikoVar = iko.c;
                if (contextTrack != null) {
                    om40 om40Var = (om40) obj2;
                    if (om40Var.b.h()) {
                        String strJ2 = l4o1.j(contextTrack);
                        if (!l4o1.G(contextTrack) || strJ2 == null) {
                            strJ2 = contextTrack.uri();
                            strJ2.getClass();
                        }
                        huzVar3 = rqt0.u(new ipr(new xs4(yoi1.g(g7h.d(om40Var.a, "", new String[]{strJ2})), strJ2, (byte) 8), om40Var, contextTrack, (byte) 19));
                    } else {
                        huzVar3 = new huz(ikoVar, (byte) 10);
                    }
                    huzVar2 = new m9r0(huzVar3, playerState, (byte) 15);
                } else {
                    huzVar2 = new huz(new mmr0(playerState, ikoVar), (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var21, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                vr20 vr20Var22 = (vr20) this.c;
                Object obj24 = this.d;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                i1r i1rVar2 = (k1r) obj24;
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                qxc0 qxc0Var = (qxc0) (i1rVar3 != null ? i1rVar3.a : null);
                String str6 = qxc0Var != null ? qxc0Var.a : null;
                String str7 = (qxc0Var == null || (benVar = qxc0Var.b) == null) ? null : benVar.a;
                pxc0 pxc0Var = qxc0Var != null ? qxc0Var.c : null;
                String str8 = pxc0Var != null ? pxc0Var.b : null;
                String str9 = pxc0Var != null ? pxc0Var.a : null;
                if (str9 == null || str9.length() == 0) {
                    huzVar4 = new huz(new sv21(str6, str7, null, str8), (byte) 10);
                } else {
                    onu0 onu0Var = (onu0) obj2;
                    huzVar4 = new sr0(d3p1.F(onu0Var.b, onu0Var.e, str9), str6, str7, str8, (byte) 18);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var22, huzVar4, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                zgv0 zgv0Var = (zgv0) obj2;
                vr20 vr20Var23 = (vr20) this.c;
                Object obj25 = this.d;
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
                jge jgeVarC2 = hu20.c(new o6d0(zgv0Var.b.a(), b3), new k1e0((Object) zgv0Var, obj25, lnmVar, (byte) 29));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var23, jgeVarC2, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                vr20 vr20Var24 = (vr20) this.c;
                Object obj26 = this.d;
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
                if (((Boolean) obj26).booleanValue()) {
                    sii0Var = rqt0.u(new j5b0(((roc0) ((koc0) ((fjk0) obj2).b)).d(), (byte) 17));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var24, sii0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                Intent intent = (Intent) this.c;
                th61 th61Var = (th61) this.d;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set = s4b1.f;
                v5b1 v5b1Var = uic.x(intent.getDataString()).d;
                aji1 aji1Var = v5b1Var instanceof aji1 ? (aji1) v5b1Var : null;
                if (aji1Var == null) {
                    return crn0.a;
                }
                String str10 = aji1Var.a;
                String str11 = aji1Var.b;
                s4b1 s4b1VarX = uic.x(intent.getDataString());
                this.c = null;
                this.d = null;
                this.b = true;
                Object objD = ((ru9) obj2).d(intent, th61Var, str10, str11, s4b1VarX, this);
                return objD == d9nVar ? d9nVar : objD;
            case 26:
                vr20 vr20Var25 = (vr20) this.c;
                Object obj27 = this.d;
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qzy0 qzy0Var = (qzy0) obj27;
                f5y0 f5y0Var = qzy0Var == qzy0.d ? new f5y0((mr20) ((a0z0) obj2).f.getValue(), qzy0Var, (byte) 7) : new huz(qzy0Var, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var25, f5y0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                vr20 vr20Var26 = (vr20) this.c;
                Object obj28 = this.d;
                boolean z32 = this.b;
                if (z32) {
                    if (z32) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = (mmr0) obj28;
                String str12 = (String) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                if (str12.length() == 0) {
                    z4 = true;
                } else {
                    y1u0 y1u0Var2 = (y1u0) obj2;
                    kge kgeVar = y1u0Var2.c;
                    if (zBooleanValue) {
                        z4 = true;
                        sii0Var = new c0l(new ht20(rqt0.u(new maz0(kgeVar, y1u0Var2, str12, 1 == true ? 1 : 0)), new nw5(2, (lnm) null, (byte) 22), (byte) 2), (byte) 1);
                    } else {
                        z4 = true;
                        sii0Var = new y080(z4p1.F(new maz0(kgeVar, y1u0Var2, str12, b4), 1), 1 == true ? 1 : 0);
                    }
                }
                this.c = null;
                this.d = null;
                this.b = z4;
                return l4p1.s(vr20Var26, sii0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 28:
                dez0 dez0Var = (dez0) obj2;
                vr20 vr20Var27 = (vr20) this.c;
                Object obj29 = this.d;
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
                String str13 = (String) obj29;
                oez0 oez0Var = dez0Var.a;
                idd1 idd1Var = oez0Var.d;
                ima1 ima1Var2 = oez0Var.a;
                boolean z34 = oez0Var.c;
                if (z34) {
                    bma1 bma1Var2 = oez0.e;
                    f5y0 f5y0Var2 = new f5y0(ima1Var2.r(bma1Var2), oez0Var, (byte) 8);
                    if (z34) {
                        String strE = ima1Var2.e(bma1Var2, (String) null);
                        listQ0 = strE != null ? ihc1.Q0(strE, new String[]{"\n"}, 0, 6) : null;
                        if (listQ0 == null) {
                            listQ0 = (List) idd1Var.getValue();
                        }
                    } else {
                        listQ0 = (List) idd1Var.getValue();
                    }
                    huzVar5 = rqt0.u(i6p1.u(f5y0Var2, listQ0));
                } else {
                    huzVar5 = new huz((List) idd1Var.getValue(), (byte) 10);
                }
                byte b5 = 26;
                jge jgeVarC3 = hu20.c(huzVar5, new pew0(dez0Var, lnmVar, b5));
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var27);
                Object objCollect3 = jgeVarC3.collect(new buc0(vr20Var27, str13, b5), this);
                if (objCollect3 != d9nVar) {
                    objCollect3 = rih1Var;
                }
                if (objCollect3 != d9nVar) {
                    objCollect3 = rih1Var;
                }
                return objCollect3 == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var28 = (vr20) this.c;
                Object obj30 = this.d;
                boolean z35 = this.b;
                if (z35) {
                    if (z35) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k1r k1rVar = (k1r) obj30;
                k1rVar.getClass();
                huz huzVar9 = ((k1rVar instanceof i1r) || (k1rVar instanceof j1r)) ? new huz(k1rVar, (byte) 10) : new huz((k1r) obj2, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var28, huzVar9, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4o0(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4o0(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
