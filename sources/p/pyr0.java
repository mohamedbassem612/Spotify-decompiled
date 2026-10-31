package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pyr0 {
    public final String a;

    public pyr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyr0) && this.a.equals(((pyr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
