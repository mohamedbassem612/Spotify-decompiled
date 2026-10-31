package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eia {
    public final String a;
    public final long b;
    public final Long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;

    public eia(String str, long j, Long l, long j2, long j3, String str2, String str3) {
        this.a = str;
        this.b = j;
        this.c = l;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.g = str3;
    }

    public final String a() {
        return this.g;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eia)) {
            return false;
        }
        eia eiaVar = (eia) obj;
        return u890.j(this.a, eiaVar.a) && this.b == eiaVar.b && u890.j(this.c, eiaVar.c) && this.d == eiaVar.d && this.e == eiaVar.e && this.f.equals(eiaVar.f) && this.g.equals(eiaVar.g);
    }

    public final Long f() {
        return this.c;
    }

    public final String g() {
        return this.f;
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        Long l = this.c;
        return this.g.hashCode() + cy30.d(cy30.f(cy30.f((iF + (l == null ? 0 : l.hashCode())) * 31, this.d, 31), this.e, 31), 31, this.f);
    }
}
