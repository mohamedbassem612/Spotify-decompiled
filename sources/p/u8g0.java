package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8g0 extends x8g0 {
    public final String a;
    public final int b;

    public u8g0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8g0)) {
            return false;
        }
        u8g0 u8g0Var = (u8g0) obj;
        return this.a.equals(u8g0Var.a) && this.b == u8g0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
