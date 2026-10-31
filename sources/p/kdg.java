package p;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kdg implements f4h1, ihr0 {
    public final vdg a;
    public final pdg b;
    public final View c;

    public kdg(e6p e6pVar, f6p f6pVar, Context context, cir0 cir0Var, LayoutInflater layoutInflater, ViewGroup viewGroup, ddg ddgVar) {
        gw70 gw70Var = (gw70) ((rls0) ((tnm) f6pVar.a.c).c).c.get();
        c8o.l(gw70Var);
        vdg vdgVar = new vdg(gw70Var, context, cir0Var, layoutInflater, viewGroup);
        this.a = vdgVar;
        tnm tnmVar = (tnm) e6pVar.a.c;
        lzn0 lzn0Var = (lzn0) ((rls0) tnmVar.c).b.get();
        c8o.l(lzn0Var);
        mdg mdgVar = (mdg) tnmVar.b;
        rls0 rls0Var = (rls0) tnmVar.c;
        i8h1 i8h1Var = (i8h1) rls0Var.i.get();
        c8o.l(i8h1Var);
        cfd cfdVar = new cfd(mdgVar, i8h1Var);
        kly0 kly0Var = rls0Var.a;
        Activity activity = (Activity) kly0Var.get();
        c8o.l(activity);
        Activity activity2 = (Activity) kly0Var.get();
        c8o.l(activity2);
        aod aodVar = new aod(activity, new efr(activity2, (byte) 22), (byte) 11);
        iyc0 iyc0Var = (iyc0) rls0Var.f.get();
        c8o.l(iyc0Var);
        op31 op31Var = (op31) rls0Var.g.get();
        c8o.l(op31Var);
        q8n q8nVar = (q8n) rls0Var.h.get();
        c8o.l(q8nVar);
        this.b = new pdg(lzn0Var, cfdVar, aodVar, iyc0Var, op31Var, mdgVar, q8nVar, ddgVar, vdgVar);
        this.c = vdgVar.d;
    }

    public final boolean b(ehr0 ehr0Var) {
        ihr0 ihr0Var = this.a;
        ihr0 ihr0Var2 = ihr0Var instanceof ihr0 ? ihr0Var : null;
        if (ihr0Var2 != null) {
            return ihr0Var2.b(ehr0Var);
        }
        return false;
    }

    public final Object getView() {
        return this.c;
    }

    public final void stop() {
        this.b.stop();
    }

    public final void start() {
    }
}
