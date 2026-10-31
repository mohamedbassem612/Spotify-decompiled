package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g19 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public g19(boolean z, boolean z2, String str) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g19)) {
            return false;
        }
        g19 g19Var = (g19) obj;
        return this.a == g19Var.a && this.b == g19Var.b && this.c.equals(g19Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrationState{isConnected=");
        sb.append(this.a);
        sb.append(", isInstalled=");
        sb.append(this.b);
        sb.append(", clientId=");
        return l1d.n(this.c, "}", sb);
    }
}
