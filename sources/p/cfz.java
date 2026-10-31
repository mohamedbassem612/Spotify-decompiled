package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cfz {
    public final int a;
    public final String b;
    public final int c;

    public cfz(int i, int i2, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfz)) {
            return false;
        }
        cfz cfzVar = (cfz) obj;
        return this.a == cfzVar.a && this.b.equals(cfzVar.b) && this.c == cfzVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(240, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
