package p;

import android.content.Context;
import android.net.NetworkRequest;
import androidx.glance.session.SessionWorker;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cg61 implements xf61 {
    public final xgn0 a = ygn0.a();
    public final bg61 b = new bg61(this);

    public static final void a(cg61 cg61Var, Context context) {
        awl1.d(context).c("sessionWorkerKeepEnabled", 2, new ciq0(SessionWorker.class).h(3650L, TimeUnit.DAYS).f(new gjl(new e8o0((NetworkRequest) null), 1, true, false, false, false, -1L, -1L, o7h.p1(new LinkedHashSet()))).b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(vu30 vu30Var, onm onmVar) throws Throwable {
        yf61 yf61Var;
        vgn0 vgn0Var;
        vgn0 vgn0Var2;
        if (onmVar instanceof yf61) {
            yf61Var = (yf61) onmVar;
            int i = yf61Var.f;
            if ((i & os00.INVALID_ID) != 0) {
                yf61Var.f = i - os00.INVALID_ID;
            } else {
                yf61Var = new yf61(this, onmVar);
            }
        } else {
            yf61Var = new yf61(this, onmVar);
        }
        Object obj = yf61Var.d;
        int i2 = yf61Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                yf61Var.a = this;
                yf61Var.b = (a8d1) vu30Var;
                vgn0Var = this.a;
                yf61Var.c = vgn0Var;
                yf61Var.f = 1;
                if (vgn0Var.a(yf61Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = (vgn0) yf61Var.a;
                try {
                    hm5.M(obj);
                    vgn0Var2.c((Object) null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            vgn0 vgn0Var3 = yf61Var.c;
            vu30Var = (vu30) yf61Var.b;
            cg61 cg61Var = (cg61) yf61Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            this = cg61Var;
            bg61 bg61Var = this.b;
            yf61Var.a = vgn0Var;
            yf61Var.b = null;
            yf61Var.c = null;
            yf61Var.f = 2;
            Object objInvoke = vu30Var.invoke(bg61Var, yf61Var);
            if (objInvoke != d9nVar) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objInvoke;
                vgn0Var2 = vgn0Var4;
                vgn0Var2.c((Object) null);
                return obj;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
