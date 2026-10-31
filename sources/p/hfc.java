package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hfc implements xpw {
    public final Context a;
    public final lzn0 b;
    public final rey0 c = new rey0(new gaa(this, (byte) 20));
    public final eih1 d = new eih1();
    public final psw e;

    public hfc(Context context, lzn0 lzn0Var) {
        this.a = context;
        this.b = lzn0Var;
        j2i j2iVar = gai.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
