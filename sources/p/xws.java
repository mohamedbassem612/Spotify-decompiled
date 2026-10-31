package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xws implements Comparable {
    public final boolean a;
    public final boolean b;

    public xws(int i, ie30 ie30Var) {
        this.a = (ie30Var.e & 1) != 0;
        this.b = jca.u(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xws xwsVar = (xws) obj;
        return sxh.a.d(this.b, xwsVar.b).d(this.a, xwsVar.a).f();
    }
}
