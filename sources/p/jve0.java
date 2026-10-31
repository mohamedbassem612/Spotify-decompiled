package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jve0 {
    public final String a;
    public final String b;

    public jve0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jve0)) {
            return false;
        }
        jve0 jve0Var = (jve0) obj;
        return this.a.equals(jve0Var.a) && this.b.equals(jve0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
