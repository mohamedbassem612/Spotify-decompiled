package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ne20 extends pe20 {
    public final otl a;

    public ne20(otl otlVar) {
        this.a = otlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne20) && this.a.equals(((ne20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
