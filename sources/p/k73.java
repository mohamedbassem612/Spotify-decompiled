package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k73 {
    public final String a;

    public k73(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k73) && this.a.equals(((k73) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
