package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qlt0 implements slt0 {
    public final String a;

    public qlt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlt0) && this.a.equals(((qlt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
