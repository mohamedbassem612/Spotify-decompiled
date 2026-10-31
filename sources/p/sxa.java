package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$ListState;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$State;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$UserState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sxa extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxa(jge jgeVar, vr20 vr20Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.d = jgeVar;
        this.e = vr20Var;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                sxa sxaVar = new sxa(obj3, obj2, lnmVar, (byte) 0);
                sxaVar.c = obj;
                return sxaVar;
            case 1:
                sxa sxaVar2 = new sxa((mr20) obj3, lnmVar, obj2, (byte) 1);
                sxaVar2.c = obj;
                return sxaVar2;
            case 2:
                return new sxa((t3b) this.c, (String) obj3, (gzx0) obj2, lnmVar, (byte) 2);
            case 3:
                return new sxa((g4b) this.c, (String) obj3, (bbc) obj2, lnmVar, (byte) 3);
            case 4:
                return new sxa((y7e1) this.c, (iu30) obj3, (at80) obj2, lnmVar, (byte) 4);
            case 5:
                sxa sxaVar3 = new sxa((cab) obj3, (String) obj2, this.b, lnmVar);
                sxaVar3.c = obj;
                return sxaVar3;
            case 6:
                return new sxa((p2c) this.c, (o0i) obj3, (l2c) obj2, lnmVar, (byte) 6);
            case 7:
                return new sxa((m5c) this.c, (ndo0) obj3, (og) obj2, lnmVar, (byte) 7);
            case 8:
                return new sxa((cab) this.c, (Context) obj3, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new sxa((rec) this.c, (String) obj3, (tv80) obj2, lnmVar, (byte) 9);
            case 10:
                return new sxa((bpb1) this.c, (hec) obj3, (EncoreButton) obj2, lnmVar, (byte) 10);
            case 11:
                return new sxa((k9) this.c, (ArrayList) obj3, (ksc) obj2, lnmVar, (byte) 11);
            case 12:
                return new sxa((tym0) this.c, (x5d) obj3, (ven0) obj2, lnmVar, (byte) 12);
            case 13:
                return new sxa((pcd) this.c, (ayh) obj3, (faa0) obj2, lnmVar, (byte) 13);
            case 14:
                return new sxa((jkr0) this.c, (iu30) obj3, (hdn0) obj2, lnmVar, (byte) 14);
            case 15:
                sxa sxaVar4 = new sxa((mr20) obj3, lnmVar, obj2, (byte) 15);
                sxaVar4.c = obj;
                return sxaVar4;
            case 16:
                sxa sxaVar5 = new sxa((mr20) obj3, lnmVar, obj2, (byte) 16);
                sxaVar5.c = obj;
                return sxaVar5;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                sxa sxaVar6 = new sxa((mr20) obj3, lnmVar, obj2, (byte) 17);
                sxaVar6.c = obj;
                return sxaVar6;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new sxa((cab) this.c, (String) obj3, (r6h1) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new sxa((mr20) this.c, (d561) obj3, (k261) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new sxa((jge) obj3, (vr20) obj2, this.c, lnmVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                sxa sxaVar7 = new sxa(obj3, obj2, lnmVar, (byte) 21);
                sxaVar7.c = obj;
                return sxaVar7;
            case 22:
                sxa sxaVar8 = new sxa(obj3, obj2, lnmVar, (byte) 22);
                sxaVar8.c = obj;
                return sxaVar8;
            case 23:
                sxa sxaVar9 = new sxa(obj3, obj2, lnmVar, (byte) 23);
                sxaVar9.c = obj;
                return sxaVar9;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new sxa((xtb0) this.c, (Function0) obj3, (ven0) obj2, lnmVar, (byte) 24);
            case 25:
                sxa sxaVar10 = new sxa(obj3, obj2, lnmVar, (byte) 25);
                sxaVar10.c = obj;
                return sxaVar10;
            case 26:
                return new sxa((ru9) this.c, (Intent) obj3, (th61) obj2, lnmVar, (byte) 26);
            case 27:
                return new sxa((cwe) this.c, (gob) obj3, (nwe) obj2, lnmVar, (byte) 27);
            case 28:
                return new sxa((qbf) this.c, (qto0) obj3, (String) obj2, lnmVar, (byte) 28);
            default:
                return new sxa((hvp0) this.c, (String) obj3, (qto0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((BottomActionsVisibilityProto$State) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((npe) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0708  */
    public final Object invokeSuspend(Object obj) {
        Object objR;
        m231 m231Var;
        Object objY;
        Object objI;
        String dataString;
        Object objF;
        byte b = this.a;
        m231 ogeVar = rih1.a;
        m231 m231Var2 = d9n.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                zsc zscVar = (zsc) obj3;
                c9n c9nVar = (c9n) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList<mmr0> arrayList = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    if (!((rol1) zscVar.c).a.containsKey(txa.a((String) ((mmr0) obj4).a))) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (mmr0 mmr0Var : arrayList) {
                    arrayList2.add(fn31.q(c9nVar, (o8n) null, 0, new rxa((String) mmr0Var.a, (String) mmr0Var.b, zscVar, (lnm) null), 3));
                }
                this.c = null;
                this.b = true;
                Object objU = o1p1.u(arrayList2, this);
                return objU == m231Var2 ? m231Var2 : objU;
            case 1:
                vr20 vr20Var = (vr20) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f64 f64Var = new f64(vr20Var, (xya) obj3, (byte) 23);
                this.c = null;
                this.b = true;
                return ((mr20) obj2).collect(f64Var, this) == m231Var2 ? m231Var2 : ogeVar;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t3b t3bVar = (t3b) this.c;
                l24 l24Var = new l24((Object) t3bVar, obj2, obj3, (lnm) null, (byte) 3);
                this.b = true;
                return t3bVar.f(l24Var, this) == m231Var2 ? m231Var2 : ogeVar;
            case 3:
                g4b g4bVar = (g4b) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarA = g4bVar.d.a("hm://social-prompting/v1/session-update", new qka(1, g4bVar, g4b.class, "convertPusherMessage", "convertPusherMessage(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/socialprompting/v1/SocialPromptingPusherMessage;", 0, (byte) 6));
                x3b x3bVar = new x3b((bbc) obj3, (byte) 0);
                this.b = true;
                Object objCollect = jgeVarA.collect(new st(new bt9(x3bVar, (byte) 22), (String) obj2, (byte) 15), this);
                if (objCollect != m231Var2) {
                    objCollect = ogeVar;
                }
                if (objCollect != m231Var2) {
                    objCollect = ogeVar;
                }
                return objCollect == m231Var2 ? m231Var2 : ogeVar;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV = z4p1.v(rwq.q(new tr1((y7e1) this.c, (byte) 8)), 1);
                f64 f64Var2 = new f64((iu30) obj2, (at80) obj3, (byte) 27);
                this.b = true;
                return qt20VarV.collect(f64Var2, this) == m231Var2 ? m231Var2 : ogeVar;
            case 5:
                BottomActionsVisibilityProto$State bottomActionsVisibilityProto$State = (BottomActionsVisibilityProto$State) this.c;
                hm5.M(obj);
                Map mapO = bottomActionsVisibilityProto$State.o();
                cab cabVar = (cab) obj2;
                String str = (String) cabVar.c;
                BottomActionsVisibilityProto$UserState bottomActionsVisibilityProto$UserState = (BottomActionsVisibilityProto$UserState) mapO.getOrDefault(str, BottomActionsVisibilityProto$UserState.n());
                Map mapO2 = bottomActionsVisibilityProto$UserState.o();
                String str2 = (String) cabVar.b;
                BottomActionsVisibilityProto$ListState bottomActionsVisibilityProto$ListState = (BottomActionsVisibilityProto$ListState) mapO2.getOrDefault(str2, BottomActionsVisibilityProto$ListState.o());
                tsb tsbVar = (tsb) bottomActionsVisibilityProto$State.toBuilder();
                vsb vsbVar = (vsb) bottomActionsVisibilityProto$UserState.toBuilder();
                rsb rsbVar = (rsb) bottomActionsVisibilityProto$ListState.toBuilder();
                rsbVar.n((String) obj3, this.b);
                vsbVar.n(str2, (BottomActionsVisibilityProto$ListState) rsbVar.build());
                tsbVar.n(str, (BottomActionsVisibilityProto$UserState) vsbVar.build());
                return tsbVar.build();
            case 6:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                l2c l2cVar = (l2c) obj3;
                k2c k2cVar = (k2c) l2cVar.f;
                String str3 = k2cVar.f;
                String str4 = k2cVar.e;
                boolean z7 = l2cVar.h;
                boolean z8 = k2cVar.g;
                String str5 = l2cVar.X;
                this.b = true;
                return ((p2c) this.c).d((o0i) obj2, str3, str4, z7, z8, str5, this) == m231Var2 ? m231Var2 : ogeVar;
            case 7:
                m5c m5cVar = (m5c) this.c;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xtl xtlVar = m5cVar.O0;
                l5c l5cVar = new l5c(m5cVar, (ndo0) obj2, (og) obj3);
                this.b = true;
                xtlVar.getClass();
                n511 n511Var = (n511) l5cVar.invoke();
                if (n511Var == null || xtl.J1(xtlVar, n511Var, 0L, 0L, 3)) {
                    objR = ogeVar;
                } else {
                    ohd ohdVar = new ohd(1, aym.t(this));
                    ohdVar.t();
                    wtl wtlVar = new wtl(l5cVar, ohdVar);
                    ps7 ps7Var = xtlVar.T0;
                    bfn0 bfn0Var = (bfn0) ps7Var.b;
                    n511 n511Var2 = (n511) l5cVar.invoke();
                    if (n511Var2 == null) {
                        ohdVar.resumeWith(ogeVar);
                    } else {
                        ohdVar.n(new b6(ps7Var, wtlVar, (byte) 14));
                        tr80 tr80VarQ = yoi1.Q(0, bfn0Var.c);
                        int i = ((rr80) tr80VarQ).a;
                        int i2 = ((rr80) tr80VarQ).b;
                        if (i <= i2) {
                            while (true) {
                                n511 n511Var3 = (n511) ((wtl) bfn0Var.a[i2]).a.invoke();
                                if (n511Var3 != null) {
                                    n511 n511VarJ = n511Var2.j(n511Var3);
                                    if (n511VarJ.equals(n511Var2)) {
                                        bfn0Var.a(i2 + 1, wtlVar);
                                    } else if (!n511VarJ.equals(n511Var3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i3 = bfn0Var.c - 1;
                                        if (i3 <= i2) {
                                            while (true) {
                                                ((wtl) bfn0Var.a[i2]).b.q(cancellationException);
                                                if (i3 != i2) {
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i2 != i) {
                                    i2--;
                                } else {
                                    bfn0Var.a(0, wtlVar);
                                }
                            }
                        } else {
                            bfn0Var.a(0, wtlVar);
                        }
                        if (!xtlVar.W0) {
                            xtlVar.K1(0L);
                        }
                    }
                    objR = ohdVar.r();
                    if (objR != m231Var2) {
                        objR = ogeVar;
                    }
                }
                return objR == m231Var2 ? m231Var2 : ogeVar;
            case 8:
                String str6 = (String) obj3;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vkc0 vkc0Var = new vkc0((String) obj3, (String) null, (Map) null, (dqi1) null, (o371) null, 30);
                String str7 = f0o1.m(str6).d;
                String str8 = f0o1.o(str6).a;
                this.b = true;
                return ((r35) ((cab) this.c).d).a((Context) obj2, vkc0Var, str7, str8, "browse", (String) null, this) == m231Var2 ? m231Var2 : ogeVar;
            case 9:
                boolean z11 = this.b;
                try {
                    if (!z11) {
                        hm5.M(obj);
                        hce1 hce1Var = ((rec) this.c).i;
                        String str9 = (String) obj2;
                        str9.getClass();
                        this.b = true;
                        Object objY2 = fn31.Y((q8n) hce1Var.e, new kv1(hce1Var, str9, true, (tv80) obj3, (lnm) null, (byte) 19), this);
                        if (objY2 != m231Var2) {
                            objY2 = ogeVar;
                        }
                        if (objY2 != m231Var2) {
                            objY2 = ogeVar;
                        }
                        if (objY2 == m231Var2) {
                            ogeVar = m231Var2;
                        }
                    } else {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return ogeVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    return ogeVar;
                }
            case 10:
                hec hecVar = (hec) obj2;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = (bpb1) this.c;
                mr20 mr20Var2 = hecVar.c;
                ce2 ce2Var = new ce2(3, (lnm) null, (byte) 8);
                hb1 hb1Var = new hb1((EncoreButton) obj3, hecVar, (lnm) null, (byte) 29);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, new eu20(kfo0.a, hb1Var, (byte) 1), new ekv(ce2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                if (objS != m231Var2) {
                    objS = ogeVar;
                }
                if (objS != m231Var2) {
                    objS = ogeVar;
                }
                if (objS != m231Var2) {
                    objS = ogeVar;
                }
                return objS == m231Var2 ? m231Var2 : ogeVar;
            case 11:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k9 k9Var = (k9) this.c;
                q8n q8nVar = (q8n) k9Var.b;
                nsc nscVar = new nsc((ArrayList) obj2, k9Var, (ksc) obj3, (lnm) null);
                this.b = true;
                Object objY3 = fn31.Y(q8nVar, nscVar, this);
                return objY3 == m231Var2 ? m231Var2 : objY3;
            case 12:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441Var = new m441(new p5o((byte) 2, (tym0) this.c, ((x5d) obj2).g, (lnm) null));
                mp0 mp0Var = new mp0((ven0) obj3, (byte) 3);
                this.b = true;
                return m441Var.collect(mp0Var, this) == m231Var2 ? m231Var2 : ogeVar;
            case 13:
                ayh ayhVar = (ayh) obj2;
                boolean z15 = this.b;
                if (!z15) {
                    p811 p811VarU = cy30.u(obj);
                    pcd pcdVar = (pcd) this.c;
                    mr20 mr20Var3 = pcdVar.c;
                    h50 h50Var = new h50(ayhVar, p811VarU, pcdVar, (faa0) obj3);
                    this.b = true;
                    if (mr20Var3.collect(h50Var, this) == m231Var2) {
                        return m231Var2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (ayhVar.v()) {
                    return ogeVar;
                }
                ayhVar.m0(new th61((String) null, false, (yg8) null, (String) null, false, false, (zcs0) null, (String) null, (km) null, 4095));
                return ogeVar;
            case 14:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(rwq.q(new of((jkr0) this.c, (byte) 5)));
                g4c g4cVar = new g4c((iu30) obj2, (hdn0) obj3, (byte) 7);
                this.b = true;
                return mr20VarU.collect(g4cVar, this) == m231Var2 ? m231Var2 : ogeVar;
            case 15:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                g4c g4cVar2 = new g4c(vr20Var2, (nty) obj3, (byte) 8);
                this.c = null;
                this.b = true;
                return ((fu20) obj2).collect(g4cVar2, this) == m231Var2 ? m231Var2 : ogeVar;
            case 16:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fdd fddVar = new fdd(vr20Var3, (hxn) obj3, (byte) 4);
                this.c = null;
                this.b = true;
                return ((m441) obj2).collect(fddVar, this) == m231Var2 ? m231Var2 : ogeVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                g4c g4cVar3 = new g4c(vr20Var4, (i4e) obj3, (byte) 9);
                this.c = null;
                this.b = true;
                return ((fu20) obj2).collect(g4cVar3, this) == m231Var2 ? m231Var2 : ogeVar;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cab cabVar2 = (cab) this.c;
                r6h1 r6h1Var = (r6h1) obj3;
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                xae xaeVar = (xae) cabVar2.c;
                db dbVar = new db((Object) cabVar2, obj2, (Object) r6h1Var, (Object) ohdVar2, (byte) 26);
                efr efrVar = xaeVar.b;
                Activity activity = xaeVar.a;
                String string = activity.getString(2131955108);
                String string2 = activity.getString(2131955102);
                String string3 = activity.getString(2131955107);
                String string4 = activity.getString(2131955106);
                boolean zA = ((zb4) xaeVar.c.b).a();
                yae yaeVar = yae.b;
                if (zA) {
                    if (efrVar.c()) {
                        uae uaeVar = new uae(dbVar, (byte) 0);
                        z50 z50Var = z50.c;
                        oqo1.t((Activity) efrVar.b, new fhx(string, string2, new ygx(string3, new gbx(z50Var, uaeVar)), new ygx(string4, new gbx(z50Var, new uae(dbVar, (byte) 1))), new uae(dbVar, (byte) 2), (v3v0) null, 80));
                    } else {
                        dbVar.invoke(yaeVar);
                    }
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    dbVar.invoke(yaeVar);
                } else {
                    mw40 mw40VarT = yoi1.T(activity, string, string2);
                    mw40VarT.e = true;
                    mw40VarT.f = new vae(dbVar, (byte) 0);
                    wae waeVar = new wae(dbVar, (byte) 0);
                    mw40VarT.a = string3;
                    mw40VarT.c = waeVar;
                    wae waeVar2 = new wae(dbVar, (byte) 1);
                    mw40VarT.b = string4;
                    mw40VarT.d = waeVar2;
                    mw40VarT.b().b();
                }
                wqk0 wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 20) : null;
                if (wqk0Var != null) {
                    wqk0Var.e();
                }
                Object objR2 = ohdVar2.r();
                return objR2 == m231Var2 ? m231Var2 : objR2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                k261 k261Var = (k261) obj3;
                boolean z21 = this.b;
                try {
                    if (!z21) {
                        hm5.M(obj);
                        this.b = true;
                        if (((mr20) this.c).collect((d561) obj2, this) == m231Var2) {
                            return m231Var2;
                        }
                    } else {
                        if (!z21) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    k261Var.e();
                    return ogeVar;
                } catch (Throwable th) {
                    k261Var.e();
                    throw th;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    Object obj5 = this.c;
                    this.b = true;
                    return ((jge) obj2).e.invoke((vr20) obj3, obj5, this) == m231Var2 ? m231Var2 : ogeVar;
                }
                if (z22) {
                    hm5.M(obj);
                    return ogeVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                boolean z23 = this.b;
                try {
                    if (!z23) {
                        hm5.M(obj);
                        r261 r261Var = (r261) obj2;
                        this.c = null;
                        this.b = true;
                        if (r261Var.b(obj3, this) == m231Var2) {
                            return m231Var2;
                        }
                    } else {
                        if (!z23) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = ogeVar;
                    break;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                if (m231Var instanceof m231) {
                    ogeVar = new oge(e331.a(m231Var));
                }
                return new qge(ogeVar);
            case 22:
                List list = (List) this.c;
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qix0 qix0Var = ((eme) obj2).p;
                en6 en6Var = new en6((d0r) obj3, (byte) 2);
                lnm lnmVar = null;
                this.c = null;
                this.b = true;
                if (list.isEmpty() || (objY = fn31.Y(qix0Var.c, new sew0(list, qix0Var, en6Var, lnmVar, (byte) 1), this)) != m231Var2) {
                    objY = ogeVar;
                }
                return objY == m231Var2 ? m231Var2 : ogeVar;
            case 23:
                joe joeVar = (joe) obj2;
                c9n c9nVar2 = (c9n) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                s2t s2tVarQ = fn31.q(c9nVar2, (o8n) null, 4, new vk6(joeVar, (lnm) null, (byte) 29), 1);
                a1r0.j(joeVar.a, "spotify:internal:ai-disclosure", (String) obj3, mno1.h(new mmr0[]{new mmr0("ai_disclosure_sheet_params", new r03("chat_ai"))}), false, 8);
                this.c = null;
                this.b = true;
                Object objQ = s2tVarQ.Q(this);
                return objQ == m231Var2 ? m231Var2 : objQ;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return ogeVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((xtb0) this.c).g.a;
                g4c g4cVar4 = new g4c((Function0) obj2, (ven0) obj3, (byte) 11);
                this.b = true;
                dt71Var.collect(g4cVar4, this);
                return m231Var2;
            case 25:
                npe npeVar = (npe) this.c;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    Float f = new Float(0.0f);
                    pxg1 pxg1VarO0 = irn1.o0(375, 0, (dlv) null, 6);
                    this.c = npeVar;
                    this.b = true;
                    if (o95.b((o95) obj2, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == m231Var2) {
                        return m231Var2;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj3).invoke(npeVar);
                return ogeVar;
            case 26:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = ((kbd) ((kly0) ((ru9) this.c).c).get()).b();
                this.b = true;
                objI = b5p1.i(mr20VarB, this);
                if (objI == m231Var2) {
                    return m231Var2;
                }
                if (!((Boolean) objI).booleanValue() || (dataString = ((Intent) obj2).getDataString()) == null || ihc1.y0(dataString)) {
                    return crn0.a;
                }
                String str10 = ((th61) obj3).a;
                Set set = s4b1.f;
                String strB = pcf.b(uic.x(dataString));
                if (strB != null) {
                    return new hrn0(eve.class, new gve(strB, dataString, str10), a6w0.a);
                }
                k220.f("Chat id should not be empty. Uri: ".concat(dataString));
                return null;
            case 27:
                nwe nweVar = (nwe) obj3;
                boolean z29 = this.b;
                try {
                    if (!z29) {
                        hm5.M(obj);
                        this.b = true;
                        if (((cwe) this.c).b((gob) obj2, this) == m231Var2) {
                            return m231Var2;
                        }
                    } else {
                        if (!z29) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    nweVar.Y0();
                    return ogeVar;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                    nweVar.r1(false);
                    View view = ((zf30) nweVar).j1;
                    if (view == null) {
                        return ogeVar;
                    }
                    int[] iArr = yq91.t;
                    yq91.i(view, view.getResources().getText(2131953604), 0).k();
                    return ogeVar;
                }
            case 28:
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
                qbf qbfVar = (qbf) this.c;
                this.b = true;
                Object objN = tro1.n(qbfVar.e, qbfVar.c, qbfVar.d, ((qto0) obj2).d.c, (String) obj3, this);
                return objN == m231Var2 ? m231Var2 : objN;
            default:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        objF = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                String str11 = ((qto0) obj3).f;
                this.b = true;
                objF = ((hvp0) this.c).f((String) obj2, str11, this);
                if (objF == m231Var2) {
                    return m231Var2;
                }
                tvy0 tvy0Var = objF instanceof tvy0 ? (tvy0) objF : null;
                if (tvy0Var != null) {
                    return tvy0Var.c;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxa(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxa(cab cabVar, String str, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.d = cabVar;
        this.e = str;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxa(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxa(mr20 mr20Var, lnm lnmVar, Object obj, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = mr20Var;
        this.e = obj;
    }
}
