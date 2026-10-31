package p;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a7n1 implements xug {
    public final Application a;

    public a7n1(Application application) {
        this.a = application;
    }

    @Override // p.xug
    public final Float a() {
        try {
            return Float.valueOf(Settings.System.getFloat(this.a.getContentResolver(), "font_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.xug
    public final Float b() {
        try {
            return Float.valueOf(Settings.Global.getFloat(this.a.getContentResolver(), "transition_animation_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.xug
    public final String c() {
        try {
            int i = Build.VERSION.SDK_INT;
            Application application = this.a;
            return i >= 31 ? String.valueOf(Settings.System.getInt(application.getContentResolver(), "time_12_24", 12)) : Settings.System.getString(application.getContentResolver(), "date_format");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.xug
    public final Float d() {
        try {
            return Float.valueOf(Settings.Global.getFloat(this.a.getContentResolver(), "window_animation_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.xug
    public final Integer f() {
        try {
            return Integer.valueOf(Settings.System.getInt(this.a.getContentResolver(), "screen_off_timeout"));
        } catch (Exception unused) {
            return null;
        }
    }
}
