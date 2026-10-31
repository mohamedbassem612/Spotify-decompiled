package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sv10 extends uv10 {
    public final String a;
    public final String b;

    public sv10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv10)) {
            return false;
        }
        sv10 sv10Var = (sv10) obj;
        return this.a.equals(sv10Var.a) && this.b.equals(sv10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
