package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t62 {
    public final String a;
    public final String b;

    public t62(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t62)) {
            return false;
        }
        t62 t62Var = (t62) obj;
        return this.a.equals(t62Var.a) && this.b.equals(t62Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
