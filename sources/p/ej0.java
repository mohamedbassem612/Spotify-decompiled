package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ej0 {
    public final r1t a;

    public ej0(r1t r1tVar) {
        this.a = r1tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ej0) && this.a.equals(((ej0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
