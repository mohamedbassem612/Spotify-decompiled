package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dhm implements khm {
    public final String a;
    public final String b;
    public final String c;

    public dhm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhm)) {
            return false;
        }
        dhm dhmVar = (dhm) obj;
        return this.a.equals(dhmVar.a) && this.b.equals(dhmVar.b) && this.c.equals(dhmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
