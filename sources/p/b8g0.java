package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b8g0 extends hon1 {
    public final String e;
    public final String f;

    public b8g0(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8g0)) {
            return false;
        }
        b8g0 b8g0Var = (b8g0) obj;
        return u890.j(this.e, b8g0Var.e) && u890.j(this.f, b8g0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
