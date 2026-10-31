package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k720 {
    public final String a;

    public k720(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k720) && this.a.equals(((k720) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
