package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z8n extends r6 {
    public static final ekb c = new ekb((byte) 3);
    public final String b;

    public z8n(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8n) && this.b.equals(((z8n) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
