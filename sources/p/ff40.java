package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ff40 implements Comparable {
    public final short a;
    public final lul1 b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public ff40(int i, lul1 lul1Var, boolean z) {
        this.a = i;
        this.b = lul1Var;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((ff40) obj).a;
    }
}
