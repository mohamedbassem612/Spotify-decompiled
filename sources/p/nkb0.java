package p;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import app.p000rive.semantics.SemanticState;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nkb0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final List l;
    public final String m;
    public final owg1 n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f103p;

    /* JADX WARN: Code duplicated, block: B:15:0x00ba  */
    public nkb0(Bundle bundle, Resources resources) {
        wgz0 wgz0Var;
        this.a = bundle.getString("android.support.customtabs.trusted.DEFAULT_URL");
        int i = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR", R.color.white);
        this.b = i;
        this.c = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR_DARK", i);
        int i2 = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR", R.color.white);
        this.d = i2;
        this.e = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR_DARK", i2);
        this.f = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR", R.color.transparent);
        this.g = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR_DARK", i2);
        boolean z = false;
        this.h = bundle.getInt("android.support.customtabs.trusted.SPLASH_IMAGE_DRAWABLE", 0);
        this.i = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_BACKGROUND_COLOR", R.color.white);
        this.j = bundle.getString("android.support.customtabs.trusted.FILE_PROVIDER_AUTHORITY");
        this.k = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_FADE_OUT_DURATION", 0);
        if (bundle.containsKey("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")) {
            this.l = Arrays.asList(resources.getStringArray(bundle.getInt("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")));
        } else {
            this.l = null;
        }
        this.m = bundle.getString("android.support.customtabs.trusted.FALLBACK_STRATEGY");
        String string = bundle.getString("android.support.customtabs.trusted.DISPLAY_MODE");
        byte b = 11;
        int i3 = 1;
        char c = 1;
        if ("immersive".equals(string)) {
            wgz0Var = new wgz0(b, z);
        } else {
            wgz0Var = "sticky-immersive".equals(string) ? new wgz0(b, c == true ? 1 : 0) : new ejb((byte) 28);
        }
        this.n = wgz0Var;
        String string2 = bundle.getString("android.support.customtabs.trusted.SCREEN_ORIENTATION");
        if (string2 != null) {
            switch (string2) {
                case "portrait-primary":
                    break;
                case "landscape-secondary":
                    i3 = 4;
                    break;
                case "any":
                    i3 = 5;
                    break;
                case "portrait":
                    i3 = 7;
                    break;
                case "landscape":
                    i3 = 6;
                    break;
                case "natural":
                    i3 = 8;
                    break;
                case "landscape-primary":
                    i3 = 3;
                    break;
                case "portrait-secondary":
                    i3 = 2;
                    break;
                default:
                    i3 = 0;
                    break;
            }
        } else {
            i3 = 0;
        }
        this.o = i3;
        int i4 = bundle.getInt("android.support.customtabs.trusted.METADATA_SHARE_TARGET", 0);
        this.f103p = i4 != 0 ? resources.getString(i4) : null;
    }

    public static nkb0 a(Context context) {
        Bundle bundle;
        Resources resources = context.getResources();
        try {
            bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), SemanticState.Focused).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new nkb0(bundle, resources);
    }
}
