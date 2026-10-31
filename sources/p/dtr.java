package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dtr implements xpw {
    public final /* synthetic */ byte a;
    public final ft30 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public dtr(ft30 ft30Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = ft30Var;
                this.c = new rey0(new b1s(this, (byte) 22));
                this.d = n3o1.q(this).a(njs.Z0, njs.a1);
                j2i j2iVar = ikj.a;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = ft30Var;
                this.c = new rey0(new mgl(this, (byte) 27));
                this.d = n3o1.q(this).a(zho.X0, zho.Y0);
                j2i j2iVar2 = nhi.a;
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
        byte b = this.a;
        return this.c;
    }
}
