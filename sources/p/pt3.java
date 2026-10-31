package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pt3 implements xpw {
    public final /* synthetic */ byte a;
    public final bqk0 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public pt3(bqk0 bqk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = bqk0Var;
                this.c = k1o1.p();
                this.d = n3o1.q(this).a(new v72(this, (byte) 12), k63.V0);
                j2i j2iVar = c6i.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = bqk0Var;
                this.c = k1o1.p();
                this.d = n3o1.q(this).a(new v72(this, (byte) 10), k63.T0);
                j2i j2iVar2 = z5i.a;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }
}
