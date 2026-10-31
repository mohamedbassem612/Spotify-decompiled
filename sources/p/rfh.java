package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfh implements sfh {
    public final String a;
    public final String b;

    public rfh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfh)) {
            return false;
        }
        rfh rfhVar = (rfh) obj;
        return this.a.equals(rfhVar.a) && this.b.equals(rfhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
