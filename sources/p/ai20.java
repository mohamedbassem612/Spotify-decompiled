package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ai20 extends ci20 {
    public final String a;
    public final boolean b;

    public ai20(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai20)) {
            return false;
        }
        ai20 ai20Var = (ai20) obj;
        return u890.j(this.a, ai20Var.a) && this.b == ai20Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
