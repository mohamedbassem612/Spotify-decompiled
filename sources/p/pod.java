package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pod {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public pod(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pod)) {
            return false;
        }
        pod podVar = (pod) obj;
        return u890.j(this.a, podVar.a) && u890.j(this.b, podVar.b) && this.c == podVar.c && this.d == podVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }
}
