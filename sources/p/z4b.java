package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z4b extends z47 {
    public final String g;

    public z4b(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4b) && u890.j(this.g, ((z4b) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
