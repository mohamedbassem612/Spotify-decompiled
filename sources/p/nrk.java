package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nrk {
    public final String a;

    public nrk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrk) && this.a.equals(((nrk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
