package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pm5 {
    public final String a;
    public final String b;
    public final String c;

    public pm5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm5)) {
            return false;
        }
        pm5 pm5Var = (pm5) obj;
        return this.a.equals(pm5Var.a) && this.b.equals(pm5Var.b) && this.c.equals(pm5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return gvg.k(sb, this.c, ')');
    }
}
