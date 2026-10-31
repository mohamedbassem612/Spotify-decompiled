package p;

import android.app.Application;
import android.content.Context;
import com.spotify.mobius.MobiusHooks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bj5 implements f961, cj5 {
    public final kly0 N0;
    public final kly0 O0;
    public final tif1 P0;
    public final fwo Q0;
    public final llm R0;
    public final kly0 X;
    public final kly0 Y;
    public final kly0 Z;
    public final Context a;
    public final fwo b;
    public final fwo c;
    public final fwo d;
    public final q8n e;
    public final q8n f;
    public final Application g;
    public final fwo h;
    public final fwo i;
    public final fwo t;

    public bj5(Context context, fwo fwoVar, q8n q8nVar, fwo fwoVar2, fwo fwoVar3, q8n q8nVar2, q8n q8nVar3, Application application, fwo fwoVar4, fwo fwoVar5, fwo fwoVar6, jly0 jly0Var, fwo fwoVar7, fwo fwoVar8, fwo fwoVar9, fwo fwoVar10, tif1 tif1Var, fwo fwoVar11) {
        this.a = context;
        this.b = fwoVar;
        this.c = fwoVar2;
        this.d = fwoVar3;
        this.e = q8nVar2;
        this.f = q8nVar3;
        this.g = application;
        this.h = fwoVar4;
        this.i = fwoVar5;
        this.t = fwoVar6;
        this.X = jly0Var;
        this.Y = fwoVar7;
        this.Z = fwoVar8;
        this.N0 = fwoVar9;
        this.O0 = fwoVar10;
        this.P0 = tif1Var;
        this.Q0 = fwoVar11;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("AppBootstrapService")));
        this.R0 = llmVarE;
        c921.y(llmVarE, (o8n) null, 0, new zi5(this, (lnm) null, (byte) 0), 3);
        c921.y(llmVarE, (o8n) null, 0, new zi5(this, (lnm) null, (byte) 1), 3);
        c921.y(llmVarE, (o8n) null, 0, new bh(this, (lnm) null, (byte) 14), 3);
    }

    public final void a() {
        tif1 tif1Var = this.P0;
        try {
            tif1Var.e(2, "AppBootstrapService_onApplicationCreated", "qss");
            aj5 aj5Var = new aj5(this);
            rue0 rue0Var = MobiusHooks.a;
            synchronized (MobiusHooks.class) {
                MobiusHooks.b = aj5Var;
            }
            byte b = 1;
            byte b2 = 0;
            lnm lnmVar = null;
            if (this.X.get() == fsw0.a) {
                c921.y(this.R0, (o8n) null, 0, new q82(this, lnmVar, b), 3);
            }
            c921.y(this.R0, this.f, 0, new zi5(this, (lnm) null, (byte) 2), 2);
            h54 h54Var = (h54) this.O0.get();
            Executor executor = h54Var.a;
            if (!h54Var.e) {
                executor.execute(new g54(h54Var, b2));
                executor.execute(new s10(h54Var, (byte) 3));
                h54Var.e = true;
            }
            Iterator it = ((Set) this.h.get()).iterator();
            while (it.hasNext()) {
                this.g.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) it.next());
            }
            c921.y(this.R0, (o8n) null, 0, new mx(this, (lnm) null, (byte) 4), 3);
            this.g.registerActivityLifecycleCallbacks(((kwn0) this.i.get()).c);
            hx5 hx5Var = (hx5) this.Y.get();
            synchronized (hx5Var) {
                hx5Var.a.a(hx5Var);
            }
            c921.y(this.R0, (o8n) null, 0, new qm(this, (lnm) null, (byte) 26), 3);
            tif1Var.f("AppBootstrapService_onApplicationCreated", "qss");
        } catch (Throwable th) {
            tif1Var.f("AppBootstrapService_onApplicationCreated", "qss");
            throw th;
        }
    }

    @Override // p.dwo
    public final void shutdown() {
        smo1.q(this.R0);
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
