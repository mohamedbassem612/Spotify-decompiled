package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ont implements isw {
    public boolean a;
    public final FrameLayout b;
    public final dtw c;
    public final FrameLayout d;

    public ont(lnt lntVar, Context context, iac0 iac0Var, n9c n9cVar, lnt lntVar2) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.b = frameLayout;
        tka0 tka0Var = dtw.C;
        this.c = mhc.d(context, frameLayout, f6o1.A(n9cVar.a(iac0Var, lntVar, lntVar2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
        this.d = frameLayout;
    }

    public final void a(Object obj, ysw yswVar) {
        k6l1 k6l1Var = (k6l1) obj;
        String str = k6l1Var.a;
        ArrayList arrayList = k6l1Var.b;
        y7l1 y7l1Var = new y7l1(new x7l1(str, arrayList, str), k6l1Var.c, true, (String) null, "browse:carousel", 0, 40);
        joa0 joa0Var = new joa0(str);
        tka0 tka0Var = dtw.C;
        dtw dtwVar = this.c;
        dtwVar.k(y7l1Var, joa0Var, (vu30) null);
        if (this.a || arrayList.isEmpty()) {
            return;
        }
        View view = dtwVar.w;
        FrameLayout frameLayout = this.b;
        frameLayout.addView(view);
        this.a = true;
        Resources resources = frameLayout.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165289) + resources.getDimensionPixelSize(2131167023);
        frameLayout.setPadding(dimensionPixelSize, frameLayout.getPaddingTop(), dimensionPixelSize, frameLayout.getPaddingBottom());
    }

    public final View getView() {
        return this.d;
    }
}
