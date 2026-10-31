package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cid {
    public final int a;
    public final int b;
    public final String c;

    public cid(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cid)) {
            return false;
        }
        cid cidVar = (cid) obj;
        return this.a == cidVar.a && this.b == cidVar.b && this.c.equals(cidVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
