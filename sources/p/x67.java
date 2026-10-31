package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x67 {
    public final String a;
    public final String b;

    public x67(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x67)) {
            return false;
        }
        x67 x67Var = (x67) obj;
        return u890.j(this.a, x67Var.a) && u890.j(this.b, x67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
