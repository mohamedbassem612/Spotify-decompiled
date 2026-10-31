package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ss01 extends vs01 {
    public final String a;
    public final int b;

    public ss01(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss01)) {
            return false;
        }
        ss01 ss01Var = (ss01) obj;
        return u890.j(this.a, ss01Var.a) && this.b == ss01Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
