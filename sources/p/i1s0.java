package p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i1s0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;

    public /* synthetic */ i1s0(long j, int i, String str) {
        this(UUID.randomUUID().toString(), (i & 2) != 0 ? "unknown" : str, (i & 4) == 0 ? "navigation" : "unknown", z6x.a, (i & 16) != 0 ? "" : "waze", (i & 32) != 0 ? 0L : j, 0L, 0L);
    }

    public static i1s0 a(i1s0 i1s0Var, long j, long j2, long j3, int i) {
        String str = i1s0Var.a;
        String str2 = i1s0Var.b;
        String str3 = i1s0Var.c;
        List list = i1s0Var.d;
        String str4 = i1s0Var.e;
        if ((i & 32) != 0) {
            j = i1s0Var.f;
        }
        long j4 = j;
        long j5 = (i & 64) != 0 ? i1s0Var.g : j2;
        long j6 = (i & 128) != 0 ? i1s0Var.h : j3;
        i1s0Var.getClass();
        return new i1s0(str, str2, str3, list, str4, j4, j5, j6);
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.h;
    }

    public final long d() {
        return this.g;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1s0)) {
            return false;
        }
        i1s0 i1s0Var = (i1s0) obj;
        return u890.j(this.a, i1s0Var.a) && u890.j(this.b, i1s0Var.b) && u890.j(this.c, i1s0Var.c) && u890.j(this.d, i1s0Var.d) && u890.j(this.e, i1s0Var.e) && this.f == i1s0Var.f && this.g == i1s0Var.g && this.h == i1s0Var.h;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + cy30.f(cy30.f(cy30.d(f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final List i() {
        return this.d;
    }

    public i1s0(String str, String str2, String str3, List list, String str4, long j, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = j3;
    }
}
