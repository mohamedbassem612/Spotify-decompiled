package p;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sz7 implements rd21 {
    public final /* synthetic */ tz7 a;

    public sz7(tz7 tz7Var) {
        this.a = tz7Var;
    }

    @Override // p.rd21
    public final jca[] b(Handler handler, qwj1 qwj1Var, t38 t38Var, hbe1 hbe1Var, plj0 plj0Var) {
        Context applicationContext = this.a.a.getApplicationContext();
        return new zjh0[]{new zjh0(applicationContext, new uf0(applicationContext), handler, t38Var, new vgr(applicationContext).g())};
    }
}
