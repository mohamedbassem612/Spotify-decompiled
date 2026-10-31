package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q4b implements d8c1 {
    public final /* synthetic */ r4b a;
    public final /* synthetic */ cea b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public q4b(r4b r4bVar, cea ceaVar, int i, int i2) {
        this.a = r4bVar;
        this.b = ceaVar;
        this.c = i;
        this.d = i2;
    }

    @Override // p.d8c1
    public final v7c1 b() {
        r4b r4bVar = this.a;
        return new v7c1(new dea(r4bVar.b, this.b, r4bVar.c, r4bVar.d, r4bVar.e, r4bVar.g, r4bVar.i, this.c + this.d, r4bVar.h));
    }
}
