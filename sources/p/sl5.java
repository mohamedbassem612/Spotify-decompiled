package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sl5 {
    public static WeakReference b;
    public static final sl5 a = new sl5();
    public static final pl5 c = new pl5();
    public static final idd1 d = new idd1(ql5.a);

    public static void a(Context context, nl5 nl5Var, String str) {
        String[] strArr = str.equals("delete") ? new String[]{"requestedContextType", "contextId"} : new String[]{"requestedContextType", "contextId", "createTime", "lastUpdatedTime"};
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            if (!nl5Var.hasValue$continuity_release(str2)) {
                throw new InvalidParameterException(u890.A(":missing when sending app context", str2));
            }
        }
        if (!nhc1.Y(nl5Var.getContextId(), context.getApplicationContext().getPackageName(), false)) {
            throw new InvalidParameterException("contextId:invalid when sending app context");
        }
    }

    public static void b(Context context, nl5 nl5Var, eg70 eg70Var, String str) {
        String string;
        m231 m231Var;
        m231 m231Var2 = rih1.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("app_context_pref", 0);
        WeakReference weakReference = new WeakReference(eg70Var);
        if (nl5Var.getType() != 0) {
            string = sharedPreferences.getString(String.valueOf(nl5Var.getType()), null);
        } else {
            int i = sharedPreferences.getInt("requestedContextType", 2);
            nl5Var.setType(i);
            string = sharedPreferences.getString(String.valueOf(i), null);
        }
        String str2 = string;
        if (str2 == null) {
            throw new InvalidParameterException("contentProviderUri:missing when sending app context");
        }
        try {
            a(context, nl5Var, str);
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        cte0 cte0Var = cte0.a;
        if (thA != null) {
            String message = thA.getMessage();
            message.getClass();
            cte0Var.e("AppContextManager", message, thA);
            ynm ynmVar = (eg70) weakReference.get();
            if (ynmVar == null) {
                return;
            }
            ynmVar.a(nl5Var, thA);
            return;
        }
        nl5Var.setAction$continuity_release(str);
        String string2 = sharedPreferences.getString(nl5Var.getType() + "triggerType", "RecentTask");
        string2.getClass();
        nl5Var.setTriggerType$continuity_release(string2);
        nl5Var.setVersion$continuity_release(sharedPreferences.getBoolean("using_legacy_mode", false) ? 1.0d : 3.0d);
        Long l = (!nl5Var.hasValue$continuity_release("lifeTime") ? nl5Var : null) == null ? null : 2592000000L;
        nl5Var.setLifeTime(l == null ? nl5Var.getLifeTime() : l.longValue());
        String packageName = (!nl5Var.hasValue$continuity_release("packageName") ? nl5Var : null) == null ? null : context.getPackageName();
        if (packageName == null) {
            packageName = nl5Var.getAppId();
        }
        nl5Var.setAppId(packageName);
        if (!str.equals("delete")) {
            try {
                c(nl5Var);
            } catch (Throwable th2) {
                m231Var2 = new m231(th2);
            }
            Throwable thA2 = e331.a(m231Var2);
            if (thA2 != null) {
                String message2 = thA2.getMessage();
                message2.getClass();
                cte0Var.e("AppContextManager", message2, thA2);
                ynm ynmVar2 = (eg70) weakReference.get();
                if (ynmVar2 == null) {
                    return;
                }
                ynmVar2.a(nl5Var, thA2);
                return;
            }
        }
        c921.y((c9n) d.getValue(), (o8n) null, 0, new rl5(context, str2, nl5Var, weakReference, (lnm) null), 3);
    }

    public static void c(nl5 nl5Var) {
        long lastUpdatedTime = nl5Var.getLastUpdatedTime();
        long lifeTime = nl5Var.getLifeTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lifeTime < 0 || lastUpdatedTime + lifeTime >= jCurrentTimeMillis) {
            return;
        }
        StringBuilder sbS = cy30.s(lastUpdatedTime, "lastUpdatedTime:invalid timestamp. The context has already expired (lastUpdatedTime + lifeTime < currentTime). lastUpdatedTime=", ", lifeTime=");
        sbS.append(lifeTime);
        sbS.append(", currentTime=");
        sbS.append(jCurrentTimeMillis);
        sbS.append('.');
        throw new InvalidParameterException(sbS.toString());
    }

    public void deInitialize(Context context) {
        b = new WeakReference(null);
        context.getApplicationContext().unregisterReceiver(c);
    }

    public void deleteAppContext(Context context, String str, eg70 eg70Var) {
        nl5 nl5Var = new nl5();
        nl5Var.setContextId(str);
        b(context, nl5Var, eg70Var, "delete");
    }

    public final dg70 getAppContextEventHandler$continuity_release() {
        WeakReference weakReference = b;
        if (weakReference == null) {
            return null;
        }
        return (dg70) weakReference.get();
    }

    public void initialize(Context context, dg70 dg70Var) {
        String str;
        b = new WeakReference(dg70Var);
        tl5 tl5Var = ul5.a;
        Context applicationContext = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.microsoft.crossdevice.appcontextrequest");
        tl5Var.registerReceiver(applicationContext, c, intentFilter, 2);
        Context applicationContext2 = context.getApplicationContext();
        int mataDataInt = tl5Var.getMataDataInt(applicationContext2, "com.microsoft.crossdevice.trigger.PartnerApp");
        boolean z = false;
        SharedPreferences sharedPreferences = applicationContext2.getSharedPreferences("app_context_pref", 0);
        for (String str2 : cjy0.a.getTYPE_MAP().keySet()) {
            cjy0 cjy0Var = cjy0.a;
            Integer num = cjy0Var.getTYPE_MAP().get(str2);
            num.getClass();
            int iIntValue = num.intValue() & mataDataInt;
            Integer num2 = cjy0Var.getTYPE_MAP().get(str2);
            if (num2 != null && iIntValue == num2.intValue()) {
                z = true;
                str = "PartnerApp";
            } else {
                str = "RecentTask";
            }
            sharedPreferences.edit().putString(cjy0Var.getTYPE_MAP().get(str2) + "triggerType", str).apply();
        }
        if (z) {
            Intent intent = new Intent();
            intent.setAction("com.microsoft.crossdevice.ACTION_PARTNER_APP_TRIGGER");
            intent.putExtra("partnerPackage", applicationContext2.getPackageName());
            applicationContext2.sendBroadcast(intent);
            cte0.a.i("AppContextManager", "Sent trigger broadcast");
        }
    }

    public void sendAppContext(Context context, nl5 nl5Var, eg70 eg70Var) {
        b(context, nl5Var, eg70Var, "upsert");
    }
}
