package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rus implements hw61 {
    public final long a;

    public rus(long j) {
        this.a = j;
    }

    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        tw4 tw4VarA = ww4.a();
        long j2 = this.a;
        float fX0 = watVar.X0(s3v.b(j2));
        float fX1 = watVar.X0(s3v.a(j2));
        tw4VarA.k(0.0f, 0.0f);
        tw4VarA.j(fX0 / 2.0f, 0.0f);
        tw4VarA.j(0.0f, fX1);
        tw4VarA.j((-fX0) / 2.0f, 0.0f);
        tw4VarA.g();
        return new htq0(tw4VarA);
    }
}
