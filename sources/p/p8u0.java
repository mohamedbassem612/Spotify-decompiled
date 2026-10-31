package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p8u0 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f111p;
    public final Object a;
    public final int b;
    public final yoh0 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        String str = zoi1.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        f111p = Integer.toString(6, 36);
    }

    public p8u0(Object obj, int i, yoh0 yoh0Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        dm5.m(i >= 0);
        dm5.m(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = yoh0Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public static p8u0 c(int i, Bundle bundle) {
        int iMax = Math.max(0, bundle.getInt(j, 0));
        Bundle bundle2 = bundle.getBundle(k);
        return new p8u0(null, iMax, bundle2 == null ? null : yoh0.b(i, bundle2), null, Math.max(0, bundle.getInt(l, 0)), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(f111p, -1));
    }

    public final boolean a(p8u0 p8u0Var) {
        return this.b == p8u0Var.b && this.e == p8u0Var.e && this.f == p8u0Var.f && this.g == p8u0Var.g && this.h == p8u0Var.h && this.i == p8u0Var.i && Objects.equals(this.c, p8u0Var.c);
    }

    public final p8u0 b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new p8u0(this.a, z2 ? this.b : 0, z ? this.c : null, this.d, z2 ? this.e : 0, z ? this.f : 0L, z ? this.g : 0L, z ? this.h : -1, z ? this.i : -1);
    }

    public final Bundle d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        yoh0 yoh0Var = this.c;
        if (yoh0Var != null) {
            bundle.putBundle(k, yoh0Var.e(i, false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(f111p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p8u0.class == obj.getClass()) {
            p8u0 p8u0Var = (p8u0) obj;
            if (a(p8u0Var) && Objects.equals(this.a, p8u0Var.a) && Objects.equals(this.d, p8u0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        StringBuilder sbG = dv20.g(str, ", contentPos=");
        sbG.append(this.g);
        sbG.append(", adGroup=");
        sbG.append(i);
        sbG.append(", ad=");
        sbG.append(this.i);
        return sbG.toString();
    }
}
