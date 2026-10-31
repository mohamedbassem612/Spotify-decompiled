package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b02 implements c02 {
    public final String a;
    public final String b;

    public b02(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        return this.a.equals(b02Var.a) && this.b.equals(b02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
