package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import com.facebook.FacebookException;
import j$.net.URLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class fpi1 {
    public static volatile int a = 0;
    public static volatile long b = -1;
    public static volatile long c = -1;
    public static volatile long d = -1;
    public static volatile String e = "";
    public static volatile String f = "";
    public static volatile String g = "NoCarrier";
    public static volatile String h = "";
    public static volatile Locale i;

    public static final ArrayList A(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final HashMap B(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String C(Map map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static final boolean D(Context context) {
        AutofillManager autofillManagerI;
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerI = qpp0.i(context.getSystemService(qpp0.k()))) != null && autofillManagerI.isAutofillSupported() && autofillManagerI.isEnabled();
    }

    public static final Bundle E(String str) {
        Bundle bundle = new Bundle();
        if (!y(str)) {
            if (str == null) {
                eg.m("Required value was null.");
                return null;
            }
            for (String str2 : (String[]) ihc1.Q0(str, new String[]{"&"}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) ihc1.Q0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    wf10 wf10Var = wf10.a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(Bundle bundle, JSONArray jSONArray) {
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final HashMap G(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    public static final String H(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    String string = sb.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static Intent I(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i2) {
        return (i2 & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, x74.b0(context), handler) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler, i2 & 1);
    }

    public static void J(MenuItem menuItem, char c2, int i2) {
        menuItem.setAlphabeticShortcut(c2, i2);
    }

    public static final void K(JSONObject jSONObject, Context context) throws JSONException {
        Locale locale;
        int i2;
        int i3;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i4 = 0;
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                f = timeZone.getID();
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                wf10 wf10Var = wf10.a;
            }
            if (g.equals("NoCarrier")) {
                try {
                    g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                } catch (Exception unused3) {
                    wf10 wf10Var2 = wf10.a;
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                c = Math.round(c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i5 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i5 = packageInfo.versionCode;
            h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        i = locale;
        Locale locale2 = i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        StringBuilder sb = new StringBuilder(language);
        sb.append('_');
        Locale locale3 = i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i6 = displayMetrics.widthPixels;
                try {
                    i4 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i2 = i4;
                i4 = i6;
            } else {
                i2 = 0;
            }
        } catch (Exception unused9) {
        }
        jSONArray.put(i4);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        if (a > 0) {
            i3 = a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles((FilenameFilter) new yin((byte) 5));
                if (fileArrListFiles != null) {
                    a = fileArrListFiles.length;
                }
            } catch (Exception unused10) {
                wf10 wf10Var3 = wf10.a;
            }
            if (a <= 0) {
                a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i3 = a;
        }
        jSONArray.put(i3);
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static void L(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void M(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void N(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void O(MenuItem menuItem, char c2, int i2) {
        menuItem.setNumericShortcut(c2, i2);
    }

    public static void P(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static final String Q(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(nne.a);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static void R(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final void S(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        Iterator itJ = xcg1.j(parcel, map);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof String) {
                builder.appendQueryParameter(str3, (String) obj);
            }
        }
        return builder.build();
    }

    public static void b(String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) ihc1.Q0(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) ihc1.Q0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = u890.q(str3.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i2, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void c(Context context) {
        try {
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String d(String str) {
        return y(str) ? "" : str;
    }

    public static final HashSet e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(jSONArray.getString(i2));
        }
        return hashSet;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    Object objG = jSONObject.get(string);
                    if (objG instanceof JSONObject) {
                        objG = g((JSONObject) objG);
                    }
                    map.put(string, objG);
                } catch (JSONException unused) {
                    wf10 wf10Var = wf10.a;
                }
            }
        }
        return map;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 == -1) {
                    bufferedInputStream.close();
                    return i2;
                }
                filterOutputStream.write(bArr, 0, i3);
                i2 += i3;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final void j(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final int l(Bitmap bitmap) {
        int i2;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i2 = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i2 = 2;
                } else {
                    i2 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
                }
                return height * i2;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final String m(Context context) {
        try {
            wf10 wf10Var = wf10.a;
            w0h1.H();
            String str = wf10.e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            return i2 == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date n(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject o() {
        if (dhn.a.contains(fpi1.class)) {
            return null;
        }
        try {
            String string = wf10.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    wf10 wf10Var = wf10.a;
                }
            }
            return null;
        } catch (Throwable th) {
            dhn.a(fpi1.class, th);
            return null;
        }
    }

    public static md50 p(String str) {
        String str2;
        Bundle bundle = new Bundle();
        Date date = xd.Y;
        xd xdVarS = fuo1.s();
        if (xdVarS == null || (str2 = xdVarS.X) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", str2.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        md50 md50Var = new md50(null, "me", null, null, new km5((byte) 1), 32);
        md50Var.d = bundle;
        md50Var.h = a370.a;
        return md50Var;
    }

    public static final Method q(String str, String str2, Class... clsArr) {
        try {
            Class<?> cls = Class.forName(str);
            Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
            return cls.getMethod(str2, (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Object r(String str, String str2, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    public static final Object s(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean t() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{wf10.b()}, 1))));
            Context contextA = wf10.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (u890.j(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean u(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && Pattern.compile(".+_cheets|cheets_.+").matcher(str).matches();
    }

    public static final boolean v() {
        if (!dhn.a.contains(fpi1.class)) {
            try {
                JSONObject jSONObjectO = o();
                if (jSONObjectO != null) {
                    try {
                        JSONArray jSONArray = jSONObjectO.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            if (jSONArray.getString(i2).toLowerCase().equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        wf10 wf10Var = wf10.a;
                    }
                }
            } catch (Throwable th) {
                dhn.a(fpi1.class, th);
                return false;
            }
        }
        return false;
    }

    public static boolean w(Context context) {
        Method methodQ = q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = s(null, methodQ, context);
            if ((objS instanceof Integer) && objS.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final boolean y(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean z(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }
}
