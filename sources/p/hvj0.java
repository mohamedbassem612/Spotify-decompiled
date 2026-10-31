package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hvj0 implements xpw {
    public final /* synthetic */ byte a;
    public final r7j0 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public hvj0(r7j0 r7j0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = r7j0Var;
                this.c = new rey0(new mbj0(this, (byte) 7));
                this.d = n3o1.q(this).a(eej0.T0, eej0.U0);
                j2i j2iVar = o1j.b;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = r7j0Var;
                this.c = new rey0(new mbj0(this, (byte) 8));
                this.d = n3o1.q(this).a(eej0.Y0, eej0.Z0);
                j2i j2iVar2 = q1j.a;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            case 3:
                this.b = r7j0Var;
                this.c = new rey0(new mbj0(this, (byte) 11));
                this.d = n3o1.q(this).a(w7k0.h, w7k0.i);
                j2i j2iVar3 = z1j.d;
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
            case 4:
                this.b = r7j0Var;
                this.c = new rey0(new mbj0(this, (byte) 12));
                this.d = n3o1.q(this).a(w7k0.X, w7k0.Z);
                j2i j2iVar4 = a2j.b;
                ien0 ien0Var4 = qsw.a;
                this.e = new psw(j2iVar4, (byte) 0);
                break;
            default:
                this.b = r7j0Var;
                this.c = new rey0(new mbj0(this, (byte) 6));
                this.d = n3o1.q(this).a(eej0.R0, eej0.S0);
                j2i j2iVar5 = m1j.a;
                ien0 ien0Var5 = qsw.a;
                this.e = new psw(j2iVar5, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.e;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }
}
