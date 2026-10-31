package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pcu {
    public final String a;

    public pcu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcu) && this.a.equals(((pcu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
