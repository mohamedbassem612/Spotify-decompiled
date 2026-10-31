package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vw81 implements z0i {
    public final String a;
    public final String b;

    public vw81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw81)) {
            return false;
        }
        vw81 vw81Var = (vw81) obj;
        return this.a.equals(vw81Var.a) && this.b.equals(vw81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
