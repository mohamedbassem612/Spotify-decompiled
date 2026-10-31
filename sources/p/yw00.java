package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yw00 implements dx00 {
    public final String a;
    public final String b;

    public yw00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw00)) {
            return false;
        }
        yw00 yw00Var = (yw00) obj;
        return u890.j(this.a, yw00Var.a) && u890.j(this.b, yw00Var.b);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
