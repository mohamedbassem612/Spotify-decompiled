package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xkf1 {
    public final String a;
    public final String b;

    public xkf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkf1)) {
            return false;
        }
        xkf1 xkf1Var = (xkf1) obj;
        return this.a.equals(xkf1Var.a) && this.b.equals(xkf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
