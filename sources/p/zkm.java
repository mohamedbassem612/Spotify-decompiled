package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zkm {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public zkm(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkm)) {
            return false;
        }
        zkm zkmVar = (zkm) obj;
        return u890.j(this.a, zkmVar.a) && u890.j(this.b, zkmVar.b) && this.c == zkmVar.c && this.d == zkmVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }
}
