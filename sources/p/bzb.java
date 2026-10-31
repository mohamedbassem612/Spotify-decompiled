package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bzb {
    public final String a;
    public final String b;

    public bzb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzb)) {
            return false;
        }
        bzb bzbVar = (bzb) obj;
        return u890.j(this.a, bzbVar.a) && this.b.equals(bzbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
