package p;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpw extends sua {
    public final void y(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fCos;
        RectF rectFJ = sua.j(tabLayout, view);
        RectF rectFJ2 = sua.j(tabLayout, view2);
        if (rectFJ.left < rectFJ2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
        }
        int i = (int) rectFJ.left;
        int i2 = (int) rectFJ2.left;
        LinearInterpolator linearInterpolator = je5.a;
        int iRound = Math.round(fSin * (i2 - i)) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFJ.right;
        drawable.setBounds(iRound, i3, Math.round(fCos * (((int) rectFJ2.right) - i4)) + i4, drawable.getBounds().bottom);
    }
}
