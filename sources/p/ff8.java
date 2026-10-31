package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ff8 implements xpw {
    public final zhh1 a;
    public final rey0 b;
    public final ia00 c = n3o1.q(this).a(jb8.i, jb8.X);
    public final psw d;

    public ff8(zhh1 zhh1Var, Activity activity) {
        this.a = zhh1Var;
        this.b = new rey0(new ef8(this, activity, (byte) 0));
        j2i j2iVar = c8i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
