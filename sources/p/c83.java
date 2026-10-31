package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c83 {
    public final String a;
    public final String b;

    public c83(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c83)) {
            return false;
        }
        c83 c83Var = (c83) obj;
        return this.a.equals(c83Var.a) && this.b.equals(c83Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
