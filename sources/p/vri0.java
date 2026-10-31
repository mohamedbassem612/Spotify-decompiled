package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vri0 implements yri0 {
    public final String a;
    public final String b;
    public final String c;

    public vri0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vri0)) {
            return false;
        }
        vri0 vri0Var = (vri0) obj;
        return this.a.equals(vri0Var.a) && this.b.equals(vri0Var.b) && this.c.equals(vri0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
