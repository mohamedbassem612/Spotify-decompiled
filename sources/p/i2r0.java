package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i2r0 extends udk1 {
    public final ViewPager2 a;
    public m0o b = null;
    public int c = 3;
    public int d;
    public int e;

    public i2r0(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public final void a(int i) {
        View viewD;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.c = 2;
            return;
        }
        this.c = 3;
        ViewPager2 viewPager2 = this.a;
        a layoutManager = jhc1.q(0, viewPager2).getLayoutManager();
        if (layoutManager == null || (viewD = layoutManager.D(this.e)) == null) {
            return;
        }
        viewD.measure(View.MeasureSpec.makeMeasureSpec(viewD.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (viewPager2.getLayoutParams().height != viewD.getMeasuredHeight()) {
            fjg1.a((ViewGroup) viewPager2.getParent(), new rce());
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = viewD.getMeasuredHeight();
            viewPager2.setLayoutParams(layoutParams);
        }
    }

    public final void c(int i) {
        this.e = i;
        int iC = l1d.C(this.c);
        int i2 = 1;
        if (iC != 0) {
            if (iC == 1) {
                i2 = this.d < i ? 2 : 3;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i2 = 4;
            }
        }
        m0o m0oVar = this.b;
        if (m0oVar != null) {
            m0oVar.invoke(new eh7(this.d, i, i2));
        }
        this.d = i;
    }
}
