package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vg80 {
    public final String a;

    public vg80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg80) && u890.j(this.a, ((vg80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
