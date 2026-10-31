package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hgr implements qzh {
    public final ai4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final oq51 f;
    public final d520 g;
    public final int h;

    public hgr(Context context, gw70 gw70Var, ai4 ai4Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = ai4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624065, (ViewGroup) null, false);
        int i = 2131427553;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427553);
        if (textView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427741;
                if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                    i = 2131428924;
                    EncoreFollowButton encoreFollowButtonT = m5n1.t(constraintLayoutInflate, 2131428924);
                    if (encoreFollowButtonT != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131431115;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView2 != null) {
                            i = 2131431356;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView3 != null) {
                                i = 2131431572;
                                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                if (imageView != null) {
                                    d520 d520Var = new d520(constraintLayout, textView, view, encoreFollowButtonT, textView2, textView3, imageView, (byte) 11);
                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    view.setViewContext(new f47(gw70Var));
                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                    Collections.addAll(v9w0VarQ.c, textView3, textView2);
                                    Collections.addAll(v9w0VarQ.d, view);
                                    v9w0VarQ.e = false;
                                    v9w0VarQ.a();
                                    this.g = d520Var;
                                    this.h = textView3.getLayoutParams().B;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        xx6 xx6Var = (xx6) obj;
        boolean z = xx6Var.h;
        String str = xx6Var.b;
        d520 d520Var = this.g;
        TextView textView = (TextView) d520Var.g;
        ArtworkView artworkView = (ArtworkView) d520Var.d;
        TextView textView2 = (TextView) d520Var.c;
        ImageView imageView = (ImageView) d520Var.h;
        EncoreFollowButton encoreFollowButton = (EncoreFollowButton) d520Var.e;
        TextView textView3 = (TextView) d520Var.f;
        List list = xx6Var.i;
        textView.setText(!list.isEmpty() ? this.f.a(list, true, this.a) : xx6Var.a);
        textView3.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str != null && str.length() != 0) {
            textView3.setText(str);
        }
        boolean z2 = (xx6Var.e && this.c) || (xx6Var.f && this.d);
        cwl1.c0(imageView, xx6Var.d && !z2, this.b);
        cwl1.b0(textView2, z2, textView, this.h);
        artworkView.h(new l07(new g07(z ? null : xx6Var.c, xz6.d), false));
        boolean z3 = this.e;
        if (z3) {
            encoreFollowButton.setVisibility(0);
            encoreFollowButton.g(new g330(xx6Var.g ? 1 : 2, false, 10));
        }
        boolean z4 = !z;
        textView.setEnabled(z4);
        textView3.setEnabled(z4);
        artworkView.setEnabled(z4);
        imageView.setEnabled(z4);
        textView2.setEnabled(z4);
        if (z3) {
            encoreFollowButton.setEnabled(z4);
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.g.b;
    }

    public final void n(iu30 iu30Var) {
        d520 d520Var = this.g;
        ((ConstraintLayout) d520Var.b).setOnClickListener(new yer(iu30Var, (byte) 10));
        if (this.e) {
            ((EncoreFollowButton) d520Var.e).n(new m0o(iu30Var, (byte) 11));
        }
    }
}
