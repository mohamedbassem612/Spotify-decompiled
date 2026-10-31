package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c78 implements xq91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c78(Object obj, ohd ohdVar, byte b) {
        this.a = b;
        this.c = obj;
        this.b = ohdVar;
    }

    public final void a(yq91 yq91Var) {
        tac0 tac0Var;
        w8c0 w8c0Var;
        byte b = this.a;
        ohd ohdVar = this.b;
        w8c0 w8c0Var2 = w8c0.e;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (((f0i) ((d78) obj).b).a.i.a(w8c0Var2)) {
                    ohdVar.resumeWith(Boolean.TRUE);
                }
                break;
            case 1:
                cfr cfrVar = (cfr) obj;
                dg30 dg30Var = cfrVar.a;
                dg30 dg30Var2 = dg30Var instanceof dg30 ? dg30Var : null;
                if (dg30Var2 != null && (tac0Var = ((f0i) dg30Var2).a) != null && (w8c0Var = tac0Var.i) != null && w8c0Var.a(w8c0Var2)) {
                    cfrVar.c.i(this);
                    ohdVar.resumeWith(Boolean.TRUE);
                    break;
                }
                break;
            case 2:
                if (((f0i) ((ivg0) obj).j).a.i.a(w8c0Var2)) {
                    ohdVar.resumeWith(Boolean.TRUE);
                }
                break;
            case 3:
                byg0 byg0Var = (byg0) obj;
                if (byg0Var.a.d.c.getLifecycle().b().a(w8c0Var2)) {
                    byg0Var.i.i(this);
                    if (ohdVar.s() instanceof ago0) {
                        ohdVar.k(jtg0.f, Boolean.TRUE);
                    }
                }
                break;
            default:
                if (((f0i) ((dg30) ((s880) obj).c)).a.i.a(w8c0Var2)) {
                    ohdVar.resumeWith(Boolean.TRUE);
                }
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((d78) obj).a.i(this);
                break;
            case 1:
                ((cfr) obj).c.i(this);
                break;
            case 2:
                ((ivg0) obj).h.i(this);
                break;
            case 3:
                ((byg0) obj).i.i(this);
                break;
            default:
                kt91 kt91Var = (kt91) ((s880) obj).h;
                if (kt91Var != null) {
                    kt91Var.i(this);
                }
                break;
        }
    }
}
