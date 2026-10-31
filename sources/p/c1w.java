package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c1w extends d1w {
    public final String a;

    public c1w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1w) && this.a.equals(((c1w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
