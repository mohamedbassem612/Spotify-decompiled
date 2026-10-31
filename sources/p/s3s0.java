package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s3s0 {
    public final String a;
    public final Long b;
    public final ibf c;

    public /* synthetic */ s3s0(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3s0)) {
            return false;
        }
        s3s0 s3s0Var = (s3s0) obj;
        return u890.j(this.a, s3s0Var.a) && u890.j(this.b, s3s0Var.b) && u890.j(this.c, s3s0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        ibf ibfVar = this.c;
        return iHashCode2 + (ibfVar != null ? ibfVar.hashCode() : 0);
    }

    public s3s0(String str, Long l, ibf ibfVar) {
        this.a = str;
        this.b = l;
        this.c = ibfVar;
    }
}
