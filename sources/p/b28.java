package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b28 implements e28 {
    public final String a;
    public final String b;

    public b28(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b28)) {
            return false;
        }
        b28 b28Var = (b28) obj;
        return this.a.equals(b28Var.a) && this.b.equals(b28Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
