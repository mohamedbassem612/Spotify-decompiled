package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lmd0 implements xpw {
    public final /* synthetic */ byte a;
    public final l6m0 b;

    public /* synthetic */ lmd0(l6m0 l6m0Var, byte b) {
        this.a = b;
        this.b = l6m0Var;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return n3o1.q(this).a(new kmd0(this, (byte) 0), i2d0.b1);
            default:
                return n3o1.q(this).a(new kmd0(this, (byte) 26), ytg0.b);
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                j2i j2iVar = jwi.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            default:
                j2i j2iVar2 = mzi.a;
                ien0 ien0Var2 = qsw.a;
                return new psw(j2iVar2, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return new rey0(j830.a1);
            default:
                return new rey0(gce0.g);
        }
    }
}
