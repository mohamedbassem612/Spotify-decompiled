package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zh1 implements xpw {
    public final /* synthetic */ byte a;
    public final q7r0 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public zh1(q7r0 q7r0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = q7r0Var;
                this.c = new rey0(new yy80(this, (byte) 18));
                this.d = n3o1.q(this).a(lta0.h, lta0.i);
                j2i j2iVar = rui.b;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = q7r0Var;
                this.c = new rey0(new k681(this, (byte) 13));
                this.d = n3o1.q(this).a(c781.Y0, c781.Z0);
                j2i j2iVar2 = jij.b;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            default:
                this.b = q7r0Var;
                this.c = new rey0(new o2(this, (byte) 18));
                this.d = n3o1.q(this).a(fp0.X0, fp0.Y0);
                j2i j2iVar3 = l4i.b;
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
