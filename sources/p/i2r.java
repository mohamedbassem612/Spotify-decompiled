package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i2r extends l3p1 {
    public final String c;
    public final byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public i2r(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2r)) {
            return false;
        }
        i2r i2rVar = (i2r) obj;
        return u890.j(this.c, i2rVar.c) && this.d == i2rVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
