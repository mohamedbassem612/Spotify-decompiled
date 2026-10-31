package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q6y implements p6y, pjl1 {
    public final Object a;

    public q6y(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public WebView H() {
        WebView webViewH = ((pjl1) this.a).H();
        if (webViewH == null) {
            return null;
        }
        WebSettings settings = webViewH.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        return webViewH;
    }

    public synchronized void a() {
        try {
            long j = ((SharedPreferences) this.a).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.a).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public bd30 b() {
        Context context = (Context) this.a;
        String string = context.getString(2131955509);
        dko0 dko0Var = new dko0(context, "CubesPublishing");
        dko0Var.e = dko0.d(string);
        dko0Var.D.icon = 2131233418;
        dko0Var.E = true;
        Notification notificationC = dko0Var.c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            wu7.m();
            notificationManager.createNotificationChannel(new NotificationChannel("CubesPublishing", context.getString(2131955510), 2));
        }
        return i >= 29 ? new bd30(32543, notificationC, 1) : new bd30(32543, notificationC, 0);
    }

    public synchronized void c() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strE = e(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strE)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strE);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList d() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(e(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new z09(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.a).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String e(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public synchronized String f(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void g(String str) {
        try {
            String strF = f(str);
            if (strF == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(strF, new HashSet()));
            hashSet.remove(str);
            boolean zIsEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = (SharedPreferences) this.a;
            if (zIsEmpty) {
                sharedPreferences.edit().remove(strF).commit();
            } else {
                sharedPreferences.edit().putStringSet(strF, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean h(long j) {
        boolean zContains = ((SharedPreferences) this.a).contains("fire-global");
        SharedPreferences sharedPreferences = (SharedPreferences) this.a;
        if (!zContains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (e(j2).equals(e(j))) {
                return false;
            }
            ((SharedPreferences) this.a).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void i(long j, String str) {
        String strE = e(j);
        if (((SharedPreferences) this.a).getString("last-used-date", "").equals(strE)) {
            String strF = f(strE);
            if (strF == null) {
                return;
            }
            if (strF.equals(str)) {
                return;
            }
            j(str, strE);
            return;
        }
        long j2 = ((SharedPreferences) this.a).getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            a();
            j2 = ((SharedPreferences) this.a).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(str, new HashSet()));
        hashSet.add(strE);
        ((SharedPreferences) this.a).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strE).commit();
    }

    public synchronized void j(String str, String str2) {
        g(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.a).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.a).edit().putStringSet(str, hashSet).commit();
    }
}
