package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xll1 implements Comparable {
    public final int a;
    public final tll1 b;

    public xll1(int i, tll1 tll1Var) {
        this.a = i;
        this.b = tll1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((xll1) obj).a);
    }
}
