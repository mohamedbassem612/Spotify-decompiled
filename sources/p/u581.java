package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u581 implements x581 {
    public final String a;

    public u581(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u581) && this.a.equals(((u581) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
