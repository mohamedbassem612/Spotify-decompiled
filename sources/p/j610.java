package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j610 extends qro1 {
    public final String b;

    public j610(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j610) && this.b.equals(((j610) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
