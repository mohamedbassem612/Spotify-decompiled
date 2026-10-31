package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aev {
    public final String a;
    public final ak3 b;

    public aev(String str, ak3 ak3Var) {
        this.a = str;
        this.b = ak3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aev)) {
            return false;
        }
        aev aevVar = (aev) obj;
        return u890.j(this.a, aevVar.a) && this.b == aevVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
