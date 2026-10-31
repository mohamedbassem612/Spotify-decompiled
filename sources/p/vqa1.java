package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vqa1 implements era1 {
    public final String a;
    public final String b;

    public vqa1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqa1)) {
            return false;
        }
        vqa1 vqa1Var = (vqa1) obj;
        return u890.j(this.a, vqa1Var.a) && u890.j(this.b, vqa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
