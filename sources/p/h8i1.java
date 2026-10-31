package p;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h8i1 {
    public static SharedPreferences b;
    public static final h8i1 a = new h8i1();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = e;
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = tmj0.d;
            HashSet hashSet = new HashSet();
            Iterator it = tmj0.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((tmj0) it.next()).c());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final synchronized void b() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(wf10.a());
            b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                u890.C("sharedPreferences");
                throw null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            d.putAll(fpi1.B(string));
            e.putAll(fpi1.B(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final String c(String str, String str2) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = u890.q(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            if ("em".equals(str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
            } else {
                if ("ph".equals(str)) {
                    return Pattern.compile("[^0-9]").matcher(lowerCase).replaceAll("");
                }
                if ("ge".equals(str)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    return ("f".equals(strSubstring) || "m".equals(strSubstring)) ? strSubstring : "";
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }
}
