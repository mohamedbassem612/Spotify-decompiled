package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nwr0 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwr0) && this.a.equals(((nwr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
