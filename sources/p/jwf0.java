package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jwf0 implements xpw {
    public final Context a;
    public final r35 b;
    public final jjz c;
    public final c9n d;
    public final pd71 e;
    public final rey0 f;
    public final idd1 g = new idd1(i0f0.e1);
    public final u7h1 h = new u7h1(new mbf0(this, 8), new otf0(this, (byte) 1));
    public final psw i;

    public jwf0(Context context, String str, String str2, r35 r35Var, c9n c9nVar, jjz jjzVar, pd71 pd71Var) {
        this.a = context;
        this.b = r35Var;
        this.c = jjzVar;
        this.d = c9nVar;
        this.e = pd71Var;
        this.f = new rey0(new iwf0(this, str, str2, (byte) 0));
        j2i j2iVar = hyi.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
