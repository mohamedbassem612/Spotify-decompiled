package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aga implements cga {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final int f;

    public aga(int i, int i2, int i3, long j, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = i2;
        this.f = i3;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aga)) {
            return false;
        }
        aga agaVar = (aga) obj;
        return this.a == agaVar.a && u890.j(this.b, agaVar.b) && this.c.equals(agaVar.c) && this.d == agaVar.d && this.e == agaVar.e && this.f == agaVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, cy30.f(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31);
    }
}
