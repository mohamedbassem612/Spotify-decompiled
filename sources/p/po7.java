package p;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class po7 {
    public static final po7 i = new wa().a();
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f93p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = zoi1.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        f93p = Integer.toString(6, 36);
    }

    public po7(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static po7 a(Bundle bundle) {
        wa waVar = new wa();
        String str = j;
        if (bundle.containsKey(str)) {
            waVar.c(bundle.getInt(str));
        }
        String str2 = k;
        if (bundle.containsKey(str2)) {
            waVar.d(bundle.getInt(str2));
        }
        String str3 = l;
        if (bundle.containsKey(str3)) {
            waVar.h(bundle.getInt(str3));
        }
        String str4 = m;
        if (bundle.containsKey(str4)) {
            waVar.b(bundle.getInt(str4));
        }
        String str5 = n;
        if (bundle.containsKey(str5)) {
            waVar.g(bundle.getInt(str5));
        }
        String str6 = o;
        if (bundle.containsKey(str6)) {
            waVar.f(bundle.getBoolean(str6));
        }
        String str7 = f93p;
        if (bundle.containsKey(str7)) {
            waVar.e(bundle.getBoolean(str7));
        }
        return waVar.a();
    }

    public static po7 b(AudioAttributes audioAttributes) {
        wa waVar = new wa();
        waVar.c(audioAttributes.getContentType());
        waVar.d(audioAttributes.getFlags());
        waVar.h(audioAttributes.getUsage());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            waVar.b(audioAttributes.getAllowedCapturePolicy());
            waVar.e(audioAttributes.areHapticChannelsMuted());
        }
        if (i2 >= 32) {
            waVar.g(audioAttributes.getSpatializationBehavior());
            waVar.f(audioAttributes.isContentSpatialized());
        }
        return waVar.a();
    }

    public final AudioAttributes c() {
        AudioAttributes audioAttributes = this.h;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            x74.j0(usage, this.d);
            x74.h(usage, this.g);
        }
        if (i2 >= 32) {
            oo7.b(usage, this.e);
            oo7.a(usage, this.f);
        }
        AudioAttributes audioAttributesBuild = usage.build();
        this.h = audioAttributesBuild;
        return audioAttributesBuild;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        int i2 = this.a;
        if (i2 != 0) {
            bundle.putInt(j, i2);
        }
        int i3 = this.b;
        if (i3 != 0) {
            bundle.putInt(k, i3);
        }
        int i4 = this.c;
        if (i4 != 1) {
            bundle.putInt(l, i4);
        }
        int i5 = this.d;
        if (i5 != 1) {
            bundle.putInt(m, i5);
        }
        int i6 = this.e;
        if (i6 != 0) {
            bundle.putInt(n, i6);
        }
        boolean z = this.f;
        if (z) {
            bundle.putBoolean(o, z);
        }
        boolean z2 = this.g;
        if (!z2) {
            bundle.putBoolean(f93p, z2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && po7.class == obj.getClass()) {
            po7 po7Var = (po7) obj;
            if (this.a == po7Var.a && this.b == po7Var.b && this.c == po7Var.c && this.d == po7Var.d && this.e == po7Var.e && this.f == po7Var.f && this.g == po7Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
