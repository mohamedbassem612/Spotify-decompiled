package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qxl {
    public final vzq0 a = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
    public final g36 b = h36.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxl)) {
            return false;
        }
        qxl qxlVar = (qxl) obj;
        return this.a.equals(qxlVar.a) && this.b.equals(qxlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
