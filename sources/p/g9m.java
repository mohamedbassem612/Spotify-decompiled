package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g9m implements xpw {
    public final Context a;
    public final rey0 b = new rey0(new mgl(this, (byte) 3));
    public final ia00 c = n3o1.q(this).a(ngl.X0, ngl.Y0);
    public final psw d;

    public g9m(Context context) {
        this.a = context;
        j2i j2iVar = rfi.a;
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
