package p;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ly9 {
    public final Object a;
    public final Object b;

    public /* synthetic */ ly9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(onm onmVar) {
        owt owtVar;
        int i;
        z6x z6xVar;
        Context context = (Context) this.a;
        if (onmVar instanceof owt) {
            owtVar = (owt) onmVar;
            int i2 = owtVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                owtVar.c = i2 - Integer.MIN_VALUE;
            } else {
                owtVar = new owt(this, onmVar);
            }
        } else {
            owtVar = new owt(this, onmVar);
        }
        Object obj = owtVar.a;
        int i3 = owtVar.c;
        int i4 = 5;
        if (i3 == 0) {
            hm5.M(obj);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            owtVar.c = 1;
            int iOrdinal = ((dto0) this.b).d.m().ordinal();
            if (iOrdinal == 0) {
                i = 4;
            } else if (iOrdinal == 1) {
                i = 2;
            } else if (iOrdinal == 2) {
                i = 5;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
                i = 3;
            } else if (Build.VERSION.SDK_INT >= 33) {
                i = 6;
            } else {
                i = 4;
            }
            if (Build.VERSION.SDK_INT < 26) {
                z6xVar = z6x.a;
            } else {
                List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
                z6x arrayList = new ArrayList(q7h.U(notificationChannels, 10));
                for (NotificationChannel notificationChannel : notificationChannels) {
                    arrayList.add(new wjo0(notificationChannel.getId(), notificationChannel.getImportance() != 0 ? 2 : 3, notificationChannel.getImportance()));
                }
                z6xVar = arrayList;
            }
            d9n ato0Var = new ato0(i, z6xVar);
            d9n d9nVar = d9n.a;
            if (ato0Var == d9nVar) {
                return d9nVar;
            }
            obj = ato0Var;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ato0 ato0Var2 = (ato0) obj;
        if (Build.VERSION.SDK_INT < 28) {
            i4 = 1;
        } else {
            Object systemService = context.getSystemService("usagestats");
            UsageStatsManager usageStatsManager = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
            if (usageStatsManager == null) {
                i4 = 1;
            } else {
                try {
                    int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    if (appStandbyBucket == 10) {
                        i4 = 2;
                    } else if (appStandbyBucket == 20) {
                        i4 = 3;
                    } else if (appStandbyBucket == 30) {
                        i4 = 4;
                    } else if (appStandbyBucket != 40) {
                        if (appStandbyBucket != 45) {
                            i4 = 1;
                        } else {
                            i4 = 6;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return new gwt(ato0Var2, Build.VERSION.SDK_INT < 30 ? 1 : 3, i4);
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 28) {
            boolean zIsBackgroundRestricted = ((ActivityManager) this.a).isBackgroundRestricted();
            ix7 ix7Var = (ix7) this.b;
            oy9 oy9Var = (oy9) ix7Var.c;
            if (!zIsBackgroundRestricted) {
                hma1 hma1VarEdit = oy9Var.b.edit();
                hma1VarEdit.c(oy9.c, 0L);
                hma1VarEdit.b(oy9.d, 1);
                hma1VarEdit.g();
                return;
            }
            dma1 dma1Var = oy9Var.b;
            yqg yqgVar = oy9Var.a;
            long jB = yqgVar.b();
            bma1 bma1Var = oy9.c;
            if (jB >= dma1Var.g(bma1Var, 0L)) {
                long jB2 = yqgVar.b();
                bma1 bma1Var2 = oy9.d;
                int iL = dma1Var.l(bma1Var2, 1);
                long millis = TimeUnit.DAYS.toMillis(iL > 2 ? 7 : 1) + jB2;
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.c(bma1Var, millis);
                hma1VarEdit2.b(bma1Var2, iL + 1);
                hma1VarEdit2.g();
                Activity activity = (Activity) ix7Var.b;
                mw40 mw40VarT = yoi1.T(activity, activity.getString(2131952703), activity.getString(2131952702));
                String string = activity.getString(2131952701);
                ny9 ny9Var = new ny9(ix7Var, (byte) 0);
                mw40VarT.b = string;
                mw40VarT.d = ny9Var;
                String string2 = activity.getString(2131952700);
                ny9 ny9Var2 = new ny9(ix7Var, (byte) 1);
                mw40VarT.a = string2;
                mw40VarT.c = ny9Var2;
                mw40VarT.b().b();
                it8 it8Var = (it8) ix7Var.d;
                i8h1 i8h1Var = (i8h1) it8Var.b;
                py9 py9Var = (py9) it8Var.c;
                r6h1 r6h1Var = py9Var.b;
                y6h1 y6h1Var = py9Var.c;
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("dismiss_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var2.a(), (Set) null);
            }
        }
    }
}
