package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c5b extends z47 {
    public final String g;

    public c5b(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5b) && u890.j(this.g, ((c5b) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
