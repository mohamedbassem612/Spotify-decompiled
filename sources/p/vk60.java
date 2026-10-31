package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vk60 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final b380 l;
    public final b380 m;
    public final bg11 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f162p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public vk60(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        dm5.m((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = b380.p(arrayList2);
        this.m = b380.p(arrayList3);
        this.n = b380.w(arrayList4, new m((byte) 17));
        this.o = z2;
        this.f162p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk60)) {
            return false;
        }
        vk60 vk60Var = (vk60) obj;
        return this.d == vk60Var.d && this.e == vk60Var.e && this.f == vk60Var.f && this.g == vk60Var.g && this.i == vk60Var.i && this.j == vk60Var.j && this.k == vk60Var.k && this.o == vk60Var.o && this.r == vk60Var.r && this.s == vk60Var.s && this.a.equals(vk60Var.a) && Objects.equals(this.b, vk60Var.b) && Objects.equals(this.c, vk60Var.c) && this.h.equals(vk60Var.h) && Objects.equals(this.l, vk60Var.l) && Objects.equals(this.m, vk60Var.m) && Objects.equals(this.n, vk60Var.n) && Objects.equals(this.f162p, vk60Var.f162p) && Objects.equals(this.q, vk60Var.q) && Objects.equals(this.t, vk60Var.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.f162p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
