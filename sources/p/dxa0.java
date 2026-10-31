package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dxa0 implements exa0 {
    public final boolean a;

    public dxa0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxa0) && this.a == ((dxa0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
