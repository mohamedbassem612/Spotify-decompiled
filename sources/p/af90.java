package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class af90 implements ty31 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ af90(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final rqg0 a(Message message, gmc gmcVar, klc klcVar) {
        FormatType formatType;
        FormatType formatType2;
        byte b = this.a;
        Object obj = this.b;
        vy31 vy31Var = vy31.f;
        switch (b) {
            case 0:
                return ((ji5) obj).a > 0 ? vy31Var : new wy31(null);
            default:
                if (gmcVar.i == ConflictResolutionStrategy.DISMISS_OTHER) {
                    return vy31Var;
                }
                Set set = klcVar.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    mmr0 mmr0Var = (mmr0) obj2;
                    a5j0 a5j0Var = (a5j0) mmr0Var.b;
                    a5j0Var.getClass();
                    if (!(a5j0Var instanceof x4j0)) {
                        a5j0 a5j0Var2 = (a5j0) mmr0Var.b;
                        a5j0Var2.getClass();
                        if (a5j0Var2 instanceof y4j0) {
                        }
                    }
                    arrayList.add(obj2);
                }
                dqu dquVar = (dqu) obj;
                FormatType formatTypeB = yhm0.b(message);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LoggingData loggingDataB = ((a5j0) ((mmr0) it.next()).b).b();
                    FormatType formatType3 = loggingDataB != null ? loggingDataB.getFormatType() : null;
                    if (formatType3 != null) {
                        arrayList2.add(formatType3);
                    }
                }
                w7x w7xVar = (Set) ((Map) dquVar.b).get(formatTypeB);
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (w7xVar.contains((FormatType) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                Set setP1 = o7h.p1(arrayList3);
                if (setP1.isEmpty()) {
                    return vy31Var;
                }
                Set<FormatType> set2 = setP1;
                ArrayList arrayList4 = new ArrayList(q7h.U(set2, 10));
                String str = "";
                for (FormatType formatType4 : set2) {
                    ArrayList<mmr0> arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        LoggingData loggingDataB2 = ((a5j0) ((mmr0) obj4).b).b();
                        if ((loggingDataB2 != null ? loggingDataB2.getFormatType() : null) == formatType4) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                    for (mmr0 mmr0Var2 : arrayList5) {
                        Object obj5 = mmr0Var2.b;
                        Object obj6 = mmr0Var2.a;
                        a5j0 a5j0Var3 = (a5j0) obj5;
                        a5j0Var3.getClass();
                        if (a5j0Var3 instanceof x4j0) {
                            LoggingData loggingDataB3 = ((a5j0) obj5).b();
                            String strName = (loggingDataB3 == null || (formatType2 = loggingDataB3.getFormatType()) == null) ? null : formatType2.name();
                            str = ((Object) str) + "Presenting formats: " + strName + " (oppId: " + ((gmc) obj6).a + "), ";
                        }
                        a5j0 a5j0Var4 = (a5j0) obj5;
                        a5j0Var4.getClass();
                        if (a5j0Var4 instanceof y4j0) {
                            LoggingData loggingDataB4 = a5j0Var4.b();
                            String strName2 = (loggingDataB4 == null || (formatType = loggingDataB4.getFormatType()) == null) ? null : formatType.name();
                            str = ((Object) str) + "Inflight selected formats: " + strName2 + " (oppId: " + ((gmc) obj6).a + "), ";
                        }
                        arrayList6.add(rih1.a);
                    }
                    arrayList4.add(arrayList6);
                }
                return new wy31(ihc1.m0(2, str));
        }
    }

    public final void dispose() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }
}
