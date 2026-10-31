package p;

import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vyf0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ MainLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vyf0(MainLayout mainLayout, byte b) {
        super((Object) null);
        this.b = b;
        this.c = mainLayout;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        i0g0 nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view;
        i0g0 nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view2;
        byte b = this.b;
        MainLayout mainLayout = this.c;
        switch (b) {
            case 0:
                if (((c7p0) obj) != ((c7p0) obj2)) {
                    mainLayout.getVisibilityManager().getClass();
                    c7p0 nowPlayingViewMode = mainLayout.getNowPlayingViewMode();
                    if (nowPlayingViewMode != null && (nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view = mainLayout.getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view()) != null) {
                        nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view.f(new d0g0(nowPlayingViewMode, u890.j(mainLayout.getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view(), Boolean.TRUE)));
                    }
                }
                break;
            case 1:
                f2g0 visibilityManager = mainLayout.getVisibilityManager();
                visibilityManager.e.c(f2g0.g[1], visibilityManager, (Boolean) obj2);
                c7p0 nowPlayingViewMode2 = mainLayout.getNowPlayingViewMode();
                if (nowPlayingViewMode2 != null && (nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view2 = mainLayout.getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view()) != null) {
                    nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view2.f(new d0g0(nowPlayingViewMode2, u890.j(mainLayout.getNowPlayingViewPopulated$src_main_java_com_spotify_mainlayout_ui_view_view(), Boolean.TRUE)));
                }
                break;
            default:
                hgr0 hgr0Var = (hgr0) obj2;
                f2g0 visibilityManager2 = mainLayout.getVisibilityManager();
                visibilityManager2.d.c(f2g0.g[0], visibilityManager2, hgr0Var);
                d1g0 d1g0Var = mainLayout.G1;
                d1g0Var.e.c(d1g0.i[2], d1g0Var, hgr0Var);
                xyf0 bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view = mainLayout.getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view();
                if (bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view != null) {
                    bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view.h.c(xyf0.i[2], bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view, hgr0Var);
                }
                break;
        }
    }
}
