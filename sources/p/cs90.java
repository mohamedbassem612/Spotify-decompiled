package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cs90 implements xpw {
    public final /* synthetic */ byte a;
    public final c9c0 b;
    public final up90 c;
    public final ikp d;
    public final js20 e;
    public final ia00 f;
    public final psw g;

    public cs90(c9c0 c9c0Var, up90 up90Var, ikp ikpVar, byte b) {
        this.a = b;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 1:
                this.b = c9c0Var;
                this.c = up90Var;
                this.d = ikpVar;
                this.e = x3p1.m(new x880(c9c0Var.b.current(), this, (byte) 7), new dz90(this, b3), ul90.t, (o8n) null, new dz90(this, b2), 8);
                this.f = n3o1.q(this).a(mx90.f, mx90.g);
                j2i j2iVar = xti.a;
                ien0 ien0Var = qsw.a;
                this.g = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = c9c0Var;
                this.c = up90Var;
                this.d = ikpVar;
                this.e = x3p1.m(new x880(c9c0Var.b.current(), this, (byte) 5), new zr90(this, b3), ul90.c, (o8n) null, new zr90(this, b2), 8);
                this.f = n3o1.q(this).a(rb80.V0, rb80.W0);
                j2i j2iVar2 = oti.a;
                ien0 ien0Var2 = qsw.a;
                this.g = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public static yr90 e(pp90 pp90Var) {
        if (pp90Var == null) {
            return xr90.a;
        }
        String str = pp90Var.a;
        String str2 = pp90Var.d.b;
        np90 np90Var = pp90Var.h;
        int i = np90Var.f;
        return new wr90(str, str2, i != 1, i == 2, true ^ np90Var.g);
    }

    public static cz90 f(pp90 pp90Var) {
        if (pp90Var == null) {
            return bz90.a;
        }
        String str = pp90Var.a;
        np90 np90Var = pp90Var.h;
        int i = np90Var.f;
        return new az90(str, i != 1, i == 2, np90Var.g);
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
