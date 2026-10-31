package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p9c implements isw {
    public final /* synthetic */ byte a = 3;
    public final dtw b;
    public final FrameLayout c;

    public p9c(Context context, iac0 iac0Var, n9c n9cVar, lal1 lal1Var, lal1 lal1Var2) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(n9cVar.a(iac0Var, lal1Var2, lal1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        frameLayout.addView(dtwVarD.w);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), context.getResources().getDimensionPixelSize(2131167033));
        this.b = dtwVarD;
        this.c = frameLayout;
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        ioa0 ioa0Var = ioa0.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                o9c o9cVar = (o9c) obj;
                String str = o9cVar.a;
                y7l1 y7l1Var = new y7l1(new x7l1(str, o9cVar.b, str), o9cVar.c, true, (String) null, "browse:carousel", 0, 40);
                joa0 joa0Var = new joa0(str);
                tka0 tka0Var = dtw.C;
                dtwVar.k(y7l1Var, joa0Var, (vu30) null);
                break;
            case 1:
                sq60 sq60Var = (sq60) obj;
                y7l1 y7l1Var2 = new y7l1(new x7l1(sq60Var.a, sq60Var.b, sq60Var.d), sq60Var.c, sq60Var.e, (String) null, "home:carousel", sq60Var.f, 8);
                tka0 tka0Var2 = dtw.C;
                dtwVar.k(y7l1Var2, ioa0Var, (vu30) null);
                break;
            case 2:
                vnj0 vnj0Var = (xnj0) obj;
                boolean zEquals = vnj0Var.equals(unj0.a);
                FrameLayout frameLayout = this.c;
                if (zEquals) {
                    frameLayout.setVisibility(8);
                } else if (vnj0Var instanceof vnj0) {
                    frameLayout.setVisibility(0);
                    Object obj2 = vnj0Var.a;
                    tka0 tka0Var3 = dtw.C;
                    dtwVar.k(obj2, ioa0Var, (vu30) null);
                } else if (!vnj0Var.equals(wnj0.a)) {
                    eg.o();
                } else {
                    frameLayout.setVisibility(8);
                }
                break;
            default:
                dtwVar.f(obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.c;
    }

    public p9c(Context context, iac0 iac0Var, yfu yfuVar, Function0 function0, sjf1 sjf1Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, frameLayout, f6o1.A(yfuVar.a(iac0Var, sjf1Var, function0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        frameLayout.addView(dtwVarD.w);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), context.getResources().getDimensionPixelSize(2131167033));
        this.b = dtwVarD;
        this.c = frameLayout;
    }

    public p9c(Context context, ViewGroup viewGroup, bs0 bs0Var) {
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, (qtw) bs0Var.f, (drw) null, 24);
        this.b = dtwVarD;
        FrameLayout frameLayout = new FrameLayout(context);
        View view = dtwVarD.w;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height));
        frameLayout.addView(view);
        this.c = frameLayout;
    }

    public p9c(Context context, ViewGroup viewGroup, ug3 ug3Var) {
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, (wpw) ug3Var.c, (drw) null, 24);
        this.b = dtwVarD;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(dtwVarD.w);
        this.c = frameLayout;
    }
}
