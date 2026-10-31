package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nvn implements btt0, hs80 {
    public final dt71 a;
    public final stt0 b;

    public nvn(qeq qeqVar) {
        dt71 dt71VarE = mgo1.e(1, 1, 0, 4);
        this.a = dt71VarE;
        stt0 stt0VarA = qeqVar.a(dt71VarE);
        stt0VarA.c();
        this.b = stt0VarA;
    }

    public final g9i0 a(String str) {
        return this.b.a(str);
    }

    public final Object b(String str, onm onmVar) {
        return this.b.b(str, onmVar);
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new i3b(chm0Var, (byte) 23), r4u.a(new n4b(this.a, (byte) 19)));
    }

    @Override // p.hs80
    public final void dispose() {
        this.b.d();
    }

    @Override // p.hs80
    public final void start() {
        this.b.c();
    }
}
