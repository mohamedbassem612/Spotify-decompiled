package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yg01 implements xpw {
    public final /* synthetic */ byte a;
    public final String b;
    public final uqv0 c;
    public final wen0 d;
    public final rey0 e;
    public final ia00 f;
    public final psw g;

    public yg01(String str, uqv0 uqv0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = str;
                this.c = uqv0Var;
                this.d = ((k511) uqv0Var.b).a(str);
                this.e = new rey0(new e9f1(this, (byte) 10));
                this.f = n3o1.q(this).a(vrf1.b1, vrf1.c1);
                j2i j2iVar = new j2i(-46853147, new y2f1(this, (byte) 21), true);
                ien0 ien0Var = qsw.a;
                this.g = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = str;
                this.c = uqv0Var;
                this.d = ((k511) uqv0Var.b).a(str);
                this.e = new rey0(new f2z0(this, (byte) 18));
                this.f = n3o1.q(this).a(kxz0.Q0, new g001(this, (byte) 8));
                j2i j2iVar2 = new j2i(-1093887460, new zyy0(this, (byte) 27), true);
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
