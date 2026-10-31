package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ou8 implements xpw {
    public final /* synthetic */ byte a;
    public final ljm0 b;
    public final eih1 c;
    public final psw d;

    public ou8(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = h7w.B(wiu.Y, (o8n) null, (iu30) null, uji.a, 6);
                this.c = new eih1();
                j2i j2iVar = uji.b;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = h7w.B(oc8.U0, (o8n) null, (iu30) null, jb8.N0, 6);
                this.c = new eih1();
                j2i j2iVar2 = f8i.a;
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
        return this.c;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }
}
