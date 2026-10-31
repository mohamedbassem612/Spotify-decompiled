package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uz7 {
    public final Uri a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;

    public uz7(Uri uri, long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4) {
        this.a = uri;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public static uz7 a(uz7 uz7Var, Uri uri, long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4, int i) {
        if ((i & 1) != 0) {
            uri = uz7Var.a;
        }
        Uri uri2 = uri;
        long j5 = (i & 2) != 0 ? uz7Var.b : j;
        boolean z4 = (i & 4) != 0 ? uz7Var.c : z;
        boolean z5 = (i & 8) != 0 ? uz7Var.d : z2;
        boolean z6 = (i & 16) != 0 ? uz7Var.e : z3;
        long j6 = (i & 32) != 0 ? uz7Var.f : j2;
        long j7 = (i & 64) != 0 ? uz7Var.g : j3;
        long j8 = (i & 128) != 0 ? uz7Var.h : j4;
        uz7Var.getClass();
        return new uz7(uri2, j5, z4, z5, z6, j6, j7, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz7)) {
            return false;
        }
        uz7 uz7Var = (uz7) obj;
        return u890.j(this.a, uz7Var.a) && this.b == uz7Var.b && this.c == uz7Var.c && this.d == uz7Var.d && this.e == uz7Var.e && this.f == uz7Var.f && this.g == uz7Var.g && this.h == uz7Var.h;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return Long.hashCode(this.h) + cy30.f(cy30.f(xcg1.g(xcg1.g(xcg1.g(cy30.f((uri == null ? 0 : uri.hashCode()) * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public /* synthetic */ uz7() {
        this(null, 0L, false, false, false, 0L, 0L, 0L);
    }
}
