package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zaw0 {
    public final oiw0 a;

    public zaw0(oiw0 oiw0Var) {
        this.a = oiw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zaw0) && this.a.equals(((zaw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
