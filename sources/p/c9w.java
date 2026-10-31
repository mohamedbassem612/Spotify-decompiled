package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9w {
    public final String a;

    public c9w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9w) && this.a.equals(((c9w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
