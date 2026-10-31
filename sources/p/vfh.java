package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vfh implements xfh {
    public final String a;

    public vfh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfh) && this.a.equals(((vfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
