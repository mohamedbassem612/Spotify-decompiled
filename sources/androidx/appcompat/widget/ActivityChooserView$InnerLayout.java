package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p.lvc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lvc1 lvc1VarD = lvc1.D(context, attributeSet, a);
        setBackgroundDrawable(lvc1VarD.k(0));
        lvc1VarD.I();
    }
}
