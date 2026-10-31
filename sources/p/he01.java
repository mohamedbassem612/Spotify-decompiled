package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class he01 implements xpw {
    public final /* synthetic */ byte a;
    public final qe01 b;
    public final ljm0 c;
    public final eih1 d;
    public final psw e;

    public he01(qe01 qe01Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = qe01Var;
                this.c = h7w.B(oa01.Z0, (o8n) null, (iu30) null, new g001(this, (byte) 7), 6);
                this.d = new eih1();
                j2i j2iVar = ubj.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = qe01Var;
                this.c = h7w.B(oa01.Y0, (o8n) null, (iu30) null, new g001(this, (byte) 6), 6);
                this.d = new eih1();
                j2i j2iVar2 = tbj.a;
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
