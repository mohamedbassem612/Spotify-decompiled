package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aqj0 {
    public final UUID a;
    public final npj0 b;
    public final String c;
    public final String d;
    public final mpj0 e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final int j;
    public final String k;
    public final Long l;
    public final String m;
    public final boolean n;

    public aqj0(UUID uuid, npj0 npj0Var, String str, String str2, mpj0 mpj0Var, String str3, long j, long j2, long j3, int i, String str4, Long l, String str5, boolean z) {
        this.a = uuid;
        this.b = npj0Var;
        this.c = str;
        this.d = str2;
        this.e = mpj0Var;
        this.f = str3;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = i;
        this.k = str4;
        this.l = l;
        this.m = str5;
        this.n = z;
    }

    public final mpj0 a() {
        return this.e;
    }

    public final String b() {
        return this.k;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqj0)) {
            return false;
        }
        aqj0 aqj0Var = (aqj0) obj;
        return this.a.equals(aqj0Var.a) && u890.j(this.b, aqj0Var.b) && this.c.equals(aqj0Var.c) && this.d.equals(aqj0Var.d) && u890.j(this.e, aqj0Var.e) && u890.j(this.f, aqj0Var.f) && this.g == aqj0Var.g && this.h == aqj0Var.h && this.i == aqj0Var.i && this.j == aqj0Var.j && this.k.equals(aqj0Var.k) && u890.j(this.l, aqj0Var.l) && this.m.equals(aqj0Var.m) && this.n == aqj0Var.n;
    }

    public final npj0 f() {
        return this.b;
    }

    public final String g() {
        return this.m;
    }

    public final UUID h() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        mpj0 mpj0Var = this.e;
        int iHashCode = (iD + (mpj0Var == null ? 0 : mpj0Var.hashCode())) * 961;
        String str = this.f;
        int iD2 = cy30.d(ab80.k(this.j, cy30.f(cy30.f(cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.g, 31), this.h, 31), this.i, 31), 31), 31, this.k);
        Long l = this.l;
        return Boolean.hashCode(this.n) + cy30.d((iD2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.m);
    }

    public final Long i() {
        return this.l;
    }

    public final String j() {
        return this.c;
    }

    public final long k() {
        return this.h;
    }

    public final long l() {
        return this.g;
    }

    public final long m() {
        return this.i;
    }
}
