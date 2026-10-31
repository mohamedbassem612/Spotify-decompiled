package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wy61 implements xpw {
    public final /* synthetic */ byte a;
    public final w701 b;
    public final jz51 c;
    public final q8n d;
    public final ljm0 e;
    public final ia00 f;
    public final psw g;

    public wy61(w701 w701Var, jz51 jz51Var, q8n q8nVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = w701Var;
                this.c = jz51Var;
                this.d = q8nVar;
                this.e = h7w.B(rq61.T0, (o8n) null, (iu30) null, new cq61(this, (byte) 4), 6);
                this.f = n3o1.q(this).a(vy61.f, vy61.g);
                j2i j2iVar = ygj.c;
                ien0 ien0Var = qsw.a;
                this.g = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = w701Var;
                this.c = jz51Var;
                this.d = q8nVar;
                this.e = h7w.B(rq61.X, (o8n) null, (iu30) null, new cq61(this, (byte) 2), 6);
                this.f = n3o1.q(this).a(vp51.c1, vp51.e1);
                j2i j2iVar2 = vgj.a;
                ien0 ien0Var2 = qsw.a;
                this.g = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.g;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
