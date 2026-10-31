package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vck implements wck {
    public final String a;

    public vck(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vck) && u890.j(this.a, ((vck) obj).a);
    }

    public final String getLabel() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
