package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class han implements ian {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public han(int i, long j, String str, boolean z) {
        z = (i & 8) != 0 ? false : z;
        boolean z2 = (i & 16) != 0;
        this.a = j;
        this.b = str;
        this.c = null;
        this.d = z;
        this.e = z2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof han)) {
            return false;
        }
        han hanVar = (han) obj;
        return this.a == hanVar.a && u890.j(this.b, hanVar.b) && u890.j(this.c, hanVar.c) && this.d == hanVar.d && this.e == hanVar.e;
    }

    public final int hashCode() {
        int iD = cy30.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
