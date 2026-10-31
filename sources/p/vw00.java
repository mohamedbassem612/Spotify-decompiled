package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vw00 implements ww00 {
    public final String a;

    public vw00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw00) && u890.j(this.a, ((vw00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
