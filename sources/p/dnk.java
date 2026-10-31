package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dnk {
    public final String a;
    public final String b;

    public dnk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk)) {
            return false;
        }
        dnk dnkVar = (dnk) obj;
        return this.a.equals(dnkVar.a) && u890.j(this.b, dnkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
