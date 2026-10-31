package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class phx {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public phx(int i, long j, String str, String str2, String str3) {
        this((i & 8) != 0 ? u7h.k : j, str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final long a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phx)) {
            return false;
        }
        phx phxVar = (phx) obj;
        if (!u890.j(this.a, phxVar.a) || !u890.j(this.b, phxVar.b) || !u890.j(this.c, phxVar.c)) {
            return false;
        }
        long j = phxVar.d;
        int i = u7h.l;
        return z4h1.b(this.d, j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = u7h.l;
        return Long.hashCode(this.d) + iD;
    }

    public phx(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }
}
