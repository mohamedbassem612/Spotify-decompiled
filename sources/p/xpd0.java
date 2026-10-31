package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xpd0 {
    public final String a;
    public final String b;

    public xpd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpd0)) {
            return false;
        }
        xpd0 xpd0Var = (xpd0) obj;
        return this.a.equals(xpd0Var.a) && this.b.equals(xpd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
