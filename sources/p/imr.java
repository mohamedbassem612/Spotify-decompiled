package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import com.spotify.encoreconsumermobile.elements.follow.FollowButtonView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.shuffle.ShuffleButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class imr implements qzh {
    public final h72 a;
    public final p2o0 b;
    public final PlayButtonView c;

    public imr(Context context) {
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        h360.h(h72VarG);
        this.a = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131624344);
        ConstraintLayout constraintLayout = constraintLayoutF;
        int i = 2131428228;
        if (((Space) m5n1.t(constraintLayoutF, 2131428228)) != null) {
            i = 2131428234;
            ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutF, 2131428234);
            if (contextMenuButtonT != null) {
                i = 2131428511;
                DownloadButtonView downloadButtonViewT = m5n1.t(constraintLayoutF, 2131428511);
                if (downloadButtonViewT != null) {
                    i = 2131428924;
                    FollowButtonView followButtonViewT = m5n1.t(constraintLayoutF, 2131428924);
                    if (followButtonViewT != null) {
                        i = 2131429064;
                        if (m5n1.t(constraintLayoutF, 2131429064) != null) {
                            i = 2131429069;
                            if (m5n1.t(constraintLayoutF, 2131429069) != null) {
                                i = 2131430970;
                                ShuffleButtonView shuffleButtonViewT = m5n1.t(constraintLayoutF, 2131430970);
                                if (shuffleButtonViewT != null) {
                                    i = 2131431356;
                                    TextView textView = (TextView) m5n1.t(constraintLayoutF, 2131431356);
                                    if (textView != null) {
                                        this.b = new p2o0(constraintLayout, contextMenuButtonT, downloadButtonViewT, followButtonViewT, shuffleButtonViewT, textView, (byte) 10);
                                        this.c = h360.g(h72VarG);
                                        h360.i(h72VarG, new ptj(1, this, imr.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 20));
                                        h360.a(h72VarG, constraintLayout, textView);
                                        ((BehaviorRetainingAppBarLayout) h72VarG.b).a(new rzg(this, (byte) 4));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        z1h z1hVar = (z1h) obj;
        int i = z1hVar.b;
        h72 h72Var = this.a;
        h360.j(h72Var, i);
        TextView textView = (TextView) h72Var.Y;
        String str = z1hVar.a;
        textView.setText(str);
        p2o0 p2o0Var = this.b;
        ((TextView) p2o0Var.g).setText(str);
        ((FollowButtonView) p2o0Var.e).j(z1hVar.e);
        DownloadButtonView downloadButtonView = (DownloadButtonView) p2o0Var.d;
        sru sruVar = z1hVar.f;
        sru sruVar2 = downloadButtonView.e;
        if (sruVar2 == null) {
            downloadButtonView.e = sruVar;
            sruVar2 = sruVar;
        }
        downloadButtonView.b(sruVar2, sruVar);
        ((ContextMenuButton) p2o0Var.c).a(z1hVar.g);
        this.c.B(z1hVar.c);
        se81 se81Var = z1hVar.d;
        ShuffleButtonView shuffleButtonView = (ShuffleButtonView) p2o0Var.f;
        if (se81Var == null) {
            shuffleButtonView.setVisibility(8);
        } else {
            shuffleButtonView.setVisibility(0);
            shuffleButtonView.a(se81Var);
        }
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.a.e).n(new m0o(iu30Var, (byte) 16));
        p2o0 p2o0Var = this.b;
        ((FollowButtonView) p2o0Var.e).n(new m0o(iu30Var, (byte) 17));
        ((DownloadButtonView) p2o0Var.d).n(new m0o(iu30Var, (byte) 18));
        ((ContextMenuButton) p2o0Var.c).n(new m0o(iu30Var, (byte) 19));
        this.c.n(new m0o(iu30Var, (byte) 20));
        ((ShuffleButtonView) p2o0Var.f).n(new m0o(iu30Var, (byte) 21));
    }
}
