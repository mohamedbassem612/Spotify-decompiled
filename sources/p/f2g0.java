package p;

import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f2g0 {
    public static final /* synthetic */ mma0[] g = {new een0(f2g0.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0), new een0(f2g0.class, "nowPlayingViewPopulated", "getNowPlayingViewPopulated()Ljava/lang/Boolean;", 0), new een0(f2g0.class, "visibilities", "getVisibilities()Lcom/spotify/mainlayout/ui/view/visibility/MainLayoutVisibilityManager$Visibilities;", 0)};
    public final MainLayout a;
    public final z1g0 b;
    public final fad0 c;
    public final e2g0 d = new e2g0(this, 0);
    public final e2g0 e = new e2g0(this, 1);
    public final e2g0 f = new e2g0(this, 2);

    /* JADX WARN: Multi-variable type inference failed */
    public f2g0(MainLayout mainLayout, z1g0 z1g0Var) {
        this.a = mainLayout;
        this.b = z1g0Var;
        this.c = new fad0(mainLayout.getContext());
    }

    public final void a() {
        ggr0 ggr0Var;
        mma0[] mma0VarArr = g;
        mma0 mma0Var = mma0VarArr[0];
        hgr0 hgr0Var = (hgr0) ((sgp0) this.d).a;
        if (hgr0Var == null || (ggr0Var = hgr0Var.a) == null) {
            ggr0Var = dgr0.a;
        }
        mma0 mma0Var2 = mma0VarArr[1];
        Boolean bool = (Boolean) ((sgp0) this.e).a;
        this.f.c(mma0VarArr[2], this, this.b.e(new c2g0(ggr0Var, bool != null ? bool.booleanValue() : false)));
    }
}
