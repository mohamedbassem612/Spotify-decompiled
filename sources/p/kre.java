package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kre implements xpw {
    public final lzn0 a;
    public final z710 b;
    public final blp c;
    public final ffq d;
    public final blp e;
    public final gw70 f;
    public final oql g;
    public final rey0 h = new rey0(new dwd(this, (byte) 10));
    public final psw i;
    public final ia00 t;

    public kre(lzn0 lzn0Var, z710 z710Var, blp blpVar, ffq ffqVar, blp blpVar2, gw70 gw70Var, oql oqlVar) {
        this.a = lzn0Var;
        this.b = z710Var;
        this.c = blpVar;
        this.d = ffqVar;
        this.e = blpVar2;
        this.f = gw70Var;
        this.g = oqlVar;
        j2i j2iVar = new j2i(-703843697, new gtd(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.t = n3o1.q(this).a(emd.b1, new v08(this, (byte) 6));
    }

    public static boolean e(wre wreVar) {
        d4f d4fVar = wreVar.e;
        c4f c4fVar = d4fVar instanceof c4f ? (c4f) d4fVar : null;
        return c4fVar != null && c4fVar.a == 2 && c4fVar.b == 1 && !ihc1.y0(wreVar.d);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
