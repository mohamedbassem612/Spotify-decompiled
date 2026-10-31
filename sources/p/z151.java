package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z151 implements j251 {
    public final String a;
    public final String b;

    public z151(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z151)) {
            return false;
        }
        z151 z151Var = (z151) obj;
        return u890.j(this.a, z151Var.a) && this.b.equals(z151Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
