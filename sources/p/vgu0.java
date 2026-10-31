package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vgu0 {
    public final String a;
    public final String b;

    public vgu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgu0)) {
            return false;
        }
        vgu0 vgu0Var = (vgu0) obj;
        return u890.j(this.a, vgu0Var.a) && u890.j(this.b, vgu0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
