package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class whl extends g9p1 implements bsr0 {
    public final ihl c;
    public final iu30 d;

    public whl(ihl ihlVar, iu30 iu30Var) {
        this.c = ihlVar;
        this.d = iu30Var;
    }

    public final Object e(wat watVar, Object obj) {
        return new vhl(this.c, this.d);
    }

    public final boolean equals(Object obj) {
        whl whlVar = obj instanceof whl ? (whl) obj : null;
        return u890.j(this.d, whlVar != null ? whlVar.d : null);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
