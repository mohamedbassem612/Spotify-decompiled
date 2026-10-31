package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class azo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ azo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final hko a(kko kkoVar, boolean z) {
        byte b = this.a;
        lbp lbpVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ezo ezoVar = (ezo) ((fwo) lbpVar).c;
                g7h g7hVar = (g7h) ((hc3) ezoVar.v).r.get();
                c8o.l(g7hVar);
                ijr ijrVar = (ijr) ((hc3) ezoVar.v).F.get();
                c8o.l(ijrVar);
                o241 o241Var = (o241) ((hc3) ezoVar.v).g0.get();
                c8o.l(o241Var);
                return new hko(g7hVar, ijrVar, o241Var, kkoVar, z);
            case 1:
                zwg zwgVar = (zwg) ((wzn) ((fwo) lbpVar).c).a;
                return new hko((g7h) zwgVar.b, (ijr) zwgVar.a, (o241) zwgVar.c, kkoVar, z);
            default:
                wgp wgpVar = (wgp) lbpVar.c;
                g7h g7hVar2 = (g7h) wgpVar.a.G.get();
                c8o.l(g7hVar2);
                ijr ijrVar2 = (ijr) wgpVar.a.F.get();
                c8o.l(ijrVar2);
                o241 o241Var2 = (o241) wgpVar.a.Y.get();
                c8o.l(o241Var2);
                return new hko(g7hVar2, ijrVar2, o241Var2, kkoVar, z);
        }
    }
}
