package p;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pun implements wi5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pun(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        int totalScrollRange;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                AppBarLayout appBarLayout2 = (AppBarLayout) obj2;
                ubd1 ubd1Var = (ubd1) obj;
                if (Math.abs(i) != appBarLayout2.getTotalScrollRange()) {
                    ubd1Var.m(true);
                    tl7.f(ubd1Var, 0, Float.valueOf(appBarLayout2.getResources().getDisplayMetrics().density), 0.0f, 12);
                } else {
                    ubd1Var.m(false);
                    tl7.f(ubd1Var, 1500, Float.valueOf(appBarLayout2.getResources().getDisplayMetrics().density), 0.0f, 12);
                }
                break;
            default:
                h72 h72Var = (h72) obj2;
                h360.b(h72Var, i);
                srr srrVar = (srr) obj;
                h72 h72Var2 = srrVar.a;
                wdm wdmVar = srrVar.b;
                View view = srrVar.g;
                if (view != null && (totalScrollRange = ((BehaviorRetainingAppBarLayout) h72Var.d).getTotalScrollRange()) != 0) {
                    view.findViewById(2131430939).getBackground().setAlpha(jch0.U(((totalScrollRange + i) / totalScrollRange) * 255.0f));
                }
                TextView textView = (TextView) wdmVar.Z;
                Integer num = srrVar.d;
                int iIntValue = num != null ? num.intValue() : srrVar.c;
                AppBarLayout appBarLayout3 = (BehaviorRetainingAppBarLayout) h72Var2.b;
                float dimensionPixelSize = appBarLayout3.getContext().getResources().getDimensionPixelSize(2131167142);
                float y = textView.getY();
                Toolbar toolbar = (Toolbar) h72Var2.X;
                float f = -i;
                int iO = (int) ((yoi1.o(f - ((y - toolbar.getHeight()) - dimensionPixelSize), 0.0f, dimensionPixelSize) / dimensionPixelSize) * 255.0f);
                toolbar.getBackground().setAlpha(iO);
                int iArgb = Color.argb(iO, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
                Drawable background = toolbar.getBackground();
                if (background != null) {
                    background.setColorFilter(new PorterDuffColorFilter(iArgb, PorterDuff.Mode.DST_OVER));
                }
                float fMin = Math.min(toolbar.getHeight(), (appBarLayout3.getHeight() - textView.getY()) - dimensionPixelSize);
                ((TextView) h72Var2.Y).setAlpha(yoi1.o(f - ((textView.getY() - toolbar.getHeight()) + dimensionPixelSize), 0.0f, fMin) / fMin);
                ((MotionLayout) wdmVar.g).setProgress(f / appBarLayout.getTotalScrollRange());
                float f2 = i;
                ((ArtworkView) wdmVar.c).setTranslationY(-f2);
                float measuredHeight = ((appBarLayout.getMeasuredHeight() - ((Toolbar) h72Var2.X).getMeasuredHeight()) - ((TextView) wdmVar.X).getMeasuredHeight()) - ((TextView) wdmVar.Z).getHeight();
                float f3 = ((f2 + measuredHeight) / measuredHeight) * 255.0f;
                ((View) wdmVar.d).getBackground().setAlpha((int) (255.0f - ((float) Math.rint(f3 >= 0.0f ? f3 : 0.0f))));
                break;
        }
    }
}
