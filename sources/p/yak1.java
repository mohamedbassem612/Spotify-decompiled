package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.mobius.Next;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yak1 {
    public final dqu a;
    public final yqg b;

    public yak1(dqu dquVar, yqg yqgVar) {
        this.a = dquVar;
        this.b = yqgVar;
    }

    public final Next a(klc klcVar, xkc xkcVar) {
        klc klcVar2;
        klc klcVar3 = klcVar;
        Set set = klcVar3.h;
        Set set2 = klcVar3.g;
        Set set3 = klcVar3.e;
        h4j0 h4j0Var = xkcVar.a;
        if (h4j0Var instanceof h4j0) {
            Set set4 = set3;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator it = set4.iterator();
                while (it.hasNext()) {
                    h4j0 h4j0Var2 = h4j0Var;
                    if (u890.j(((gmc) ((mmr0) it.next()).a).a, h4j0Var2.R().a)) {
                        Set setO1 = o7h.o1(set4);
                        r7h.Z(setO1, new sak1(h4j0Var, (byte) 2), true);
                        Set setO2 = o7h.o1(set2);
                        r7h.Z(setO2, new sak1(h4j0Var, (byte) 3), true);
                        klc klcVarA = klc.a(klcVar3, null, 0L, null, setO1, null, setO2, null, null, 431);
                        xj61 xj61Var = new xj61();
                        Message messageQ = h4j0Var2.Q();
                        LoggingData loggingDataI = messageQ != null ? yhm0.i(messageQ) : null;
                        if (loggingDataI != null) {
                            xj61Var.add(new ckc(h4j0Var2.R(), loggingDataI, h4j0Var2.P()));
                        } else {
                            xj61Var.add(new hkc(h4j0Var2.R(), h4j0Var2.P()));
                        }
                        xj61Var.add(new yjc(new v4j0(h4j0Var2.R(), h4j0Var2.Q(), h4j0Var2.P())));
                        return Next.i(klcVarA, cwl1.j(xj61Var));
                    }
                }
            }
            return Next.j();
        }
        boolean z = h4j0Var instanceof i4j0;
        boolean zJ = false;
        yqg yqgVar = this.b;
        if (!z) {
            if (!(h4j0Var instanceof j4j0)) {
                eg.o();
                return null;
            }
            Set set5 = set3;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it2 = set5.iterator();
                while (it2.hasNext()) {
                    j4j0 j4j0Var = (j4j0) h4j0Var;
                    if (u890.j(((gmc) ((mmr0) it2.next()).a).a, j4j0Var.Q().a)) {
                        LoggingData loggingDataI2 = yhm0.i(j4j0Var.P());
                        if (loggingDataI2 == null) {
                            bhn0.f(l1d.m("Logging data is missing for dismissed message ", j4j0Var.Q().a));
                            return null;
                        }
                        Set setO3 = o7h.o1(set);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        x4j0 x4j0Var = new x4j0(j4j0Var.Q(), j4j0Var.P());
                        if (!set.contains(j4j0Var.Q().a)) {
                            linkedHashSet.add(new ekc(j4j0Var.Q(), loggingDataI2));
                            mmr0 mmr0VarE = jqu.e(j4j0Var.P(), klcVar3, EventType.VIEW, yqgVar);
                            klc klcVar4 = (klc) mmr0VarE.a;
                            linkedHashSet.addAll((Set) mmr0VarE.b);
                            setO3.add(j4j0Var.Q().a);
                            klcVar3 = klcVar4;
                        }
                        linkedHashSet.add(new yjc(x4j0Var));
                        return Next.i(jqu.f(klc.a(jqu.g(klcVar3, new sak1(h4j0Var, (byte) 0)), null, 0L, null, null, null, null, setO3, null, 383), new sak1(h4j0Var, (byte) 1), new tak1(x4j0Var, (byte) 0)), linkedHashSet);
                    }
                }
            }
            return Next.j();
        }
        Set set6 = set3;
        if (!(set6 instanceof Collection) || !set6.isEmpty()) {
            Iterator it3 = set6.iterator();
            while (it3.hasNext()) {
                i4j0 i4j0Var = (i4j0) h4j0Var;
                if (u890.j(((gmc) ((mmr0) it3.next()).a).a, i4j0Var.R().a)) {
                    LoggingData loggingDataI3 = yhm0.i(i4j0Var.Q());
                    if (loggingDataI3 == null) {
                        bhn0.f(l1d.m("Logging data is missing for dismissed message ", i4j0Var.R().a));
                        return null;
                    }
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    DismissReason.MessageButtonTapped messageButtonTappedP = i4j0Var.P();
                    if (messageButtonTappedP instanceof DismissReason.MessageButtonTapped) {
                        zJ = u890.j(messageButtonTappedP.getButton().getClickAction().getClickActionIdentifier(), "DISMISS");
                    } else if (!(messageButtonTappedP instanceof DismissReason.ContextChanged) && !(messageButtonTappedP instanceof DismissReason.SessionEnded) && !(messageButtonTappedP instanceof DismissReason.MessageCleanup) && !(messageButtonTappedP instanceof DismissReason.UserLoggingOut)) {
                        zJ = true;
                    }
                    if (zJ) {
                        linkedHashSet2.add(new dkc(i4j0Var.R(), loggingDataI3, i4j0Var.P()));
                        mmr0 mmr0VarE2 = jqu.e(i4j0Var.Q(), klcVar3, EventType.DISMISS, yqgVar);
                        klc klcVar5 = (klc) mmr0VarE2.a;
                        linkedHashSet2.addAll((Set) mmr0VarE2.b);
                        klcVar2 = klcVar5;
                    } else {
                        klcVar2 = klcVar3;
                    }
                    linkedHashSet2.add(new yjc(new w4j0(i4j0Var.R(), i4j0Var.Q(), i4j0Var.P())));
                    linkedHashSet2.add(new qjc(i4j0Var.R(), null));
                    Set setO4 = o7h.o1(set6);
                    r7h.Z(setO4, new sak1(h4j0Var, (byte) 4), true);
                    Set setO5 = o7h.o1(set2);
                    r7h.Z(setO5, new sak1(h4j0Var, (byte) 5), true);
                    return Next.i(klc.a(klcVar2, null, 0L, null, setO4, null, setO5, null, null, 431), linkedHashSet2);
                }
            }
        }
        return Next.j();
    }
}
