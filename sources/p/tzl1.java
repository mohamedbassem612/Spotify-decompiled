package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tzl1 implements g0m1 {
    public final String a;
    public final String b;

    public tzl1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzl1)) {
            return false;
        }
        tzl1 tzl1Var = (tzl1) obj;
        return u890.j(this.a, tzl1Var.a) && this.b.equals(tzl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
