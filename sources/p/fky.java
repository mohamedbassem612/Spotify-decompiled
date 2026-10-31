package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fky {
    public final CharSequence a;
    public final eky b;

    public fky(CharSequence charSequence, eky ekyVar, int i) {
        ekyVar = (i & 2) != 0 ? p9w.b1 : ekyVar;
        this.a = charSequence;
        this.b = ekyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fky)) {
            return false;
        }
        fky fkyVar = (fky) obj;
        return u890.j(this.a, fkyVar.a) && this.b.equals(fkyVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 961;
    }
}
