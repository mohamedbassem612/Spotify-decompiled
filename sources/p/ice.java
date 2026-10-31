package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ice {
    public final ggi1 a;
    public final String b;
    public final int c;
    public final kce d;

    public ice(ggi1 ggi1Var, String str, int i, kce kceVar) {
        this.a = ggi1Var;
        this.b = str;
        this.c = i;
        this.d = kceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ice)) {
            return false;
        }
        ice iceVar = (ice) obj;
        return this.a.equals(iceVar.a) && this.b.equals(iceVar.b) && this.c == iceVar.c && this.d.equals(iceVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
