package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iul implements cwl {
    public final ol6 a;

    public iul(ol6 ol6Var) {
        this.a = ol6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iul) && this.a.equals(((iul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
