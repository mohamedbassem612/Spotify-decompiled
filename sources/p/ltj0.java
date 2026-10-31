package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.AdPlayingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CarConnectionState;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ltj0 {
    public final yqg a;

    public ltj0(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final Next a(klc klcVar, okc okcVar) {
        Set set = klcVar.e;
        if (okcVar.a != AdPlayingState.AD_NOT_PLAYING) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    Object obj = ((mmr0) it.next()).b;
                    if ((obj instanceof z4j0) || (obj instanceof y4j0) || (obj instanceof x4j0)) {
                        kmj0 kmj0Var = kmj0.Y0;
                        kmj0 kmj0Var2 = kmj0.X0;
                        kmj0 kmj0Var3 = kmj0.Z0;
                        klc klcVarD = jqu.d(jqu.h(klcVar, new nrj0((byte) 1)), kmj0Var2, DiscardReason.AdStartedPlaying.INSTANCE);
                        xj61 xj61Var = new xj61();
                        ArrayList<mmr0> arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((Boolean) kmj0Var.invoke((mmr0) obj2)).booleanValue()) {
                                arrayList.add(obj2);
                            }
                        }
                        for (mmr0 mmr0Var : arrayList) {
                            xj61Var.addAll(jqu.a((gmc) mmr0Var.a, (a5j0) mmr0Var.b, DiscardReason.AdStartedPlaying.INSTANCE));
                        }
                        ArrayList<mmr0> arrayList2 = new ArrayList();
                        for (Object obj3 : set2) {
                            if (((Boolean) kmj0Var3.invoke((mmr0) obj3)).booleanValue()) {
                                arrayList2.add(obj3);
                            }
                        }
                        ArrayList<mmr0> arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                        for (mmr0 mmr0Var2 : arrayList2) {
                            Object obj4 = mmr0Var2.a;
                            Message messageC = ((a5j0) mmr0Var2.b).c();
                            if (messageC == null) {
                                eg.m("Required value was null.");
                                return null;
                            }
                            arrayList3.add(oqn1.n(obj4, messageC));
                        }
                        for (mmr0 mmr0Var3 : arrayList3) {
                            xj61Var.add(new vjc(yhm0.q((gmc) mmr0Var3.a), (Message) mmr0Var3.b, DismissReason.ProgrammaticDismissal.INSTANCE));
                        }
                        return Next.i(klcVarD, cwl1.j(xj61Var));
                    }
                }
            }
        }
        return Next.j();
    }

    public final Next b(klc klcVar, pkc pkcVar) {
        r7j0 r7j0Var = new r7j0(pkcVar, (byte) 13);
        klc klcVarD = jqu.d(jqu.h(klc.a(klcVar, null, 0L, null, null, null, null, null, pkcVar.a, 255), new r7j0(r7j0Var, (byte) 12)), new xy50(pkcVar, (byte) 16), DiscardReason.ContextSwitched.INSTANCE);
        xj61 xj61Var = new xj61();
        Set set = klcVar.e;
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : set) {
            if (((Boolean) r7j0Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (mmr0 mmr0Var : arrayList) {
            xj61Var.addAll(jqu.a((gmc) mmr0Var.a, (a5j0) mmr0Var.b, DiscardReason.ContextSwitched.INSTANCE));
        }
        return Next.i(klcVarD, cwl1.j(xj61Var));
    }

    public final Next c(klc klcVar, qkc qkcVar) {
        Set set = klcVar.e;
        long jB = this.a.b() / 1000;
        ApplicationState applicationState = qkcVar.a;
        if (applicationState == ApplicationState.FOREGROUND && jB - klcVar.c >= klcVar.b) {
            return Next.i(klc.a(klcVar, applicationState, 0L, CacheState.LOADING, null, null, null, null, null, 502), Collections.singleton(akc.b));
        }
        ApplicationState applicationState2 = ApplicationState.BACKGROUND;
        if (applicationState != applicationState2 || set.isEmpty()) {
            return Next.h(klc.a(klcVar, qkcVar.a, 0L, null, null, null, null, null, null, 510));
        }
        kmj0 kmj0Var = kmj0.b1;
        klc klcVarD = jqu.d(jqu.h(klc.a(klcVar, applicationState2, 0L, null, null, null, null, null, null, 510), new nrj0((byte) 2)), kmj0.a1, DiscardReason.AppBackgrounded.INSTANCE);
        xj61 xj61Var = new xj61();
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : set) {
            if (((Boolean) kmj0Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (mmr0 mmr0Var : arrayList) {
            xj61Var.addAll(jqu.a((gmc) mmr0Var.a, (a5j0) mmr0Var.b, DiscardReason.AppBackgrounded.INSTANCE));
        }
        return Next.i(klcVarD, cwl1.j(xj61Var));
    }

    public final Next d(klc klcVar, tkc tkcVar) {
        Set set = klcVar.e;
        if (tkcVar.a != CarConnectionState.CAR_DISCONNECTED) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    Object obj = ((mmr0) it.next()).b;
                    if ((obj instanceof z4j0) || (obj instanceof y4j0)) {
                        kmj0 kmj0Var = kmj0.d1;
                        klc klcVarD = jqu.d(jqu.h(klcVar, new nrj0((byte) 3)), kmj0.c1, DiscardReason.CarConnected.INSTANCE);
                        xj61 xj61Var = new xj61();
                        ArrayList<mmr0> arrayList = new ArrayList();
                        for (Object obj2 : set2) {
                            if (((Boolean) kmj0Var.invoke((mmr0) obj2)).booleanValue()) {
                                arrayList.add(obj2);
                            }
                        }
                        for (mmr0 mmr0Var : arrayList) {
                            xj61Var.addAll(jqu.a((gmc) mmr0Var.a, (a5j0) mmr0Var.b, DiscardReason.CarConnected.INSTANCE));
                        }
                        return Next.i(klcVarD, cwl1.j(xj61Var));
                    }
                }
            }
        }
        return Next.j();
    }

    public final Next e(klc klcVar) {
        Set set = klcVar.h;
        Set set2 = klcVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((mmr0) obj).b instanceof x4j0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gmc) ((mmr0) it.next()).a).a);
        }
        return Next.h(klc.a(klcVar, null, 0L, null, null, null, null, dm61.y0(set, arrayList2), null, 383));
    }

    public final Next f(klc klcVar, ilc ilcVar) {
        Set set = klcVar.e;
        int i = jtj0.a[ilcVar.a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        ktj0 ktj0Var = ktj0.b;
        kmj0 kmj0Var = kmj0.e1;
        ktj0 ktj0Var2 = ktj0.c;
        klc klcVarD = jqu.d(jqu.h(klcVar, new nrj0((byte) 4)), kmj0Var, DiscardReason.UserLoggingOut.INSTANCE);
        xj61 xj61Var = new xj61();
        xj61Var.add(rjc.b);
        Set set2 = set;
        ArrayList<mmr0> arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Boolean) ktj0Var.invoke((mmr0) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (mmr0 mmr0Var : arrayList) {
            xj61Var.addAll(jqu.a((gmc) mmr0Var.a, (a5j0) mmr0Var.b, DiscardReason.UserLoggingOut.INSTANCE));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Boolean) ktj0Var2.invoke((mmr0) obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            xj61Var.add(new qjc(yhm0.q((gmc) ((mmr0) it.next()).a), DismissReason.UserLoggingOut.INSTANCE));
        }
        return Next.i(klcVarD, cwl1.j(xj61Var));
    }
}
