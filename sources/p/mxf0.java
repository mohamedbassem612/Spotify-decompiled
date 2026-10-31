package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mxf0 implements xpw {
    public final psw X;
    public final Context a;
    public final r35 b;
    public final jjz c;
    public final pd71 d;
    public final c9n e;
    public final String f;
    public final String g;
    public final rey0 h = new rey0(new kxf0(this, (byte) 0));
    public final idd1 i = new idd1(lxf0.b);
    public final u7h1 t = eth.a0((vu30) null, new kxf0(this, (byte) 1), 1);

    public mxf0(Context context, String str, String str2, r35 r35Var, c9n c9nVar, jjz jjzVar, pd71 pd71Var) {
        this.a = context;
        this.b = r35Var;
        this.c = jjzVar;
        this.d = pd71Var;
        this.e = c9nVar;
        this.f = str;
        this.g = str2;
        j2i j2iVar = iyi.a;
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
