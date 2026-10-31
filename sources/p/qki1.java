package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qki1 implements eli1 {
    public final String a;
    public final Long b;

    public qki1(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qki1)) {
            return false;
        }
        qki1 qki1Var = (qki1) obj;
        return this.a.equals(qki1Var.a) && u890.j(this.b, qki1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
