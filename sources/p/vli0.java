package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vli0 implements xli0 {
    public final String a;

    public vli0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vli0) && this.a.equals(((vli0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
