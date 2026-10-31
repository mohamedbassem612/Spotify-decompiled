package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class flr {
    public final p7s a;
    public final String b;
    public final ilr c;
    public final g0l d;

    public flr(p7s p7sVar, String str, ilr ilrVar, g0l g0lVar) {
        this.a = p7sVar;
        this.b = str;
        this.c = ilrVar;
        this.d = g0lVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da A[LOOP:3: B:37:0x00c3->B:41:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de A[SYNTHETIC] */
    public final void a(pr31 pr31Var, String str) {
        iwh0 iwh0Var;
        Object next;
        lwh0 lwh0Var = pr31Var.l;
        String str2 = pr31Var.a;
        p7s p7sVar = this.a;
        p7sVar.c();
        owh0.b();
        ArrayList<sn50> arrayListM0 = irn1.m0(p7sVar.f, owh0.c().e());
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM0.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = ((sn50) it.next()).c;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((pr31) it2.next()).a);
            }
            r7h.W(arrayList3, arrayList);
        }
        boolean zContains = arrayList.contains(str2);
        ilr ilrVar = this.c;
        if (zContains) {
            ilrVar.b(m4e.X);
        } else {
            sn50 sn50VarO = e130.o(pr31Var, this.b);
            if (sn50VarO != null) {
                iwh0 iwh0Var2 = sn50VarO.d;
                if (iwh0Var2 == null) {
                    eg.m("Required value was null.");
                    return;
                } else if (iwh0Var2.n()) {
                    ilrVar.b(m4e.Y);
                }
            }
        }
        if (arrayList.contains(str2)) {
            Iterator it3 = this.d.i().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!u890.j(((l0l) next).d(), str));
            l0l l0lVar = (l0l) next;
            if (l0lVar == null || !l0lVar.isActive()) {
                arrayListM0.size();
                for (sn50 sn50Var : arrayListM0) {
                    String str3 = sn50Var.b;
                    Objects.toString(sn50Var.c);
                    iwh0Var = sn50Var.d;
                    if (iwh0Var != null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    iwh0Var.a();
                }
                if (lwh0Var != null) {
                    eg.m("Required value was null.");
                    return;
                }
                lwh0Var.a();
            }
        } else {
            arrayListM0.size();
            while (r11.hasNext()) {
                String str4 = sn50Var.b;
                Objects.toString(sn50Var.c);
                iwh0Var = sn50Var.d;
                if (iwh0Var != null) {
                    eg.m("Required value was null.");
                    return;
                }
                iwh0Var.a();
            }
            if (lwh0Var != null) {
                eg.m("Required value was null.");
                return;
            }
            lwh0Var.a();
        }
        if (lwh0Var != null) {
            lwh0Var.a.d.e();
        }
        if (lwh0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        owh0.b();
        kv40 kv40VarC = owh0.c();
        HashMap map = kv40VarC.j;
        Context context = kv40VarC.g;
        cv40 cv40Var = kv40VarC.a;
        if (kv40VarC.i.contains(lwh0Var)) {
            boolean z = lwh0Var.g;
            String str5 = lwh0Var.c;
            if (!z) {
                lwh0Var.toString();
                cv40Var.getClass();
                Message messageObtainMessage = cv40Var.obtainMessage(266, new iv40(lwh0Var, null));
                messageObtainMessage.arg1 = 3;
                messageObtainMessage.sendToTarget();
            } else if (kv40VarC.d == lwh0Var) {
                lwh0Var.toString();
                cv40Var.getClass();
                Message messageObtainMessage2 = cv40Var.obtainMessage(266, new iv40(lwh0Var, null));
                messageObtainMessage2.arg1 = 4;
                messageObtainMessage2.sendToTarget();
            } else {
                kwh0 kwh0Var = lwh0Var.a;
                jqd0 jqd0Var = kwh0Var.e;
                if (jqd0Var == null || !jqd0Var.C()) {
                    kwh0Var.toString();
                    cv40Var.getClass();
                    Message messageObtainMessage3 = cv40Var.obtainMessage(266, new iv40(lwh0Var, null));
                    messageObtainMessage3.arg1 = 5;
                    messageObtainMessage3.sendToTarget();
                } else if (!map.containsKey(str5)) {
                    rvh0 rvh0VarB = lwh0Var.b();
                    String str6 = lwh0Var.b;
                    Bundle bundle = new Bundle();
                    bundle.putString("clientPackageName", context.getPackageName());
                    mvh0 mvh0VarB = rvh0VarB.b(str6, new ovh0(bundle));
                    if (mvh0VarB == null) {
                        lwh0Var.toString();
                        cv40Var.getClass();
                        Message messageObtainMessage4 = cv40Var.obtainMessage(266, new iv40(lwh0Var, null));
                        messageObtainMessage4.arg1 = 6;
                        messageObtainMessage4.sendToTarget();
                    } else {
                        hv40 hv40Var = new hv40(kv40VarC, lwh0Var, mvh0VarB);
                        mvh0VarB.o(x74.N(context), hv40Var);
                        mvh0VarB.f();
                        hv40Var.d.postDelayed(hv40Var.e, 20000L);
                        map.put(str5, hv40Var);
                    }
                }
            }
        } else {
            Objects.toString(lwh0Var);
            cv40Var.getClass();
            Message messageObtainMessage5 = cv40Var.obtainMessage(266, new iv40(lwh0Var, null));
            messageObtainMessage5.arg1 = 2;
            messageObtainMessage5.sendToTarget();
        }
        ilrVar.b(m4e.t);
    }
}
