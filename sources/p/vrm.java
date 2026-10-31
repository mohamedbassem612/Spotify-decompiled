package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vrm implements f961, urm {
    public final dt71 a;
    public final ve01 b;

    public vrm() {
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.a = dt71VarE;
        this.b = d5p1.g(dt71VarE);
    }

    @Override // p.urm
    public final at71 a() {
        return this.b;
    }

    @Override // p.urm
    public final Object b(trm trmVar, onm onmVar) {
        Object objEmit = this.a.emit(trmVar, onmVar);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
