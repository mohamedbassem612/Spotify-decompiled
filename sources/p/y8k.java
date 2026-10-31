package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8k implements z8k {
    public final String a;

    public y8k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8k) && u890.j(this.a, ((y8k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
