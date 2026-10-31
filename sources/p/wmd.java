package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wmd {
    public final String a;
    public final byte b;
    public final long c;
    public final long d;
    public final u7h e;
    public final lee1 f;
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public wmd(String str, int i, long j, long j2, u7h u7hVar, lee1 lee1Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = u7hVar;
        this.f = lee1Var;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmd)) {
            return false;
        }
        wmd wmdVar = (wmd) obj;
        if (!u890.j(this.a, wmdVar.a) || this.b != wmdVar.b) {
            return false;
        }
        long j = wmdVar.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && z4h1.b(this.d, wmdVar.d) && u890.j(this.e, wmdVar.e) && u890.j(this.f, wmdVar.f) && this.g == wmdVar.g;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        int i = u7h.l;
        int iF2 = cy30.f(cy30.f(iF, this.c, 31), this.d, 31);
        u7h u7hVar = this.e;
        return Integer.hashCode(this.g) + p3d1.h(this.f, (iF2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31);
    }
}
