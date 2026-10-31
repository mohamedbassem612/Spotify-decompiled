package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jb9 {
    public final String a;
    public final String b;

    public jb9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb9)) {
            return false;
        }
        jb9 jb9Var = (jb9) obj;
        return this.a.equals(jb9Var.a) && this.b.equals(jb9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
