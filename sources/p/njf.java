package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class njf implements xpw {
    public final Context a;
    public final lzn0 b;
    public final add c;
    public final dto0 d;
    public final oto0 e;
    public final idd1 f = new idd1(new lwe(this, (byte) 5));
    public final rey0 g = new rey0(new dwd(this, (byte) 19));
    public final ia00 h;
    public final psw i;

    public njf(Context context, lzn0 lzn0Var, add addVar, dto0 dto0Var, oto0 oto0Var, String str) {
        this.a = context;
        this.b = lzn0Var;
        this.c = addVar;
        this.d = dto0Var;
        this.e = oto0Var;
        this.h = n3o1.q(this).a(new pm6(str, (byte) 3), new zee(this, (byte) 11));
        j2i j2iVar = new j2i(1902437392, new gtd(this, (byte) 18), true);
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
        return this.g;
    }
}
