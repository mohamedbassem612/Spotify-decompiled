package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gc60 implements xpw {
    public final Context a;
    public final xf60 b;
    public final boolean c;
    public final rey0 d = new rey0(new gn50(this, (byte) 12));
    public final psw e;

    public gc60(Context context, xf60 xf60Var, boolean z) {
        this.a = context;
        this.b = xf60Var;
        this.c = z;
        j2i j2iVar = gsi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return n3o1.q(this).a(vn50.a1, vn50.b1);
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
