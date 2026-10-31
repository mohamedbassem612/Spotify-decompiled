package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jqu {
    public static final Set a(gmc gmcVar, a5j0 a5j0Var, DiscardReason discardReason) {
        boolean z = a5j0Var instanceof x4j0;
        Set setY0 = w7x.a;
        if (z || (a5j0Var instanceof v4j0) || (a5j0Var instanceof w4j0) || (a5j0Var instanceof y4j0)) {
            return setY0;
        }
        xj61 xj61VarC = c(gmcVar, a5j0Var, discardReason);
        if (!(a5j0Var instanceof z4j0)) {
            xj61 xj61VarB = b(a5j0Var, discardReason);
            xj61 xj61Var = new xj61();
            xj61Var.add(new yjc(new v4j0(a5j0Var.a(), a5j0Var.c(), discardReason)));
            setY0 = dm61.y0(xj61VarB, cwl1.j(xj61Var));
        }
        return dm61.y0(xj61VarC, setY0);
    }

    public static final xj61 b(a5j0 a5j0Var, DiscardReason discardReason) {
        xj61 xj61Var = new xj61();
        LoggingData loggingDataB = a5j0Var.b();
        if (loggingDataB == null) {
            xj61Var.add(new hkc(a5j0Var.a(), discardReason));
        } else {
            xj61Var.add(new ckc(a5j0Var.a(), loggingDataB, discardReason));
        }
        return cwl1.j(xj61Var);
    }

    public static final xj61 c(gmc gmcVar, a5j0 a5j0Var, DiscardReason discardReason) {
        xj61 xj61Var = new xj61();
        if (a5j0Var instanceof z4j0) {
            xj61Var.add(new xjc(new p6j0(gmcVar, ((z4j0) a5j0Var).b, discardReason)));
        } else if (a5j0Var instanceof u4j0) {
            xj61Var.add(new wjc(new MessageResponse.Failure(yhm0.n(gmcVar), gmcVar.a, discardReason)));
        }
        return cwl1.j(xj61Var);
    }

    public static final klc d(klc klcVar, iu30 iu30Var, DiscardReason discardReason) {
        Set set = klcVar.g;
        xj61 xj61Var = new xj61();
        Set set2 = klcVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Boolean) iu30Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(oqn1.n(((mmr0) it.next()).a, discardReason));
        }
        xj61Var.addAll(arrayList2);
        return klc.a(klcVar, null, 0L, null, null, null, dm61.y0(set, cwl1.j(xj61Var)), null, null, 447);
    }

    public static final mmr0 e(Message message, klc klcVar, EventType eventType, yqg yqgVar) {
        Set<CappingRule> cappingRules;
        MessageSource source;
        boolean z;
        boolean z2;
        mmr0 mmr0VarN;
        long messageId;
        Map map = klcVar.f;
        boolean z3 = message instanceof Message.CreativeMessage;
        w7x w7xVar = w7x.a;
        if (z3) {
            cappingRules = ((Message.CreativeMessage) message).getCappingRules();
        } else {
            if (!(message instanceof Message.JITMessageStub)) {
                eg.o();
                return null;
            }
            cappingRules = w7xVar;
        }
        String strA = yhm0.a(message);
        if (strA == null) {
            return oqn1.n(klcVar, w7xVar);
        }
        if (cappingRules.isEmpty()) {
            return oqn1.n(klcVar, w7xVar);
        }
        if (z3) {
            source = ((Message.CreativeMessage) message).getSource();
        } else {
            if (!(message instanceof Message.JITMessageStub)) {
                eg.o();
                return null;
            }
            source = MessageSource.JIT;
        }
        boolean z4 = source == MessageSource.LOCAL;
        CappingState cappingState = (CappingState) map.get(CappingKey.box-impl(strA));
        CappingState cappingState2 = cappingState == null ? new CappingState(0, 0L, (Set) null, 7, (DefaultConstructorMarker) null) : cappingState;
        int i = iqu.a[eventType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return oqn1.n(klcVar, w7xVar);
            }
            if (i == 3) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : cappingRules) {
                    if (obj instanceof CappingRule.Interaction) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!((CappingRule.Interaction) it.next()).getInteractionsToCap().contains(InteractionType.DISMISS));
                    CappingState cappingStateCopy$default = CappingState.copy$default(cappingState2, 0, 0L, dm61.x0(EventType.DISMISS, cappingState2.getCapturedInteractions()), 3, (Object) null);
                    mmr0VarN = oqn1.n(cappingStateCopy$default, Boolean.valueOf(yhm0.h(message, cappingStateCopy$default)));
                }
                return oqn1.n(klcVar, w7xVar);
            }
            if (i != 4) {
                eg.o();
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : cappingRules) {
                if (obj2 instanceof CappingRule.Interaction) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((CappingRule.Interaction) it2.next()).getInteractionsToCap().contains(InteractionType.CLICK));
                CappingState cappingStateCopy$default2 = CappingState.copy$default(cappingState2, 0, 0L, dm61.x0(EventType.CLICK, cappingState2.getCapturedInteractions()), 3, (Object) null);
                mmr0VarN = oqn1.n(cappingStateCopy$default2, Boolean.valueOf(yhm0.h(message, cappingStateCopy$default2)));
            }
            return oqn1.n(klcVar, w7xVar);
        }
        Set<CappingRule> set = cappingRules;
        boolean z5 = set instanceof Collection;
        if (!z5 || !set.isEmpty()) {
            Iterator<T> it3 = set.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                }
                if (((CappingRule) it3.next()) instanceof CappingRule.Impression) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z5 || !set.isEmpty()) {
            Iterator<T> it4 = set.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((CappingRule) it4.next()) instanceof CappingRule.TimeBased) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (!z && !z2) {
            return oqn1.n(klcVar, w7xVar);
        }
        CappingState cappingStateCopy$default3 = CappingState.copy$default(cappingState2, z ? cappingState2.getImpressionCount() + 1 : cappingState2.getImpressionCount(), z2 ? yqgVar.b() : cappingState2.getLastImpressionTimestamp(), (Set) null, 4, (Object) null);
        mmr0VarN = oqn1.n(cappingStateCopy$default3, Boolean.valueOf(z && yhm0.g(message, cappingStateCopy$default3)));
        CappingState cappingState3 = (CappingState) mmr0VarN.a;
        if (!((Boolean) mmr0VarN.b).booleanValue() || z4) {
            return oqn1.n(klc.a(klcVar, null, 0L, null, null, sqg0.P(map, oqn1.n(CappingKey.box-impl(strA), cappingState3)), null, null, null, 479), Collections.singleton(new nkc(strA, cappingState3)));
        }
        klc klcVarA = klc.a(klcVar, null, 0L, null, null, sqg0.K(CappingKey.box-impl(strA), map), null, null, null, 479);
        if (z3) {
            messageId = ((Message.CreativeMessage) message).getLoggingData().getMessageId();
        } else {
            if (!(message instanceof Message.JITMessageStub)) {
                eg.o();
                return null;
            }
            messageId = -1;
        }
        return oqn1.n(klcVarA, dm61.z0(new ujc(messageId), new sjc(strA)));
    }

    public static final klc f(klc klcVar, iu30 iu30Var, iu30 iu30Var2) {
        Set<mmr0> set = klcVar.e;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        for (mmr0 mmr0VarN : set) {
            if (((Boolean) iu30Var.invoke(mmr0VarN)).booleanValue()) {
                mmr0VarN = oqn1.n(mmr0VarN.a, iu30Var2.invoke(mmr0VarN.b));
            }
            arrayList.add(mmr0VarN);
        }
        return klc.a(klcVar, null, 0L, null, o7h.p1(arrayList), null, null, null, null, 495);
    }

    public static final klc g(klc klcVar, iu30 iu30Var) {
        Set set = klcVar.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!((Boolean) iu30Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return klc.a(klcVar, null, 0L, null, null, null, o7h.p1(arrayList), null, null, 447);
    }

    public static final klc h(klc klcVar, iu30 iu30Var) {
        Set set = klcVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!((Boolean) iu30Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return klc.a(klcVar, null, 0L, null, o7h.p1(arrayList), null, null, null, null, 495);
    }
}
