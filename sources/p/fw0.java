package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fw0 implements it80 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ fw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                wmo1.q(ajq0Var, cpn1.w(blc0.Y), "Handle ad routing.", new ew0(this, (lnm) null, (byte) 0));
                break;
            case 1:
                ajq0Var.K(blc0.O0, "A page for the plan manager to search for content to block for managed accounts", new pdx0(this));
                wmo1.q(ajq0Var, l6o1.p(new jbh0[]{cpn1.w(blc0.Fc), cpn1.w(blc0.Dc)}), "A page for the plan manager to search for content to add to the blocked or approved list for a managed account", new qt(this, (lnm) null, (byte) 3));
                break;
            case 2:
                ajq0Var.G(blc0.F3, "Open the UC choice screen checkout_session_id", new fna(this, (byte) 13));
                break;
            case 3:
                oto0 oto0Var = (oto0) this.b;
                yg4 yg4Var = oto0Var.a;
                yg4 yg4Var2 = oto0Var.a;
                if (!yg4Var.b()) {
                    ajq0Var.K(blc0.c5, "Show notification settings fragment", wdu0.Z0);
                }
                if (!yg4Var2.d()) {
                    ajq0Var.K(blc0.Ub, "Show group categories fragment", new nbc(this, (byte) 17));
                }
                if (!yg4Var2.c()) {
                    ajq0Var.K(blc0.Tb, "Show category details fragment", new ubc(this, (byte) 17));
                }
                break;
            default:
                ajq0Var.K(blc0.Lf, "Page presenting the main search without a query", new ij01(new f751(this, (byte) 0), (byte) 18));
                ajq0Var.K(blc0.Kf, "Page presenting the main search with a query", new ij01(new f751(this, (byte) 1), (byte) 18));
                ajq0Var.K(blc0.If, "Page presenting the drilldown search with a given query", new ij01(new f751(this, (byte) 2), (byte) 18));
                ajq0Var.K(blc0.b4, "Page presenting the main search scoped to Your Library", new ij01(new f751(this, (byte) 3), (byte) 18));
                ajq0Var.H("android.media.action.MEDIA_PLAY_FROM_SEARCH", "Page presenting the main search in autoplay", new ks21(this, (byte) 9));
                break;
        }
    }

    public hrn0 b(y651 y651Var) {
        boolean zE = ((di4) this.b).E();
        a6w0 a6w0Var = a6w0.a;
        return zE ? new hrn0(q651.class, y651Var, a6w0Var) : new hrn0(o1c0.class, y651Var, a6w0Var);
    }
}
