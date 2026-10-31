package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xkh implements hlh {
    public final int a;
    public final String b;

    public xkh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkh)) {
            return false;
        }
        xkh xkhVar = (xkh) obj;
        return this.a == xkhVar.a && this.b.equals(xkhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, false);
    }
}
