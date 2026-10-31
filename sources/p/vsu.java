package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vsu implements btu {
    public final String a;

    public vsu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsu) && u890.j(this.a, ((vsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
