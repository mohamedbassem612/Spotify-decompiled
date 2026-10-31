package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class elf0 implements flf0 {
    public final a9h a;

    public elf0(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elf0) && this.a.equals(((elf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
