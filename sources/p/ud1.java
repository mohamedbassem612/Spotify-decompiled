package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ud1 implements xpw {
    public final /* synthetic */ byte a;
    public final f1n0 b;
    public final k8d1 c;
    public final psw d;
    public final ia00 e;

    public ud1(f1n0 f1n0Var, byte b) {
        this.a = b;
        lnm lnmVar = null;
        byte b2 = 0;
        switch (b) {
            case 1:
                this.b = f1n0Var;
                this.c = k1o1.u(new r20((Object) this, lnmVar, (byte) 9));
                j2i j2iVar = m7i.a;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                this.e = n3o1.q(this).a(d27.t, d27.X);
                break;
            case 2:
                this.b = f1n0Var;
                this.c = k1o1.u(new yyg(this, (lnm) null, (byte) 2));
                this.e = n3o1.q(this).a(fri0.c1, fri0.d1);
                j2i j2iVar2 = z0j.b;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
            case 3:
                this.b = f1n0Var;
                this.c = k1o1.u(new kw0(this, (lnm) null, (byte) 13));
                j2i j2iVar3 = hcj.a;
                ien0 ien0Var3 = qsw.a;
                this.d = new psw(j2iVar3, (byte) 0);
                this.e = n3o1.q(this).a(rw01.d, rw01.e);
                break;
            default:
                this.b = f1n0Var;
                this.c = k1o1.u(new td1(this, lnmVar, b2));
                j2i j2iVar4 = f4i.a;
                ien0 ien0Var4 = qsw.a;
                this.d = new psw(j2iVar4, (byte) 0);
                this.e = n3o1.q(this).a(fp0.T0, fp0.U0);
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
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }
}
