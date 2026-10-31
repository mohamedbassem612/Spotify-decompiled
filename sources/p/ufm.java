package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ufm extends rzn1 {
    public final c380 f;

    public ufm(c380 c380Var) {
        this.f = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufm) && u890.j(this.f, ((ufm) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
