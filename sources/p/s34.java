package p;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s34 implements pe {
    public final kly0 a;
    public final ContentResolver b;
    public final AccessibilityManager c;

    public s34(Context context, caq caqVar) {
        this.a = caqVar;
        this.b = context.getContentResolver();
        this.c = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final float a() {
        return Settings.System.getFloat(this.b, "font_scale", 1.0f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b(int i) throws NoWhenBranchMatchedException {
        switch (l1d.C(i)) {
            case 0:
            case 1:
                return true;
            case 2:
                return f("animator_duration_scale") && f("transition_animation_scale");
            case 3:
            case 4:
            case 5:
                a811 a811VarL = mta.l(Integer.valueOf(((men0) this.a.get()).a.l(men0.c, -1)));
                if (u890.j(a811VarL, y711.a)) {
                    return f("animator_duration_scale");
                }
                if (!u890.j(a811VarL, z711.a)) {
                    eg.o();
                    return false;
                }
            case 6:
                return f("animator_duration_scale");
            default:
                eg.o();
                return false;
        }
    }

    public final float c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Settings.Secure.getFloat(this.b, "accessibility_non_interactive_ui_timeout_ms", 0.0f);
        }
        return 0.0f;
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT >= 29 && Settings.Secure.getFloat(this.b, "accessibility_non_interactive_ui_timeout_ms", 0.0f) > 0.0f;
    }

    public final boolean e() {
        return this.c.isTouchExplorationEnabled();
    }

    public final boolean f(String str) {
        return !(Settings.Global.getFloat(this.b, str, 1.0f) == 0.0f);
    }
}
