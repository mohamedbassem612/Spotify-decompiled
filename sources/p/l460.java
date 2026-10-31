package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l460 implements xpw {
    public final ojm a;
    public final rey0 b = k1o1.o(new gn50(this, (byte) 8));
    public final ia00 c;
    public final psw d;

    public l460(ojm ojmVar, boolean z) {
        this.a = ojmVar;
        this.c = z ? n3o1.q(this).a(vn50.X, vn50.Y) : n3o1.q(this).a(vn50.Z, vn50.N0);
        j2i j2iVar = zri.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
