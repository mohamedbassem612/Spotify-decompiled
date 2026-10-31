package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u6x implements xpw {
    public final /* synthetic */ byte a;
    public final Object b;

    public u6x(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = gio1.b(Boolean.FALSE);
                break;
            default:
                this.b = k1o1.p();
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return n3o1.q(this).a(lnv.U0, lnv.V0);
            default:
                return n3o1.q(this).a(new kds(this, (byte) 6), lnv.W0);
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                j2i j2iVar = lli.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            default:
                j2i j2iVar2 = oli.a;
                ien0 ien0Var2 = qsw.a;
                return new psw(j2iVar2, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (rey0) obj;
            default:
                return z0o1.k((bpb1) obj, urw.Z, new i5w(this, (byte) 11), 4);
        }
    }
}
