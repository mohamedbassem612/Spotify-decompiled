package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9e0 implements isw {
    public final /* synthetic */ byte a = 0;
    public final FrameLayout b;

    public k9e0(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(2131625160, viewGroup, false);
        if (m5n1.t(viewInflate, 2131430528) != null) {
            this.b = (FrameLayout) viewInflate;
        } else {
            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131430528)));
            throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, ysw yswVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }

    public k9e0(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131625161, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.b = (FrameLayout) viewInflate;
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public k9e0(Context context, q1v0 q1v0Var, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView((View) q1v0Var.e.f(new vi11(q1v0Var.b, viewGroup, q1v0Var.a, q1v0Var.c, q1v0Var.d.a)).b);
        this.b = frameLayout;
    }
}
