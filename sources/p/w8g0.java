package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w8g0 extends x8g0 {
    public final String a;
    public final ox3 b;

    public w8g0(String str, ox3 ox3Var) {
        this.a = str;
        this.b = ox3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8g0)) {
            return false;
        }
        w8g0 w8g0Var = (w8g0) obj;
        return this.a.equals(w8g0Var.a) && this.b == w8g0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
