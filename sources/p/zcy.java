package p;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zcy implements f4h1 {
    public final String a;
    public final zob1 b;
    public final o1o c;
    public final c8b d;
    public final llm e;
    public xab1 f;
    public final FrameLayout g;

    public zcy(x290 x290Var, q8n q8nVar, Context context, String str, zob1 zob1Var, o1o o1oVar) {
        this.a = str;
        this.b = zob1Var;
        this.c = o1oVar;
        this.d = x290Var.a();
        this.e = smo1.e(q8nVar);
        FrameLayout frameLayout = new FrameLayout(context);
        if (!((Boolean) zob1Var.getValue()).booleanValue()) {
            frameLayout.addView(o1oVar.h);
        }
        this.g = frameLayout;
    }

    public final Object getView() {
        return this.g;
    }

    public final Bundle serialize() {
        return this.c.serialize();
    }

    public final void start() {
        this.f = fn31.T(this.e, (o8n) null, 0, new ett(this, (lnm) null, (byte) 18), 3);
        this.c.start();
    }

    public final void stop() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c.stop();
    }
}
