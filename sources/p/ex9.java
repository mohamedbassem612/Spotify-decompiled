package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ex9 implements gx9 {
    public final String a;
    public final String b;

    public ex9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex9)) {
            return false;
        }
        ex9 ex9Var = (ex9) obj;
        return this.a.equals(ex9Var.a) && this.b.equals(ex9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
