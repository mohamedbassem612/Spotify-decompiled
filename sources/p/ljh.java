package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ljh implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ljh(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljh)) {
            return false;
        }
        ljh ljhVar = (ljh) obj;
        return this.a.equals(ljhVar.a) && this.b.equals(ljhVar.b) && this.c.equals(ljhVar.c) && this.d == ljhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
