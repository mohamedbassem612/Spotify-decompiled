package p;

import com.spotify.episodepage.loading.exceptions.CustomErrorException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ctq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ctq0(dtq0 dtq0Var, byte b) {
        super(1);
        this.a = b;
        this.b = dtq0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dtq0 dtq0Var = this.b;
        switch (b) {
            case 0:
                dtq0Var.e.invoke(((zsq0) obj).a);
                dtq0Var.i();
                t890.l("loadable", (t45) dtq0Var.i.b);
                break;
            default:
                iu30 iu30Var = dtq0Var.f;
                Throwable th = ((xsq0) obj).a;
                if (!((Boolean) iu30Var.invoke(th)).booleanValue()) {
                    t890.l("loadable", (t45) dtq0Var.i.b);
                    dtq0Var.h.a();
                    if (!(th instanceof CustomErrorException)) {
                        dtq0Var.h(th);
                    } else {
                        dtq0Var.g();
                    }
                }
                break;
        }
        return rih1Var;
    }
}
