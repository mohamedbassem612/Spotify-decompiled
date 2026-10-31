package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r060 implements xpw {
    public final /* synthetic */ byte a;
    public final ynb0 b;
    public final js20 c;
    public final eih1 d;
    public final psw e;

    public r060(ynb0 ynb0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ynb0Var;
                this.c = x3p1.n(ppg1.h, ppg1.i, lbg1.i, (o8n) null, (iu30) null, 24);
                this.d = new eih1();
                j2i j2iVar = new j2i(1902906263, new y2f1(this, (byte) 22), true);
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = ynb0Var;
                this.d = new eih1();
                this.c = x3p1.n(new zi50(this, (byte) 7), aw50.Q0, oq50.i, (o8n) null, (iu30) null, 24);
                j2i j2iVar2 = sri.a;
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
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }
}
