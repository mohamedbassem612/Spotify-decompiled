package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vus0 implements xus0 {
    public final String a;

    public vus0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vus0) && this.a.equals(((vus0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
