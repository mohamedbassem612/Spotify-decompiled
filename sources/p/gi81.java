package p;

import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gi81 implements iyf0 {
    public final oe41 a;
    public final ke71 b;
    public wh81 c;

    public gi81(oe41 oe41Var, ke71 ke71Var) {
        this.a = oe41Var;
        this.b = ke71Var;
    }

    @Override // p.iyf0
    public final void c() {
        wh81 wh81Var = this.c;
        if (wh81Var != null) {
            wh81Var.h.d(wh81Var.i);
            wh81Var.N0.d(wh81Var.O0);
            wh81Var.X.d(wh81Var.Y);
            fns fnsVar = igu.a;
            llm llmVarE = smo1.e(pyf0.a.f);
            wh81Var.d = llmVarE;
            c921.y(llmVarE, (o8n) null, 0, new b751(wh81Var, (lnm) null, (byte) 20), 3);
            wh81Var.Q0.m(Boolean.TRUE);
        }
    }

    @Override // p.iyf0
    public final void d() {
        wh81 wh81Var = this.c;
        if (wh81Var != null) {
            wh81Var.Q0.m(Boolean.FALSE);
            llm llmVar = wh81Var.d;
            if (llmVar != null) {
                smo1.q(llmVar);
            }
            wh81Var.d = null;
            wh81Var.X.c(wh81Var.Y);
            wh81Var.N0.c(wh81Var.O0);
            wh81Var.h.c(wh81Var.i);
        }
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        if (this.c == null) {
            Object tag = viewGroup.getTag(2131430971);
            th81 th81Var = tag instanceof th81 ? (th81) tag : null;
            if (th81Var == null) {
                n57.e("Could not find SideDrawerMainLayoutConfig");
            }
            wh81 wh81VarC = this.b.c(viewGroup, th81Var);
            oe41 oe41Var = this.a;
            Bundle bundleA = oe41Var.a("com.spotify.sidedrawer.sidedrawer.SideDrawerPlugin");
            if (bundleA != null) {
                if (bundleA.getBoolean("isSideDrawerOpened", false)) {
                    wh81VarC.a.u(false);
                }
                wh81VarC.t = bundleA.getString("identifierWhenOpened");
            }
            oe41Var.c("com.spotify.sidedrawer.sidedrawer.SideDrawerPlugin", wh81VarC);
            this.c = wh81VarC;
        }
    }
}
