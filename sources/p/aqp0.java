package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqp0 implements bqp0 {
    public final String a;
    public final String b;

    public aqp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqp0)) {
            return false;
        }
        aqp0 aqp0Var = (aqp0) obj;
        return u890.j(this.a, aqp0Var.a) && u890.j(this.b, aqp0Var.b);
    }

    public final String getManifestId() {
        return this.b;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
