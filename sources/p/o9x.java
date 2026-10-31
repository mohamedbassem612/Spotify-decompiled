package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o9x implements xpw {
    public final /* synthetic */ byte a;
    public final String b;
    public final z0t c;
    public final sb7 d;
    public final rey0 e;
    public final ia00 f;
    public final psw g;

    public o9x(String str, z0t z0tVar, sb7 sb7Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = str;
                this.c = z0tVar;
                this.d = sb7Var;
                this.e = new rey0(new yy80(this, (byte) 28));
                this.f = n3o1.q(this).a(lta0.Y0, lta0.Z0);
                j2i j2iVar = new j2i(78497643, new pba0(this, (byte) 21), true);
                ien0 ien0Var = qsw.a;
                this.g = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = str;
                this.c = z0tVar;
                this.d = sb7Var;
                this.e = new rey0(new o8x(this, (byte) 1));
                this.f = n3o1.q(this).a(c9x.c, c9x.e);
                j2i j2iVar2 = new j2i(-1037015229, new ent(this, (byte) 24), true);
                ien0 ien0Var2 = qsw.a;
                this.g = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.g;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.e;
    }
}
