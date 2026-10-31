package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xg61 {
    public static final p8u0 k;
    public static final xg61 l;
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f169p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final p8u0 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        p8u0 p8u0Var = new p8u0(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = p8u0Var;
        l = new xg61(p8u0Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = zoi1.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        f169p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public xg61(p8u0 p8u0Var, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        dm5.m(z == (p8u0Var.h != -1));
        this.a = p8u0Var;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public static xg61 b(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(m);
        return new xg61(bundle2 == null ? k : p8u0.c(i, bundle2), bundle.getBoolean(n, false), bundle.getLong(o, -9223372036854775807L), bundle.getLong(f169p, -9223372036854775807L), bundle.getLong(q, 0L), bundle.getInt(r, 0), bundle.getLong(s, 0L), bundle.getLong(t, -9223372036854775807L), bundle.getLong(u, -9223372036854775807L), bundle.getLong(v, 0L));
    }

    public final xg61 a(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new xg61(this.a.b(z, z2), z && this.b, this.c, z ? this.d : -9223372036854775807L, z ? this.e : 0L, z ? this.f : 0, z ? this.g : 0L, z ? this.h : -9223372036854775807L, z ? this.i : -9223372036854775807L, z ? this.j : 0L);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        p8u0 p8u0Var = this.a;
        if (i < 3 || !k.a(p8u0Var)) {
            bundle.putBundle(m, p8u0Var.d(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(f169p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i >= 3 && j7 == 0) {
            return bundle;
        }
        bundle.putLong(v, j7);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xg61.class == obj.getClass()) {
            xg61 xg61Var = (xg61) obj;
            if (this.c == xg61Var.c && this.a.equals(xg61Var.a) && this.b == xg61Var.b && this.d == xg61Var.d && this.e == xg61Var.e && this.f == xg61Var.f && this.g == xg61Var.g && this.h == xg61Var.h && this.i == xg61Var.i && this.j == xg61Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        p8u0 p8u0Var = this.a;
        sb.append(p8u0Var.b);
        sb.append(", periodIndex=");
        sb.append(p8u0Var.e);
        sb.append(", positionMs=");
        sb.append(p8u0Var.f);
        sb.append(", contentPositionMs=");
        sb.append(p8u0Var.g);
        sb.append(", adGroupIndex=");
        sb.append(p8u0Var.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(p8u0Var.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return pze0.h(this.j, "}", sb);
    }
}
