package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class crl implements grl {
    public final String a;

    public crl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crl) && this.a.equals(((crl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
