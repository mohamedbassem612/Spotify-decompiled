package p;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ehd1 implements pdk1 {
    public final WeakReference a;
    public int b;
    public int c;

    public ehd1(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void c(float f, int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            tabLayout.k(f, i, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true);
        }
    }

    public final void e(int i) {
        this.b = this.c;
        this.c = i;
    }
}
