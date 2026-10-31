package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zc71 {
    public final vur0 a;

    public zc71(vur0 vur0Var) {
        this.a = vur0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc71) && this.a == ((zc71) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
