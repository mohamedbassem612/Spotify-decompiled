package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vq90 implements dr90 {
    public final String a;

    public vq90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq90) && u890.j(this.a, ((vq90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
