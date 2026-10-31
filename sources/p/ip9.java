package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ip9 implements xpw {
    public final /* synthetic */ byte a;
    public final rm9 b;
    public final js20 c;
    public final ia00 d;
    public final psw e;

    public ip9(rm9 rm9Var, byte b) {
        this.a = b;
        byte b2 = 0;
        switch (b) {
            case 1:
                this.b = rm9Var;
                this.c = z0o1.k(rm9Var.u, tj8.d1, new uv8((Object) this, (byte) 16), 4);
                this.d = n3o1.q(this).a(pn9.g, new hp9(this, (byte) 1));
                j2i j2iVar = t8i.b;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            case 2:
                this.b = rm9Var;
                this.c = z0o1.k(rm9Var.u, tj8.e1, new uv8((Object) this, (byte) 17), 4);
                this.d = n3o1.q(this).a(pn9.h, new hp9(this, (byte) 2));
                j2i j2iVar2 = u8i.b;
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
            default:
                this.b = rm9Var;
                this.c = z0o1.k(rm9Var.u, tj8.c1, new uv8((Object) this, (byte) 15), 4);
                this.d = n3o1.q(this).a(pn9.f, new hp9(this, b2));
                j2i j2iVar3 = s8i.a;
                ien0 ien0Var3 = qsw.a;
                this.e = new psw(j2iVar3, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
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
        }
        return this.e;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }
}
