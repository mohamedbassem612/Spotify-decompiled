package p;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rmm0 implements qmm0 {
    public final Context a;
    public llm b;
    public final drr0 c = exd0.u(1.0f);
    public faa0 d;

    public rmm0(Context context) {
        this.a = context;
    }

    public final /* bridge */ m8n A(n8n n8nVar) {
        return tm80.y(this, n8nVar);
    }

    public final /* bridge */ o8n C(n8n n8nVar) {
        return tm80.E(this, n8nVar);
    }

    @Override // p.qmm0
    public final float i() {
        zob1 zob1Var;
        if (this.d == null) {
            Context context = this.a;
            nen0 nen0Var = gtl1.a;
            synchronized (nen0Var) {
                try {
                    Object objG = nen0Var.g(context);
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        bbc bbcVarA = mno1.a(-1, 0, 6);
                        objG = d5p1.t(h4p1.l(new ae1(contentResolver, uriFor, new p2a(bbcVarA, zno1.g(Looper.getMainLooper()), (byte) 3), bbcVarA, context, (lnm) null)), smo1.g(), new alb1(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        nen0Var.m(context, objG);
                    }
                    zob1Var = (zob1) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.t(((Number) zob1Var.getValue()).floatValue());
            llm llmVar = this.b;
            if (llmVar == null) {
                eg.m("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.d = c921.y(llmVar, (o8n) null, 0, new d7i0(zob1Var, this, (lnm) null, (byte) 24), 3);
        }
        return this.c.s();
    }

    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return tm80.x(this, obj, vu30Var);
    }

    public final /* bridge */ o8n y(o8n o8nVar) {
        return tm80.F(this, o8nVar);
    }
}
