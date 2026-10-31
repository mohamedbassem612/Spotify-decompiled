package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve7 extends iqo1 {
    public final String d;
    public final int e;

    public ve7(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve7)) {
            return false;
        }
        ve7 ve7Var = (ve7) obj;
        return u890.j(this.d, ve7Var.d) && this.e == ve7Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
