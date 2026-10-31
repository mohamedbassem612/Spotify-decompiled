package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vbf implements nwy0 {
    public final Context a;
    public final yqg b;
    public final vno0 c;
    public final lb d;
    public final rut0 e;
    public final mvy0 f;

    public vbf(Context context, yqg yqgVar, vno0 vno0Var, lb lbVar, l7c l7cVar, rut0 rut0Var, mvy0 mvy0Var) {
        this.a = context;
        this.b = yqgVar;
        this.c = vno0Var;
        this.d = lbVar;
        this.e = rut0Var;
        this.f = mvy0Var;
    }

    public final void b(tbf tbfVar, dko0 dko0Var, String str, Bitmap bitmap, mrs0 mrs0Var) {
        String strM = l1d.m("CHAT_", tbfVar.c);
        t081 t081Var = new t081();
        t081Var.a = this.a;
        t081Var.b = strM;
        t081Var.l = true;
        t081Var.e = str;
        t081Var.h = IconCompat.c(bitmap);
        t081Var.c = new Intent[]{new Intent("android.intent.action.VIEW", Uri.parse(tbfVar.a.c))};
        t081Var.i = new mrs0[]{mrs0Var};
        if (TextUtils.isEmpty(t081Var.e)) {
            hhg1.n("Shortcut must have a non-empty label");
            return;
        }
        Intent[] intentArr = t081Var.c;
        if (intentArr == null || intentArr.length == 0) {
            hhg1.n("Shortcut must have an intent");
            return;
        }
        if (t081Var.k == null) {
            t081Var.k = new rre0(t081Var.b);
        }
        t081Var.l = true;
        lb lbVar = this.d;
        List listB = lbVar.b();
        if (listB != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (nhc1.Y(((t081) obj).b, "CHAT_", false)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                Context context = lbVar.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((t081) it.next()).b);
                }
                w081.v(context, arrayList2);
            }
        }
        if (lbVar.c(t081Var)) {
            dko0Var.z = strM;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef A[LOOP:0: B:38:0x00d0->B:43:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217 A[LOOP:1: B:72:0x0211->B:74:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(tbf tbfVar, onm onmVar) throws Throwable {
        ubf ubfVar;
        int iN;
        c561 c561Var;
        String str;
        Uri uri;
        mrs0 mrs0Var;
        q520 q520Var;
        String str2;
        mrs0 mrs0Var2;
        vxi0 vxi0Var;
        String str3;
        cvy0 cvy0Var;
        String str4;
        String str5;
        Iterator it;
        Notification notification;
        qko0 qko0Var;
        yqg yqgVar;
        dko0 dko0Var;
        qko0 qko0Var2;
        vxi0 vxi0Var2;
        vbf vbfVar;
        Iterator it2;
        glo0 glo0VarC;
        StatusBarNotification statusBarNotification;
        tbf tbfVar2 = tbfVar;
        if (onmVar instanceof ubf) {
            ubfVar = (ubf) onmVar;
            int i = ubfVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubfVar.g = i - Integer.MIN_VALUE;
            } else {
                ubfVar = new ubf(this, onmVar);
            }
        } else {
            ubfVar = new ubf(this, onmVar);
        }
        ubf ubfVar2 = ubfVar;
        Object objB = ubfVar2.e;
        int i2 = ubfVar2.g;
        if (i2 == 0) {
            hm5.M(objB);
            cvy0 cvy0Var2 = tbfVar2.h;
            iN = l7c.n(cvy0Var2.a, cvy0Var2.d);
            vxi0 vxi0Var3 = tbfVar2.b;
            if (vxi0Var3 instanceof uxi0) {
                c561Var = ((uxi0) vxi0Var3).a;
            } else {
                if (!(vxi0Var3 instanceof txi0)) {
                    eg.o();
                    return null;
                }
                c561Var = ((txi0) vxi0Var3).a;
            }
            str = c561Var.a;
            IconCompat iconCompatC = IconCompat.c(c561Var.c);
            String str6 = c561Var.b;
            mrs0 mrs0Var3 = new mrs0();
            mrs0Var3.a = str;
            mrs0Var3.b = iconCompatC;
            mrs0Var3.c = null;
            mrs0Var3.d = str6;
            mrs0Var3.e = false;
            mrs0Var3.f = true;
            khh0 khh0Var = tbfVar2.d;
            if (khh0Var != null) {
                int iC = l1d.C(khh0Var.b);
                if (iC == 0) {
                    q520Var = q520.GIF;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    q520Var = q520.IMAGE;
                }
                q520 q520Var2 = q520Var;
                String str7 = tbfVar2.c;
                String str8 = khh0Var.a;
                ubfVar2.a = tbfVar2;
                ubfVar2.b = str;
                ubfVar2.c = mrs0Var3;
                ubfVar2.d = iN;
                ubfVar2.g = 1;
                objB = this.f.b(str7, iN, str8, q520Var2, ubfVar2);
                Object obj = d9n.a;
                if (objB == obj) {
                    return obj;
                }
                str2 = str;
                mrs0Var2 = mrs0Var3;
            } else {
                uri = null;
                mrs0Var = mrs0Var3;
            }
            ujo0 ujo0Var = tbfVar2.a;
            vxi0Var = tbfVar2.b;
            str3 = tbfVar2.c;
            cvy0Var = tbfVar2.h;
            str4 = ujo0Var.a;
            str5 = ujo0Var.b;
            vno0 vno0Var = this.c;
            it = ljo1.q(vno0Var.b).iterator();
            while (true) {
                if (it.hasNext()) {
                    notification = null;
                    break;
                }
                statusBarNotification = (StatusBarNotification) it.next();
                if (u890.j(statusBarNotification.getNotification().getGroup(), str3)) {
                    notification = statusBarNotification.getNotification();
                    break;
                }
            }
            if (notification != null) {
                glo0VarC = glo0.c(notification);
                if (glo0VarC instanceof qko0) {
                    qko0Var = (qko0) glo0VarC;
                } else {
                    qko0Var = null;
                }
                if (qko0Var == null) {
                    qko0Var = new qko0(mrs0Var);
                }
            } else {
                qko0Var = new qko0(mrs0Var);
                qko0Var.h = str4;
            }
            yqgVar = this.b;
            if (uri != null) {
                if (str5.length() > 0) {
                    qko0Var.f(new pko0(str5, yqgVar.d().getTimeInMillis(), mrs0Var));
                }
                pko0 pko0Var = new pko0("", yqgVar.d().getTimeInMillis(), mrs0Var);
                pko0Var.e = "image/*";
                pko0Var.f = uri;
                qko0Var.f(pko0Var);
            } else {
                vxi0Var = vxi0Var;
                cvy0Var = cvy0Var;
                qko0Var.f(new pko0(str5, yqgVar.d().getTimeInMillis(), mrs0Var));
            }
            Context context = this.a;
            dko0Var = new dko0(context, "NOTIFICATION_CHANNEL_MESSAGES");
            dko0Var.e = dko0.d(ujo0Var.a);
            dko0Var.f = dko0.d(ujo0Var.b);
            dko0Var.r(qko0Var);
            Notification notification2 = dko0Var.D;
            notification2.icon = 2131233418;
            qko0Var2 = qko0Var;
            notification2.when = yqgVar.d().getTimeInMillis();
            dko0Var.s = "msg";
            dko0Var.j = 2;
            dko0Var.q = str3;
            dko0Var.l(16, true);
            if (mrs0Var != null) {
                dko0Var.c.add(mrs0Var);
            }
            dko0Var.u = context.getColor(2131101551);
            notification2.deleteIntent = (PendingIntent) tbfVar2.e.invoke(new Integer(iN));
            dko0Var.g = (PendingIntent) tbfVar2.f.invoke(new Integer(iN));
            dko0Var.t = tbfVar2.g;
            cvy0 cvy0Var3 = cvy0Var;
            t3p1.u(dko0Var, v1p1.h(tbfVar2), cvy0Var3);
            vxi0Var2 = vxi0Var;
            if (vxi0Var2 instanceof uxi0) {
                b(tbfVar2, dko0Var, str, ((uxi0) vxi0Var2).a.c, mrs0Var);
            }
            if (vxi0Var2 instanceof txi0) {
                qko0Var2.i = Boolean.TRUE;
                txi0 txi0Var = (txi0) vxi0Var2;
                String str9 = txi0Var.b;
                qko0Var2.h = str9;
                Bitmap bitmap = txi0Var.c;
                vbfVar = this;
                vbfVar.b(tbfVar2, dko0Var, str9, bitmap, mrs0Var);
            } else {
                vbfVar = this;
            }
            it2 = vbfVar.e.h(iN, ujo0Var.c, cvy0Var3, tbfVar2.i).iterator();
            while (it2.hasNext()) {
                dko0Var.b((xjo0) it2.next());
            }
            vno0Var.a(iN, dko0Var.c());
            return new gs50(new v5w0(iN, 0), cvy0Var3, v1p1.h(tbfVar2));
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = ubfVar2.d;
        mrs0Var2 = ubfVar2.c;
        str2 = ubfVar2.b;
        tbf tbfVar3 = ubfVar2.a;
        hm5.M(objB);
        iN = i3;
        tbfVar2 = tbfVar3;
        uri = (Uri) objB;
        mrs0Var = mrs0Var2;
        str = str2;
        ujo0 ujo0Var2 = tbfVar2.a;
        vxi0Var = tbfVar2.b;
        str3 = tbfVar2.c;
        cvy0Var = tbfVar2.h;
        str4 = ujo0Var2.a;
        str5 = ujo0Var2.b;
        vno0 vno0Var2 = this.c;
        it = ljo1.q(vno0Var2.b).iterator();
        while (true) {
            if (it.hasNext()) {
                notification = null;
                break;
            }
            statusBarNotification = (StatusBarNotification) it.next();
            if (u890.j(statusBarNotification.getNotification().getGroup(), str3)) {
                notification = statusBarNotification.getNotification();
                break;
            }
        }
        if (notification != null) {
            glo0VarC = glo0.c(notification);
            if (glo0VarC instanceof qko0) {
                qko0Var = (qko0) glo0VarC;
            } else {
                qko0Var = null;
            }
            if (qko0Var == null) {
                qko0Var = new qko0(mrs0Var);
            }
        } else {
            qko0Var = new qko0(mrs0Var);
            qko0Var.h = str4;
        }
        yqgVar = this.b;
        if (uri != null) {
            if (str5.length() > 0) {
                qko0Var.f(new pko0(str5, yqgVar.d().getTimeInMillis(), mrs0Var));
            }
            pko0 pko0Var2 = new pko0("", yqgVar.d().getTimeInMillis(), mrs0Var);
            pko0Var2.e = "image/*";
            pko0Var2.f = uri;
            qko0Var.f(pko0Var2);
        } else {
            vxi0Var = vxi0Var;
            cvy0Var = cvy0Var;
            qko0Var.f(new pko0(str5, yqgVar.d().getTimeInMillis(), mrs0Var));
        }
        Context context2 = this.a;
        dko0Var = new dko0(context2, "NOTIFICATION_CHANNEL_MESSAGES");
        dko0Var.e = dko0.d(ujo0Var2.a);
        dko0Var.f = dko0.d(ujo0Var2.b);
        dko0Var.r(qko0Var);
        Notification notification3 = dko0Var.D;
        notification3.icon = 2131233418;
        qko0Var2 = qko0Var;
        notification3.when = yqgVar.d().getTimeInMillis();
        dko0Var.s = "msg";
        dko0Var.j = 2;
        dko0Var.q = str3;
        dko0Var.l(16, true);
        if (mrs0Var != null) {
            dko0Var.c.add(mrs0Var);
        }
        dko0Var.u = context2.getColor(2131101551);
        notification3.deleteIntent = (PendingIntent) tbfVar2.e.invoke(new Integer(iN));
        dko0Var.g = (PendingIntent) tbfVar2.f.invoke(new Integer(iN));
        dko0Var.t = tbfVar2.g;
        cvy0 cvy0Var4 = cvy0Var;
        t3p1.u(dko0Var, v1p1.h(tbfVar2), cvy0Var4);
        vxi0Var2 = vxi0Var;
        if (vxi0Var2 instanceof uxi0) {
            b(tbfVar2, dko0Var, str, ((uxi0) vxi0Var2).a.c, mrs0Var);
        }
        if (vxi0Var2 instanceof txi0) {
            qko0Var2.i = Boolean.TRUE;
            txi0 txi0Var2 = (txi0) vxi0Var2;
            String str10 = txi0Var2.b;
            qko0Var2.h = str10;
            Bitmap bitmap2 = txi0Var2.c;
            vbfVar = this;
            vbfVar.b(tbfVar2, dko0Var, str10, bitmap2, mrs0Var);
        } else {
            vbfVar = this;
        }
        it2 = vbfVar.e.h(iN, ujo0Var2.c, cvy0Var4, tbfVar2.i).iterator();
        while (it2.hasNext()) {
            dko0Var.b((xjo0) it2.next());
        }
        vno0Var2.a(iN, dko0Var.c());
        return new gs50(new v5w0(iN, 0), cvy0Var4, v1p1.h(tbfVar2));
    }
}
