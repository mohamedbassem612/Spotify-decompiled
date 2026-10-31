package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lao implements wpw {
    public final /* synthetic */ byte a;
    public final rey0 b;
    public final nsw c;
    public final ia00 d;

    public lao(gw70 gw70Var, yqg yqgVar, urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 0;
        this.d = n3o1.q(this).a(new z63(urk0Var, (byte) 12), cnn.V0);
        this.b = new rey0(new jao(iu30Var, yqgVar, (byte) 0));
        this.c = jch0.j(new gmb(gw70Var, (byte) 1));
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

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.b;
    }

    public lao(gw70 gw70Var, urk0 urk0Var, yqg yqgVar, iu30 iu30Var) {
        this.a = (byte) 2;
        byte b = 1;
        this.d = n3o1.q(this).a(new zm01(urk0Var, b), rw01.b);
        this.b = new rey0(new jao(iu30Var, yqgVar, b));
        this.c = jch0.j(new gmb(gw70Var, (byte) 2));
    }

    public lao(xh71 xh71Var) {
        this.a = (byte) 1;
        this.b = new rey0(new oat(xh71Var, (byte) 14));
        this.c = jch0.j(riu.d1);
        this.d = n3o1.q(this).a(riu.b1, riu.c1);
    }
}
