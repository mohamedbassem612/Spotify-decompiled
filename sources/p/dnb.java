package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dnb implements gnb {
    public final String a;
    public final String b;

    public dnb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnb)) {
            return false;
        }
        dnb dnbVar = (dnb) obj;
        return u890.j(this.a, dnbVar.a) && this.b.equals(dnbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
