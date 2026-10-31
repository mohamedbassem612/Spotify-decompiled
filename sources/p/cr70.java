package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cr70 implements nwy0 {
    public final /* synthetic */ byte a;
    public final Context b;
    public final yqg c;
    public final vno0 d;
    public final rut0 e;

    public /* synthetic */ cr70(Context context, yqg yqgVar, vno0 vno0Var, l7c l7cVar, rut0 rut0Var, byte b) {
        this.a = b;
        this.b = context;
        this.c = yqgVar;
        this.d = vno0Var;
        this.e = rut0Var;
    }

    public final Object a(rxd1 rxd1Var, onm onmVar) {
        Long l;
        byte b = this.a;
        vno0 vno0Var = this.d;
        rut0 rut0Var = this.e;
        yqg yqgVar = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                br70 br70Var = (br70) rxd1Var;
                cvy0 cvy0Var = br70Var.i;
                int iN = l7c.n(cvy0Var.a, cvy0Var.d);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131625082);
                remoteViews.setTextViewText(2131428798, br70Var.c);
                remoteViews.setTextViewText(2131428797, br70Var.d);
                remoteViews.setTextViewText(2131428793, br70Var.e);
                remoteViews.setTextViewText(2131428794, br70Var.f);
                Bitmap bitmap = br70Var.b;
                remoteViews.setImageViewBitmap(2131428795, bitmap);
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), 2131625083);
                ujo0 ujo0Var = br70Var.a;
                String str = ujo0Var.a;
                remoteViews2.setTextViewText(2131428118, str);
                String str2 = ujo0Var.b;
                remoteViews2.setTextViewText(2131428117, str2);
                remoteViews2.setImageViewBitmap(2131428116, bitmap);
                dko0 dko0Var = new dko0(context, "NOTIFICATION_CHANNEL_DEFAULT");
                dko0Var.e = dko0.d(str);
                dko0Var.f = dko0.d(str2);
                dko0Var.r(new iko0());
                dko0Var.x = remoteViews;
                dko0Var.w = remoteViews2;
                Notification notification = dko0Var.D;
                notification.icon = 2131233418;
                notification.when = yqgVar.d().getTimeInMillis();
                dko0Var.l(16, true);
                dko0Var.u = context.getColor(2131101551);
                notification.deleteIntent = (PendingIntent) br70Var.g.invoke(new Integer(iN));
                dko0Var.g = (PendingIntent) br70Var.h.invoke(new Integer(iN));
                t3p1.u(dko0Var, v1p1.h(br70Var), cvy0Var);
                Iterator it = rut0Var.h(iN, ujo0Var.c, cvy0Var, br70Var.j).iterator();
                while (it.hasNext()) {
                    dko0Var.b((xjo0) it.next());
                }
                vno0Var.a(iN, dko0Var.c());
                return new gs50(new v5w0(iN, 0), cvy0Var, v1p1.h(br70Var));
            case 1:
                return b((g080) rxd1Var, onmVar);
            case 2:
                cai0 cai0Var = (cai0) rxd1Var;
                cvy0 cvy0Var2 = cai0Var.i;
                int iN2 = l7c.n(cvy0Var2.a, cvy0Var2.d);
                RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), 2131625213);
                ujo0 ujo0Var2 = cai0Var.a;
                String str3 = ujo0Var2.a;
                remoteViews3.setTextViewText(2131431221, str3);
                String str4 = ujo0Var2.b;
                remoteViews3.setTextViewText(2131431220, str4);
                remoteViews3.setTextViewText(2131429950, cai0Var.c);
                remoteViews3.setTextViewText(2131429949, cai0Var.d);
                Bitmap bitmap2 = cai0Var.b;
                remoteViews3.setImageViewBitmap(2131429939, bitmap2);
                remoteViews3.setImageViewBitmap(2131429932, cai0Var.e);
                remoteViews3.setOnClickPendingIntent(2131429932, (PendingIntent) cai0Var.h.invoke(Integer.valueOf(iN2)));
                RemoteViews remoteViews4 = new RemoteViews(context.getPackageName(), 2131625214);
                remoteViews4.setTextViewText(2131431219, str3);
                remoteViews4.setTextViewText(2131431218, str4);
                remoteViews4.setImageViewBitmap(2131429935, bitmap2);
                dko0 dko0Var2 = new dko0(context, "NOTIFICATION_CHANNEL_DEFAULT");
                dko0Var2.e = dko0.d(str3);
                dko0Var2.f = dko0.d(str4);
                dko0Var2.r(new iko0());
                dko0Var2.x = remoteViews3;
                dko0Var2.w = remoteViews4;
                Notification notification2 = dko0Var2.D;
                notification2.icon = 2131233418;
                notification2.when = yqgVar.d().getTimeInMillis();
                dko0Var2.l(16, true);
                dko0Var2.u = context.getColor(2131101551);
                notification2.deleteIntent = (PendingIntent) cai0Var.f.invoke(new Integer(iN2));
                dko0Var2.g = (PendingIntent) cai0Var.g.invoke(new Integer(iN2));
                t3p1.u(dko0Var2, v1p1.h(cai0Var), cvy0Var2);
                Iterator it2 = rut0Var.h(iN2, ujo0Var2.c, cvy0Var2, cai0Var.j).iterator();
                while (it2.hasNext()) {
                    dko0Var2.b((xjo0) it2.next());
                }
                vno0Var.a(iN2, dko0Var2.c());
                return new gs50(new v5w0(iN2, 0), cvy0Var2, v1p1.h(cai0Var));
            default:
                jx81 jx81Var = (jx81) rxd1Var;
                cvy0 cvy0Var3 = jx81Var.d;
                int iN3 = l7c.n(cvy0Var3.a, cvy0Var3.d);
                dko0 dko0Var3 = new dko0(context, "NOTIFICATION_CHANNEL_DEFAULT");
                ujo0 ujo0Var3 = jx81Var.a;
                dko0Var3.e = dko0.d(ujo0Var3.a);
                String str5 = ujo0Var3.b;
                dko0Var3.f = dko0.d(str5);
                cko0 cko0Var = new cko0(false);
                cko0Var.f = dko0.d(str5);
                dko0Var3.r(cko0Var);
                Notification notification3 = dko0Var3.D;
                notification3.icon = 2131233418;
                notification3.when = yqgVar.d().getTimeInMillis();
                dko0Var3.l(16, true);
                dko0Var3.u = context.getColor(2131101551);
                notification3.deleteIntent = (PendingIntent) jx81Var.b.invoke(new Integer(iN3));
                dko0Var3.g = (PendingIntent) jx81Var.c.invoke(new Integer(iN3));
                t3p1.u(dko0Var3, v1p1.h(jx81Var), cvy0Var3);
                atk atkVar = jx81Var.f;
                if (atkVar != null && (l = atkVar.a) != null) {
                    dko0Var3.A = l.longValue();
                }
                Iterator it3 = rut0Var.h(iN3, ujo0Var3.c, cvy0Var3, jx81Var.e).iterator();
                while (it3.hasNext()) {
                    dko0Var3.b((xjo0) it3.next());
                }
                vno0Var.a(iN3, dko0Var3.c());
                return new gs50(new v5w0(iN3, jx81Var.g), cvy0Var3, v1p1.h(jx81Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c A[LOOP:0: B:32:0x0126->B:34:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(g080 g080Var, onm onmVar) {
        h080 h080Var;
        int iN;
        dko0 dko0Var;
        bko0 bko0Var;
        Object objInvoke;
        dko0 dko0Var2;
        bko0 bko0Var2;
        atk atkVar;
        Iterator it;
        Long l;
        if (onmVar instanceof h080) {
            h080Var = (h080) onmVar;
            int i = h080Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                h080Var.g = i - Integer.MIN_VALUE;
            } else {
                h080Var = new h080(this, onmVar);
            }
        } else {
            h080Var = new h080(this, onmVar);
        }
        Object obj = h080Var.e;
        int i2 = h080Var.g;
        Uri uri = null;
        if (i2 == 0) {
            hm5.M(obj);
            cvy0 cvy0Var = g080Var.f;
            ujo0 ujo0Var = g080Var.a;
            iN = l7c.n(cvy0Var.a, cvy0Var.d);
            Context context = this.b;
            dko0Var = new dko0(context, "NOTIFICATION_CHANNEL_DEFAULT");
            String str = ujo0Var.a;
            String str2 = ujo0Var.b;
            dko0Var.e = dko0.d(str);
            dko0Var.f = dko0.d(str2);
            dko0Var.m(g080Var.b);
            Notification notification = dko0Var.D;
            notification.icon = 2131233418;
            notification.when = this.c.d().getTimeInMillis();
            dko0Var.l(16, true);
            dko0Var.u = context.getColor(2131101551);
            notification.deleteIntent = (PendingIntent) g080Var.d.invoke(new Integer(iN));
            dko0Var.g = (PendingIntent) g080Var.e.invoke(new Integer(iN));
            t3p1.u(dko0Var, v1p1.h(g080Var), g080Var.f);
            bko0Var = new bko0();
            ((glo0) bko0Var).b = dko0.d(ujo0Var.a);
            ((glo0) bko0Var).c = dko0.d(str2);
            ((glo0) bko0Var).d = true;
            vu30 vu30Var = g080Var.c;
            if (vu30Var != null) {
                Integer num = new Integer(iN);
                h080Var.a = g080Var;
                h080Var.b = dko0Var;
                h080Var.c = bko0Var;
                h080Var.d = iN;
                h080Var.g = 1;
                objInvoke = vu30Var.invoke(num, h080Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                dko0Var2 = dko0Var;
                bko0Var2 = bko0Var;
            }
            if (uri != null) {
                bko0Var.h(g080Var.b);
            } else if (Build.VERSION.SDK_INT >= 31) {
                Icon iconCreateWithContentUri = Icon.createWithContentUri(uri);
                bko0Var.getClass();
                PorterDuff.Mode mode = IconCompat.k;
                bko0Var.e = xzo1.j(iconCreateWithContentUri);
            }
            dko0Var.r(bko0Var);
            atkVar = g080Var.h;
            cvy0 cvy0Var2 = g080Var.f;
            if (atkVar != null && (l = atkVar.a) != null) {
                dko0Var.A = l.longValue();
            }
            it = this.e.h(iN, g080Var.a.c, cvy0Var2, g080Var.g).iterator();
            while (it.hasNext()) {
                dko0Var.b((xjo0) it.next());
            }
            this.d.a(iN, dko0Var.c());
            return new gs50(new v5w0(iN, 0), cvy0Var2, v1p1.h(g080Var));
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = h080Var.d;
        bko0Var2 = h080Var.c;
        dko0Var2 = h080Var.b;
        g080 g080Var2 = h080Var.a;
        hm5.M(obj);
        iN = i3;
        g080Var = g080Var2;
        objInvoke = obj;
        bko0Var = bko0Var2;
        dko0Var = dko0Var2;
        uri = (Uri) objInvoke;
        if (uri != null) {
            bko0Var.h(g080Var.b);
        } else if (Build.VERSION.SDK_INT >= 31) {
            Icon iconCreateWithContentUri2 = Icon.createWithContentUri(uri);
            bko0Var.getClass();
            PorterDuff.Mode mode2 = IconCompat.k;
            bko0Var.e = xzo1.j(iconCreateWithContentUri2);
        }
        dko0Var.r(bko0Var);
        atkVar = g080Var.h;
        cvy0 cvy0Var3 = g080Var.f;
        if (atkVar != null) {
            dko0Var.A = l.longValue();
        }
        it = this.e.h(iN, g080Var.a.c, cvy0Var3, g080Var.g).iterator();
        while (it.hasNext()) {
            dko0Var.b((xjo0) it.next());
        }
        this.d.a(iN, dko0Var.c());
        return new gs50(new v5w0(iN, 0), cvy0Var3, v1p1.h(g080Var));
    }

    public /* synthetic */ cr70(vno0 vno0Var, l7c l7cVar, Context context, yqg yqgVar, rut0 rut0Var, byte b) {
        this.a = b;
        this.d = vno0Var;
        this.b = context;
        this.c = yqgVar;
        this.e = rut0Var;
    }
}
