package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9w implements hiw {
    public final String a;
    public final String b;

    public g9w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9w)) {
            return false;
        }
        g9w g9wVar = (g9w) obj;
        return u890.j(this.a, g9wVar.a) && this.b.equals(g9wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
