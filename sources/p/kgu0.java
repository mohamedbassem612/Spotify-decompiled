package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kgu0 {
    public final String a;

    public kgu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgu0) && this.a.equals(((kgu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
