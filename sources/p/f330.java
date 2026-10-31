package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f330 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final lzn0 b;
    public final rey0 c;
    public final psw d;
    public final hy00 e;

    public f330(lzn0 lzn0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = lzn0Var;
                this.c = new rey0(new k2d0(this, (byte) 25));
                j2i j2iVar = yxi.a;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                this.e = n3o1.r(this).c(wud0.Z0, wud0.a1);
                break;
            case 2:
                this.b = lzn0Var;
                this.c = new rey0(new bxb1(this, (byte) 8));
                j2i j2iVar2 = klj.a;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                this.e = n3o1.r(this).c(m1c1.f, m1c1.g);
                break;
            case 3:
                this.b = lzn0Var;
                this.c = new rey0(new e9f1(this, (byte) 27));
                this.e = n3o1.r(this).c(ruh1.T0, ruh1.U0);
                j2i j2iVar3 = zpj.a;
                ien0 ien0Var3 = qsw.a;
                this.d = new psw(j2iVar3, (byte) 0);
                break;
            default:
                this.b = lzn0Var;
                this.c = new rey0(new mp20(this, (byte) 1));
                this.e = n3o1.r(this).c(je20.h, je20.i);
                j2i j2iVar4 = epi.c;
                ien0 ien0Var4 = qsw.a;
                this.d = new psw(j2iVar4, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.e;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
