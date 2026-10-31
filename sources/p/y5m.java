package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y5m extends e6m {
    public final String a;
    public final String b;

    public y5m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5m)) {
            return false;
        }
        y5m y5mVar = (y5m) obj;
        return this.a.equals(y5mVar.a) && this.b.equals(y5mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
