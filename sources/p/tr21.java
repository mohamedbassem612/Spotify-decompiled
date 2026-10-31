package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tr21 implements xpw {
    public final /* synthetic */ byte a;
    public final gw70 b;
    public final rey0 c;
    public final eih1 d;
    public final psw e;

    public tr21(gw70 gw70Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = gw70Var;
                this.c = k1o1.p();
                this.d = new eih1();
                j2i j2iVar = new j2i(-1024538561, new vsb1(this, (byte) 18), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = gw70Var;
                this.c = new rey0(krz0.X);
                this.d = new eih1();
                j2i j2iVar2 = new j2i(127220232, new dr01(this, (byte) 27), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
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
        }
        return this.e;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
