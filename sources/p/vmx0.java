package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vmx0 implements isw {
    public final /* synthetic */ byte a;
    public final idd1 b;
    public final LinearLayout c;
    public final dtw d;

    public vmx0(Context context, ViewGroup viewGroup, qfv qfvVar, kly0 kly0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new idd1(new pd3(kly0Var, (byte) 11));
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2131625464, viewGroup, false);
                this.c = linearLayout;
                tka0 tka0Var = dtw.C;
                dtw dtwVarD = mhc.d(context, linearLayout, qfvVar, (drw) null, 24);
                FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(2131430548);
                View view = dtwVarD.w;
                xhk1.c(view, new k3h1(0));
                frameLayout.addView(view);
                this.d = dtwVarD;
                break;
            default:
                this.b = new idd1(new pd3(kly0Var, (byte) 10));
                LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(2131625463, viewGroup, false);
                this.c = linearLayout2;
                tka0 tka0Var2 = dtw.C;
                dtw dtwVarD2 = mhc.d(context, linearLayout2, qfvVar, (drw) null, 24);
                FrameLayout frameLayout2 = (FrameLayout) linearLayout2.findViewById(2131430547);
                View view2 = dtwVarD2.w;
                xhk1.c(view2, new k3h1(0));
                frameLayout2.addView(view2);
                this.d = dtwVarD2;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        dtw dtwVar = this.d;
        LinearLayout linearLayout = this.c;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                tmx0 tmx0Var = (tmx0) obj;
                ((c460) idd1Var.getValue()).a(tmx0Var.a, (FrameLayout) linearLayout.findViewById(2131429104));
                joa0 joa0Var = new joa0(tmx0Var.b);
                tka0 tka0Var = dtw.C;
                dtwVar.k(tmx0Var, joa0Var, (vu30) null);
                break;
            default:
                xnx0 xnx0Var = (xnx0) obj;
                ((c460) idd1Var.getValue()).a(xnx0Var.c, (FrameLayout) linearLayout.findViewById(2131429104));
                joa0 joa0Var2 = new joa0(xnx0Var.a);
                tka0 tka0Var2 = dtw.C;
                dtwVar.k(xnx0Var, joa0Var2, (vu30) null);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.c;
    }
}
