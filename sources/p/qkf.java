package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qkf {
    public final String a;
    public final rkf b;
    public final hux c;

    public qkf(String str, rkf rkfVar, hux huxVar) {
        this.a = str;
        this.b = rkfVar;
        this.c = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkf)) {
            return false;
        }
        qkf qkfVar = (qkf) obj;
        return this.a.equals(qkfVar.a) && this.b.equals(qkfVar.b) && u890.j(this.c, qkfVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hux huxVar = this.c;
        return iHashCode + (huxVar == null ? 0 : huxVar.hashCode());
    }
}
