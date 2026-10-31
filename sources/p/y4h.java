package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y4h implements b5h {
    public final String a;

    public y4h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4h) && u890.j(this.a, ((y4h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
