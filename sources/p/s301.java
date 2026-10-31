package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s301 implements y301 {
    public final String a;
    public final int b;

    public s301(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s301)) {
            return false;
        }
        s301 s301Var = (s301) obj;
        return this.a.equals(s301Var.a) && this.b == s301Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
