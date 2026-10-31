package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lvx0 extends qvx0 {
    public final String a;
    public final boolean b;

    public lvx0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvx0)) {
            return false;
        }
        lvx0 lvx0Var = (lvx0) obj;
        return u890.j(this.a, lvx0Var.a) && this.b == lvx0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
