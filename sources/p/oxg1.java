package p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oxg1 {
    public static final t8e1 h = new t8e1(10);
    public static final t8e1 i = new t8e1(11);
    public byte a;
    public boolean b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public oxg1(NoAnimLauncherActivity noAnimLauncherActivity) {
        nta ntaVar;
        uf0 uf0Var = new uf0(noAnimLauncherActivity);
        this.c = noAnimLauncherActivity;
        this.g = uf0Var;
        PackageManager packageManager = noAnimLauncherActivity.getPackageManager();
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        listQueryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap map = new HashMap();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.serviceInfo.packageName;
            if (!s9g.a.contains(str2) ? false : s9g.a(packageManager, str2, 362600000)) {
                map.put(str2, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i2 = 1;
                }
                map.put(str2, Integer.valueOf(i2 ^ 1));
            }
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        String str3 = null;
        while (it2.hasNext()) {
            String str4 = it2.next().activityInfo.packageName;
            int iIntValue = map.containsKey(str4) ? ((Integer) map.get(str4)).intValue() : 2;
            if (iIntValue == 0) {
                ntaVar = new nta(0, str4);
                this.d = ntaVar.a;
                this.a = ntaVar.b;
            } else if (iIntValue != 1) {
                if (iIntValue == 2 && str3 == null) {
                    str3 = str4;
                }
            } else if (str == null) {
                str = str4;
            }
        }
        ntaVar = str != null ? new nta(1, str) : new nta(2, str3);
        this.d = ntaVar.a;
        this.a = ntaVar.b;
    }

    public oql a() {
        Intent intent = (Intent) this.c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.b);
        asn asnVar = (asn) this.d;
        Integer num = (Integer) asnVar.a;
        Integer num2 = (Integer) asnVar.b;
        Integer num3 = (Integer) asnVar.c;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num3.intValue());
        }
        intent.putExtras(bundle2);
        Bundle bundle3 = (Bundle) this.g;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        if (((SparseArray) this.f) != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", (SparseArray) this.f);
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", (int) this.a);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            ActivityOptions activityOptionsMakeBasic = (ActivityOptions) this.e;
            if (activityOptionsMakeBasic == null) {
                activityOptionsMakeBasic = ActivityOptions.makeBasic();
                this.e = activityOptionsMakeBasic;
            }
            sf.R(activityOptionsMakeBasic);
        }
        if (i2 >= 36) {
            if (((ActivityOptions) this.e) == null) {
                this.e = ActivityOptions.makeBasic();
            }
            hg.j((ActivityOptions) this.e, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.e;
        return new oql(intent, activityOptions != null ? activityOptions.toBundle() : null, (byte) 18);
    }

    public void b(pwg1 pwg1Var, gv40 gv40Var) {
        wzn wznVar;
        if (this.b || (wznVar = (wzn) this.f) == null) {
            return;
        }
        oxg1 oxg1Var = pwg1Var.b;
        Intent intent = (Intent) oxg1Var.c;
        intent.setPackage(((ComponentName) wznVar.c).getPackageName());
        hro hroVar = (hro) wznVar.b;
        PendingIntent pendingIntent = (PendingIntent) wznVar.d;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", hroVar);
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        intent.putExtras(bundle);
        Intent intent2 = (Intent) oxg1Var.a().b;
        intent2.setData(pwg1Var.a);
        intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (pwg1Var.c != null) {
            intent2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(pwg1Var.c));
        }
        Bundle bundle2 = pwg1Var.d;
        if (bundle2 != null) {
            intent2.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle2);
        }
        List list = Collections.EMPTY_LIST;
        y441 y441Var = pwg1Var.f;
        if (y441Var != null && pwg1Var.e != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("androidx.browser.trusted.sharing.KEY_ACTION", (String) y441Var.a);
            bundle3.putString("androidx.browser.trusted.sharing.KEY_METHOD", (String) y441Var.b);
            bundle3.putString("androidx.browser.trusted.sharing.KEY_ENCTYPE", (String) y441Var.c);
            q371 q371Var = (q371) y441Var.d;
            Bundle bundle4 = new Bundle();
            bundle4.putString("androidx.browser.trusted.sharing.KEY_TITLE", q371Var.a);
            bundle4.putString("androidx.browser.trusted.sharing.KEY_TEXT", q371Var.b);
            List<nn71> list2 = q371Var.c;
            if (list2 != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (nn71 nn71Var : list2) {
                    nn71Var.getClass();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("androidx.browser.trusted.sharing.KEY_FILE_NAME", nn71Var.a);
                    bundle5.putStringArrayList("androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES", new ArrayList<>(nn71Var.b));
                    arrayList.add(bundle5);
                }
                bundle4.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_FILES", arrayList);
            }
            bundle3.putBundle("androidx.browser.trusted.sharing.KEY_PARAMS", bundle4);
            intent2.putExtra("androidx.browser.trusted.extra.SHARE_TARGET", bundle3);
            q371 q371Var2 = pwg1Var.e;
            q371Var2.getClass();
            Bundle bundle6 = new Bundle();
            bundle6.putString("androidx.browser.trusted.sharing.KEY_TITLE", q371Var2.a);
            bundle6.putString("androidx.browser.trusted.sharing.KEY_TEXT", q371Var2.b);
            List list3 = q371Var2.c;
            if (list3 != null) {
                bundle6.putParcelableArrayList("androidx.browser.trusted.sharing.KEY_URIS", new ArrayList<>(list3));
            }
            intent2.putExtra("androidx.browser.trusted.extra.SHARE_DATA", bundle6);
            List list4 = pwg1Var.e.c;
            if (list4 != null) {
                list = list4;
            }
        }
        List list5 = Collections.EMPTY_LIST;
        intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", pwg1Var.g.a());
        intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", pwg1Var.h);
        intent2.putExtra("androidx.browser.trusted.extra.LAUNCH_HANDLER_CLIENT_MODE", 0);
        NoAnimLauncherActivity noAnimLauncherActivity = (NoAnimLauncherActivity) this.c;
        Boolean bool = ox20.a;
        Intent intent3 = new Intent(noAnimLauncherActivity, (Class<?>) ox20.class);
        Boolean boolValueOf = ox20.a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(intent3.resolveActivityInfo(noAnimLauncherActivity.getPackageManager(), 0) != null);
            ox20.a = boolValueOf;
        }
        if (!Boolean.FALSE.equals(boolValueOf)) {
            intent3.setFlags(268435456);
            intent2.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(noAnimLauncherActivity, 0, intent3, 67108864));
        }
        NoAnimLauncherActivity noAnimLauncherActivity2 = (NoAnimLauncherActivity) this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            noAnimLauncherActivity2.grantUriPermission(intent2.getPackage(), (Uri) it.next(), 1);
        }
        Iterator it2 = Collections.EMPTY_LIST.iterator();
        while (it2.hasNext()) {
            noAnimLauncherActivity2.grantUriPermission(intent2.getPackage(), (Uri) it2.next(), 3);
        }
        noAnimLauncherActivity2.startActivity(intent2, null);
        gv40Var.run();
    }

    public void c(int i2) {
        if (i2 < 0 || i2 > 2) {
            hhg1.n("Invalid value for the colorScheme argument");
        } else {
            ((Intent) this.c).putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i2);
        }
    }

    public void d(int i2, wzn wznVar) {
        if (i2 < 0 || i2 > 2 || i2 == 0) {
            hhg1.n(f4i1.c(i2, "Invalid colorScheme: "));
            return;
        }
        SparseArray sparseArray = (SparseArray) this.f;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.f = sparseArray;
        }
        Bundle bundle = new Bundle();
        Integer num = (Integer) wznVar.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) wznVar.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) wznVar.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = (Integer) wznVar.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        sparseArray.put(i2, bundle);
    }

    public void e() {
        ((Intent) this.c).putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", true);
    }

    public void f() {
        Intent intent = (Intent) this.c;
        this.a = (byte) 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    public void g() {
        ((Intent) this.c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    public void h(int i2) {
        ((asn) this.d).a = Integer.valueOf(i2 | (-16777216));
    }

    public void i() {
        ((Intent) this.c).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
    }

    public oxg1() {
        this.c = new Intent("android.intent.action.VIEW");
        this.d = new asn();
        this.a = (byte) 0;
        this.b = true;
    }

    public oxg1(wzn wznVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.c = intent;
        this.d = new asn();
        this.a = (byte) 0;
        this.b = true;
        if (wznVar != null) {
            intent.setPackage(((ComponentName) wznVar.c).getPackageName());
            hro hroVar = (hro) wznVar.b;
            PendingIntent pendingIntent = (PendingIntent) wznVar.d;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", hroVar);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
