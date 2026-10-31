package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mp3 extends hr3 {
    public final otl a;

    public mp3(otl otlVar) {
        this.a = otlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp3) && this.a.equals(((mp3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
