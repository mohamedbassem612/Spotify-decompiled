package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ny21 implements qy21 {
    public final String a;
    public final String b;

    public ny21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny21)) {
            return false;
        }
        ny21 ny21Var = (ny21) obj;
        return this.a.equals(ny21Var.a) && this.b.equals(ny21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
