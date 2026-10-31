package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bp5 implements jlq0 {
    public final /* synthetic */ byte a = 1;
    public final Context b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bp5(Context context, kly0 kly0Var, q8n q8nVar, luk lukVar) {
        this.b = context;
        this.c = kly0Var;
        this.d = q8nVar;
        this.e = new e85(false, lukVar);
    }

    public final void c() {
        switch (this.a) {
            case 0:
                ((y2g0) this.c).b("AppLifecycleShutdownOperation", new f85(this, (byte) 21));
                break;
            default:
                fn31.T(ov40.a, (q8n) this.d, 0, new hzb(this, (lnm) null, (byte) 8), 2);
                break;
        }
    }

    public final String getName() {
        switch (this.a) {
            case 0:
                return "AppLifecycleShutdownOperation";
            default:
                return "ClientMessagingPlatformPreloadOperation";
        }
    }

    public bp5(y2g0 y2g0Var, Context context, cd30 cd30Var, oo70 oo70Var) {
        this.c = y2g0Var;
        this.b = context;
        this.d = cd30Var;
        this.e = oo70Var;
    }
}
