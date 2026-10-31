package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o0j0 implements w0j0 {
    public final String a;

    public o0j0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0j0) && u890.j(this.a, ((o0j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
