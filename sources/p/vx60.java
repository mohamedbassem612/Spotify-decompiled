package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vx60 {
    public final String a;
    public final String b;

    public vx60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx60)) {
            return false;
        }
        vx60 vx60Var = (vx60) obj;
        return this.a.equals(vx60Var.a) && this.b.equals(vx60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
