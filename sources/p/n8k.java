package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n8k implements z8k {
    public final String a;

    public n8k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8k) && this.a.equals(((n8k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
