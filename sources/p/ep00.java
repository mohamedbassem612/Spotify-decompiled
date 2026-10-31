package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ep00 implements Comparable {
    public final sbu0 a;
    public int b;
    public long c;
    public Object d;

    public ep00(sbu0 sbu0Var) {
        this.a = sbu0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ep00 ep00Var = (ep00) obj;
        Object obj2 = this.d;
        if ((obj2 == null) != (ep00Var.d == null)) {
            return obj2 != null ? -1 : 1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.b - ep00Var.b;
        return i != 0 ? i : Long.compare(this.c, ep00Var.c);
    }
}
