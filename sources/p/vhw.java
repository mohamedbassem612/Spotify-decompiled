package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vhw implements fiw {
    public final String a;

    public vhw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhw) && u890.j(this.a, ((vhw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
