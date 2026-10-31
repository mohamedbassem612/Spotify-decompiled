package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw2 implements vw2 {
    public final j2i a;

    public uw2(j2i j2iVar) {
        this.a = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw2) && this.a == ((uw2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
