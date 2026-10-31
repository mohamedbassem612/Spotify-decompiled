package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface k1r {
    default k1r map(iu30 iu30Var) {
        if (this instanceof i1r) {
            return new i1r(iu30Var.invoke(((i1r) this).a), null);
        }
        if ((this instanceof j1r) || (this instanceof h1r)) {
            return this;
        }
        eg.o();
        return null;
    }
}
