package p;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sdk1 extends udk1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ sdk1(ViewPager2 viewPager2, byte b) {
        this.a = b;
        this.b = viewPager2;
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.f();
                }
                break;
        }
    }

    public final void c(int i) {
        byte b = this.a;
        ViewPager2 viewPager2 = this.b;
        switch (b) {
            case 0:
                if (viewPager2.d != i) {
                    viewPager2.d = i;
                    viewPager2.W0.m();
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.t.requestFocus(2);
                }
                break;
        }
    }
}
