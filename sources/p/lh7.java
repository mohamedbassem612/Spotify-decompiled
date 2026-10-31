package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lh7 {
    public final String a;

    public lh7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh7) && this.a.equals(((lh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
