package p;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ihd1 extends udk1 {
    public final WeakReference a;
    public byte c = 0;
    public byte b = 0;

    public ihd1(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
    }

    public final void b(int i, int i2, float f) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            byte b = this.c;
            tabLayout.k(f, i, b != 2 || this.b == 1, (b == 2 && this.b == 0) ? false : true);
        }
    }

    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        byte b = this.c;
        tabLayout.j(tabLayout.g(i), b == 0 || (b == 2 && this.b == 0));
    }
}
