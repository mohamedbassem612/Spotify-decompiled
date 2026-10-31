package p;

import android.app.Activity;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class see0 implements xpw {
    public final psw X;
    public final Activity a;
    public final lzn0 b;
    public final xde0 c;
    public final q8n d;
    public final q8n e;
    public iu30 f = u0e0.b1;
    public final String g = pro1.t("localFilesLibrary");
    public final String h;
    public final e7m0 i;
    public final ia00 t;

    public see0(Activity activity, lzn0 lzn0Var, xde0 xde0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = xde0Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        String str = Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE";
        this.h = str;
        this.i = sbl.B(new nee0(false, false, x74.j(activity, str) == 0 ? 2 : 1), new dq7(this, (byte) 18), new ku1(this, (byte) 19), x5d0.Q0, new l6d0(this, (byte) 21));
        this.t = n3o1.q(this).a(wud0.t, new kmd0(this, (byte) 5));
        j2i j2iVar = new j2i(1076845157, new qcd0(this, (byte) 6), true);
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
        return this.i;
    }
}
