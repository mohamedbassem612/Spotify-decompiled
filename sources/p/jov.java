package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jov implements r2g {
    public final String a;
    public final j7p b;
    public final huz c;
    public final yd91 d;
    public final mr20 e;
    public final o3r f;
    public final aa3 g;

    public jov(Context context, String str, koc0 koc0Var, j7p j7pVar) {
        this.a = str;
        this.b = j7pVar;
        this.c = new huz(Boolean.valueOf(context.getResources().getConfiguration().orientation == 1), (byte) 10);
        this.d = new yd91(3, new v7v(this, (byte) 7));
        this.e = rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 19));
        this.f = w3p1.o(new l4r(pwc0.b, 1, rnv.Y, new j4r(new nit(this, (byte) 22)), rnv.Z), rnv.t);
        this.g = new aa3(this);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.d;
    }

    @Override // p.r2g
    public final mr20 g() {
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.e;
    }
}
