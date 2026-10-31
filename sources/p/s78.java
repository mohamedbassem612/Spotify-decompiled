package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s78 implements ez00 {
    public final String a;
    public final boolean b;

    public s78(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78Var = (s78) obj;
        return this.a.equals(s78Var.a) && this.b == s78Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
