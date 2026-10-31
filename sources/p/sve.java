package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sve implements xpw {
    public final /* synthetic */ byte a;
    public final lzn0 b;
    public final rey0 c;
    public final eih1 d;
    public final psw e;

    public sve(lzn0 lzn0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = lzn0Var;
                this.c = new rey0(new mgl(this, (byte) 10));
                this.d = new eih1();
                j2i j2iVar = jgi.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = lzn0Var;
                this.c = new rey0(new g2j1(this, (byte) 17));
                this.d = new eih1();
                j2i j2iVar2 = brj.a;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            default:
                this.b = lzn0Var;
                this.c = new rey0(new dwd(this, (byte) 11));
                this.d = new eih1();
                j2i j2iVar3 = obi.b;
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        byte b = this.a;
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
