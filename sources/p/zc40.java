package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zc40 {
    public final hd40 a;

    public zc40(hd40 hd40Var) {
        this.a = hd40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc40) && this.a.equals(((zc40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
