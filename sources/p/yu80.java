package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yu80 extends lm5 {
    public final String d;
    public final int e;

    public yu80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu80)) {
            return false;
        }
        yu80 yu80Var = (yu80) obj;
        return u890.j(this.d, yu80Var.d) && this.e == yu80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
