package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AdStartedPlaying;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AppBackgrounded;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AppIsOffline;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$BackendError;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$CarConnected;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$ConflictingMessagePresenting;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$DataMalformed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$InlineCardIncorrectTriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$NowPlayingViewPresenting;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$RequestDismissedConflictingPresentedMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jjc implements Update {
    public final dzq a;
    public final yak1 b;
    public final ltj0 c;

    public jjc(no21 no21Var, dzq dzqVar, yak1 yak1Var, ltj0 ltj0Var) {
        this.a = dzqVar;
        this.b = yak1Var;
        this.c = ltj0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Next a(klc klcVar, jlc jlcVar) {
        boolean z;
        boolean z2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        klc klcVarF;
        Object obj;
        Object obj2;
        Object next6;
        DiscardReason.MessageNotFound discardReason$BackendError;
        DiscardReason.MessageNotFound messageNotFound;
        Object next7;
        a5j0 a5j0Var;
        Object obj3;
        Object obj4;
        Object next8;
        DiscardReason.ContextSwitched discardReason$ConflictingMessagePresenting;
        LoggingData loggingDataI;
        Message messageY;
        Object next9;
        a5j0 a5j0Var2;
        Object next10;
        Object next11;
        Object next12;
        a5j0 a5j0Var3;
        LinkedHashMap linkedHashMap;
        Set set;
        Iterator it;
        w7x cappingRules;
        Long lValueOf;
        yqg yqgVar = this.a.a;
        ApplicationState applicationState = klcVar.a;
        Set set2 = klcVar.g;
        Set set3 = klcVar.e;
        if (jlcVar instanceof ykc) {
            gmc gmcVar = ((ykc) jlcVar).a;
            TriggerType triggerType = gmcVar.c;
            String str = gmcVar.b;
            if (applicationState == ApplicationState.BACKGROUND) {
                return Next.a(Collections.singleton(new yjc(new v4j0(yhm0.q(gmcVar), (Message) null, DiscardReason$AppBackgrounded.INSTANCE))));
            }
            Set set4 = set3;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator it2 = set4.iterator();
                while (it2.hasNext()) {
                    gmc gmcVar2 = (gmc) ((mmr0) it2.next()).a;
                    if (u890.j(gmcVar2.b, str) && gmcVar2.c == triggerType) {
                        return Next.a(Collections.singleton(new yjc(new v4j0(yhm0.q(gmcVar), (Message) null, new DiscardReason() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$RequestAlreadyProcessing
                            public static final int $stable = 0;
                        }))));
                    }
                }
            }
            klc klcVarA = klc.a(klcVar, (ApplicationState) null, 0L, (CacheState) null, dm61.x0(oqn1.n(gmcVar, new u4j0(yhm0.q(gmcVar))), set3), (Map) null, (Set) null, (Set) null, (ml5) null, 495);
            Set set5 = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            xj61 xj61Var = new xj61();
            xj61Var.add(str);
            try {
                xj61Var.add(nhc1.W(str, s4b1VarX.h(), "?"));
            } catch (UnsupportedOperationException unused) {
            }
            xj61 xj61VarJ = cwl1.j(xj61Var);
            ArrayList arrayList = new ArrayList(q7h.U(xj61VarJ, 10));
            wkg0 it3 = xj61VarJ.iterator();
            while (((g0y) it3).hasNext()) {
                arrayList.add(((String) it3.next()) + "#" + triggerType.name());
            }
            return Next.i(klcVarA, dm61.z0(new t3k1[]{new bkc(gmcVar, o7h.p1(arrayList), klcVar), new yjc(new u4j0(yhm0.q(gmcVar)))}));
        }
        if (jlcVar instanceof vkc) {
            vkc vkcVar = (vkc) jlcVar;
            gmc gmcVar3 = vkcVar.a;
            return Next.a(Collections.singleton(new zjc(gmcVar3, o7h.l1(vkcVar.b), gmcVar3.c)));
        }
        if (jlcVar instanceof rkc) {
            rkc rkcVar = (rkc) jlcVar;
            gmc gmcVar4 = rkcVar.b;
            String str2 = gmcVar4.a;
            Iterator it4 = set3.iterator();
            do {
                if (!it4.hasNext()) {
                    next10 = null;
                    break;
                }
                next10 = it4.next();
            } while (!u890.j(((gmc) ((mmr0) next10).a).a, str2));
            mmr0 mmr0Var = (mmr0) next10;
            if ((mmr0Var != null ? (a5j0) mmr0Var.b : null) == null) {
                return Next.j();
            }
            LinkedHashMap linkedHashMapO = sqg0.O(rkcVar.d, klcVar.f);
            klc klcVarA2 = klc.a(klcVar, (ApplicationState) null, 0L, (CacheState) null, (Set) null, linkedHashMapO, (Set) null, (Set) null, (ml5) null, 479);
            LinkedHashMap linkedHashMap2 = linkedHashMapO;
            Set set6 = klcVarA2.e;
            List list = rkcVar.c;
            List list2 = gmcVar4.e;
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                Object next13 = it5.next();
                Message.CreativeMessage creativeMessage = (Message) next13;
                String strA = yhm0.a(creativeMessage);
                CappingState cappingState = strA != null ? (CappingState) linkedHashMap2.get(CappingKey.m201boximpl(CappingKey.m201boximpl(strA).m207unboximpl())) : null;
                if (cappingState == null) {
                    linkedHashMap = linkedHashMap2;
                    set = set6;
                    it = it5;
                } else {
                    if (yhm0.g(creativeMessage, cappingState) || yhm0.h(creativeMessage, cappingState)) {
                        linkedHashMap = linkedHashMap2;
                        set = set6;
                        it = it5;
                    } else {
                        boolean z3 = creativeMessage instanceof Message.CreativeMessage;
                        if (z3) {
                            cappingRules = creativeMessage.getCappingRules();
                        } else {
                            if (!(creativeMessage instanceof Message.JITMessageStub)) {
                                eg.o();
                                return null;
                            }
                            cappingRules = w7x.a;
                        }
                        linkedHashMap = linkedHashMap2;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : (Iterable) cappingRules) {
                            Set set7 = set6;
                            Iterator it6 = it5;
                            if (obj5 instanceof CappingRule.TimeBased) {
                                arrayList3.add(obj5);
                            }
                            it5 = it6;
                            set6 = set7;
                        }
                        set = set6;
                        it = it5;
                        Iterator it7 = arrayList3.iterator();
                        if (it7.hasNext()) {
                            lValueOf = Long.valueOf(((CappingRule.TimeBased) it7.next()).getImpressionTimeInterval());
                            while (it7.hasNext()) {
                                Long lValueOf2 = Long.valueOf(((CappingRule.TimeBased) it7.next()).getImpressionTimeInterval());
                                if (lValueOf.compareTo(lValueOf2) < 0) {
                                    lValueOf = lValueOf2;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            if (z3) {
                                if (cappingState.getLastImpressionTimestamp() + jLongValue > yqgVar.b()) {
                                }
                            } else if (!(creativeMessage instanceof Message.JITMessageStub)) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                    it5 = it;
                    linkedHashMap2 = linkedHashMap;
                    set6 = set;
                }
                arrayList2.add(next13);
                it5 = it;
                linkedHashMap2 = linkedHashMap;
                set6 = set;
            }
            Set set8 = set6;
            ArrayList arrayListN0 = o7h.N0(arrayList2, list);
            if (!arrayListN0.isEmpty()) {
                Set setZ0 = dm61.z0(new t3k1[]{new mkc(gmcVar4, arrayListN0, klcVarA2), new gkc(str2, gmcVar4.b)});
                return klcVarA2.equals(klcVar) ? Next.a(setZ0) : Next.i(klcVarA2, setZ0);
            }
            Set set9 = set8;
            Iterator it8 = set9.iterator();
            do {
                if (!it8.hasNext()) {
                    next11 = null;
                    break;
                }
                next11 = it8.next();
            } while (!u890.j(((gmc) ((mmr0) next11).a).a, str2));
            mmr0 mmr0Var2 = (mmr0) next11;
            if ((mmr0Var2 != null ? (a5j0) mmr0Var2.b : null) instanceof u4j0) {
                klc klcVarH = jqu.h(klcVarA2, new fnn(rkcVar, (byte) 26));
                xj61 xj61Var2 = new xj61();
                pih1 pih1VarQ = yhm0.q(gmcVar4);
                DiscardReason.MessageNotFound messageNotFound2 = DiscardReason.MessageNotFound.INSTANCE;
                xj61Var2.add(new yjc(new v4j0(pih1VarQ, (Message) null, messageNotFound2)));
                xj61Var2.add(new wjc(new MessageResponse.Failure(yhm0.n(gmcVar4), str2, messageNotFound2)));
                return Next.i(klcVarH, cwl1.j(xj61Var2));
            }
            Iterator it9 = set9.iterator();
            do {
                if (!it9.hasNext()) {
                    next12 = null;
                    break;
                }
                next12 = it9.next();
            } while (!u890.j(((gmc) ((mmr0) next12).a).a, str2));
            mmr0 mmr0Var3 = (mmr0) next12;
            bhn0.f(gvg.h("Expected DataRequestReceived state for request ", str2, " but was actually ", (mmr0Var3 == null || (a5j0Var3 = (a5j0) mmr0Var3.b) == null) ? null : axo1.n(a5j0Var3)));
            return null;
        }
        if (jlcVar instanceof zkc) {
            zkc zkcVar = (zkc) jlcVar;
            gmc gmcVar5 = zkcVar.a;
            String str3 = gmcVar5.a;
            Set set10 = set3;
            Iterator it10 = set10.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    obj3 = null;
                    break;
                }
                Object next14 = it10.next();
                if (u890.j(((gmc) ((mmr0) next14).a).a, str3)) {
                    obj3 = next14;
                    break;
                }
            }
            mmr0 mmr0Var4 = (mmr0) obj3;
            if ((mmr0Var4 != null ? (a5j0) mmr0Var4.b : null) == null) {
                return Next.j();
            }
            Iterator it11 = set10.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    obj4 = null;
                    break;
                }
                Object next15 = it11.next();
                if (u890.j(((gmc) ((mmr0) next15).a).a, str3)) {
                    obj4 = next15;
                    break;
                }
            }
            mmr0 mmr0Var5 = (mmr0) obj4;
            a5j0 a5j0Var4 = mmr0Var5 != null ? (a5j0) mmr0Var5.b : null;
            if (!(a5j0Var4 instanceof u4j0)) {
                Iterator it12 = set10.iterator();
                do {
                    if (!it12.hasNext()) {
                        next9 = null;
                        break;
                    }
                    next9 = it12.next();
                } while (!u890.j(((gmc) ((mmr0) next9).a).a, str3));
                mmr0 mmr0Var6 = (mmr0) next9;
                bhn0.f(gvg.h("Expected DataRequestReceived state for request ", str3, " but was actually ", (mmr0Var6 == null || (a5j0Var2 = (a5j0) mmr0Var6.b) == null) ? null : axo1.n(a5j0Var2)));
                return null;
            }
            u4j0 u4j0Var = (u4j0) a5j0Var4;
            Iterator it13 = set2.iterator();
            do {
                if (!it13.hasNext()) {
                    next8 = null;
                    break;
                }
                next8 = it13.next();
            } while (!u890.j(((gmc) ((mmr0) next8).a).a, str3));
            mmr0 mmr0Var7 = (mmr0) next8;
            if (mmr0Var7 != null) {
                klc klcVarG = jqu.g(jqu.h(klcVar, new bzq(zkcVar, (byte) 0)), new bzq(zkcVar, (byte) 1));
                xj61 xj61Var3 = new xj61();
                xj61Var3.addAll(jqu.a((gmc) mmr0Var7.a, u4j0Var, (DiscardReason) mmr0Var7.b));
                return Next.i(klcVarG, cwl1.j(xj61Var3));
            }
            vxo1 vxo1Var = zkcVar.b;
            if (vxo1Var instanceof z5j0) {
                klc klcVarF2 = jqu.f(klcVar, new bzq(zkcVar, (byte) 2), new czq(vxo1Var));
                xj61 xj61Var4 = new xj61();
                z5j0 z5j0Var = (z5j0) vxo1Var;
                xj61Var4.add(new wjc(new MessageResponse.Success(yhm0.n(gmcVar5), str3, new MessageResponseToken(str3, yhm0.n(gmcVar5), z5j0Var.p()))));
                xj61Var4.add(new yjc(new t4j0(yhm0.q(gmcVar5), z5j0Var.p())));
                return Next.i(klcVarF2, cwl1.j(xj61Var4));
            }
            if (!(vxo1Var instanceof v5j0)) {
                eg.o();
                return null;
            }
            v5j0 v5j0Var = (v5j0) vxo1Var;
            hxo1 hxo1VarP = v5j0Var.p();
            if (hxo1VarP instanceof y5j0) {
                y5j0 y5j0Var = (y5j0) hxo1VarP;
                Rule rule = y5j0Var.c;
                String str4 = y5j0Var.e;
                switch (kh10.a[rule.ordinal()]) {
                    case 1:
                        discardReason$ConflictingMessagePresenting = DiscardReason$AdStartedPlaying.INSTANCE;
                        break;
                    case 2:
                        discardReason$ConflictingMessagePresenting = DiscardReason$CarConnected.INSTANCE;
                        break;
                    case 3:
                        discardReason$ConflictingMessagePresenting = DiscardReason$AppBackgrounded.INSTANCE;
                        break;
                    case 4:
                        discardReason$ConflictingMessagePresenting = new DiscardReason$ConflictingMessagePresenting(str4);
                        break;
                    case 5:
                        discardReason$ConflictingMessagePresenting = DiscardReason.ContextSwitched.INSTANCE;
                        break;
                    case 6:
                        discardReason$ConflictingMessagePresenting = DiscardReason$AppIsOffline.INSTANCE;
                        break;
                    case 7:
                        discardReason$ConflictingMessagePresenting = DiscardReason$NowPlayingViewPresenting.INSTANCE;
                        break;
                    case 8:
                        discardReason$ConflictingMessagePresenting = DiscardReason$InlineCardIncorrectTriggerType.INSTANCE;
                        break;
                    default:
                        eg.o();
                        return null;
                }
            } else if (hxo1VarP instanceof x5j0) {
                discardReason$ConflictingMessagePresenting = DiscardReason.MessageNotFound.INSTANCE;
            } else {
                if (!(hxo1VarP instanceof w5j0)) {
                    eg.o();
                    return null;
                }
                discardReason$ConflictingMessagePresenting = new DiscardReason() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$MessageExpired
                    public static final int $stable = 0;
                };
            }
            hxo1 hxo1VarP2 = v5j0Var.p();
            if (hxo1VarP2 instanceof w5j0) {
                loggingDataI = yhm0.i(((w5j0) hxo1VarP2).y());
            } else {
                if (hxo1VarP2 instanceof y5j0) {
                    Message messageY2 = ((y5j0) hxo1VarP2).y();
                    if (messageY2 != null) {
                        loggingDataI = yhm0.i(messageY2);
                    }
                } else if (!(hxo1VarP2 instanceof x5j0)) {
                    eg.o();
                    return null;
                }
                loggingDataI = null;
            }
            hxo1 hxo1VarP3 = v5j0Var.p();
            if (hxo1VarP3 instanceof w5j0) {
                messageY = ((w5j0) hxo1VarP3).y();
            } else if (hxo1VarP3 instanceof y5j0) {
                messageY = ((y5j0) hxo1VarP3).y();
            } else {
                if (!(hxo1VarP3 instanceof x5j0)) {
                    eg.o();
                    return null;
                }
                messageY = null;
            }
            klc klcVarH2 = jqu.h(klcVar, new bzq(zkcVar, (byte) 3));
            xj61 xj61Var5 = new xj61();
            xj61Var5.add(new wjc(new MessageResponse.Failure(yhm0.n(gmcVar5), str3, discardReason$ConflictingMessagePresenting)));
            if (loggingDataI != null) {
                xj61Var5.add(new ckc(yhm0.q(gmcVar5), loggingDataI, discardReason$ConflictingMessagePresenting));
            } else {
                xj61Var5.add(new hkc(yhm0.q(gmcVar5), discardReason$ConflictingMessagePresenting));
            }
            xj61Var5.add(new yjc(new v4j0(yhm0.q(gmcVar5), messageY, discardReason$ConflictingMessagePresenting)));
            return Next.i(klcVarH2, cwl1.j(xj61Var5));
        }
        if (jlcVar instanceof elc) {
            elc elcVar = (elc) jlcVar;
            gmc gmcVar6 = elcVar.a;
            String str5 = gmcVar6.a;
            Set set11 = set3;
            Iterator it14 = set11.iterator();
            while (true) {
                if (!it14.hasNext()) {
                    obj = null;
                    break;
                }
                Object next16 = it14.next();
                if (u890.j(((gmc) ((mmr0) next16).a).a, str5)) {
                    obj = next16;
                    break;
                }
            }
            mmr0 mmr0Var8 = (mmr0) obj;
            if ((mmr0Var8 != null ? (a5j0) mmr0Var8.b : null) == null) {
                return Next.j();
            }
            Iterator it15 = set11.iterator();
            while (true) {
                if (!it15.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next17 = it15.next();
                if (u890.j(((gmc) ((mmr0) next17).a).a, str5)) {
                    obj2 = next17;
                    break;
                }
            }
            mmr0 mmr0Var9 = (mmr0) obj2;
            a5j0 a5j0Var5 = mmr0Var9 != null ? (a5j0) mmr0Var9.b : null;
            if (!(a5j0Var5 instanceof u4j0)) {
                Iterator it16 = set11.iterator();
                do {
                    if (!it16.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it16.next();
                } while (!u890.j(((gmc) ((mmr0) next7).a).a, str5));
                mmr0 mmr0Var10 = (mmr0) next7;
                bhn0.f(gvg.h("Expected DataRequestReceived state for request ", str5, " but was actually ", (mmr0Var10 == null || (a5j0Var = (a5j0) mmr0Var10.b) == null) ? null : axo1.n(a5j0Var)));
                return null;
            }
            u4j0 u4j0Var2 = (u4j0) a5j0Var5;
            Iterator it17 = set2.iterator();
            do {
                if (!it17.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it17.next();
            } while (!u890.j(((gmc) ((mmr0) next6).a).a, str5));
            mmr0 mmr0Var11 = (mmr0) next6;
            if (mmr0Var11 != null) {
                klc klcVarG2 = jqu.g(jqu.h(klcVar, new s20(elcVar, (byte) 10)), new azq(elcVar, (byte) 0));
                xj61 xj61Var6 = new xj61();
                xj61Var6.addAll(jqu.a((gmc) mmr0Var11.a, u4j0Var2, (DiscardReason) mmr0Var11.b));
                return Next.i(klcVarG2, cwl1.j(xj61Var6));
            }
            h321 h321Var = elcVar.b;
            if (!(h321Var instanceof h321)) {
                if (h321Var instanceof l321) {
                    return Next.a(Collections.singleton(new mkc(gmcVar6, k4p1.x(((l321) h321Var).c), klcVar)));
                }
                eg.o();
                return null;
            }
            l6p1 l6p1Var = h321Var.c;
            boolean z4 = l6p1Var instanceof j321;
            if (z4) {
                messageNotFound = DiscardReason.MessageNotFound.INSTANCE;
            } else {
                if (l6p1Var instanceof k321) {
                    discardReason$BackendError = new DiscardReason$DataMalformed(((k321) l6p1Var).d);
                } else {
                    if (!(l6p1Var instanceof i321)) {
                        eg.o();
                        return null;
                    }
                    discardReason$BackendError = new DiscardReason$BackendError(((i321) l6p1Var).d);
                }
                messageNotFound = discardReason$BackendError;
            }
            klc klcVarH3 = jqu.h(klcVar, new azq(elcVar, (byte) 1));
            xj61 xj61Var7 = new xj61();
            xj61Var7.addAll(jqu.c(gmcVar6, u4j0Var2, messageNotFound));
            xj61 xj61Var8 = new xj61();
            xj61Var8.add(new yjc(new v4j0(u4j0Var2.a(), u4j0Var2.c(), messageNotFound)));
            xj61Var7.addAll(cwl1.j(xj61Var8));
            if (z4) {
                List listX = elcVar.c;
                if (listX.isEmpty()) {
                    listX = k4p1.x(gmcVar6.b);
                }
                xj61Var7.add(new tjc(listX, gmcVar6.c));
            } else {
                xj61Var7.addAll(jqu.b(u4j0Var2, messageNotFound));
            }
            return Next.i(klcVarH3, cwl1.j(xj61Var7));
        }
        if (jlcVar instanceof flc) {
            n321 n321Var = ((flc) jlcVar).a;
            if (n321Var instanceof n321) {
                return Next.a(Collections.singleton(new lkc(n321Var.c)));
            }
            if (n321Var instanceof m321) {
                return Next.h(klc.a(klcVar, (ApplicationState) null, 0L, CacheState.UPDATE_FAILED, (Set) null, (Map) null, (Set) null, (Set) null, (ml5) null, 503));
            }
            eg.o();
            return null;
        }
        if (jlcVar instanceof skc) {
            CacheState cacheState = ((skc) jlcVar).a;
            return cacheState == CacheState.LOADED ? Next.i(klc.a(klcVar, (ApplicationState) null, yqgVar.b() / 1000, cacheState, (Set) null, (Map) null, (Set) null, (Set) null, (ml5) null, 499), Collections.singleton(kkc.b)) : Next.h(klc.a(klcVar, (ApplicationState) null, 0L, cacheState, (Set) null, (Map) null, (Set) null, (Set) null, (ml5) null, 503));
        }
        if (jlcVar instanceof blc) {
            blc blcVar = (blc) jlcVar;
            MessageResponseToken messageResponseToken = blcVar.b;
            Iterator it18 = set2.iterator();
            do {
                if (!it18.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it18.next();
            } while (!u890.j(((gmc) ((mmr0) next4).a).a, messageResponseToken.getRequestId()));
            mmr0 mmr0Var12 = (mmr0) next4;
            Set set12 = set3;
            Iterator it19 = set12.iterator();
            do {
                if (!it19.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it19.next();
            } while (!u890.j(((gmc) ((mmr0) next5).a).a, messageResponseToken.getRequestId()));
            mmr0 mmr0Var13 = (mmr0) next5;
            if (mmr0Var12 != null && mmr0Var13 != null) {
                klc klcVarG3 = jqu.g(jqu.h(klcVar, new uak1(blcVar, (byte) 0)), new uak1(blcVar, (byte) 1));
                xj61 xj61Var9 = new xj61();
                xj61Var9.addAll(jqu.a((gmc) mmr0Var12.a, (a5j0) mmr0Var13.b, (DiscardReason) mmr0Var12.b));
                return Next.i(klcVarG3, cwl1.j(xj61Var9));
            }
            uak1 uak1Var = new uak1(blcVar, (byte) 2);
            dch1 dch1Var = new dch1(blcVar, (byte) 28);
            vak1 vak1Var = new vak1(blcVar);
            if ((set12 instanceof Collection) && set12.isEmpty()) {
                gmc gmcVar7 = (gmc) dch1Var.invoke();
                yhm0.q((gmc) dch1Var.invoke());
                MessageResponseToken messageResponseToken2 = vak1Var.a.b;
                klcVarF = klc.a(klcVar, (ApplicationState) null, 0L, (CacheState) null, dm61.x0(oqn1.n(gmcVar7, new z4j0(yhm0.p(messageResponseToken2.getMessageRequest(), messageResponseToken2.getRequestId()), messageResponseToken2.getMessageData())), set3), (Map) null, (Set) null, (Set) null, (ml5) null, 495);
            } else {
                Iterator it20 = set12.iterator();
                while (it20.hasNext()) {
                    if (((Boolean) uak1Var.invoke(it20.next())).booleanValue()) {
                        klcVarF = jqu.f(klcVar, uak1Var, vak1Var);
                    }
                }
                gmc gmcVar8 = (gmc) dch1Var.invoke();
                yhm0.q((gmc) dch1Var.invoke());
                MessageResponseToken messageResponseToken3 = vak1Var.a.b;
                klcVarF = klc.a(klcVar, (ApplicationState) null, 0L, (CacheState) null, dm61.x0(oqn1.n(gmcVar8, new z4j0(yhm0.p(messageResponseToken3.getMessageRequest(), messageResponseToken3.getRequestId()), messageResponseToken3.getMessageData())), set3), (Map) null, (Set) null, (Set) null, (ml5) null, 495);
            }
            xj61 xj61Var10 = new xj61();
            xj61Var10.add(new jkc(blcVar.a, blcVar.c, blcVar.b, blcVar.d, blcVar.e, klcVar, blcVar.f, blcVar.g));
            xj61Var10.add(new yjc(new z4j0(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData())));
            return Next.i(klcVarF, cwl1.j(xj61Var10));
        }
        boolean z5 = jlcVar instanceof wkc;
        yak1 yak1Var = this.b;
        if (z5) {
            wkc wkcVar = (wkc) jlcVar;
            Message message = wkcVar.b;
            xj61 xj61Var11 = new xj61();
            Button button = wkcVar.c;
            if (u890.j(button.getClickAction().getClickActionIdentifier(), "DISMISS")) {
                return Next.j();
            }
            LoggingData loggingDataI2 = yhm0.i(message);
            if (loggingDataI2 != null) {
                xj61Var11.add(new fkc(wkcVar.a, loggingDataI2, button));
            }
            mmr0 mmr0VarE = jqu.e(message, klcVar, EventType.CLICK, yak1Var.b);
            klc klcVar2 = (klc) mmr0VarE.a;
            xj61Var11.addAll((Set) mmr0VarE.b);
            xj61 xj61VarJ2 = cwl1.j(xj61Var11);
            return !u890.j(klcVar2, klcVar) ? Next.i(klcVar2, xj61VarJ2) : Next.a(xj61VarJ2);
        }
        if (jlcVar instanceof dlc) {
            dlc dlcVar = (dlc) jlcVar;
            qtg qtgVar = dlcVar.a;
            Iterator it21 = set3.iterator();
            do {
                if (!it21.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it21.next();
            } while (!u890.j(((gmc) ((mmr0) next2).a).a, qtgVar.n().a));
            mmr0 mmr0Var14 = (mmr0) next2;
            a5j0 a5j0Var6 = mmr0Var14 != null ? (a5j0) mmr0Var14.b : null;
            if (!(a5j0Var6 instanceof z4j0)) {
                return Next.j();
            }
            Iterator it22 = set2.iterator();
            do {
                if (!it22.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it22.next();
            } while (!u890.j(((gmc) ((mmr0) next3).a).a, qtgVar.n().a));
            mmr0 mmr0Var15 = (mmr0) next3;
            if (mmr0Var15 != null) {
                klc klcVarG4 = jqu.g(jqu.h(klcVar, new wak1(dlcVar, (byte) 0)), new wak1(dlcVar, (byte) 1));
                xj61 xj61Var12 = new xj61();
                xj61Var12.addAll(jqu.a((gmc) mmr0Var15.a, a5j0Var6, (DiscardReason) mmr0Var15.b));
                return Next.i(klcVarG4, cwl1.j(xj61Var12));
            }
            if (!(qtgVar instanceof mxv0)) {
                if (!(qtgVar instanceof lxv0)) {
                    eg.o();
                    return null;
                }
                xj61 xj61Var13 = new xj61();
                lxv0 lxv0Var = (lxv0) qtgVar;
                xj61Var13.addAll(jqu.a(lxv0Var.n(), a5j0Var6, lxv0Var.f));
                return Next.a(cwl1.j(xj61Var13));
            }
            z4j0 z4j0Var = (z4j0) a5j0Var6;
            klc klcVarF3 = jqu.f(klcVar, new tak1(qtgVar, (byte) 3), new tak1(z4j0Var, (byte) 4));
            Set set13 = klcVarF3.e;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            mxv0 mxv0Var = (mxv0) qtgVar;
            linkedHashSet.add(new xjc(new q6j0(mxv0Var.n(), mxv0Var.e, mxv0Var.f)));
            linkedHashSet.add(new yjc(new y4j0(z4j0Var.a, z4j0Var.b)));
            if (mxv0Var.n().i == ConflictResolutionStrategy.DISMISS_OTHER) {
                xak1 xak1Var = new xak1(qtgVar, yak1Var, (byte) 1);
                xak1 xak1Var2 = new xak1(qtgVar, yak1Var, (byte) 0);
                xak1 xak1Var3 = new xak1(qtgVar, yak1Var, (byte) 2);
                Set set14 = set13;
                ArrayList<mmr0> arrayList4 = new ArrayList();
                for (Object obj6 : set14) {
                    if (((Boolean) xak1Var.invoke(obj6)).booleanValue()) {
                        arrayList4.add(obj6);
                    }
                }
                for (mmr0 mmr0Var16 : arrayList4) {
                    linkedHashSet.addAll(jqu.a((gmc) mmr0Var16.a, (a5j0) mmr0Var16.b, new DiscardReason$RequestDismissedConflictingPresentedMessage(mxv0Var.n().a)));
                }
                ArrayList<mmr0> arrayList5 = new ArrayList();
                for (Object obj7 : set14) {
                    if (((Boolean) xak1Var3.invoke(obj7)).booleanValue()) {
                        arrayList5.add(obj7);
                    }
                }
                ArrayList<mmr0> arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                for (mmr0 mmr0Var17 : arrayList5) {
                    Object obj8 = mmr0Var17.a;
                    Message messageC = ((a5j0) mmr0Var17.b).c();
                    if (messageC == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    arrayList6.add(oqn1.n(obj8, messageC));
                }
                for (mmr0 mmr0Var18 : arrayList6) {
                    linkedHashSet.add(new vjc(yhm0.q((gmc) mmr0Var18.a), (Message) mmr0Var18.b, DismissReason.ProgrammaticDismissal.INSTANCE));
                }
                klcVarF3 = jqu.d(jqu.h(klcVarF3, new tak1(xak1Var, (byte) 2)), xak1Var2, new DiscardReason$RequestDismissedConflictingPresentedMessage(mxv0Var.n().a));
            }
            return Next.i(klcVarF3, linkedHashSet);
        }
        if (jlcVar instanceof xkc) {
            return yak1Var.a(klcVar, (xkc) jlcVar);
        }
        if (!(jlcVar instanceof alc)) {
            boolean z6 = jlcVar instanceof ilc;
            ltj0 ltj0Var = this.c;
            if (z6) {
                return ltj0Var.f(klcVar, (ilc) jlcVar);
            }
            if (jlcVar instanceof qkc) {
                return ltj0Var.c(klcVar, (qkc) jlcVar);
            }
            boolean z7 = jlcVar instanceof hlc;
            akc akcVar = akc.b;
            if (z7) {
                return Next.a(Collections.singleton(akcVar));
            }
            if (jlcVar instanceof glc) {
                xj61 xj61Var14 = new xj61();
                for (mmr0 mmr0Var19 : klcVar.e) {
                    Object obj9 = mmr0Var19.b;
                    Object obj10 = mmr0Var19.a;
                    Message messageC2 = ((a5j0) obj9).c();
                    if (messageC2 != null) {
                        a5j0 a5j0Var7 = (a5j0) mmr0Var19.b;
                        a5j0Var7.getClass();
                        if (a5j0Var7 instanceof x4j0) {
                            gmc gmcVar9 = (gmc) obj10;
                            xj61Var14.add(new vjc(yhm0.q(gmcVar9), messageC2, DismissReason.SessionEnded.INSTANCE));
                            xj61Var14.add(new qjc(yhm0.q(gmcVar9), (DismissReason.UserLoggingOut) null));
                        }
                    }
                }
                return Next.a(cwl1.j(xj61Var14));
            }
            if (jlcVar instanceof ukc) {
                ukc ukcVar = (ukc) jlcVar;
                if (klcVar.d == CacheState.LOADED) {
                    return Next.j();
                }
                return (ukcVar.a && applicationState == ApplicationState.FOREGROUND) ? Next.a(Collections.singleton(akcVar)) : Next.j();
            }
            if (jlcVar instanceof okc) {
                return ltj0Var.a(klcVar, (okc) jlcVar);
            }
            if (jlcVar instanceof tkc) {
                return ltj0Var.d(klcVar, (tkc) jlcVar);
            }
            if (jlcVar instanceof pkc) {
                return ltj0Var.b(klcVar, (pkc) jlcVar);
            }
            if (jlcVar instanceof clc) {
                return ltj0Var.e(klcVar);
            }
            eg.o();
            return null;
        }
        alc alcVar = (alc) jlcVar;
        String str6 = alcVar.a;
        Set set15 = set3;
        boolean z8 = set15 instanceof Collection;
        if (!z8 || !set15.isEmpty()) {
            Iterator it23 = set15.iterator();
            while (true) {
                if (!it23.hasNext()) {
                    z = false;
                    break;
                }
                mmr0 mmr0Var20 = (mmr0) it23.next();
                if (u890.j(((gmc) mmr0Var20.a).a, str6) && (mmr0Var20.b instanceof x4j0)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z8 || !set15.isEmpty()) {
            Iterator it24 = set15.iterator();
            while (true) {
                if (!it24.hasNext()) {
                    z2 = false;
                    break;
                }
                mmr0 mmr0Var21 = (mmr0) it24.next();
                if (u890.j(((gmc) mmr0Var21.a).a, str6) && !(mmr0Var21.b instanceof x4j0)) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (!z) {
            return z2 ? Next.h(jqu.d(klcVar, new tak1(alcVar, (byte) 1), new DiscardReason$PresentationFailed("Message view dismissed before presentation"))) : Next.j();
        }
        xj61 xj61Var15 = new xj61();
        Iterator it25 = set15.iterator();
        do {
            if (!it25.hasNext()) {
                next = null;
                break;
            }
            next = it25.next();
        } while (!u890.j(((gmc) ((mmr0) next).a).a, str6));
        mmr0 mmr0Var22 = (mmr0) next;
        if (mmr0Var22 != null) {
            if (((a5j0) mmr0Var22.b).c() == null) {
                mmr0Var22 = null;
            }
            if (mmr0Var22 != null) {
                pih1 pih1VarQ2 = yhm0.q((gmc) mmr0Var22.a);
                Message messageC3 = ((a5j0) mmr0Var22.b).c();
                if (messageC3 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                xj61Var15.add(new vjc(pih1VarQ2, messageC3, alcVar.b));
            }
        }
        return Next.a(cwl1.j(xj61Var15));
    }
}
