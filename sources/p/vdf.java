package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vdf implements bef {
    public final String a;

    public vdf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdf) && u890.j(this.a, ((vdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
