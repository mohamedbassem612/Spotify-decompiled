package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class q7g0 extends Activity {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r2.queryIntentServices(r5, 64).size() > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity r7, java.lang.String r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 >= r1) goto L7
            return
        L7:
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r7.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            java.lang.String r4 = "android.support.customtabs.action.SITE_SETTINGS_SHORTCUT"
            if (r8 != 0) goto L19
            goto Lae
        L19:
            java.util.List r5 = p.s9g.a
            boolean r5 = r5.contains(r8)
            if (r5 != 0) goto L23
            r5 = 0
            goto L2a
        L23:
            r5 = 362600000(0x159cd640, float:6.3345925E-26)
            boolean r5 = p.s9g.a(r2, r8, r5)
        L2a:
            if (r5 == 0) goto L2d
            goto L48
        L2d:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.support.customtabs.action.CustomTabsService"
            r5.<init>(r6)
            java.lang.String r6 = "androidx.browser.trusted.category.LaunchSiteSettings"
            r5.addCategory(r6)
            r5.setPackage(r8)
            r8 = 64
            java.util.List r8 = r2.queryIntentServices(r5, r8)
            int r8 = r8.size()
            if (r8 <= 0) goto Lae
        L48:
            r8 = 0
            if (r0 >= r1) goto L4c
            goto L9c
        L4c:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<p.q7g0> r1 = p.q7g0.class
            r0.<init>(r7, r1)
            java.lang.String r1 = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA"
            r0.setAction(r1)
            r1 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r2.queryIntentActivities(r0, r1)
            int r1 = r1.size()
            if (r1 != 0) goto L65
            goto L9c
        L65:
            android.content.res.Resources r8 = r7.getResources()
            java.lang.String r1 = "drawable"
            java.lang.String r2 = r7.getPackageName()
            java.lang.String r5 = "drawable/override_ic_site_settings"
            int r8 = r8.getIdentifier(r5, r1, r2)
            android.content.pm.ShortcutInfo$Builder r1 = new android.content.pm.ShortcutInfo$Builder
            r1.<init>(r7, r4)
            java.lang.String r2 = "Site Settings"
            android.content.pm.ShortcutInfo$Builder r1 = r1.setShortLabel(r2)
            java.lang.String r2 = "Manage website notifications, permissions, etc."
            android.content.pm.ShortcutInfo$Builder r1 = r1.setLongLabel(r2)
            if (r8 == 0) goto L89
            goto L8c
        L89:
            r8 = 2131233385(0x7f080a69, float:1.8082906E38)
        L8c:
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r7, r8)
            android.content.pm.ShortcutInfo$Builder r7 = r1.setIcon(r7)
            android.content.pm.ShortcutInfo$Builder r7 = r7.setIntent(r0)
            android.content.pm.ShortcutInfo r8 = r7.build()
        L9c:
            if (r8 != 0) goto La6
            java.util.List r7 = java.util.Collections.singletonList(r4)
            r3.removeDynamicShortcuts(r7)
            return
        La6:
            java.util.List r7 = java.util.Collections.singletonList(r8)
            r3.addDynamicShortcuts(r7)
            return
        Lae:
            java.util.List r7 = java.util.Collections.singletonList(r4)
            r3.removeDynamicShortcuts(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q7g0.a(com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity, java.lang.String):void");
    }
}
