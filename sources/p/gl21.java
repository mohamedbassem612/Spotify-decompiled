package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gl21 {
    public final String a;
    public final String b;

    public gl21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl21)) {
            return false;
        }
        gl21 gl21Var = (gl21) obj;
        return this.a.equals(gl21Var.a) && this.b.equals(gl21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
