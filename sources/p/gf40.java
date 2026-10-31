package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gf40 implements Comparable {
    public final y190 a;
    public final int b;
    public final kul1 c;
    public final boolean d;
    public final boolean e;

    public gf40(y190 y190Var, int i, kul1 kul1Var, boolean z, boolean z2) {
        this.a = y190Var;
        this.b = i;
        this.c = kul1Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((gf40) obj).b;
    }
}
