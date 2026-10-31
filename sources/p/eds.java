package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eds implements qad1, qzh {
    public final wmy a;
    public final v8o0 b;
    public final v8o0 c;

    public eds(Context context, gw70 gw70Var) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625340, (ViewGroup) null, false);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i = 2131428234;
            ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
            if (contextMenuButtonT != null) {
                i = 2131430674;
                ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                if (contentRestrictionBadgeViewT != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    i = 2131431115;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                    if (textView != null) {
                        i = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                        if (textView2 != null) {
                            wmy wmyVar = new wmy(constraintLayout, view, contextMenuButtonT, contentRestrictionBadgeViewT, textView, textView2);
                            view.setViewContext(new f47(gw70Var));
                            v9w0 v9w0VarQ = b2u.q(constraintLayout);
                            Collections.addAll(v9w0VarQ.c, textView2, textView);
                            Collections.addAll(v9w0VarQ.d, view);
                            v9w0VarQ.a();
                            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            this.a = wmyVar;
                            this.b = new v8o0(constraintLayout.getContext(), 1);
                            this.c = new v8o0(constraintLayout.getContext(), 2);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final m9d1 a() {
        return this.c.c();
    }

    public final m9d1 b() {
        return this.b.c();
    }

    public final void f(Object obj) {
        y07 g17Var;
        awp0 awp0Var = (awp0) obj;
        int i = awp0Var.d;
        boolean z = awp0Var.g;
        wmy wmyVar = this.a;
        TextView textView = (TextView) wmyVar.f;
        ContextMenuButton contextMenuButton = (ContextMenuButton) wmyVar.c;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) wmyVar.d;
        ArtworkView artworkView = (ArtworkView) wmyVar.b;
        TextView textView2 = (TextView) wmyVar.e;
        String str = awp0Var.a;
        textView.setText(str);
        int i2 = 3;
        textView.setActivated(awp0Var.e != 3);
        textView2.setText(awp0Var.b);
        g07 g07Var = new g07(z ? null : awp0Var.c, yz6.d);
        int iC = l1d.C(i);
        if (iC == 0) {
            g17Var = new g17(g07Var);
        } else if (iC == 1) {
            g17Var = new k07(g07Var, false);
        } else if (iC == 2) {
            g17Var = new t07(g07Var, false);
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            g17Var = new y07(g07Var, false);
        }
        artworkView.h(g17Var);
        contentRestrictionBadgeView.c(awp0Var.f);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            i2 = 1;
        } else if (iC2 != 1) {
            if (iC2 == 2) {
                i2 = 2;
            } else {
                if (iC2 != 3) {
                    eg.o();
                    return;
                }
                i2 = 5;
            }
        }
        contextMenuButton.setEnabled(true);
        contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(ydh.c(i2), str));
        boolean z2 = !z;
        textView.setEnabled(z2);
        textView2.setEnabled(z2);
        artworkView.setEnabled(z2);
        contentRestrictionBadgeView.setEnabled(z2);
        contextMenuButton.setEnabled(z2);
        this.b.b = awp0Var.h;
        this.c.b = awp0Var.i;
    }

    public final View getView() {
        return (ConstraintLayout) this.a.a;
    }

    public final void n(iu30 iu30Var) {
        wmy wmyVar = this.a;
        ConstraintLayout constraintLayout = (ConstraintLayout) wmyVar.a;
        constraintLayout.setOnClickListener(new o0s(iu30Var, (byte) 23));
        constraintLayout.setOnLongClickListener(new wer(iu30Var, (byte) 8));
        ((ContextMenuButton) wmyVar.c).n(new mwr(iu30Var, (byte) 17));
        this.b.e = new hbs(iu30Var, (byte) 2);
        this.c.e = new hbs(iu30Var, (byte) 3);
    }
}
