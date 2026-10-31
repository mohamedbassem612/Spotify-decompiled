package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vq10 implements er10 {
    public final String a;
    public final String b;

    public vq10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq10)) {
            return false;
        }
        vq10 vq10Var = (vq10) obj;
        return u890.j(this.a, vq10Var.a) && u890.j(this.b, vq10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
