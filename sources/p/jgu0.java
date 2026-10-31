package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jgu0 {
    public final String a;
    public final String b;

    public jgu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgu0)) {
            return false;
        }
        jgu0 jgu0Var = (jgu0) obj;
        return this.a.equals(jgu0Var.a) && this.b.equals(jgu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
