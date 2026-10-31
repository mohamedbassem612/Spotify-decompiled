package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rj2 implements dwo {
    public final Context a;
    public final luk b;
    public final ov20 c;
    public final ri2 d;
    public final mbo0 e;
    public final si8 f;
    public faa0 g;
    public final llm h;

    public rj2(Context context, luk lukVar, ov20 ov20Var, ri2 ri2Var, mbo0 mbo0Var, ohv0 ohv0Var, t2j0 t2j0Var, jqt jqtVar, q8n q8nVar) {
        this.a = context;
        this.b = lukVar;
        this.c = ov20Var;
        this.d = ri2Var;
        this.e = mbo0Var;
        this.f = new si8(ohv0Var, t2j0Var, jqtVar);
        llm llmVarE = smo1.e(q8nVar);
        this.h = llmVarE;
        faa0 faa0Var = this.g;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.g = c921.y(llmVarE, (o8n) null, 0, new qm(this, (lnm) null, (byte) 15), 3);
        c921.y(llmVarE, (o8n) null, 0, new mx(this, null, (byte) 3), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(gn2 gn2Var) throws NoWhenBranchMatchedException {
        boolean z = gn2Var instanceof en2;
        ri2 ri2Var = this.d;
        if (z) {
            ri2Var.a.m((Object) null, ni2.a);
        } else {
            if (!(gn2Var instanceof fn2)) {
                eg.o();
                return;
            }
            fn2 fn2Var = (fn2) gn2Var;
            int i = fn2Var.a;
            Logger.k("Age verification blocked: ".concat(kk0.B(i)), new Object[0]);
            ri2Var.a.m((Object) null, new oi2(i, fn2Var.b));
        }
    }

    public final void shutdown() {
        smo1.q(this.h);
        this.g = null;
    }
}
