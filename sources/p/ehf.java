package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehf extends gto1 {
    public final int b;
    public final Integer c;

    public ehf(Integer num, int i) {
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehf)) {
            return false;
        }
        ehf ehfVar = (ehf) obj;
        return this.b == ehfVar.b && u890.j(this.c, ehfVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
