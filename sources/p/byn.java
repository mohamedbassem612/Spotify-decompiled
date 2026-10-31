package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class byn {
    public final wxn a;

    public byn(wxn wxnVar) {
        this.a = wxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byn) && this.a == ((byn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
