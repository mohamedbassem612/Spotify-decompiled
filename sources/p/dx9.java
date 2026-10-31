package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dx9 implements gx9 {
    public final String a;
    public final String b;

    public dx9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx9)) {
            return false;
        }
        dx9 dx9Var = (dx9) obj;
        return this.a.equals(dx9Var.a) && this.b.equals(dx9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
