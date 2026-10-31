package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n4g0 implements o4g0 {
    public final String a;

    public n4g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4g0) && this.a.equals(((n4g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
