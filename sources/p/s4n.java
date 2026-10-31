package p;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s4n extends FrameLayout {
    public final ViewGroup a;
    public final int b;

    public s4n(BottomSheetBehavior bottomSheetBehavior, ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.a = viewGroup;
        this.b = getContext().getResources().getDimensionPixelSize(2131165559);
        h3n h3nVar = new h3n(-1, 0);
        h3nVar.c = 81;
        setLayoutParams(h3nVar);
        int iR = xfo1.r(this, 2130968769);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        tr80 tr80Var = new tr80(0, 10, 1);
        ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
        lr80 it = tr80Var.iterator();
        while (((sr80) it).c) {
            arrayList.add(Float.valueOf(decelerateInterpolator.getInterpolation(it.nextInt() / 10.0f)));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(uah.l(iR, (int) (((Number) it2.next()).floatValue() * 255.0f))));
        }
        setBackground(new GradientDrawable(orientation, o7h.k1(arrayList2)));
        bottomSheetBehavior.t(new r4n(this, this.a));
        rwq0.s(this, new mgl(this, (byte) 12));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a.getMeasuredWidth(), 1073741824), i2);
    }
}
