package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ggp0 extends lgp0 {
    public final vbe a;

    public ggp0(vbe vbeVar) {
        this.a = vbeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggp0) && this.a.equals(((ggp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.lgp0
    public final String toString() {
        return super.toString();
    }
}
