package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jsa0 implements lsa0 {
    public final String a;
    public final String b;

    public jsa0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsa0)) {
            return false;
        }
        jsa0 jsa0Var = (jsa0) obj;
        return u890.j(this.a, jsa0Var.a) && this.b.equals(jsa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
