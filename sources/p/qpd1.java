package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpd1 {
    public final String a;

    public qpd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpd1) && this.a.equals(((qpd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
