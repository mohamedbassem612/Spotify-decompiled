package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ozf0 {
    public final u9c0 a;
    public final MainLayout b;
    public final e1g0 c;
    public final bbr0 d;
    public final eq80 e;
    public final m0n0 f;

    public ozf0(u9c0 u9c0Var, MainLayout mainLayout, e1g0 e1g0Var, bbr0 bbr0Var, eq80 eq80Var, m0n0 m0n0Var) {
        this.a = u9c0Var;
        this.b = mainLayout;
        this.c = e1g0Var;
        this.d = bbr0Var;
        this.e = eq80Var;
        this.f = m0n0Var;
    }

    public static void c(ozf0 ozf0Var, MainLayoutContentContainerView mainLayoutContentContainerView, String str, pzf0 pzf0Var, Object obj, iu30 iu30Var, int i) {
        mainLayoutContentContainerView.E(str, pzf0Var, gio1.b(obj), ozf0Var.d, ozf0Var.e, ozf0Var.f, ozf0Var.b.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view(), (i & 8) != 0 ? dvf0.X : iu30Var, nim0.a);
    }

    public final float a(int i) {
        ConstraintLayout constraintLayout = this.b;
        return constraintLayout.getResources().getDimension(i) / constraintLayout.getResources().getDisplayMetrics().density;
    }

    public final float b() {
        int i;
        int iOrdinal = this.b.getMode().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = 2131166402;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return 0.0f;
            }
            i = 2131166390;
        }
        return a(i);
    }
}
