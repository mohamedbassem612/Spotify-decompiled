package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pfn implements ugn {
    public final String a;

    public pfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfn) && this.a.equals(((pfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
