package p;

import android.service.notification.StatusBarNotification;
import com.spotify.messages.PushNotificationsRemovalV1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gwy0 {
    public final vno0 a;
    public final rvy0 b;
    public final cpr c;

    public gwy0(vno0 vno0Var, rvy0 rvy0Var, cpr cprVar) {
        this.a = vno0Var;
        this.b = rvy0Var;
        this.c = cprVar;
    }

    public final Object a(String str, List list, int i) {
        ic21 ic21Var;
        Object next;
        String str2;
        String str3;
        String str4;
        boolean zJ;
        if (list.isEmpty()) {
            return z6x.a;
        }
        List<StatusBarNotification> listQ = ljo1.q(this.a.b);
        ArrayList<xno0> arrayList = new ArrayList(q7h.U(listQ, 10));
        for (StatusBarNotification statusBarNotification : listQ) {
            statusBarNotification.getClass();
            arrayList.add(new xno0(statusBarNotification.getId(), statusBarNotification.getNotification().extras.getString("NOTIFICATION_EXTRAS_COLLAPSE_KEY"), statusBarNotification.getNotification().extras.getString("NOTIFICATION_EXTRAS_URI"), statusBarNotification.getNotification().extras.getString("NOTIFICATION_EXTRAS_APP_DEVICE_ID"), statusBarNotification.getNotification().extras.getString("NOTIFICATION_EXTRAS_MESSAGE_ID"), statusBarNotification.getNotification().extras.getString("NOTIFICATION_EXTRAS_OPPORTUNITY_ID")));
        }
        ArrayList arrayList2 = new ArrayList();
        for (xno0 xno0Var : arrayList) {
            Iterator it = list.iterator();
            do {
                ic21Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                kwy0 kwy0Var = (kwy0) next;
                String str5 = xno0Var.c;
                if (kwy0Var instanceof hwy0) {
                    zJ = u890.j(xno0Var.b, ((hwy0) kwy0Var).a);
                } else if (kwy0Var instanceof iwy0) {
                    zJ = u890.j(str5, ((iwy0) kwy0Var).a);
                } else {
                    if (!(kwy0Var instanceof jwy0)) {
                        eg.o();
                        return null;
                    }
                    zJ = str5 != null && nhc1.Y(str5, ((jwy0) kwy0Var).a, false);
                }
            } while (!zJ);
            kwy0 kwy0Var2 = (kwy0) next;
            if (kwy0Var2 != null) {
                this.b.a(xno0Var.a);
                String str6 = xno0Var.f;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = xno0Var.d;
                if (str7 == null) {
                    str7 = "";
                }
                boolean z = kwy0Var2 instanceof hwy0;
                String str8 = "uri_prefix";
                if (z) {
                    str2 = "collapse_id";
                } else if (kwy0Var2 instanceof iwy0) {
                    str2 = "uri";
                } else {
                    if (!(kwy0Var2 instanceof jwy0)) {
                        eg.o();
                        return null;
                    }
                    str2 = "uri_prefix";
                }
                if (i == 1) {
                    str3 = "client_api";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str3 = "silent_push";
                }
                if (z) {
                    str8 = "collapse_id";
                } else if (kwy0Var2 instanceof iwy0) {
                    str8 = "uri";
                } else if (!(kwy0Var2 instanceof jwy0)) {
                    eg.o();
                    return null;
                }
                if (z) {
                    str4 = ((hwy0) kwy0Var2).a;
                } else if (kwy0Var2 instanceof iwy0) {
                    str4 = ((iwy0) kwy0Var2).a;
                } else {
                    if (!(kwy0Var2 instanceof jwy0)) {
                        eg.o();
                        return null;
                    }
                    str4 = ((jwy0) kwy0Var2).a;
                }
                Map mapSingletonMap = Collections.singletonMap(str8, str4);
                String str9 = xno0Var.e;
                String str10 = str9 != null ? str9 : "";
                t2j0 t2j0Var = this.c.a;
                rwy0 rwy0VarO = PushNotificationsRemovalV1.o();
                rwy0VarO.s(str6);
                rwy0VarO.q(str7);
                rwy0VarO.u(str2);
                rwy0VarO.t(str3);
                rwy0VarO.v(str);
                rwy0VarO.n(mapSingletonMap);
                rwy0VarO.r(str10);
                t2j0Var.a(rwy0VarO.build());
                ic21Var = new ic21(xno0Var.a, xno0Var.c, kwy0Var2);
            }
            if (ic21Var != null) {
                arrayList2.add(ic21Var);
            }
        }
        return arrayList2;
    }
}
