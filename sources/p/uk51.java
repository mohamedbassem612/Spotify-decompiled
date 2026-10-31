package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uk51 implements xpw {
    public final /* synthetic */ byte a;
    public final a1r0 b;
    public final rey0 c;
    public final psw d;
    public final ia00 e;

    public uk51(a1r0 a1r0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = a1r0Var;
                this.c = new rey0(new g2j1(this, (byte) 15));
                j2i j2iVar = arj.b;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                this.e = n3o1.q(this).a(cxj1.c, cxj1.d);
                break;
            default:
                this.b = a1r0Var;
                this.c = new rey0(new u451(this, (byte) 7));
                this.e = n3o1.q(this).a(v451.P0, v451.Q0);
                j2i j2iVar2 = qfj.b;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
