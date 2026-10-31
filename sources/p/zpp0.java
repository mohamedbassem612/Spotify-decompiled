package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zpp0 implements bqp0 {
    public final mdz a;

    public zpp0(mdz mdzVar) {
        this.a = mdzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpp0) && this.a.equals(((zpp0) obj).a);
    }

    public final String getManifestId() {
        ldz ldzVar = (ldz) o7h.s0(this.a.g);
        if (ldzVar != null) {
            return ldzVar.a;
        }
        return null;
    }

    public final String getUri() {
        return this.a.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
