package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e3w0 {
    public final String a;
    public final String b;

    public e3w0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3w0)) {
            return false;
        }
        e3w0 e3w0Var = (e3w0) obj;
        return this.a.equals(e3w0Var.a) && this.b.equals(e3w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
